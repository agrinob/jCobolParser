/*
 *  Copyright (C) 2010 Andres Grino Brandt <agrinob@hotmail.com>
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package jcobol.parser.divisions;

import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.List;
import jcobol.lexer.CobolLexer;
import jcobol.lexer.TokenList;
import jcobol.parser.antlr.AntlrCobolToken;
import jcobol.parser.antlr.CobolTokenStream;
import jcobol.parser.antlr.TokenFactory;
import jcobol.parser.utils.Dictionary;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andr&eacute;s Gri&ntilde;&oacute; Brandt <agrinob@hotmail.com>
 */
public class DataDivisionTest {

    public DataDivisionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testData_div() throws Exception {
    }

    @Test
    public void testData() throws Exception {
        System.out.println("data");
        test("data", "DATA RECORD A",           "(P_DATA_RECORD A)");
        test("data", "DATA RECORD A B",         "(P_DATA_RECORD A B)");
        test("data", "DATA RECORD IS A",        "(P_DATA_RECORD A)");
        test("data", "DATA RECORD IS A B",      "(P_DATA_RECORD A B)");
        test("data", "DATA RECORDS A",          "(P_DATA_RECORD A)");
        test("data", "DATA RECORDS A B",        "(P_DATA_RECORD A B)");
        test("data", "DATA RECORDS ARE A",      "(P_DATA_RECORD A)");
        test("data", "DATA RECORDS ARE A B",    "(P_DATA_RECORD A B)");
    }

    @Test
    public void testDepending() throws Exception {
        System.out.println("depending");
        test("depending", "DEPENDING VAR",      "(DEPENDING VAR)");
        test("depending", "DEPENDING ON VAR",   "(DEPENDING VAR)");
    }

    @Test
    public void testFile_section() throws Exception {
    }

    @Test
    public void testFile_record() throws Exception {
        System.out.println("file_record");
        test("file_record", 
                "FD ARCH.\n" +
                "01 REC PIC X(100).\n" +
                "01 REC2 PIC X(200).",
                "(FD ARCH (P_RECORD 01 REC (PIC X(100))) (P_RECORD 01 REC2 (PIC X(200))))");
        test("file_record",
                "SD ARCH.\n" +
                "01 REC PIC X(100).\n" +
                "01 REC2 PIC X(200).",
                "(SD ARCH (P_RECORD 01 REC (PIC X(100))) (P_RECORD 01 REC2 (PIC X(200))))");
    }

    @Test
    public void testFile_description_entry() throws Exception {
        System.out.println("file_description_entry");
        test("file_description_entry", "FD ARCH.",                  "(FD ARCH)");
        test("file_description_entry", "FD ARCH EXTERNAL.",         "(FD ARCH EXTERNAL)");
        test("file_description_entry", "FD ARCH IS EXTERNAL.",      "(FD ARCH EXTERNAL)");
        test("file_description_entry", "FD ARCH GLOBAL.",           "(FD ARCH GLOBAL)");
        test("file_description_entry", "FD ARCH IS GLOBAL.",        "(FD ARCH GLOBAL)");
        test("file_description_entry", "FD ARCH EXTERNAL GLOBAL.",  "(FD ARCH EXTERNAL GLOBAL)");
        test("file_description_entry", "FD ARCH IS EXTERNAL IS GLOBAL.","(FD ARCH EXTERNAL GLOBAL)");
        test("file_description_entry", "FD ARCH BLOCK 1 RECORDS.",       "(FD ARCH (BLOCK (P_PAIR 1) RECORDS))");
        test("file_description_entry", "FD ARCH BLOCK 1 TO 2 RECORDS.",  "(FD ARCH (BLOCK (P_PAIR 1 2) RECORDS))");
        test("file_description_entry", "FD ARCH BLOCK 1 CHARACTERS.",       "(FD ARCH (BLOCK (P_PAIR 1)))");
        test("file_description_entry", "FD ARCH BLOCK 1 TO 2 CHARACTERS.",  "(FD ARCH (BLOCK (P_PAIR 1 2)))");
        test("file_description_entry",
                "FD ARCH\n" +
                " BLOCK CONTAINS 1000 TO 2000\n" +
                " RECORD CONTAINS 10 TO 20 CHARACTERS\n" +
                " LABEL RECORDS ARE STANDARD\n" +
                " VALUE OF A IS B\n" +
                " DATA RECORDS ARE A, B, C.",
                "(FD ARCH (BLOCK (P_PAIR 1000 2000)) (RECORD (P_PAIR 10 20)) (LABEL STANDARD) (VALUE (P_PAIR A B)) (P_DATA_RECORD A B C))");
    }

    @Test
    public void testFile_entry() throws Exception {
    }

    @Test
    public void testValue_of() throws Exception {
        System.out.println("value_of");
        test("value_of", "VALUE OF A IS B",         "(VALUE (P_PAIR A B))");
        test("value_of", "VALUE OF A IS B, C IS D", "(VALUE (P_PAIR A B) (P_PAIR C D))");
    }
    @Test
    public void testExternal() throws Exception {
        System.out.println("external");
        test("external", "EXTERNAL",    "EXTERNAL");
        test("external", "IS EXTERNAL", "EXTERNAL");
    }

    @Test
    public void testGlobal() throws Exception {
        System.out.println("global");
        test("global", "GLOBAL",    "GLOBAL");
        test("global", "IS GLOBAL", "GLOBAL");
    }

    @Test
    public void testBlock() throws Exception {
        System.out.println("block");
        test("block", "BLOCK 100",                   "(BLOCK (P_PAIR 100))");
        test("block", "BLOCK CONTAINS 100",          "(BLOCK (P_PAIR 100))");
        test("block", "BLOCK 100 TO 200",            "(BLOCK (P_PAIR 100 200))");
        test("block", "BLOCK CONTAINS 100 TO 200",   "(BLOCK (P_PAIR 100 200))");
        test("block", "BLOCK 100 CHARACTERS",                   "(BLOCK (P_PAIR 100))");
        test("block", "BLOCK CONTAINS 100 CHARACTERS",          "(BLOCK (P_PAIR 100))");
        test("block", "BLOCK 100 TO 200 CHARACTERS",            "(BLOCK (P_PAIR 100 200))");
        test("block", "BLOCK CONTAINS 100 TO 200 CHARACTERS",   "(BLOCK (P_PAIR 100 200))");
        test("block", "BLOCK 100 RECORDS.",                      "(BLOCK (P_PAIR 100) RECORDS)");
        test("block", "BLOCK CONTAINS 100 RECORDS",             "(BLOCK (P_PAIR 100) RECORDS)");
        test("block", "BLOCK 100 TO 200 RECORDS",               "(BLOCK (P_PAIR 100 200) RECORDS)");
        test("block", "BLOCK CONTAINS 100 TO 200 RECORDS",      "(BLOCK (P_PAIR 100 200) RECORDS)");
    }

    @Test
    public void testBottom() throws Exception {
        System.out.println("bottom");
        test("bottom", "BOTTOM 10",         "(BOTTOM 10)");
        test("bottom", "LINES BOTTOM 10",   "(BOTTOM 10)");
        test("bottom", "LINES AT BOTTOM 10","(BOTTOM 10)");
    }

    @Test
    public void testTop() throws Exception {
        System.out.println("top");
        test("top", "TOP 10",           "(TOP 10)");
        test("top", "LINES TOP 10",     "(TOP 10)");
        test("top", "LINES AT TOP 10",  "(TOP 10)");
    }

    @Test
    public void testFooting() throws Exception {
        System.out.println("fotting");
        test("footing", "FOOTING 10",        "(FOOTING 10)");
        test("footing", "WITH FOOTING 10",   "(FOOTING 10)");
        test("footing", "WITH FOOTING AT 10","(FOOTING 10)");
    }

    @Test
    public void testRange() throws Exception {
        System.out.println("range");
        test("range", "100 TO 200",   "(P_PAIR 100 200)");
        test("range", "100.",         "(P_PAIR 100)");
    }

    @Test
    public void testRecord() throws Exception {
        System.out.println("record");
        test("record", "RECORD VARYING",                          "(RECORD VARYING)");
        test("record", "RECORD VARYING TO 100",                   "(RECORD (VARYING (TO 100)))");
        test("record", "RECORD VARYING FROM 100",                 "(RECORD (VARYING (P_FROM 100)))");
        test("record", "RECORD VARYING FROM 100 TO 200",          "(RECORD (VARYING (P_FROM 100) (TO 200)))");

        test("record", "RECORD VARYING CHARACTERS",               "(RECORD VARYING)");
        test("record", "RECORD VARYING TO 100 CHARACTERS",        "(RECORD (VARYING (TO 100)))");
        test("record", "RECORD VARYING FROM 100 CHARACTERS",      "(RECORD (VARYING (P_FROM 100)))");
        test("record", "RECORD VARYING FROM 100 TO 200 CHARACTERS","(RECORD (VARYING (P_FROM 100) (TO 200)))");

        test("record", "RECORD IS VARYING IN SIZE",               "(RECORD VARYING)");
        test("record", "RECORD VARYING IN SIZE TO 100",           "(RECORD (VARYING (TO 100)))");
        test("record", "RECORD VARYING IN FROM 100",              "(RECORD (VARYING (P_FROM 100)))");
        test("record", "RECORD IS VARYING FROM 100 TO 200",       "(RECORD (VARYING (P_FROM 100) (TO 200)))");

        test("record", "RECORD VARYING DEPENDING XXX",               "(RECORD (VARYING (DEPENDING XXX)))");
        test("record", "RECORD VARYING DEPENDING ON XXX",            "(RECORD (VARYING (DEPENDING XXX)))");
        test("record", "RECORD VARYING 100 TO 200 DEPENDING ON XXX", "(RECORD (VARYING (P_FROM 100) (TO 200) (DEPENDING XXX)))");
        
        test("record", "RECORD 100 CHARACTERS",                   "(RECORD (P_PAIR 100))");
        test("record", "RECORD 100.",                             "(RECORD (P_PAIR 100))");
        test("record", "RECORD CONTAINS 100 CHARACTERS",          "(RECORD (P_PAIR 100))");
        test("record", "RECORD 100 TO 200 CHARACTERS",            "(RECORD (P_PAIR 100 200))");
        test("record", "RECORD CONTAINS 100 TO 200 CHARACTERS",   "(RECORD (P_PAIR 100 200))");
    }

    @Test
    public void testLabel() throws Exception {
        System.out.println("label");
        test("label", "LABEL RECORD STANDARD",      "(LABEL STANDARD)");
        test("label", "LABEL RECORD OMITTED",       "(LABEL OMITTED)");
        test("label", "LABEL RECORD XXX",           "(LABEL XXX)");
        test("label", "LABEL RECORD IS STANDARD",   "(LABEL STANDARD)");
        test("label", "LABEL RECORD IS OMITTED",    "(LABEL OMITTED)");
        test("label", "LABEL RECORD IS XXX",        "(LABEL XXX)");
        test("label", "LABEL RECORDS STANDARD",     "(LABEL STANDARD)");
        test("label", "LABEL RECORDS OMITTED",      "(LABEL OMITTED)");
        test("label", "LABEL RECORDS XXX",          "(LABEL XXX)");
        test("label", "LABEL RECORDS ARE STANDARD", "(LABEL STANDARD)");
        test("label", "LABEL RECORDS ARE OMITTED",  "(LABEL OMITTED)");
        test("label", "LABEL RECORDS ARE XXX",      "(LABEL XXX)");
    }

    @Test
    public void testRecord_description_entry() throws Exception {
        System.out.println("record_description_entry");
        test("record_description_entry", "01.",                     "(P_RECORD 01)");
        test("record_description_entry", "01 FILLER.",              "(P_RECORD 01 FILLER)");
        test("record_description_entry", "01 REC PICTURE X.",       "(P_RECORD 01 REC (PICTURE X))");
        test("record_description_entry", "01 REC PICTURE X(80).",   "(P_RECORD 01 REC (PICTURE X(80)))");
        test("record_description_entry", "01 REC PICTURE IS 9(9).", "(P_RECORD 01 REC (PICTURE 9(9)))");
        test("record_description_entry", "01 REC PIC 9(9).",        "(P_RECORD 01 REC (PIC 9(9)))");
        test("record_description_entry", "01 REC PIC 9.9 VALUE 10.", "(P_RECORD 01 REC (PIC 9.9) (VALUE 10))");
        test("record_description_entry", "01 REC PIC X(80) VALUE \"ABC\" JUST RIGHT.",
                    "(P_RECORD 01 REC (PIC X(80)) (VALUE \"ABC\") JUST)");
        test("record_description_entry", "01 B REDEFINES A.",       "(P_RECORD 01 B (REDEFINES A))");
        test("record_description_entry", " 02 FILLER PICTURE IS X(99) VALUE IS 'A'.",
                "(P_RECORD 02 FILLER (PICTURE X(99)) (VALUE 'A'))");
        test("record_description_entry", " 02 FILLER PIC IS X(99) VALUE IS 'A'.",
                "(P_RECORD 02 FILLER (PIC X(99)) (VALUE 'A'))");
        test("record_description_entry", "88 End-Of-ODF VALUE HIGH-VALUES.", "(P_RECORD 88 End-Of-ODF (VALUE HIGH-VALUES))");
        test("record_description_entry", "02 A-B PIC 9(4).",                 "(P_RECORD 02 A-B (PIC 9(4)))");
    }

    @Test
    public void testWorking_storage_section() throws Exception {
    }

    @Test
    public void testCode_set() throws Exception {
        System.out.println("code_set");
        test("code_set", "CODE-SET A", "(CODE-SET A)");
        test("code_set", "CODE-SET IS A", "(CODE-SET A)");
    }

    @Test
    public void testLinage() throws Exception {
        System.out.println("linage");
        test("linage", "LINAGE 10",             "(LINAGE 10)");
        test("linage", "LINAGE IS 10",          "(LINAGE 10)");
        test("linage", "LINAGE IS 10 LINES",    "(LINAGE 10)");
        test("linage", "LINAGE 10 FOOTING 5",   "(LINAGE 10 (FOOTING 5))");
        test("linage", "LINAGE 10 FOOTING 5 TOP 6",
                "(LINAGE 10 (FOOTING 5) (TOP 6))");
        test("linage",
                "LINAGE 10 FOOTING 5 TOP 6 BOTTOM 4",
                "(LINAGE 10 (FOOTING 5) (TOP 6) (BOTTOM 4))");
        test("linage",
                "LINAGE IS 10 LINES WITH FOOTING AT 5 LINES AT TOP 6\nLINES AT BOTTOM 3",
                "(LINAGE 10 (FOOTING 5) (TOP 6) (BOTTOM 3))");
    }

    @Test
    public void testBlank_zero() throws Exception {
        System.out.println("blank_zero");
        test("blank_zero", "BLANK ZERO",    "(BLANK ZERO)");
        test("blank_zero", "BLANK ZEROS",   "(BLANK ZEROS)");
        test("blank_zero", "BLANK ZEROES",  "(BLANK ZEROES)");
        test("blank_zero", "BLANK WHEN ZERO",    "(BLANK ZERO)");
        test("blank_zero", "BLANK WHEN ZEROS",   "(BLANK ZEROS)");
        test("blank_zero", "BLANK WHEN ZEROES",  "(BLANK ZEROES)");
    }

    @Test
    public void testJustified() throws Exception {
        System.out.println("justified");
        test("justified", "JUSTIFIED",       "JUSTIFIED");
        test("justified", "JUSTIFIED RIGHT", "JUSTIFIED");
        test("justified", "JUST",            "JUST");
        test("justified", "JUST RIGHT",      "JUST");
    }

    @Test
    public void testOperator() throws Exception {
        System.out.println("operator");
        test("operator", "+", "+");
    }


    @Test
    public void testOrder() throws Exception {
        System.out.println("order");
        test("order", "ASCENDING LLAVE",                "(ASCENDING LLAVE)");
        test("order", "ASCENDING LLAVE LLAVE2",         "(ASCENDING LLAVE LLAVE2)");
        test("order", "ASCENDING KEY LLAVE",            "(ASCENDING LLAVE)");
        test("order", "ASCENDING KEY LLAVE LLAVE2",     "(ASCENDING LLAVE LLAVE2)");
        test("order", "ASCENDING KEY IS LLAVE",         "(ASCENDING LLAVE)");
        test("order", "ASCENDING KEY IS LLAVE LLAVE2",  "(ASCENDING LLAVE LLAVE2)");
        test("order", "ASCENDING IS LLAVE",             "(ASCENDING LLAVE)");
        test("order", "ASCENDING IS LLAVE LLAVE2",      "(ASCENDING LLAVE LLAVE2)");
        test("order", "DESCENDING LLAVE",               "(DESCENDING LLAVE)");
        test("order", "DESCENDING LLAVE LLAVE2",        "(DESCENDING LLAVE LLAVE2)");
        test("order", "DESCENDING KEY LLAVE",           "(DESCENDING LLAVE)");
        test("order", "DESCENDING KEY LLAVE LLAVE2",    "(DESCENDING LLAVE LLAVE2)");
        test("order", "DESCENDING KEY IS LLAVE",        "(DESCENDING LLAVE)");
        test("order", "DESCENDING KEY IS LLAVE LLAVE2", "(DESCENDING LLAVE LLAVE2)");
    }

    @Test
    public void testIndexed() throws Exception {
        System.out.println("indexed");
        test("indexed", "INDEXED LLAVE",            "(INDEXED LLAVE)");
        test("indexed", "INDEXED LLAVE LLAVE2",     "(INDEXED LLAVE LLAVE2)");
        test("indexed", "INDEXED BY LLAVE",         "(INDEXED LLAVE)");
        test("indexed", "INDEXED BY LLAVE LLAVE2",  "(INDEXED LLAVE LLAVE2)");
    }

    @Test
    public void testOccurs() throws Exception {
        System.out.println("occurs");
        test("occurs", "OCCURS 10",         "(OCCURS (P_PAIR 10))");
        test("occurs", "OCCURS 10 TIMES",   "(OCCURS (P_PAIR 10))");
        test("occurs", "OCCURS 10 TIMES INDEXED LLAVE",             "(OCCURS (P_PAIR 10) (INDEXED LLAVE))");
        test("occurs", "OCCURS 10 TIMES INDEXED LLAVE LLAVE2",      "(OCCURS (P_PAIR 10) (INDEXED LLAVE LLAVE2))");
        test("occurs", "OCCURS 70 TIMES ASCENDING LLAVE",           "(OCCURS (P_PAIR 70) (ASCENDING LLAVE))");
        test("occurs", "OCCURS 60 TIMES ASCENDING LLAVE LLAVE2",    "(OCCURS (P_PAIR 60) (ASCENDING LLAVE LLAVE2))");
        test("occurs", "OCCURS 50 TIMES DESCENDING LLAVE",          "(OCCURS (P_PAIR 50) (DESCENDING LLAVE))");
        test("occurs", "OCCURS 40 TIMES DESCENDING LLAVE LLAVE2",   "(OCCURS (P_PAIR 40) (DESCENDING LLAVE LLAVE2))");
        test("occurs", "OCCURS 30 TIMES ASCENDING LLAVE\nDESCENDING LLAVE2",
                        "(OCCURS (P_PAIR 30) (ASCENDING LLAVE) (DESCENDING LLAVE2))");
        test("occurs", "OCCURS 20 TIMES ASCENDING IS LLAVE LLAVE2\nDESCENDING KEY LLAVE3 LLAVE4",
                        "(OCCURS (P_PAIR 20) (ASCENDING LLAVE LLAVE2) (DESCENDING LLAVE3 LLAVE4))");
        test("occurs", "OCCURS 10 TIMES ASCENDING KEY LLAVE LLAVE2\nDESCENDING IS LLAVE3 LLAVE4\nINDEXED BY LLAVE5 LLAVE6",
                        "(OCCURS (P_PAIR 10) (ASCENDING LLAVE LLAVE2) (DESCENDING LLAVE3 LLAVE4) (INDEXED LLAVE5 LLAVE6))");
        test("occurs", "OCCURS 10 TO 20 TIMES", "(OCCURS (P_PAIR 10 20))");
        test("occurs", "OCCURS 10 TO 20 DEPENDING XX", "(OCCURS (P_PAIR 10 20) (DEPENDING XX))");
        test("occurs", "OCCURS 10 TO 20 DEPENDING ON XX", "(OCCURS (P_PAIR 10 20) (DEPENDING XX))");
    }

    @Test
    public void testPicture() throws Exception {
        System.out.println("picture");
        test("picture", "PICTURE IS XX",    "(PICTURE XX)");
        test("picture", "PICTURE IS 9.",    "(PICTURE 9)");
        test("picture", "PICTURE IS 9.9",   "(PICTURE 9.9)");
        test("picture", "PICTURE IS 9,999.99.", "(PICTURE 9,999.99)");
        test("picture", "PIC IS XX",        "(PIC XX)");
        test("picture", "PIC IS 9.",        "(PIC 9)");
        test("picture", "PIC IS 9.9",       "(PIC 9.9)");
        test("picture", "PIC IS 9,999.99.", "(PIC 9,999.99)");        
        test("picture", "PIC X(80).",       "(PIC X(80))");
    }

    @Test
    public void testRedefines() throws Exception {
        System.out.println("redefines");
        test("redefines", "REDEFINES XX", "(REDEFINES XX)");
    }

    @Test
    public void testRenames() throws Exception {
        System.out.println("renames");
        test("renames", "RENAMES A", "(RENAMES A)");
        test("renames", "RENAMES A THRU B", "(RENAMES A B)");
        test("renames", "RENAMES A THROUGH B", "(RENAMES A B)");
    }

    @Test
    public void testSign() throws Exception {
        System.out.println("sign");
        test("sign", "LEADING",                             "(P_SIGN LEADING)");
        test("sign", "LEADING SEPARATE",                    "(P_SIGN LEADING SEPARATE)");
        test("sign", "LEADING SEPARATE CHARACTER",          "(P_SIGN LEADING SEPARATE)");
        test("sign", "SIGN LEADING SEPARATE CHARACTER",     "(P_SIGN LEADING SEPARATE)");
        test("sign", "SIGN IS LEADING SEPARATE CHARACTER",  "(P_SIGN LEADING SEPARATE)");
        test("sign", "SIGN LEADING",                        "(P_SIGN LEADING)");
        test("sign", "SIGN IS LEADING",                     "(P_SIGN LEADING)");
        test("sign", "TRAILING",                            "(P_SIGN TRAILING)");
        test("sign", "TRAILING SEPARATE",                   "(P_SIGN TRAILING SEPARATE)");
        test("sign", "TRAILING SEPARATE CHARACTER",         "(P_SIGN TRAILING SEPARATE)");
        test("sign", "SIGN TRAILING SEPARATE CHARACTER",    "(P_SIGN TRAILING SEPARATE)");
        test("sign", "SIGN IS TRAILING SEPARATE CHARACTER", "(P_SIGN TRAILING SEPARATE)");
        test("sign", "SIGN TRAILING",                       "(P_SIGN TRAILING)");
        test("sign", "SIGN IS TRAILING",                    "(P_SIGN TRAILING)");
    }

    @Test
    public void testSync() throws Exception {
        System.out.println("sync");
        test("sync", "SYNC",                "SYNC");
        test("sync", "SYNCHRONIZED",        "SYNCHRONIZED");
        test("sync", "SYNC LEFT",           "(SYNC LEFT)");
        test("sync", "SYNCHRONIZED LEFT",   "(SYNCHRONIZED LEFT)");
        test("sync", "SYNC RIGHT",          "(SYNC RIGHT)");
        test("sync", "SYNCHRONIZED RIGHT",  "(SYNCHRONIZED RIGHT)");
    }

    @Test
    public void testUsage() throws Exception {
        System.out.println("usage");
        test("usage", "BINARY",         "(P_USAGE BINARY)");
        test("usage", "COMP",           "(P_USAGE COMP)");
        test("usage", "COMP-1",           "(P_USAGE COMP-1)");
        test("usage", "COMP-2",           "(P_USAGE COMP-2)");
        test("usage", "COMP-3",           "(P_USAGE COMP-3)");
        test("usage", "COMP-4",           "(P_USAGE COMP-4)");
        test("usage", "COMP-5",           "(P_USAGE COMP-5)");
        test("usage", "COMP-6",           "(P_USAGE COMP-6)");
        test("usage", "COMPUTATIONAL",      "(P_USAGE COMPUTATIONAL)");
        test("usage", "COMPUTATIONAL-1",    "(P_USAGE COMPUTATIONAL-1)");
        test("usage", "COMPUTATIONAL-2",    "(P_USAGE COMPUTATIONAL-2)");
        test("usage", "COMPUTATIONAL-3",    "(P_USAGE COMPUTATIONAL-3)");
        test("usage", "COMPUTATIONAL-4",    "(P_USAGE COMPUTATIONAL-4)");
        test("usage", "COMPUTATIONAL-5",    "(P_USAGE COMPUTATIONAL-5)");
        test("usage", "COMPUTATIONAL-6",    "(P_USAGE COMPUTATIONAL-6)");
        test("usage", "DISPLAY",        "(P_USAGE DISPLAY)");
        test("usage", "PACKED-DECIMAL", "(P_USAGE PACKED-DECIMAL)");
        test("usage", "INDEX",          "(P_USAGE INDEX)");
        test("usage", "USAGE BINARY",         "(P_USAGE BINARY)");
        test("usage", "USAGE COMP",           "(P_USAGE COMP)");
        test("usage", "USAGE COMPUTATIONAL",  "(P_USAGE COMPUTATIONAL)");
        test("usage", "USAGE DISPLAY",        "(P_USAGE DISPLAY)");
        test("usage", "USAGE IS PACKED-DECIMAL", "(P_USAGE PACKED-DECIMAL)");
        test("usage", "USAGE IS INDEX",          "(P_USAGE INDEX)");
        test("usage", "USAGE IS POINTER",          "(P_USAGE POINTER)");
    }

    @Test
    public void testValue() throws Exception {
        System.out.println("value_is");
        //  VALUE IS literal
        test("value", "VALUE 10", "(VALUE 10)");
        test("value", "VALUE IS 10", "(VALUE 10)");
        test("value", "VALUE \"STRING 10\"", "(VALUE \"STRING 10\")");
        test("value", "VALUE ALL \"STRING 10\"", "(VALUE ALL \"STRING 10\")");
        test("value", "VALUE SPACE",  "(VALUE SPACE)");
        test("value", "VALUE SPACES", "(VALUE SPACES)");
        test("value", "VALUE ALL SPACE",  "(VALUE ALL SPACE)");
        test("value", "VALUE ALL SPACES", "(VALUE ALL SPACES)");
        test("value", "VALUE ZERO",  "(VALUE ZERO)");
        test("value", "VALUE ZEROS", "(VALUE ZEROS)");
        test("value", "VALUE ZEROES", "(VALUE ZEROES)");
        test("value", "VALUE ALL ZERO",  "(VALUE ALL ZERO)");
        test("value", "VALUE ALL ZEROS", "(VALUE ALL ZEROS)");
        test("value", "VALUE ALL ZEROES", "(VALUE ALL ZEROES)");
        test("value", "VALUE HIGH-VALUE",  "(VALUE HIGH-VALUE)");
        test("value", "VALUE HIGH-VALUES", "(VALUE HIGH-VALUES)");
        test("value", "VALUE ALL HIGH-VALUE",  "(VALUE ALL HIGH-VALUE)");
        test("value", "VALUE ALL HIGH-VALUES", "(VALUE ALL HIGH-VALUES)");
        test("value", "VALUE LOW-VALUE",  "(VALUE LOW-VALUE)");
        test("value", "VALUE LOW-VALUES", "(VALUE LOW-VALUES)");
        test("value", "VALUE ALL LOW-VALUE",  "(VALUE ALL LOW-VALUE)");
        test("value", "VALUE ALL LOW-VALUES", "(VALUE ALL LOW-VALUES)");
        test("value", "VALUE QUOTES", "(VALUE QUOTES)");
        test("value", "VALUE ALL QUOTES", "(VALUE ALL QUOTES)");
        test("value", "VALUE NULLS", "(VALUE NULLS)");
        test("value", "VALUE ALL NULLS", "(VALUE ALL NULLS)");
        test("value", "VALUE NULL", "(VALUE NULL)");
        test("value", "VALUE ALL NULL", "(VALUE ALL NULL)");
        test("value", "VALUE A & B", "(VALUE (& A B))");

        //  Condition names
        test("value", "VALUES 10", "(VALUES 10)");
        test("value", "VALUES ARE 10", "(VALUES 10)");
        test("value", "VALUES ARE 10 THRU 20", "(VALUES (P_PAIR 10 20))");
        test("value", "VALUES ARE 10 THRU 20 30 THRU 40", "(VALUES (P_PAIR 10 20) (P_PAIR 30 40))");
        test("value", "VALUE \"-\", \"+\", \"0\".", "(VALUE \"-\" \"+\" \"0\")");
        test("value", "VALUE IS A WHEN SET TO FALSE IS B", "(VALUE A (FALSE B))");
        test("value", "VALUE IS A THRU B, C  WHEN SET TO FALSE IS D",
                "(VALUE (P_PAIR A B) C (FALSE D))");
        
        test("value", "VALUE IS LESS THAN C",   "(VALUE (P_OP_LESS C))");
        test("value", "VALUE IS LESS C",        "(VALUE (P_OP_LESS C))");
        test("value", "VALUE LESS C",           "(VALUE (P_OP_LESS C))");

        test("value", "VALUE IS LESS THAN OR EQUAL C",   "(VALUE (P_OP_LESS_EQUAL C))");
        test("value", "VALUE IS LESS OR EQUAL C",        "(VALUE (P_OP_LESS_EQUAL C))");
        test("value", "VALUE LESS THAN OR EQUAL C",      "(VALUE (P_OP_LESS_EQUAL C))");

        test("value", "VALUE IS < C",   "(VALUE (P_OP_LESS C))");
        test("value", "VALUE < C",      "(VALUE (P_OP_LESS C))");

        test("value", "VALUE IS <= C",   "(VALUE (P_OP_LESS_EQUAL C))");
        test("value", "VALUE <= C",      "(VALUE (P_OP_LESS_EQUAL C))");

        test("value", "VALUE IS > C",    "(VALUE (P_OP_GREATER C))");
        test("value", "VALUE > C",       "(VALUE (P_OP_GREATER C))");

        test("value", "VALUE IS >= C",   "(VALUE (P_OP_GREATER_EQUAL C))");
        test("value", "VALUE >= C",      "(VALUE (P_OP_GREATER_EQUAL C))");

        test("value", "VALUE IS EQUAL C","(VALUE (P_OP_EQUAL C))");
        test("value", "VALUE = C",       "(VALUE (P_OP_EQUAL C))");

        test("value", "VALUE IS NOT LESS THAN C",   "(VALUE (NOT P_OP_LESS C))");
        test("value", "VALUE IS NOT LESS C",        "(VALUE (NOT P_OP_LESS C))");
        test("value", "VALUE NOT LESS C",           "(VALUE (NOT P_OP_LESS C))");

        test("value", "VALUE IS NOT < C",   "(VALUE (NOT P_OP_LESS C))");
        test("value", "VALUE NOT < C",      "(VALUE (NOT P_OP_LESS C))");

        test("value", "VALUE IS NOT > C",    "(VALUE (NOT P_OP_GREATER C))");
        test("value", "VALUE NOT > C",       "(VALUE (NOT P_OP_GREATER C))");

        test("value", "VALUE IS NOT EQUAL C","(VALUE (NOT P_OP_EQUAL C))");
        test("value", "VALUE NOT = C",       "(VALUE (NOT P_OP_EQUAL C))");

        test("value", "VALUE LIKE CASE-INSENSITIVE 'A'","(VALUE (P_OP_CASE_INSENSITIVE 'A'))");
        test("value", "VALUE LIKE CASE-SENSITIVE 'B'",  "(VALUE (P_OP_CASE_SENSITIVE 'B'))");
        test("value", "VALUE LIKE TRIMMED LEFT A",  "(VALUE (P_OP_TRIMMED_LEFT A))");
        test("value", "VALUE LIKE TRIMMED RIGHT A", "(VALUE (P_OP_TRIMMED_RIGHT A))");
        test("value", "VALUE LIKE TRIMMED A",       "(VALUE (P_OP_TRIMMED_BOTH A))");
    }

    @Test
    public void testRelational_operator() throws Exception {
        System.out.println("relational_operator");
        test("relational_operator", "<",            "P_OP_LESS");
        test("relational_operator", "<=",           "P_OP_LESS_EQUAL");
        test("relational_operator", ">",            "P_OP_GREATER");
        test("relational_operator", ">=",           "P_OP_GREATER_EQUAL");
        test("relational_operator", "=",            "P_OP_EQUAL");
        test("relational_operator", "LIKE TRIMMED LEFT",    "P_OP_TRIMMED_LEFT");
        test("relational_operator", "LIKE TRIMMED RIGHT",   "P_OP_TRIMMED_RIGHT");
        test("relational_operator", "LIKE TRIMMED A",       "P_OP_TRIMMED_BOTH");
        test("relational_operator", "LIKE CASE-INSENSITIVE","P_OP_CASE_INSENSITIVE");
        test("relational_operator", "LIKE CASE-SENSITIVE",  "P_OP_CASE_SENSITIVE");
    }

    @Test
    public void testBasic_exp() throws Exception {
        System.out.println("basic_exp");
        test("basic_exp", "NEXT",           "NEXT");
        test("basic_exp", "LENGTH X",       "(LENGTH X)");
        test("basic_exp", "LENGTH OF X",    "(LENGTH X)");
        test("basic_exp", "SIZE X",         "(SIZE X)");
        test("basic_exp", "SIZE OF X",      "(SIZE X)");
        test("basic_exp", "START X",        "(START X)");
        test("basic_exp", "START OF X",     "(START X)");
        test("basic_exp", "A",              "A");
        test("basic_exp", "DATE-COMPILED",  "DATE-COMPILED");
    }

    @Test
    public void testConstant_expression() throws Exception {
        System.out.println("constant_expression");
        test("constant_expression", "NEXT",             "NEXT");
        test("constant_expression", "NOT NEXT",         "(NOT NEXT)");
        test("constant_expression", "SIZE OF X",        "(SIZE X)");
        test("constant_expression", "(SIZE OF X)",      "(P_PAREN_EXP (SIZE X))");
        test("constant_expression", "NOT (SIZE OF X)",  "(NOT (P_PAREN_EXP (SIZE X)))");
        test("constant_expression", "SIZE OF X * NEXT", "(* (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X + NEXT", "(+ (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X - NEXT", "(- (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X / NEXT", "(/ (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X ** NEXT", "(** (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X AND NEXT", "(AND (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X OR NEXT", "(OR (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X EXCLUSIVE OR NEXT", "(P_EXCLUSIVE_OR (SIZE X) NEXT)");
        test("constant_expression", "SIZE OF X + NEXT - DATE-COMPILED",
                "(+ (SIZE X) (- NEXT DATE-COMPILED))");
    }

    @Test
    public void testWhen() throws Exception {
        System.out.println("when");
        test("when", "FALSE A", "(FALSE A)");
        test("when", "WHEN SET TO FALSE IS A", "(FALSE A)");
    }


    @Test
    public void testLiteral() throws Exception {
        System.out.println("literal");
        test("literal", "A", "A");
        test("literal", "'A'", "'A'");
        test("literal", "'A' & 'B'", "(& 'A' 'B')");
        test("literal", "'A' & 'B' & 'c'", "(& 'A' 'B' 'c')");
        test("literal", "A & B & c", "(& A B c)");
    }

    @Test
    public void testFigurative_constant() throws Exception {
        System.out.println("figurative_constant");
        test("figurative_constant", "SPACE",        "SPACE");
        test("figurative_constant", "SPACES",       "SPACES");
        test("figurative_constant", "NULL",         "NULL");
        test("figurative_constant", "NULLS",        "NULLS");
        test("figurative_constant", "ZERO",         "ZERO");
        test("figurative_constant", "ZEROS",        "ZEROS");
        test("figurative_constant", "ZEROES",       "ZEROES");
        test("figurative_constant", "HIGH-VALUE",   "HIGH-VALUE");
        test("figurative_constant", "HIGH-VALUES",  "HIGH-VALUES");
        test("figurative_constant", "LOW-VALUE",    "LOW-VALUE");
        test("figurative_constant", "LOW-VALUES",   "LOW-VALUES");
        test("figurative_constant", "QUOTES",       "QUOTES");
    }

    @Test
    public void testQueue() throws Exception {
        System.out.println("queue");
        test("queue", "QUEUE Q",                    "(QUEUE Q)");
        test("queue", "SUB-QUEUE-1 Q",              "(SUB-QUEUE-1 Q)");
        test("queue", "SUB-QUEUE-2 Q",              "(SUB-QUEUE-2 Q)");
        test("queue", "SUB-QUEUE-3 Q",              "(SUB-QUEUE-3 Q)");
        test("queue", "SYMBOLIC QUEUE Q",           "(QUEUE Q)");
        test("queue", "SYMBOLIC SUB-QUEUE-1 Q",     "(SUB-QUEUE-1 Q)");
        test("queue", "SYMBOLIC SUB-QUEUE-2 Q",     "(SUB-QUEUE-2 Q)");
        test("queue", "SYMBOLIC SUB-QUEUE-3 Q",     "(SUB-QUEUE-3 Q)");
        test("queue", "SYMBOLIC QUEUE IS Q",        "(QUEUE Q)");
        test("queue", "SYMBOLIC SUB-QUEUE-1 IS Q",  "(SUB-QUEUE-1 Q)");
        test("queue", "SYMBOLIC SUB-QUEUE-2 IS Q",  "(SUB-QUEUE-2 Q)");
        test("queue", "SYMBOLIC SUB-QUEUE-3 IS Q",  "(SUB-QUEUE-3 Q)");
    }

    @Test
    public void testMessage_date() throws Exception {
        System.out.println("message_date");
        test("message_date", "MESSAGE DATE A",      "(P_MESSAGE_DATE A)");
        test("message_date", "MESSAGE DATE IS A",   "(P_MESSAGE_DATE A)");
    }

    @Test
    public void testMessage_time() throws Exception {
        System.out.println("message_time");
        test("message_time", "MESSAGE TIME A",      "(P_MESSAGE_TIME A)");
        test("message_time", "MESSAGE TIME IS A",   "(P_MESSAGE_TIME A)");
    }

    @Test
    public void testSource() throws Exception {
        System.out.println("source");
        test("source", "SOURCE A",              "(P_SYMBOLIC_SOURCE A)");
        test("source", "SOURCE IS A",           "(P_SYMBOLIC_SOURCE A)");
        test("source", "SYMBOLIC SOURCE IS A",  "(P_SYMBOLIC_SOURCE A)");
    }

    @Test
    public void testText_length() throws Exception {
        System.out.println("text_length");
        test("text_length", "TEXT LENGTH A",    "(P_TEXT_LENGTH A)");
        test("text_length", "TEXT LENGTH IS A", "(P_TEXT_LENGTH A)");
    }

    @Test
    public void testStatus_key() throws Exception {
        System.out.println("status_key");
        test("status_key", "STATUS KEY A",      "(P_STATUS_KEY A)");
        test("status_key", "STATUS KEY IS A",   "(P_STATUS_KEY A)");
    }

    @Test
    public void testEnd_key() throws Exception {
        System.out.println("end_key");
        test("end_key", "END KEY A",    "(P_END_KEY A)");
        test("end_key", "END KEY IS A", "(P_END_KEY A)");
    }

    @Test
    public void testError_key() throws Exception {
        System.out.println("error_key");
        test("error_key", "ERROR KEY A",    "(P_ERROR_KEY A)");
        test("error_key", "ERROR KEY IS A", "(P_ERROR_KEY A)");
    }

    @Test
    public void testDestination_count() throws Exception {
        System.out.println("destination_count");
        test("destination_count", "DESTINATION COUNT A",    "(P_DESTINATION_COUNT A)");
        test("destination_count", "DESTINATION COUNT IS A", "(P_DESTINATION_COUNT A)");
    }

    @Test
    public void testMessage_count() throws Exception {
        System.out.println("message_count");
        test("message_count", "MESSAGE COUNT A",    "(P_MESSAGE_COUNT A)");
        test("message_count", "MESSAGE COUNT IS A", "(P_MESSAGE_COUNT A)");
    }

    @Test
    public void testSymbolic_destination() throws Exception {
        System.out.println("symbolic_destination");
        test("symbolic_destination", "DESTINATION A",           "(P_SYMBOLIC_DESTINATION A)");
        test("symbolic_destination", "DESTINATION IS A",        "(P_SYMBOLIC_DESTINATION A)");
        test("symbolic_destination", "SYMBOLIC DESTINATION A",  "(P_SYMBOLIC_DESTINATION A)");
        test("symbolic_destination", "SYMBOLIC DESTINATION IS A",  "(P_SYMBOLIC_DESTINATION A)");
    }

    @Test
    public void testSymbolic_terminal() throws Exception {
        System.out.println("symbolic_terminal");
        test("symbolic_terminal", "TERMINAL A",           "(P_SYMBOLIC_TERMINAL A)");
        test("symbolic_terminal", "TERMINAL IS A",        "(P_SYMBOLIC_TERMINAL A)");
        test("symbolic_terminal", "SYMBOLIC TERMINAL A",  "(P_SYMBOLIC_TERMINAL A)");
    }

    @Test
    public void testDestination_table() throws Exception {
        System.out.println("destination_table");
        test("destination_table", "DESTINATION TABLE OCCURS 10", "(P_DESTINATION_TABLE (OCCURS (P_PAIR 10)))");
        test("destination_table", "DESTINATION TABLE OCCURS 10 TIMES", "(P_DESTINATION_TABLE (OCCURS (P_PAIR 10)))");
        test("destination_table",
                "DESTINATION TABLE OCCURS 10 TIMES\n" +
                "INDEXED BY A",
                "(P_DESTINATION_TABLE (OCCURS (P_PAIR 10) (INDEXED A)))");
        test("destination_table",
                "DESTINATION TABLE OCCURS 10 TIMES\n" +
                "INDEXED BY A, B",
                "(P_DESTINATION_TABLE (OCCURS (P_PAIR 10) (INDEXED A B)))");
        }

    @Test
    public void testCd_input() throws Exception {
        System.out.println("cd_input");
        test("cd_input", "CD Q INPUT",              "(CD INPUT Q)");
        test("cd_input", "CD Q INITIAL INPUT",      "(CD INPUT Q INITIAL)");
        test("cd_input", "CD Q FOR INITIAL INPUT",  "(CD INPUT Q INITIAL)");
        test("cd_input", "CD Q FOR INITIAL INPUT\n" +
                "SYMBOLIC QUEUE IS Q, SUB-QUEUE-1 IS Q1, SUB-QUEUE-2 IS Q2\n" +
                "MESSAGE DATE IS FEC MESSAGE TIME IS TIM\n" +
                "SYMBOLIC SOURCE IS SRC TEXT LENGTH IS LEN.",
                "(CD INPUT Q INITIAL (QUEUE Q) (SUB-QUEUE-1 Q1) (SUB-QUEUE-2 Q2) (P_MESSAGE_DATE FEC) "+
                "(P_MESSAGE_TIME TIM) (P_SYMBOLIC_SOURCE SRC) (P_TEXT_LENGTH LEN))");
    }

    @Test
    public void testCd_output() throws Exception {
        System.out.println("cd_output");
        test("cd_output", "CD Q OUTPUT",        "(CD OUTPUT Q)");
        test("cd_output", "CD Q FOR OUTPUT",    "(CD OUTPUT Q)");
        test("cd_output", "CD Q FOR OUTPUT\n" +
                "DESTINATION COUNT C\n" +
                "SYMBOLIC DESTINATION IS DST TEXT LENGTH IS LEN.",
                "(CD OUTPUT Q (P_DESTINATION_COUNT C) "+
                "(P_SYMBOLIC_DESTINATION DST) (P_TEXT_LENGTH LEN))");
    }

    @Test
    public void testCd_io() throws Exception {
        System.out.println("cd_io");
        test("cd_io", "CD Q I-O",              "(CD I-O Q)");
        test("cd_io", "CD Q INITIAL I-O",      "(CD I-O Q INITIAL)");
        test("cd_io", "CD Q FOR INITIAL I-O",  "(CD I-O Q INITIAL)");
        test("cd_io", "CD Q FOR INITIAL I-O\n" +
                "MESSAGE DATE IS FEC MESSAGE TIME IS TIM\n" +
                "SYMBOLIC TERMINAL IS TERM TEXT LENGTH IS LEN\n" +
                "END KEY IS EK STATUS KEY ST.",
                "(CD I-O Q INITIAL (P_MESSAGE_DATE FEC) "+
                "(P_MESSAGE_TIME TIM) (P_SYMBOLIC_TERMINAL TERM) (P_TEXT_LENGTH LEN) (P_END_KEY EK) (P_STATUS_KEY ST))");
    }

    @Test
    public void testCommunication_section() throws Exception {
        System.out.println("communication_section");
        test("communication_section", "COMMUNICATION SECTION.", "COMMUNICATION");
        test("communication_section",
                "COMMUNICATION SECTION.\n" +
                "CD Q FOR INITIAL I-O\n" +
                "MESSAGE DATE IS FEC MESSAGE TIME IS TIM\n" +
                "SYMBOLIC TERMINAL IS TERM TEXT LENGTH IS LEN\n" +
                "END KEY IS EK STATUS KEY ST.",
                "(COMMUNICATION (CD I-O Q INITIAL (P_MESSAGE_DATE FEC) "+
                "(P_MESSAGE_TIME TIM) (P_SYMBOLIC_TERMINAL TERM) (P_TEXT_LENGTH LEN) (P_END_KEY EK) (P_STATUS_KEY ST)))");
    }

    @Test
    public void testReport_section() throws Exception {
        System.out.println("report_section");
        test("report_section", "REPORT SECTION.", "P_REPORT_SECTION");
        test("report_section",
                "REPORT SECTION.\n" +
                "RD STOCK PAGE LIMIT 66.\n" +
                "01 TYPE IS REPORT HEADING.",
                "(P_REPORT_SECTION (RD STOCK (PAGE (P_LIMIT 66)) (P_REPORT_GROUP 01 (TYPE P_REPORT_HEADING))))");
    }

    @Test
    public void testCode_clause() throws Exception {
        System.out.println("code_clause");
        test("code_clause", "CODE 'ABC'", "(CODE 'ABC')");
    }

    @Test
    public void testControl_clause() throws Exception {
        System.out.println("control_clause");
        test("control_clause", "CONTROL A",                 "(CONTROL A)");
        test("control_clause", "CONTROL A B",               "(CONTROL A B)");
        test("control_clause", "CONTROL A IN B",            "(CONTROL (A B))");
        test("control_clause", "CONTROL IS A",              "(CONTROL A)");
        test("control_clause", "CONTROL IS A B",            "(CONTROL A B)");
        test("control_clause", "CONTROL IS A IN B",         "(CONTROL (A B))");
        test("control_clause", "CONTROL FINAL",             "(CONTROL FINAL)");
        test("control_clause", "CONTROL FINAL A",           "(CONTROL FINAL A)");
        test("control_clause", "CONTROL FINAL A B",         "(CONTROL FINAL A B)");
        test("control_clause", "CONTROL FINAL A IN B",      "(CONTROL FINAL (A B))");
        test("control_clause", "CONTROL IS FINAL A",        "(CONTROL FINAL A)");
        test("control_clause", "CONTROL IS FINAL A B",      "(CONTROL FINAL A B)");
        test("control_clause", "CONTROL IS FINAL A IN B",   "(CONTROL FINAL (A B))");
    }

    @Test
    public void testPage_limit_clause() throws Exception {
        System.out.println("page_limit_clause");
        test("page_limit_clause", "PAGE LIMIT IS 66\nHEADING 1\nFIRST DETAIL 6\n" +
                                  "LAST DETAIL 42 FOOTING 52",
                                  "(PAGE (P_LIMIT 66) (P_HEADING 1) (P_FIRST_DETAIL 6) (P_LAST_DETAIL 42) (P_FOOTING 52))");
    }

    @Test
    public void testLines_option() throws Exception {
        System.out.println("lines_option");
        test("lines_option", "10",                  "(P_LIMIT 10)");
        test("lines_option", "LIMIT 10",            "(P_LIMIT 10)");
        test("lines_option", "LIMIT 10 LINE",       "(P_LIMIT 10)");
        test("lines_option", "LIMIT 10 LINES",      "(P_LIMIT 10)");
        test("lines_option", "LIMIT IS 10 LINE",    "(P_LIMIT 10)");
        test("lines_option", "LIMIT IS 10 LINES",   "(P_LIMIT 10)");
    }

    @Test
    public void testHeading_option() throws Exception {
        System.out.println("heading_option");
        test("heading_option", "HEADING 10", "(P_HEADING 10)");
    }

    @Test
    public void testFirst_option() throws Exception {
        System.out.println("first_option");
        test("first_option", "FIRST DETAIL 10", "(P_FIRST_DETAIL 10)");
    }

    @Test
    public void testLast_option() throws Exception {
        System.out.println("last_option");
        test("last_option", "LAST DETAIL 10", "(P_LAST_DETAIL 10)");
    }

    @Test
    public void testFooting_option() throws Exception {
        System.out.println("footing_option");
        test("footing_option", "FOOTING 10", "(P_FOOTING 10)");
    }

    @Test
    public void testColumn_clause() throws Exception {
        System.out.println("column_clause");
        test("column_clause", "COLUMN 1", "(COLUMN 1)");
    }

    @Test
    public void testReport_group_desc() throws Exception {
        System.out.println("report_group_desc");
        test("report_group_desc", "01 TYPE IS REPORT HEADING.",              "(P_REPORT_GROUP 01 (TYPE P_REPORT_HEADING))");
        test("report_group_desc", "01 R1 TYPE IS REPORT HEADING.",           "(P_REPORT_GROUP 01 R1 (TYPE P_REPORT_HEADING))");
        test("report_group_desc", "02 LINE 2.",                              "(P_REPORT_GROUP 02 (LINE 2))");
        test("report_group_desc", "03 COLUMN 13 PIC X(22) VALUE ALL \"-\".", "(P_REPORT_GROUP 03 (COLUMN 13) (PIC X(22)) (VALUE ALL \"-\"))");
    }

    @Test
    public void testLine_clause() throws Exception {
        System.out.println("line_clause");
        test("line_clause", "LINE 1",                   "(LINE 1)");
        test("line_clause", "LINE NEXT PAGE",           "(LINE PAGE)");
        test("line_clause", "LINE PLUS 1",              "(LINE (PLUS 1))");
        test("line_clause", "LINE NUMBER 1",            "(LINE 1)");
        test("line_clause", "LINE NUMBER NEXT PAGE",    "(LINE PAGE)");
        test("line_clause", "LINE NUMBER PLUS 1",       "(LINE (PLUS 1))");
        test("line_clause", "LINE NUMBER IS 1",         "(LINE 1)");
        test("line_clause", "LINE NUMBER IS NEXT PAGE", "(LINE PAGE)");
        test("line_clause", "LINE NUMBER IS PLUS 1",    "(LINE (PLUS 1))");
    }

    @Test
    public void testNext_clause() throws Exception {
        System.out.println("next_clause");
        test("next_clause", "NEXT GROUP 1",             "(GROUP 1)");
        test("next_clause", "NEXT GROUP NEXT PAGE",     "(GROUP PAGE)");
        test("next_clause", "NEXT GROUP PLUS 1",        "(GROUP (PLUS 1))");
        test("next_clause", "NEXT GROUP IS 1",          "(GROUP 1)");
        test("next_clause", "NEXT GROUP IS NEXT PAGE",  "(GROUP PAGE)");
        test("next_clause", "NEXT GROUP IS PLUS 1",     "(GROUP (PLUS 1))");
    }

    @Test
    public void testSource_clause() throws Exception {
        System.out.println("source_clause");
        test("source_clause", "SOURCE A",           "(SOURCE A)");
        test("source_clause", "SOURCE A IN B",      "(SOURCE (A B))");
        test("source_clause", "SOURCE A OF B",      "(SOURCE (A B))");
        test("source_clause", "SOURCE IS A",        "(SOURCE A)");
        test("source_clause", "SOURCE IS A IN B",   "(SOURCE (A B))");
        test("source_clause", "SOURCE IS A OF B",   "(SOURCE (A B))");
    }

    @Test
    public void testType_clause() throws Exception {
        System.out.println("type_clause");
        test("type_clause", "TYPE REPORT HEADING",              "(TYPE P_REPORT_HEADING)");
        test("type_clause", "TYPE IS REPORT HEADING",           "(TYPE P_REPORT_HEADING)");
        test("type_clause", "TYPE IS CONTROL HEADING A OF B",   "(TYPE (P_CONTROL_HEADING (A B)))");
    }

    @Test
    public void testReport_type() throws Exception {
        System.out.println("report_type");
        test("report_type", "REPORT HEADING",           "P_REPORT_HEADING");
        test("report_type", "PAGE HEADING",             "P_PAGE_HEADING");
        test("report_type", "CONTROL HEADING FINAL",    "(P_CONTROL_HEADING FINAL)");
        test("report_type", "CONTROL HEADING A",        "(P_CONTROL_HEADING A)");
        test("report_type", "CONTROL HEADING A IN B",   "(P_CONTROL_HEADING (A B))");
        test("report_type", "CONTROL HEADING A OF B",   "(P_CONTROL_HEADING (A B))");
        test("report_type", "DETAIL",                   "P_DETAIL");
        test("report_type", "CONTROL FOOTING FINAL",    "(P_CONTROL_FOOTING FINAL)");
        test("report_type", "CONTROL FOOTING A",        "(P_CONTROL_FOOTING A)");
        test("report_type", "CONTROL FOOTING A IN B",   "(P_CONTROL_FOOTING (A B))");
        test("report_type", "CONTROL FOOTING A OF B",   "(P_CONTROL_FOOTING (A B))");
        test("report_type", "PAGE FOOTING",             "P_PAGE_FOOTING");
        test("report_type", "REPORT FOOTING",           "P_REPORT_FOOTING");

        test("report_type", "RH",          "P_REPORT_HEADING");
        test("report_type", "PH",          "P_PAGE_HEADING");
        test("report_type", "CH FINAL",    "(P_CONTROL_HEADING FINAL)");
        test("report_type", "CH A",        "(P_CONTROL_HEADING A)");
        test("report_type", "CH A IN B",   "(P_CONTROL_HEADING (A B))");
        test("report_type", "CH A OF B",   "(P_CONTROL_HEADING (A B))");
        test("report_type", "DE",          "P_DETAIL");
        test("report_type", "CF FINAL",    "(P_CONTROL_FOOTING FINAL)");
        test("report_type", "CF A",        "(P_CONTROL_FOOTING A)");
        test("report_type", "CF A IN B",   "(P_CONTROL_FOOTING (A B))");
        test("report_type", "CF A OF B",   "(P_CONTROL_FOOTING (A B))");
        test("report_type", "PF",          "P_PAGE_FOOTING");
        test("report_type", "RF",          "P_REPORT_FOOTING");
    }

    @Test
    public void testSum_clause() throws Exception {
        System.out.println("sum_clause");
        test("sum_clause", "SUM A",                                 "(SUM A)");
        test("sum_clause", "SUM A OF B",                            "(SUM (A B))");
        test("sum_clause", "SUM A UPON C",                          "(SUM A (UPON C))");
        test("sum_clause", "SUM A OF B UPON C",                     "(SUM (A B) (UPON C))");
        test("sum_clause", "SUM A OF B UPON C IN D",                "(SUM (A B) (UPON (C D)))");
        test("sum_clause", "SUM A RESET Z",                         "(SUM A (RESET Z))");
        test("sum_clause", "SUM A OF B RESET Z",                    "(SUM (A B) (RESET Z))");
        test("sum_clause", "SUM A UPON C RESET Z",                  "(SUM A (UPON C) (RESET Z))");
        test("sum_clause", "SUM A OF B UPON C RESET Z",             "(SUM (A B) (UPON C) (RESET Z))");
        test("sum_clause", "SUM A OF B UPON C IN D RESET Z",        "(SUM (A B) (UPON (C D)) (RESET Z))");
        test("sum_clause", "SUM A RESET FINAL",                     "(SUM A (RESET FINAL))");
        test("sum_clause", "SUM A OF B RESET FINAL",                "(SUM (A B) (RESET FINAL))");
        test("sum_clause", "SUM A UPON C RESET FINAL",              "(SUM A (UPON C) (RESET FINAL))");
        test("sum_clause", "SUM A OF B UPON C RESET FINAL",         "(SUM (A B) (UPON C) (RESET FINAL))");
        test("sum_clause", "SUM A OF B UPON C IN D RESET FINAL",    "(SUM (A B) (UPON (C D)) (RESET FINAL))");
        test("sum_clause", "SUM A RESET ON FINAL",                     "(SUM A (RESET FINAL))");
        test("sum_clause", "SUM A OF B RESET ON FINAL",                "(SUM (A B) (RESET FINAL))");
        test("sum_clause", "SUM A UPON C RESET ON FINAL",              "(SUM A (UPON C) (RESET FINAL))");
        test("sum_clause", "SUM A OF B UPON C RESET ON FINAL",         "(SUM (A B) (UPON C) (RESET FINAL))");
        test("sum_clause", "SUM A OF B UPON C IN D RESET ON FINAL",    "(SUM (A B) (UPON (C D)) (RESET FINAL))");
    }

    @Test
    public void testUpon() throws Exception {
        System.out.println("upon");
        test("upon", "UPON A", "(UPON A)");
        test("upon", "UPON A OF B", "(UPON (A B))");
        test("upon", "UPON A IN B", "(UPON (A B))");
    }
   
    @Test
    public void testReset_on() throws Exception {
        System.out.println("reset_on");
        test("reset_on", "RESET FINAL",     "(RESET FINAL)");
        test("reset_on", "RESET A",         "(RESET A)");
        test("reset_on", "RESET A OF B",    "(RESET (A B))");
        test("reset_on", "RESET A IN B",    "(RESET (A B))");
        test("reset_on", "RESET ON FINAL",  "(RESET FINAL)");
        test("reset_on", "RESET ON A",      "(RESET A)");
        test("reset_on", "RESET ON A OF B", "(RESET (A B))");
        test("reset_on", "RESET ON A IN B", "(RESET (A B))");
    }
    @Test
    public void testAdvance() throws Exception {
        System.out.println("advance");
        test("advance", "NEXT PAGE", "PAGE");
        test("advance", "PLUS 1",    "(PLUS 1)");
        test("advance", "10",         "10");
    }

    @Test
    public void testGroup_clause() throws Exception {
        System.out.println("group_clause");
        test("group_clause", "GROUP",           "GROUP");
        test("group_clause", "GROUP INDICATE",  "GROUP");
    }

    @Test
    public void testLinkage_section() throws Exception {
    }

    private void test(final String parseMethod, final String source, final String expResult) throws Exception {
        Dictionary dict     = new Dictionary("jcobol/parser/divisions/DataDivision.tokens");
        TokenFactory fact   = new TokenFactory(dict.getDictionary());
        CobolLexer lexer    = new CobolLexer(new StringReader(expand(source)));
        TokenList tokens    = lexer.getTokens();
        List<AntlrCobolToken> list = fact.getTokens(tokens);
        CobolTokenStream cb = new CobolTokenStream(list);
        DataDivision instance = new DataDivision(cb);
        Method met = DataDivision.class.getMethod(parseMethod);
        try {
            ParserRuleReturnScope ret = (ParserRuleReturnScope) met.invoke(instance);
            String result             = ((CommonTree) ret.getTree()).toStringTree();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace(System.err);
            fail("Invocation error");
        }

    }

    private String expand(final String source) {
        String[] parts = source.split("\n");
        StringBuffer buffer = new StringBuffer();
        for (String p : parts) {
            buffer.append("000001 ").append(p).append("\n");
        }
        buffer.deleteCharAt(buffer.length() - 1);
        return buffer.toString();
    }
}

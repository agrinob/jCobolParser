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
public class EnvironmentDivisionTest {

    public EnvironmentDivisionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testEnv_division() throws Exception {
        System.out.println("env_division");
        test("env_division", "ENVIRONMENT DIVISION.", "ENVIRONMENT");
        test("env_division",
                "ENVIRONMENT DIVISION.\n" +
                "CONFIGURATION SECTION.\n" +
                "SOURCE-COMPUTER. IBM390.\n" +
                "OBJECT-COMPUTER. IBM390.\n" +
                "SPECIAL-NAMES. ALPHABET ALPHA IS NATIVE.",
                "(ENVIRONMENT (CONFIGURATION (SOURCE-COMPUTER IBM390) (OBJECT-COMPUTER IBM390) (SPECIAL-NAMES (ALPHABET ALPHA NATIVE))))");
    }

    @Test
    public void testConfiguration_section() throws Exception {
        System.out.println("configuration_section");
        test("configuration_section",
                "CONFIGURATION SECTION.\n" +
                "SPECIAL-NAMES. ALPHABET ALPHA IS NATIVE.",
                "(CONFIGURATION (SPECIAL-NAMES (ALPHABET ALPHA NATIVE)))");
        test("configuration_section",
                "CONFIGURATION SECTION.\n" +
                "SOURCE-COMPUTER. IBM390.\n" +
                "OBJECT-COMPUTER. IBM390.\n" +
                "SPECIAL-NAMES. ALPHABET ALPHA IS NATIVE.",
                "(CONFIGURATION (SOURCE-COMPUTER IBM390) (OBJECT-COMPUTER IBM390) (SPECIAL-NAMES (ALPHABET ALPHA NATIVE)))");
        test("configuration_section",
                "CONFIGURATION SECTION.\n" +
                "SOURCE-COMPUTER. IBM390.\n" +
                "OBJECT-COMPUTER. IBM390.\n" +
                "SPECIAL-NAMES. A IS B.",
                "(CONFIGURATION (SOURCE-COMPUTER IBM390) (OBJECT-COMPUTER IBM390) (SPECIAL-NAMES (ENVIRONMENT_NAME A B)))");
    }

    @Test
    public void testSource_computer() throws Exception {
        System.out.println("source_computer");
        test("source_computer", "SOURCE-COMPUTER.", "SOURCE-COMPUTER");
        test("source_computer", "SOURCE-COMPUTER. IBM390.", "(SOURCE-COMPUTER IBM390)");
        test("source_computer", "SOURCE-COMPUTER. IBM390 DEBUGGING MODE.", "(SOURCE-COMPUTER IBM390 DEBUGGING)");
        test("source_computer", "SOURCE-COMPUTER. IBM390 WITH DEBUGGING MODE.", "(SOURCE-COMPUTER IBM390 DEBUGGING)");
    }

    @Test
    public void testObject_computer() throws Exception {
        System.out.println("object_computer");
        test("object_computer", "OBJECT-COMPUTER.", "OBJECT-COMPUTER");
        test("object_computer", "OBJECT-COMPUTER. IBM390.", "(OBJECT-COMPUTER IBM390)");
        test("object_computer", "OBJECT-COMPUTER.\n" +
                "IBM390 MEMORY SIZE 100 CHARACTERS\n" +
                "COLLATING SEQUENCE IS ALPHA\n" +
                "SEGMENT_LIMIT IS 10.",
                "(OBJECT-COMPUTER IBM390 (MEMORY 100 CHARACTERS) (SEQUENCE ALPHA) (SEGMENT_LIMIT 10))");
    }

    @Test
    public void testObject_computer_name() throws Exception {
        System.out.println("object_computer_name");
        test("object_computer_name", "IBM390.", "IBM390");
        test("object_computer_name",
                "IBM390 MEMORY SIZE 100 CHARACTERS\n" +
                "COLLATING SEQUENCE IS ALPHA\n" +
                "SEGMENT_LIMIT IS 10.",
                "IBM390 (MEMORY 100 CHARACTERS) (SEQUENCE ALPHA) (SEGMENT_LIMIT 10)");
    }

    @Test
    public void testMemory_size() throws Exception {
        System.out.println("memory_size");
        test("memory_size", "MEMORY 100 CHARACTERS",        "(MEMORY 100 CHARACTERS)");
        test("memory_size", "MEMORY 100 WORDS",             "(MEMORY 100 WORDS)");
        test("memory_size", "MEMORY 100 MODULES",           "(MEMORY 100 MODULES)");
        test("memory_size", "MEMORY SIZE 100 CHARACTERS",   "(MEMORY 100 CHARACTERS)");
        test("memory_size", "MEMORY SIZE 100 WORDS",        "(MEMORY 100 WORDS)");
        test("memory_size", "MEMORY SIZE 100 MODULES",      "(MEMORY 100 MODULES)");
    }

    @Test
    public void testProgram_collating() throws Exception {
        System.out.println("program_collating");
        test("program_collating", "SEQUENCE WORD", "(SEQUENCE WORD)");
        test("program_collating", "PROGRAM SEQUENCE WORD", "(SEQUENCE WORD)");
        test("program_collating", "COLLATING SEQUENCE WORD", "(SEQUENCE WORD)");
        test("program_collating", "PROGRAM COLLATING SEQUENCE WORD", "(SEQUENCE WORD)");
        test("program_collating", "SEQUENCE IS WORD", "(SEQUENCE WORD)");
        test("program_collating", "PROGRAM SEQUENCE IS WORD", "(SEQUENCE WORD)");
        test("program_collating", "COLLATING SEQUENCE IS WORD", "(SEQUENCE WORD)");
        test("program_collating", "PROGRAM COLLATING SEQUENCE IS WORD", "(SEQUENCE WORD)");
    }

    @Test
    public void testSegment_limit() throws Exception {
        System.out.println("segment_limit");
        test("segment_limit", "SEGMENT-LIMIT 200", "(SEGMENT-LIMIT 200)");
        test("segment_limit", "SEGMENT-LIMIT IS 200", "(SEGMENT-LIMIT 200)");
    }

    @Test
    public void testSpecial_names() throws Exception {
        System.out.println("special_names");
        test("special_names", "SPECIAL-NAMES.",                         "SPECIAL-NAMES");
        test("special_names", "SPECIAL-NAMES.\nA IS B.",                "(SPECIAL-NAMES (ENVIRONMENT_NAME A B))");
        test("special_names", "SPECIAL-NAMES.\nALPHABET AP IS NATIVE.", "(SPECIAL-NAMES (ALPHABET AP NATIVE))");
        test("special_names", "SPECIAL-NAMES.\nSYMBOLIC A.",            "(SPECIAL-NAMES (SYMBOLIC (P_LIST A)))");
        test("special_names", "SPECIAL-NAMES.\nA IS B\nALPHABET AP IS NATIVE.",
                                "(SPECIAL-NAMES (ENVIRONMENT_NAME A B) (ALPHABET AP NATIVE))");

    }

    @Test
    public void testEnvironment_names() throws Exception {
        System.out.println("environment_names");
        test("environment_names", "A IS B",             "(ENVIRONMENT_NAME A B)");
        test("environment_names", "A B",                "(ENVIRONMENT_NAME A B)");
        test("environment_names", "A IS B ON C",        "(ENVIRONMENT_NAME A B (ON C))");
        test("environment_names", "A ON C",             "(ENVIRONMENT_NAME A (ON C))");
        test("environment_names", "A IS B OFF D",       "(ENVIRONMENT_NAME A B (OFF D))");
        test("environment_names", "A OFF D",            "(ENVIRONMENT_NAME A (OFF D))");
        test("environment_names", "A IS B ON C OFF D",  "(ENVIRONMENT_NAME A B (ON C) (OFF D))");
        test("environment_names", "A ON C OFF D",       "(ENVIRONMENT_NAME A (ON C) (OFF D))");
    }

    @Test
    public void testStatus() throws Exception {
        System.out.println("status");
        test("status", "ON VAR",             "(ON VAR)");
        test("status", "ON STATUS VAR",      "(ON VAR)");
        test("status", "ON STATUS IS VAR",   "(ON VAR)");
        test("status", "OFF VAR",            "(OFF VAR)");
        test("status", "OFF STATUS VAR",     "(OFF VAR)");
        test("status", "OFF STATUS IS VAR",  "(OFF VAR)");
        test("status", "ON VAR OFF VAX",                     "(ON VAR) (OFF VAX)");
        test("status", "ON STATUS VAR OFF VAX",              "(ON VAR) (OFF VAX)");
        test("status", "ON STATUS IS VAR OFF VAX",           "(ON VAR) (OFF VAX)");
        test("status", "ON VAR OFF STATUS VAX",              "(ON VAR) (OFF VAX)");
        test("status", "ON VAR OFF STATUS IS VAX",           "(ON VAR) (OFF VAX)");
        test("status", "ON STATUS VAR OFF STATUS VAX",       "(ON VAR) (OFF VAX)");
        test("status", "ON STATUS IS VAR OFF STATUS IS VAX", "(ON VAR) (OFF VAX)");
    }

    @Test
    public void testOn_status() throws Exception {
        System.out.println("on_status");
        test("on_status", "ON A",           "(ON A)");
        test("on_status", "ON STATUS A",    "(ON A)");
        test("on_status", "ON IS A",        "(ON A)");
        test("on_status", "ON STATUS IS A", "(ON A)");
    }

    @Test
    public void testOff_status() throws Exception {
        System.out.println("off_status");
        test("off_status", "OFF A",           "(OFF A)");
        test("off_status", "OFF STATUS A",    "(OFF A)");
        test("off_status", "OFF IS A",        "(OFF A)");
        test("off_status", "OFF STATUS IS A", "(OFF A)");
    }

    @Test
    public void testAlphabet() throws Exception {
        System.out.println("alphabet");
        test("alphabet", "ALPHABET ALPHA STANDARD-1",   "(ALPHABET ALPHA STANDARD-1)");
        test("alphabet", "ALPHABET ALPHA STANDARD-2",   "(ALPHABET ALPHA STANDARD-2)");
        test("alphabet", "ALPHABET ALPHA NATIVE",       "(ALPHABET ALPHA NATIVE)");
        test("alphabet", "ALPHABET ALPHA EBCDIC",       "(ALPHABET ALPHA EBCDIC)");
        test("alphabet", "ALPHABET ALPHA A THROUGH B",  "(ALPHABET ALPHA (THROUGH A B))");
        test("alphabet", "ALPHABET ALPHA IS STANDARD-1","(ALPHABET ALPHA STANDARD-1)");
        test("alphabet", "ALPHABET ALPHA IS STANDARD-2","(ALPHABET ALPHA STANDARD-2)");
        test("alphabet", "ALPHABET ALPHA IS NATIVE",    "(ALPHABET ALPHA NATIVE)");
        test("alphabet", "ALPHABET ALPHA IS EBCDIC",    "(ALPHABET ALPHA EBCDIC)");
        test("alphabet", "ALPHABET ALPHA IS A THROUGH B","(ALPHABET ALPHA (THROUGH A B))");
        test("alphabet", "ALPHABET ALPHA IS A THROUGH B ALSO C","(ALPHABET ALPHA (THROUGH A B) (ALSO C))");
    }

    @Test
    public void testAlpha() throws Exception {
        System.out.println("alpha_name");
        test("alpha_name", "ALSO B",            "(ALSO B)");
        test("alpha_name", "A THROUGH B",       "(THROUGH A B)");
        test("alpha_name", "A THRU C",          "(THRU A C)");
        test("alpha_name", "ALSO 'B'",          "(ALSO 'B')");
        test("alpha_name", "'A' THROUGH 'B'",   "(THROUGH 'A' 'B')");
        test("alpha_name", "'A' THRU 'C'",      "(THRU 'A' 'C')");
        test("alpha_name", "A",                 "A");
        test("alpha_name", "'A'",               "'A'");
    }

    @Test
    public void testData_name() throws Exception {
        System.out.println("data_name");
        test("data_name", "A IN B",     "(A B)");
        test("data_name", "A OF B",     "(A B)");
        test("data_name", "A IN B OF C","(A B C)");
        test("data_name", "A",          "A");
    }
    @Test
    public void testSymbolic() throws Exception {
        System.out.println("symbolic");
        test("symbolic", "SYMBOLIC A",          "(SYMBOLIC (P_LIST A))");
        test("symbolic", "SYMBOLIC A IN ALPHA", "(SYMBOLIC (P_LIST A) (IN ALPHA))");
    }

    @Test
    public void testSymbolic_pair() throws Exception {
        System.out.println("symbolic_pair");
        test("symbolic_pair", "A",          "(P_LIST A)");
        test("symbolic_pair", "A B",        "(P_LIST A B)");
        test("symbolic_pair", "A B C",      "(P_LIST A B C)");
        test("symbolic_pair", "A ARE B",    "(ARE (P_LIST A) (P_LIST B))");
        test("symbolic_pair", "A ARE B C",  "(ARE (P_LIST A) (P_LIST B C))");
        test("symbolic_pair", "A B ARE C",  "(ARE (P_LIST A B) (P_LIST C))");
        test("symbolic_pair", "A IS B",     "(IS (P_LIST A) (P_LIST B))");
        test("symbolic_pair", "A IS B C",   "(IS (P_LIST A) (P_LIST B C))");
        test("symbolic_pair", "A B IS C",   "(IS (P_LIST A B) (P_LIST C))");
    }

    @Test
    public void testWord_list() throws Exception {
        System.out.println("word_list");
        test("word_list", "A", "(P_LIST A)");
        test("word_list", "A B", "(P_LIST A B)");
    }

    @Test
    public void testIn_alphabet() throws Exception {
        System.out.println("in_alphabet");
        test("in_alphabet", "IN ALPHA", "(IN ALPHA)");
    }

    @Test
    public void testClass_is() throws Exception {
        System.out.println("class_is");
        test("class_is", "CLASS CLASE IS CL",           "(CLASS CLASE CL)");
        test("class_is", "CLASS CLASE IS CL THRU XX",   "(CLASS CLASE (THRU CL XX))");
        test("class_is", "CLASS CLASE CL",              "(CLASS CLASE CL)");
        test("class_is", "CLASS CLASE CL THRU XX",      "(CLASS CLASE (THRU CL XX))");
    }

    @Test
    public void testSimple_pair() throws Exception {
        System.out.println("simple_pair");
        test("simple_pair", "A", "A");
        test("simple_pair", "A THRU B",     "(THRU A B)");
        test("simple_pair", "A THROUGH B",  "(THROUGH A B)");
    }

    @Test
    public void testInput_output_section() throws Exception {
        System.out.println("input_output_section");
        test("input_output_section", "INPUT-OUTPUT SECTION.\nFILE-CONTROL. SELECT ARCHIVO ASSIGN TO DISC.",
                "(INPUT-OUTPUT (FILE-CONTROL (SELECT ARCHIVO (ASSIGN DISC))))");
        test("input_output_section", "INPUT-OUTPUT SECTION.\nFILE-CONTROL. SELECT ARCHIVO ASSIGN TO DISC.\nSELECT IMP ASSIGN TO PRINT.",
                "(INPUT-OUTPUT (FILE-CONTROL (SELECT ARCHIVO (ASSIGN DISC)) (SELECT IMP (ASSIGN PRINT))))");
        test("input_output_section", "INPUT-OUTPUT SECTION.\n" +
                                        "FILE-CONTROL. SELECT ARCHIVO ASSIGN TO DISC.\n" +
                                        "I-O-CONTROL. SAME RECORD ARCH.",
                "(INPUT-OUTPUT (FILE-CONTROL (SELECT ARCHIVO (ASSIGN DISC))) (I-O-CONTROL (SAME ARCH)))");
    }

    @Test
    public void testFile_control() throws Exception {
        System.out.println("file_control");
        test("file_control", "FILE-CONTROL. SELECT ARCHIVO ASSIGN TO DISC.", "(FILE-CONTROL (SELECT ARCHIVO (ASSIGN DISC)))");
        test("file_control", "FILE-CONTROL. SELECT ARCHIVO ASSIGN TO DISC.\nSELECT IMP ASSIGN TO PRINT.",
                                "(FILE-CONTROL (SELECT ARCHIVO (ASSIGN DISC)) (SELECT IMP (ASSIGN PRINT)))");
    }

    @Test
    public void testFile_control_para() throws Exception {
        System.out.println("file_control_para");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC.", "(SELECT ARCHIVO (ASSIGN DISC))");
        test("file_control_para", "SELECT OPTIONAL ARCHIVO ASSIGN TO DISC.", "(SELECT ARCHIVO OPTIONAL (ASSIGN DISC))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC RESERVE 100 AREAS.", "(SELECT ARCHIVO (ASSIGN DISC) (RESERVE 100))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC ORGANIZATION IS SEQUENTIAL.", "(SELECT ARCHIVO (ASSIGN DISC) (P_ORGANIZATION SEQUENTIAL))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC PADDING SPACES.", "(SELECT ARCHIVO (ASSIGN DISC) (PADDING SPACES))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC RECORD DELIMITER IS NEWLINE.", "(SELECT ARCHIVO (ASSIGN DISC) (DELIMITER NEWLINE))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC ACCESS RANDOM.", "(SELECT ARCHIVO (ASSIGN DISC) (ACCESS RANDOM))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC RECORD KEY LLAVE.", "(SELECT ARCHIVO (ASSIGN DISC) (RECORD LLAVE))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC ALTERNATE RECORD LLAVE2.", "(SELECT ARCHIVO (ASSIGN DISC) (ALTERNATE LLAVE2))");
        test("file_control_para", "SELECT ARCHIVO ASSIGN TO DISC FILE STATUS IS ESTADO.", "(SELECT ARCHIVO (ASSIGN DISC) (STATUS ESTADO))");
        test("file_control_para",
                "SELECT OPTIONAL ARCHIVO ASSIGN TO DISC\n" +
                "RESERVE 100 AREA\n" +
                "ORGANIZATION IS SEQUENTIAL\n" +
                "PADDING CHARACTER IS ESPACIO\n" +
                "RECORD DELIMITER IS NEWLINE\n" +
                "ACCESS MODE SEQUENTIAL\n" +
                "RECORD KEY IS LLAVE\n" +
                "ALTERNATE RECORD IS LLAVE2\n" +
                "ALTERNATE RECORD IS LLAVE3\n" +
                "FILE STATUS IS ESTADO1.",
                "(SELECT ARCHIVO OPTIONAL (ASSIGN DISC) (RESERVE 100) (P_ORGANIZATION SEQUENTIAL) (PADDING ESPACIO) (DELIMITER NEWLINE) (ACCESS SEQUENTIAL) (RECORD LLAVE) (ALTERNATE LLAVE2) (ALTERNATE LLAVE3) (STATUS ESTADO1))"
                );
        }

    @Test
    public void testAssign_clause() throws Exception {
        System.out.println("assign_clause");
        test("assign_clause", "ASSIGN PRINTER", "(ASSIGN PRINTER)");
        test("assign_clause", "ASSIGN TO PRINTER", "(ASSIGN PRINTER)");
        test("assign_clause", "ASSIGN 'PRINTER'", "(ASSIGN 'PRINTER')");
        test("assign_clause", "ASSIGN TO 'PRINTER'", "(ASSIGN 'PRINTER')");
        test("assign_clause", "ASSIGN PRINTER ABC", "(ASSIGN PRINTER ABC)");
        test("assign_clause", "ASSIGN TO PRINTER ABC", "(ASSIGN PRINTER ABC)");
        test("assign_clause", "ASSIGN PRINTER \"ABC\"", "(ASSIGN PRINTER \"ABC\")");
        test("assign_clause", "ASSIGN TO PRINTER \"ABC\"", "(ASSIGN PRINTER \"ABC\")");
    }

    @Test
    public void testReserve_clause() throws Exception {
        System.out.println("reserve_clause");
        test("reserve_clause", "RESERVE 100", "(RESERVE 100)");
        test("reserve_clause", "RESERVE 100 AREA", "(RESERVE 100)");
    }

    @Test
    public void testConsole() throws Exception {
        System.out.println("console");
        test("console", "CONSOLE CRT", "CONSOLE");
        test("console", "CONSOLE IS CRT", "CONSOLE");
    }

    @Test
    public void testCrt_status() throws Exception {
        System.out.println("crt_status");
        test("crt_status", "CRT STATUS A OF B", "(CRT (A B))");
        test("crt_status", "CRT STATUS IS A IN B", "(CRT (A B))");
    }

    @Test
    public void testCursor() throws Exception {
        System.out.println("cursor");
        test("cursor", "CURSOR IS A", "(CURSOR A)");
        test("cursor", "CURSOR A OF B OF C", "(CURSOR (A B C))");
    }

    @Test
    public void testDecimal() throws Exception {
        System.out.println("decimal");
        test("decimal", "DECIMAL-POINT COMMA", "DECIMAL-POINT");
        test("decimal", "DECIMAL-POINT IS COMMA", "DECIMAL-POINT");
    }

    @Test
    public void testNumeric() throws Exception {
        System.out.println("numeric");
        test("numeric", "NUMERIC SIGN LEADING",                     "(SIGN LEADING)");
        test("numeric", "NUMERIC SIGN TRAILING",                    "(SIGN TRAILING)");
        test("numeric", "NUMERIC SIGN IS LEADING",                  "(SIGN LEADING)");
        test("numeric", "NUMERIC SIGN IS TRAILING",                 "(SIGN TRAILING)");
        test("numeric", "NUMERIC SIGN LEADING SEPARATE",            "(SIGN LEADING SEPARATE)");
        test("numeric", "NUMERIC SIGN TRAILING SEPARATE",           "(SIGN TRAILING SEPARATE)");
        test("numeric", "NUMERIC SIGN IS LEADING SEPARATE",         "(SIGN LEADING SEPARATE)");
        test("numeric", "NUMERIC SIGN IS TRAILING SEPARATE",        "(SIGN TRAILING SEPARATE)");
        test("numeric", "NUMERIC SIGN LEADING SEPARATE CHARACTER",  "(SIGN LEADING SEPARATE)");
        test("numeric", "NUMERIC SIGN TRAILING SEPARATE CHARACTER", "(SIGN TRAILING SEPARATE)");
        test("numeric", "NUMERIC SIGN IS LEADING SEPARATE CHARACTER","(SIGN LEADING SEPARATE)");
        test("numeric", "NUMERIC SIGN IS TRAILING SEPARATE CHARACTER","(SIGN TRAILING SEPARATE)");
    }

    @Test
    public void testCurrency() throws Exception {
        System.out.println("currency");
        test("currency", "CURRENCY '$'", "(CURRENCY '$')");
        test("currency", "CURRENCY SIGN '$'", "(CURRENCY '$')");
        test("currency", "CURRENCY SIGN IS '$'", "(CURRENCY '$')");
        test("currency", "CURRENCY IS '$'", "(CURRENCY '$')");
    }

    @Test
    public void testOrganization_clause() throws Exception {
        System.out.println("organization_clause");
        test("organization_clause", "SEQUENTIAL",                           "(P_ORGANIZATION SEQUENTIAL)");
        test("organization_clause", "ORGANIZATION SEQUENTIAL",              "(P_ORGANIZATION SEQUENTIAL)");
        test("organization_clause", "ORGANIZATION IS SEQUENTIAL",           "(P_ORGANIZATION SEQUENTIAL)");
        test("organization_clause", "LINE SEQUENTIAL",                      "(P_ORGANIZATION SEQUENTIAL LINE)");
        test("organization_clause", "ORGANIZATION LINE SEQUENTIAL",         "(P_ORGANIZATION SEQUENTIAL LINE)");
        test("organization_clause", "ORGANIZATION IS LINE SEQUENTIAL",      "(P_ORGANIZATION SEQUENTIAL LINE)");
        test("organization_clause", "BINARY SEQUENTIAL",                    "(P_ORGANIZATION SEQUENTIAL BINARY)");
        test("organization_clause", "ORGANIZATION BINARY SEQUENTIAL",       "(P_ORGANIZATION SEQUENTIAL BINARY)");
        test("organization_clause", "ORGANIZATION IS BINARY SEQUENTIAL",    "(P_ORGANIZATION SEQUENTIAL BINARY)");
        test("organization_clause", "INDEXED",                              "(P_ORGANIZATION INDEXED)");
        test("organization_clause", "ORGANIZATION INDEXED",                 "(P_ORGANIZATION INDEXED)");
        test("organization_clause", "ORGANIZATION IS INDEXED",  "(P_ORGANIZATION INDEXED)");
        test("organization_clause", "RELATIVE",                 "(P_ORGANIZATION RELATIVE)");
        test("organization_clause", "ORGANIZATION RELATIVE",    "(P_ORGANIZATION RELATIVE)");
        test("organization_clause", "ORGANIZATION IS RELATIVE", "(P_ORGANIZATION RELATIVE)");
    }

    @Test
    public void testPadding_clause() throws Exception {
        System.out.println("padding_clause");
        test("padding_clause", "PADDING X",             "(PADDING X)");
        test("padding_clause", "PADDING CHARACTER X",   "(PADDING X)");
        test("padding_clause", "PADDING CHARACTER IS X","(PADDING X)");
        test("padding_clause", "PADDING IS X",          "(PADDING X)");
        test("padding_clause", "PADDING X of U of Z",   "(PADDING (X U Z))");
    }

    @Test
    public void testRecord_delimiter_clause() throws Exception {
        System.out.println("record_delimiter_clause");
        test("record_delimiter_clause", "RECORD DELIMITER STANDARD-1",      "(DELIMITER STANDARD-1)");
        test("record_delimiter_clause", "RECORD DELIMITER IS STANDARD-1",   "(DELIMITER STANDARD-1)");
        test("record_delimiter_clause", "RECORD DELIMITER A",               "(DELIMITER A)");
        test("record_delimiter_clause", "RECORD DELIMITER IS A",            "(DELIMITER A)");
    }

    @Test
    public void testAccess_clause() throws Exception {
        System.out.println("access_clause");
        test("access_clause", "ACCESS SEQUENTIAL",                      "(ACCESS SEQUENTIAL)");
        test("access_clause", "ACCESS MODE SEQUENTIAL",                 "(ACCESS SEQUENTIAL)");
        test("access_clause", "ACCESS MODE IS SEQUENTIAL",              "(ACCESS SEQUENTIAL)");
        test("access_clause", "ACCESS SEQUENTIAL RELATIVE REL",         "(ACCESS SEQUENTIAL (RELATIVE REL))");
        test("access_clause", "ACCESS MODE SEQUENTIAL RELATIVE REL",    "(ACCESS SEQUENTIAL (RELATIVE REL))");
        test("access_clause", "ACCESS MODE IS SEQUENTIAL RELATIVE REL", "(ACCESS SEQUENTIAL (RELATIVE REL))");
        test("access_clause", "ACCESS RANDOM",                          "(ACCESS RANDOM)");
        test("access_clause", "ACCESS MODE RANDOM",                     "(ACCESS RANDOM)");
        test("access_clause", "ACCESS MODE IS RANDOM",                  "(ACCESS RANDOM)");
        test("access_clause", "ACCESS RANDOM RELATIVE REL",             "(ACCESS RANDOM (RELATIVE REL))");
        test("access_clause", "ACCESS MODE RANDOM RELATIVE REL",        "(ACCESS RANDOM (RELATIVE REL))");
        test("access_clause", "ACCESS MODE IS RANDOM RELATIVE REL",     "(ACCESS RANDOM (RELATIVE REL))");
        test("access_clause", "ACCESS DYNAMIC",                         "(ACCESS DYNAMIC)");
        test("access_clause", "ACCESS MODE DYNAMIC",                    "(ACCESS DYNAMIC)");
        test("access_clause", "ACCESS MODE IS DYNAMIC",                 "(ACCESS DYNAMIC)");
        test("access_clause", "ACCESS DYNAMIC RELATIVE REL",            "(ACCESS DYNAMIC (RELATIVE REL))");
        test("access_clause", "ACCESS MODE DYNAMIC RELATIVE REL",       "(ACCESS DYNAMIC (RELATIVE REL))");
        test("access_clause", "ACCESS MODE IS DYNAMIC RELATIVE REL",    "(ACCESS DYNAMIC (RELATIVE REL))");
    }

    @Test
    public void testRelative_clause() throws Exception {
        System.out.println("relative_clause");
        test("relative_clause", "RELATIVE REL",             "(RELATIVE REL)");
        test("relative_clause", "RELATIVE KEY REL",         "(RELATIVE REL)");
        test("relative_clause", "RELATIVE KEY IS REL",      "(RELATIVE REL)");
        test("relative_clause", "RELATIVE REL in A of B",   "(RELATIVE (REL A B))");
        }

    @Test
    public void testFile_status_clause() throws Exception {
        System.out.println("file_status_clause");
        test("file_status_clause", "STATUS ESTADO", "(STATUS ESTADO)");
        test("file_status_clause", "FILE STATUS ESTADO", "(STATUS ESTADO)");
        test("file_status_clause", "FILE STATUS IS ESTADO", "(STATUS ESTADO)");
        test("file_status_clause", "STATUS ESTADO in A", "(STATUS (ESTADO A))");
    }

    @Test
    public void testRecord_key_clause() throws Exception {
        System.out.println("record_key_clause");
        test("record_key_clause", "RECORD LLAVE.", "(RECORD LLAVE)");
        test("record_key_clause", "RECORD KEY LLAVE.", "(RECORD LLAVE)");
        test("record_key_clause", "RECORD KEY IS LLAVE.", "(RECORD LLAVE)");
        test("record_key_clause", "RECORD LLAVE of X.", "(RECORD (LLAVE X))");
    }

    @Test
    public void testAlternate_clause() throws Exception {
        System.out.println("alternate_clause");
        test("alternate_clause", "ALTERNATE RECORD REG", "(ALTERNATE REG)");
        test("alternate_clause", "ALTERNATE RECORD KEY REG", "(ALTERNATE REG)");
        test("alternate_clause", "ALTERNATE RECORD KEY IS REG", "(ALTERNATE REG)");
        test("alternate_clause", "ALTERNATE RECORD REG DUPLICATES", "(ALTERNATE REG DUPLICATES)");
        test("alternate_clause", "ALTERNATE RECORD KEY REG DUPLICATES", "(ALTERNATE REG DUPLICATES)");
        test("alternate_clause", "ALTERNATE RECORD KEY IS REG DUPLICATES", "(ALTERNATE REG DUPLICATES)");
        test("alternate_clause", "ALTERNATE RECORD KEY IS LLAVE WITH DUPLICATES.",
             "(ALTERNATE LLAVE DUPLICATES)");
        test("alternate_clause", "ALTERNATE RECORD REG in Z", "(ALTERNATE (REG Z))");
    }

    @Test
    public void testI_o_control() throws Exception {
        System.out.println("i_o_control");
        test("i_o_control", "I-O-CONTROL.", "I-O-CONTROL");
        test("i_o_control", "I-O-CONTROL.\nRERUN ON ARCH 10 RECORDS ARCH.", "(I-O-CONTROL (RERUN ARCH (RECORDS ARCH 10)))");
        test("i_o_control", "I-O-CONTROL.\nSAME RECORD FOR ARCH.", "(I-O-CONTROL (SAME ARCH))");
        test("i_o_control", "I-O-CONTROL.\nMULTIPLE FILE ARCH.", "(I-O-CONTROL (MULTIPLE (P_POSITION ARCH)))");
        test("i_o_control",
                "I-O-CONTROL.\nRERUN ON ARCH 10 RECORDS ARCH,\nSAME RECORD FOR ARCH,\nMULTIPLE FILE ARCH.",
                "(I-O-CONTROL (RERUN ARCH (RECORDS ARCH 10)) (SAME ARCH) (MULTIPLE (P_POSITION ARCH)))");
    }

    @Test
    public void testRerun_clause() throws Exception {
        System.out.println("rerun_clause");
        test("rerun_clause", "RERUN ON ARCH 100 RECORDS ARCH", "(RERUN ARCH (RECORDS ARCH 100))");
        test("rerun_clause", "RERUN ON ARCH EVERY 100 RECORDS ARCH", "(RERUN ARCH (RECORDS ARCH 100))");
        test("rerun_clause", "RERUN ON ARCH END REEL ARCH", "(RERUN ARCH (REEL ARCH))");
        test("rerun_clause", "RERUN ON ARCH EVERY END OF REEL OF ARCH", "(RERUN ARCH (REEL ARCH))");
        test("rerun_clause", "RERUN ON ARCH END UNIT ARCH", "(RERUN ARCH (UNIT ARCH))");
        test("rerun_clause", "RERUN ON ARCH EVERY END OF UNIT OF ARCH", "(RERUN ARCH (UNIT ARCH))");
    }


    @Test
    public void testEvery() throws Exception {
        System.out.println("every");
        test("every", "100 RECORDS ARCH", "(RECORDS ARCH 100)");
        test("every", "EVERY 100 RECORDS ARCH", "(RECORDS ARCH 100)");
        test("every", "EVERY 100 RECORDS OF ARCH", "(RECORDS ARCH 100)");
        test("every", "END REEL ARCH", "(REEL ARCH)");
        test("every", "EVERY END REEL ARCH", "(REEL ARCH)");
        test("every", "EVERY END OF REEL OF ARCH", "(REEL ARCH)");
        test("every", "END UNIT ARCH", "(UNIT ARCH)");
        test("every", "EVERY END UNIT ARCH", "(UNIT ARCH)");
        test("every", "EVERY END OF UNIT OF ARCH", "(UNIT ARCH)");
    }

    @Test
    public void testSame_clause() throws Exception {
        System.out.println("same_clause");
        test("same_clause", "SAME A",                       "(SAME A)");
        test("same_clause", "SAME RECORD AREA FOR A",       "(SAME A)");
        test("same_clause", "SAME SORT AREA FOR A",         "(SORT A)");
        test("same_clause", "SAME SORT-MERGE AREA FOR A",   "(SORT-MERGE A)");
    }

    @Test
    public void testMultiple_clause() throws Exception {
        System.out.println("multiple_clause");
        test("multiple_clause", "MULTIPLE FILE ARCH", "(MULTIPLE (P_POSITION ARCH))");
        test("multiple_clause", "MULTIPLE FILE ARCH POSITION 20", "(MULTIPLE (P_POSITION ARCH 20))");
    }

    @Test
    public void testPosition() throws Exception {
        System.out.println("alternate_clause");
        test("position", "ARCH",                "(P_POSITION ARCH)");
        test("position", "ARCH POSITION 10",    "(P_POSITION ARCH 10)");
    }
    private void test(final String parseMethod, final String source, final String expResult) throws Exception {
        Dictionary dict             = new Dictionary("jcobol/parser/divisions/EnvironmentDivision.tokens");
        TokenFactory fact           = new TokenFactory(dict.getDictionary());
        CobolLexer lexer            = new CobolLexer(new StringReader(expand(source)));
        TokenList tokens            = lexer.getTokens();
        List<AntlrCobolToken> list  = fact.getTokens(tokens);
        CobolTokenStream cb         = new CobolTokenStream(list);
        EnvironmentDivision instance= new EnvironmentDivision(cb);
        Method met                  = EnvironmentDivision.class.getMethod(parseMethod);
        try {
        ParserRuleReturnScope ret   = (ParserRuleReturnScope) met.invoke(instance);
        String result               = ((CommonTree) ret.getTree()).toStringTree();
        assertEquals(expResult, result);
        }
        catch(Exception ex) {
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
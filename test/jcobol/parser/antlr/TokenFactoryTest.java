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
package jcobol.parser.antlr;

import java.io.StringReader;
import java.util.List;
import java.util.Properties;
import jcobol.lexer.CobolLexer;
import jcobol.lexer.TokenList;
import jcobol.parser.utils.Dictionary;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andr&eacute;s Gri&ntilde;&oacute; Brandt <agrinob@hotmail.com>
 */
public class TokenFactoryTest {

    private final Properties dictionary;
    private final static String sDictionary =
            "AUTHOR=29\n"
            + "AREA_A=4\n"
            + "END_PSEUDO_TEXT=14\n"
            + "START_DEBUG=9\n"
            + "PERIOD=23\n"
            + "INITIAL=27\n"
            + "DATE_WRITTEN=31\n"
            + "CONTINUATION=5\n"
            + "DATE_COMPILED=32\n"
            + "INSTALLATION=30\n"
            + "TEXT=18\n"
            + "ID=20\n"
            + "IDENTIFICATION=19\n"
            + "START_PSEUDO_TEXT=12\n"
            + "WORD=24\n"
            + "COLON=15\n"
            + "RIGHT_PAREN=17\n"
            + "PROGRAM_ID=22\n"
            + "SPECIAL_LINE=8\n"
            + "IS=25\n"
            + "NEW_PAGE=6\n"
            + "DIVISION=21\n"
            + "LEFT_PAREN=16\n"
            + "COMMON=26\n"
            + "PROGRAM=28\n"
            + "END_DEBUG=10\n"
            + "COMMENT=7\n"
            + "SECURITY=33\n"
            + "PSEUDO_TEXT=13\n"
            + "STRING=11\n";
    private final static String pgma =
            "000100 IDENTIFICATION DIVISION.\n"
            + "000200 PROGRAM-ID.\n"
            + "000300     SM206A.\n"
            + "000400****************************************************************\n"
            + "002700 ENVIRONMENT DIVISION.\n"
            + "002800 CONFIGURATION SECTION.\n"
            + "002900 SOURCE-COMPUTER.\n"
            + "003000     XXXXX082.\n"
            + "003100 OBJECT-COMPUTER.\n"
            + "003200     XXXXX083.\n"
            + "003300 INPUT-OUTPUT SECTION.\n"
            + "003400 FILE-CONTROL.\n"
            + "003500     SELECT PRINT-FILE ASSIGN TO\n"
            + "003600     XXXXX055.\n"
            + "003700 DATA DIVISION.\n"
            + "003800 FILE SECTION.\n"
            + "003900 FD  PRINT-FILE.\n"
            + "004000 01  PRINT-REC PICTURE X(120).\n"
            + "004100 01  DUMMY-RECORD PICTURE X(120).\n"
            + "004200 WORKING-STORAGE SECTION.\n"
            + "021300 01  CCVS-PGM-ID                     PIC X(9)   VALUE\n"
            + "021400     \"SM206A\".\n"
            + "021500 PROCEDURE DIVISION.\n"
            + "021600 CCVS1 SECTION.\n"
            + "021700 OPEN-FILES.\n"
            + "021800     OPEN     OUTPUT PRINT-FILE.\n"
            + "021900     MOVE CCVS-PGM-ID TO TEST-ID. MOVE CCVS-PGM-ID TO ID-AGAIN.\n"
            + "022000     MOVE    SPACE TO TEST-RESULTS.\n"
            + "022100     PERFORM  HEAD-ROUTINE THRU COLUMN-NAMES-ROUTINE.\n"
            + "022200     GO TO CCVS1-EXIT.\n"
            + "022300 CLOSE-FILES.\n"
            + "022400     PERFORM END-ROUTINE THRU END-ROUTINE-13. CLOSE PRINT-FILE.\n";

    public TokenFactoryTest() {
        dictionary = new Properties();
        StringReader reader = new StringReader(sDictionary);
        try {
            dictionary.load(reader);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testGetTokensId() {
        System.out.println("getTokens");
        StringReader program = new StringReader(pgma);
        CobolLexer lexer = new CobolLexer(program);
        try {
            TokenList tokens = lexer.getTokens();
            String divisionName = "IDENTIFICATION";
            TokenFactory instance = new TokenFactory(dictionary);
            List lista = instance.getTokens(tokens, divisionName);
            int expResult = 7;
            int result = lista.size();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    @Test
    public void testGetTokensEnvironment() {
        System.out.println("getTokens");
        StringReader program = new StringReader(pgma);
        CobolLexer lexer = new CobolLexer(program);
        try {
            TokenList tokens = lexer.getTokens();
            String divisionName = "ENVIRONMENT";
            TokenFactory instance = new TokenFactory(dictionary);
            List lista = instance.getTokens(tokens, divisionName);
            int expResult = 25;
            int result = lista.size();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    @Test
    public void testGetTokensData() {
        System.out.println("getTokens");
        StringReader program = new StringReader(pgma);
        CobolLexer lexer = new CobolLexer(program);
        try {
            TokenList tokens = lexer.getTokens();
            String divisionName = "DATA";
            TokenFactory instance = new TokenFactory(dictionary);
            List lista = instance.getTokens(tokens, divisionName);
            int expResult = 29;
            int result = lista.size();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    @Test
    public void testGetTokensProcedure() {
        System.out.println("getTokens");
        StringReader program = new StringReader(pgma);
        CobolLexer lexer = new CobolLexer(program);
        try {
            TokenList tokens = lexer.getTokens();
            String divisionName = "PROCEDURE";
            TokenFactory instance = new TokenFactory(dictionary);
            List lista = instance.getTokens(tokens, divisionName);
            int expResult = 46;
            int result = lista.size();
            assertEquals(expResult, result);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}

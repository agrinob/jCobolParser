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
public class ProcedureDivisionTest {

    public ProcedureDivisionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testStmt_accept() throws Exception {
        System.out.println("stmt_accept");
        test("stmt_accept", "ACCEPT X FROM Y",                  "(P_ACCEPT_1 X (FROM Y))");
        test("stmt_accept", "ACCEPT X FROM CENTURY_DATE",       "(P_ACCEPT_1 X (FROM CENTURY_DATE))");
        test("stmt_accept", "ACCEPT X FROM DATE",               "(P_ACCEPT_1 X (FROM DATE))");
        test("stmt_accept", "ACCEPT X FROM DATE YYYYMMDD",      "(P_ACCEPT_1 X (FROM DATE YYYYMMDD))");
        test("stmt_accept", "ACCEPT X FROM DAY YYYYDDD",        "(P_ACCEPT_1 X (FROM DAY YYYYDDD))");
        test("stmt_accept", "ACCEPT X FROM ESCAPE",             "(P_ACCEPT_1 X (FROM ESCAPE))");
        test("stmt_accept", "ACCEPT X FROM ESCAPE KEY",         "(P_ACCEPT_1 X (FROM ESCAPE))");
        test("stmt_accept", "ACCEPT X FROM EXCEPTION",          "(P_ACCEPT_1 X (FROM EXCEPTION))");
        test("stmt_accept", "ACCEPT X FROM EXCEPTION STATUS",   "(P_ACCEPT_1 X (FROM EXCEPTION))");
        test("stmt_accept", "ACCEPT X FROM Y END-ACCEPT",       "(P_ACCEPT_1 X (FROM Y))");
    }

    @Test
    public void testStmt_acceptIO() throws Exception {
        System.out.println("stmt_accept (from IO)");
        test("stmt_accept", "ACCEPT X",                  "(P_ACCEPT_2 X)");
        test("stmt_accept", "ACCEPT X UNIT B",           "(P_ACCEPT_2 (X (UNIT B)))");
        test("stmt_accept", "ACCEPT A UNIT B WITH HIGH", "(P_ACCEPT_2 (A (UNIT B) (P_WITH HIGH)))");
        test("stmt_accept", "ACCEPT A UNIT B WITH ECHO", "(P_ACCEPT_2 (A (UNIT B) (P_WITH ECHO)))");
        test("stmt_accept", "ACCEPT X Y",                "(P_ACCEPT_2 X Y)");
    }

    @Test
    public void testStmt_acceptMessageCount() throws Exception {
        System.out.println("stmt_accept (message count)");
        test("stmt_accept", "ACCEPT X MESSAGE COUNT",               "(P_ACCEPT_3 X)");
        test("stmt_accept", "ACCEPT X MESSAGE COUNT END-ACCEPT",    "(P_ACCEPT_3 X)");
    }

    @Test
    public void testStmt_acceptScreenName() throws Exception {
        System.out.println("stmt_accept (screen name)");
        test("stmt_accept", "ACCEPT INVOICE-FORM AT LINE 10 COLUMN 5",   "(P_ACCEPT_2 (INVOICE-FORM (P_WITH (LINE 10) (COLUMN 5))))");
        test("stmt_accept", "ACCEPT INVOICE-FORM LINE 10 COLUMN 5",      "(P_ACCEPT_2 (INVOICE-FORM (P_WITH (LINE 10) (COLUMN 5))))");
        test("stmt_accept", "ACCEPT EOG AT COLUMN 10 LINE 5 END-ACCEPT", "(P_ACCEPT_2 (EOG (P_WITH (COLUMN 10) (LINE 5))))");
        test("stmt_accept", "ACCEPT EOG AT COLUMN 10 LINE 5\n" +
                "ON ESCAPE NEXT SENTENCE END-ACCEPT", "(P_ACCEPT_2 (EOG (P_WITH (COLUMN 10) (LINE 5))) (P_ON NEXT))");
    }

    @Test
    public void testOn_exception() throws Exception {
        System.out.println("on_exception");
        test("on_exception", "ON EXCEPTION NEXT SENTENCE", "(P_ON NEXT)");
        test("on_exception", "EXCEPTION NEXT SENTENCE", "(P_ON NEXT)");
        test("on_exception", "ESCAPE NEXT SENTENCE", "(P_ON NEXT)");
        test("on_exception", "ON ESCAPE NEXT SENTENCE", "(P_ON NEXT)");
    }

    @Test
    public void testNot_on_exception() throws Exception {
        System.out.println("not_on_exception");
        test("not_on_exception", "not ON EXCEPTION NEXT SENTENCE", "(P_NOT_ON NEXT)");
        test("not_on_exception", "not EXCEPTION NEXT SENTENCE", "(P_NOT_ON NEXT)");
        test("not_on_exception", "not ESCAPE NEXT SENTENCE", "(P_NOT_ON NEXT)");
        test("not_on_exception", "not ON ESCAPE NEXT SENTENCE", "(P_NOT_ON NEXT)");
    }

    @Test
    public void testWith() throws Exception {
        System.out.println("with");
        test("with", "WITH AUTO",                       "(P_WITH AUTO)");
        test("with", "WITH AUTO NO BEEP",               "(P_WITH AUTO P_NO_BELL)");
        test("with", "WITH AUTO, NO BEEP, CONTROL X",   "(P_WITH AUTO P_NO_BELL (CONTROL X))");
        test("with", "AUTO",                            "(P_WITH AUTO)");
        test("with", "AUTO NO BEEP",                    "(P_WITH AUTO P_NO_BELL)");
        test("with", "AUTO, NO BEEP, CONTROL X",        "(P_WITH AUTO P_NO_BELL (CONTROL X))");
    }

    @Test
    public void testFrom_io() throws Exception {
        System.out.println("from_io");
        test("from_io", "A", "A");
        test("from_io", "A UNIT B",             "(A (UNIT B))");
        test("from_io", "A WITH ECHO",          "(A (P_WITH ECHO))");
        test("from_io", "A UNIT B WITH ECHO",   "(A (UNIT B) (P_WITH ECHO))");
        test("from_io", "A ECHO",               "(A (P_WITH ECHO))");
        test("from_io", "A UNIT B ECHO",        "(A (UNIT B) (P_WITH ECHO))");
        test("from_io", "A ECHO NO BELL",          "(A (P_WITH ECHO P_NO_BELL))");
        test("from_io", "A UNIT B ECHO NO BELL",   "(A (UNIT B) (P_WITH ECHO P_NO_BELL))");
    }

    @Test
    public void testWith_option() throws Exception {
        System.out.println("with_option");
        test("with_option", "AUTO",         "AUTO");
        test("with_option", "AUTO-SKIP",    "AUTO-SKIP");
        test("with_option", "NO BEEP",      "P_NO_BELL");
        test("with_option", "NO BELL",      "P_NO_BELL");
        test("with_option", "BLINK",        "BLINK");
        test("with_option", "CONTROL X",    "(CONTROL X)");
        test("with_option", "CONTROL 'ABC'",    "(CONTROL 'ABC')");
        test("with_option", "CONVERT",          "CONVERT");
        test("with_option", "CURSOR A",         "(CURSOR A)");
        test("with_option", "CURSOR 'A'",       "(CURSOR 'A')");
        test("with_option", "ECHO",             "ECHO");
        test("with_option", "TAB",              "TAB");
        test("with_option", "UPDATE",           "UPDATE");
        test("with_option", "REVERSE",          "REVERSE");
        test("with_option", "REVERSED",         "REVERSED");
        test("with_option", "REVERSE-VIDEO",    "REVERSE-VIDEO");
        test("with_option", "ECHO",             "ECHO");
        test("with_option", "ERASE EOL",        "EOL");
        test("with_option", "ERASE EOS",        "EOS");
        test("with_option", "HIGHLIGHT",        "HIGHLIGHT");
        test("with_option", "LOWLIGHT",         "LOWLIGHT");
        test("with_option", "HIGH",             "HIGH");
        test("with_option", "LOW",              "LOW");
        test("with_option", "SECURE",           "SECURE");
        test("with_option", "OFF",              "OFF");
        test("with_option", "SIZE 5",           "(SIZE 5)");
        test("with_option", "SIZE X",           "(SIZE X)");
        test("with_option", "BEFORE TIME 5",    "(TIME 5)");
        test("with_option", "TIME 5",           "(TIME 5)");
        test("with_option", "BEFORE TIME A",    "(TIME A)");
        test("with_option", "TIME A",           "(TIME A)");
        test("with_option", "AT LINE 5",        "(LINE 5)");
        test("with_option", "LINE 5",           "(LINE 5)");
        test("with_option", "AT LINE A",        "(LINE A)");
        test("with_option", "LINE A",           "(LINE A)");
        test("with_option", "AT COL 5",         "(COL 5)");
        test("with_option", "COL 5",            "(COL 5)");
        test("with_option", "AT COL A",         "(COL A)");
        test("with_option", "COL A",            "(COL A)");
        test("with_option", "AT COLUMN 5",      "(COLUMN 5)");
        test("with_option", "COLUMN 5",         "(COLUMN 5)");
        test("with_option", "AT COLUMN A",      "(COLUMN A)");
        test("with_option", "COLUMN A",         "(COLUMN A)");
        test("with_option", "AT POSITION 5",    "(POSITION 5)");
        test("with_option", "POSITION 5",       "(POSITION 5)");
        test("with_option", "AT POSITION A",    "(POSITION A)");
        test("with_option", "POSITION A",       "(POSITION A)");
        test("with_option", "MODE IS BLOCK",    "BLOCK");
        test("with_option", "MODE BLOCK",       "BLOCK");
        test("with_option", "PROMPT CHARACTER IS A", "(PROMPT A)");
        test("with_option", "PROMPT CHARACTER A",    "(PROMPT A)");
        test("with_option", "PROMPT CHARACTER IS 'A'", "(PROMPT 'A')");
        test("with_option", "PROMPT CHARACTER 'A'",    "(PROMPT 'A')");
        test("with_option", "PROMPT 'A'",    "(PROMPT 'A')");
    }

    @Test
    public void testUnit() throws Exception {
        System.out.println("unit");
        test("unit", "UNIT A", "(UNIT A)");
        test("unit", "UNIT 'A'", "(UNIT 'A')");
    }

    @Test
    public void testUnit_with() throws Exception {
        System.out.println("unit_with");
        test("unit_with", "UNIT A",                 "(UNIT A)");
        test("unit_with", "WITH ECHO",              "(P_WITH ECHO)");
        test("unit_with", "ECHO",                   "(P_WITH ECHO)");
        test("unit_with", "UNIT A WITH ECHO",           "(UNIT A) (P_WITH ECHO)");
        test("unit_with", "UNIT A WITH ECHO, UPDATE",   "(UNIT A) (P_WITH ECHO UPDATE)");
        test("unit_with", "UNIT A ECHO, UPDATE",        "(UNIT A) (P_WITH ECHO UPDATE)");
    }

    @Test
    public void testStmt_add() throws Exception {
        System.out.println("stmt_add");
        test("stmt_add", "add 1 to b", "(P_ADD_1 (P_LIST 1) (P_LIST b))");
        test("stmt_add", "add 1 to b.", "(P_ADD_1 (P_LIST 1) (P_LIST b))");
    }

    @Test
    public void testOn_size() throws Exception {
        System.out.println("on_size");
        test("on_size", "ON SIZE ERROR ACCEPT X.",
                "(P_ON_SIZE (P_ACCEPT_2 X))");
    }

    @Test
    public void testStmt_add_errors() throws Exception {
        System.out.println("add error checking");
        test("stmt_add", "add 1 to b SIZE error accept x.",
                "(P_ADD_1 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 x)))");

        test("stmt_add", "add 1 to b SIZE error accept x NOT ON SIZE ERROR ACCEPT Y.",
                "(P_ADD_1 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 x)) (P_NOT_SIZE (P_ACCEPT_2 Y)))");

        test("stmt_add", "add 1 to b SIZE error accept x col 1 line 2 accept y at line 3.",
                "(P_ADD_1 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 (x (P_WITH (col 1) (line 2)))) (P_ACCEPT_2 (y (P_WITH (line 3))))))");

        test("stmt_add", "add 1 to b SIZE error accept x col 1 line 2 end-accept\naccept y at line 3.",
                "(P_ADD_1 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 (x (P_WITH (col 1) (line 2)))) (P_ACCEPT_2 (y (P_WITH (line 3))))))");

        test("stmt_add", "add 1 to b giving c SIZE error accept x.",
                "(P_ADD_2 (P_LIST 1) (P_LIST b) (P_LIST c) (P_ON_SIZE (P_ACCEPT_2 x)))");

        test("stmt_add", "add 1 to b giving c NOT SIZE error accept x.",
                "(P_ADD_2 (P_LIST 1) (P_LIST b) (P_LIST c) (P_NOT_SIZE (P_ACCEPT_2 x)))");

        test("stmt_add", "add 1 to b giving c SIZE error accept x\nNOT ON SIZE ERROR ACCEPT Y.",
                "(P_ADD_2 (P_LIST 1) (P_LIST b) (P_LIST c) (P_ON_SIZE (P_ACCEPT_2 x)) (P_NOT_SIZE (P_ACCEPT_2 Y)))");

        test("stmt_add", "add 1 to b giving c SIZE error accept x col 1 line 2\naccept y at line 3.",
                "(P_ADD_2 (P_LIST 1) (P_LIST b) (P_LIST c) (P_ON_SIZE (P_ACCEPT_2 (x (P_WITH (col 1) (line 2)))) (P_ACCEPT_2 (y (P_WITH (line 3))))))");

        test("stmt_add", "add 1 to b giving c SIZE error accept x col 1 line 2\nend-accept accept y at line 3.",
                "(P_ADD_2 (P_LIST 1) (P_LIST b) (P_LIST c) (P_ON_SIZE (P_ACCEPT_2 (x (P_WITH (col 1) (line 2)))) (P_ACCEPT_2 (y (P_WITH (line 3))))))");

        test("stmt_add", "add corresponding 1 to b SIZE error accept x.",
                "(P_ADD_3 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 x)))");

        test("stmt_add", "add corr 1 to b SIZE error accept x NOT ON SIZE ERROR ACCEPT Y.",
                "(P_ADD_3 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 x)) (P_NOT_SIZE (P_ACCEPT_2 Y)))");

        test("stmt_add", "add corr 1 to b SIZE error accept x col 1 line 2\naccept y at line 3.",
                "(P_ADD_3 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 (x (P_WITH (col 1) (line 2)))) (P_ACCEPT_2 (y (P_WITH (line 3))))))");

        test("stmt_add", "add corr 1 to b SIZE error accept x col 1 line 2\nend-accept accept y at line 3.",
                "(P_ADD_3 (P_LIST 1) (P_LIST b) (P_ON_SIZE (P_ACCEPT_2 (x (P_WITH (col 1) (line 2)))) (P_ACCEPT_2 (y (P_WITH (line 3))))))");
    }

    @Test
    public void testVar_ref() throws Exception {
        System.out.println("var_ref");
        test("var_ref", "ABC", "ABC");
    }

    @Test
    public void testIndex() throws Exception {
        System.out.println("index");
        test("index", "(A)",    "(P_INDEX A)");
        test("index", "(A, B)", "(P_INDEX A B)");
        test("index", "(A (B))", "(P_INDEX (A (P_INDEX B)))");
    }

    private void test(final String parseMethod, final String source, final String expResult) throws Exception {
        Dictionary dict     = new Dictionary("jcobol/parser/divisions/ProcedureDivision.tokens");
        TokenFactory fact   = new TokenFactory(dict.getDictionary());
        CobolLexer lexer    = new CobolLexer(new StringReader(expand(source)), "");
        TokenList tokens    = lexer.getTokens();
        List<AntlrCobolToken> list = fact.getTokens(tokens);
        CobolTokenStream cb = new CobolTokenStream(list);
        ProcedureDivision instance = new ProcedureDivision(cb);
        Method met = ProcedureDivision.class.getMethod(parseMethod);
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
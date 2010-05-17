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
public class IdDivisionTest {

    public IdDivisionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testId_division() throws Exception {
        System.out.println("id_division");
        test("id_division",
                " ID DIVISION.\n" +
                " PROGRAM-ID. X15.\n" +
                " AUTHOR. JOHN DOE.\n" +
                " INSTALLATION. NCR\n" +
                "               SANTIAGO.\n" +
                " DATE-WRITTEN. 01/01/10.\n" +
                " DATE-COMPILED. *\n" +
                " SECURITY. NONE\n" +
                "            (SEE DETAILS)",
                "(ID (PROGRAM-ID X15) (AUTHOR JOHN DOE.) (INSTALLATION NCR SANTIAGO.) (DATE-WRITTEN 01/01/10.) (DATE-COMPILED *) (SECURITY NONE (SEE DETAILS)))"
                );
    }

    @Test
    public void testProgram_id() throws Exception {
        System.out.println("program_id");
        test("program_id", "PROGRAM-ID. PGMA.",                             "(PROGRAM-ID PGMA)");
        test("program_id", "PROGRAM-ID. PGMA IS COMMON INITIAL PROGRAM.",   "(PROGRAM-ID PGMA COMMON INITIAL)");
        test("program_id", "PROGRAM-ID. PGMA IS INITIAL COMMON PROGRAM.",   "(PROGRAM-ID PGMA INITIAL COMMON)");
        test("program_id", "PROGRAM-ID. PGMA IS COMMON PROGRAM.",           "(PROGRAM-ID PGMA COMMON)");
        test("program_id", "PROGRAM-ID. PGMA IS INITIAL PROGRAM.",          "(PROGRAM-ID PGMA INITIAL)");
    }

    @Test
    public void testAuthor() throws Exception {
        System.out.println("author");
        test("author", "AUTHOR.", "AUTHOR");
    }

    @Test
    public void testInstallation() throws Exception {
        System.out.println("installation");
        test("installation", "INSTALLATION.", "INSTALLATION");
    }

    @Test
    public void testDate_written() throws Exception {
        System.out.println("date_written");
        test("date_written", "DATE-WRITTEN.", "DATE-WRITTEN");
    }

    @Test
    public void testDate_compiled() throws Exception {
        System.out.println("date_compiled");
        test("date_compiled", "DATE-COMPILED.", "DATE-COMPILED");
    }

    @Test
    public void testSecurity() throws Exception {
        System.out.println("security");
        test("security", "SECURITY.", "SECURITY");
    }

    private void test(final String parseMethod, final String source, final String expResult) throws Exception {
        Dictionary dict     = new Dictionary("jcobol/parser/divisions/IdDivision.tokens");
        TokenFactory fact   = new TokenFactory(dict.getDictionary());
        CobolLexer lexer    = new CobolLexer(new StringReader(expand(source)));
        TokenList tokens    = lexer.getTokens();
        List<AntlrCobolToken> list = fact.getTokens(tokens);
        CobolTokenStream cb = new CobolTokenStream(list);
        IdDivision instance = new IdDivision(cb);
        Method met = IdDivision.class.getMethod(parseMethod);
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
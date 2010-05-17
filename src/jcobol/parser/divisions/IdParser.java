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

import java.io.IOException;
import java.util.List;
import jcobol.lexer.TokenList;
import jcobol.parser.antlr.AntlrCobolToken;
import jcobol.parser.antlr.CobolTokenStream;
import jcobol.parser.antlr.TokenFactory;
import jcobol.parser.utils.Dictionary;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Andr&eacute;s Gri&ntilde;&oacute; Brandt <agrinob@hotmail.com>
 */
public class IdParser  {

    private final TokenList tokens;
    public IdParser(final TokenList tokens) {
        this.tokens = tokens;
    }

    public IdDivision.id_division_return parse() throws RecognitionException, IOException {

        Dictionary dict             = new Dictionary("jcobol/parser/divisions/IdDivision.tokens");
        TokenFactory fact           = new TokenFactory(dict.getDictionary());
        List<AntlrCobolToken> list  = fact.getTokens(tokens, "IDENTIFICATION");
        CobolTokenStream cb         = new CobolTokenStream(list);

        IdDivision iddiv = new IdDivision(cb);
        return iddiv.id_division();
    }
}

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
public class DataParser {
    private final TokenList tokens;
    public DataParser(final TokenList tokens) {
        this.tokens = tokens;
    }

    public DataDivision.data_div_return parse() throws RecognitionException, IOException {

        Dictionary dict             = new Dictionary("jcobol/parser/divisions/DataDivision.tokens");
        TokenFactory fact           = new TokenFactory(dict.getDictionary());
        List<AntlrCobolToken> list  = fact.getTokens(tokens, "DATA");
        CobolTokenStream cb         = new CobolTokenStream(list);

        DataDivision datadiv = new DataDivision(cb);
        DataDivision.data_div_return ret = datadiv.data_div();
        return ret;
    }

}

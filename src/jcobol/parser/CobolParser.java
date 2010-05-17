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

package jcobol.parser;

import java.io.IOException;
import java.io.Reader;
import jcobol.lexer.CobolLexer;
import jcobol.lexer.TokenList;
import jcobol.parser.divisions.DataDivision;
import jcobol.parser.divisions.DataParser;
import jcobol.parser.divisions.EnvironmentDivision;
import jcobol.parser.divisions.EnvironmentParser;
import jcobol.parser.divisions.IdDivision;
import jcobol.parser.divisions.IdParser;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author Andr&eacute;s Gri&ntilde;&oacute; Brandt <agrinob@hotmail.com>
 */
public class CobolParser {
    private final Reader source;
    private IdDivision.id_division_return idDiv;
    private EnvironmentDivision.env_division_return envDiv;
    private DataDivision.data_div_return dataDiv;

    public CobolParser(final Reader source) {
        this.source = source;
    }

    public void parse() throws IOException, RecognitionException {
        CobolLexer lexer = new CobolLexer(source);
        TokenList tokens = lexer.getTokens();
        IdParser idParser = new IdParser(tokens);
        EnvironmentParser envParser = new EnvironmentParser(tokens);
        DataParser dataParser = new DataParser(tokens);
        idDiv   = idParser.parse();
        envDiv  = envParser.parse();
        dataDiv = dataParser.parse();
    }

    public IdDivision.id_division_return getIdDiv() {
        return idDiv;
    }

    public EnvironmentDivision.env_division_return getEnvDiv() {
        return envDiv;
    }

    public DataDivision.data_div_return getDataDiv() {
        return dataDiv;
    }
}

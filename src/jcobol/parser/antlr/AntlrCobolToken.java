/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jcobol.parser.antlr;

import jcobol.lexer.CobolToken;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;
import org.apache.log4j.Logger;

/**
 *
 * @author Andr&eacute;s Gri&ntilde;&oacute; Brandt <agrinob@hotmail.com>
 */
public class AntlrCobolToken implements Token {

    private static final Logger logger = Logger.getLogger(AntlrCobolToken.class);
    private final CobolToken token;
    private int channel;
    private int index;
    private int type;

    public AntlrCobolToken(final CobolToken token, final int index, final int type) {
        this.token = token;
        this.channel = Token.DEFAULT_CHANNEL;
        this.index = index;
        this.type = type;
    }

    public int getChannel() {
        logger.debug("getChannel()");
        return channel;
    }

    public int getCharPositionInLine() {
        logger.debug("getCharPositionInLine()");
        return token.getCol() - 1;
    }

    public CharStream getInputStream() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getLine() {
        logger.debug("getLine() ->" + token.getRow());
        return token.getRow();
    }

    public String getText() {
        logger.debug("getText() ->" + token.getText());
        return token.getText();
    }

    public int getTokenIndex() {
        logger.debug("getTokenIndex() ->" + this.index);
        return this.index;
    }

    public int getType() {
        logger.debug("getType() ->" + type);
        return type;
    }

    public void setChannel(int channel) {
        logger.debug("setChannel(" + channel + ")");
        this.channel = channel;
    }

    public void setCharPositionInLine(int pos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setInputStream(CharStream input) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setLine(int line) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setText(String text) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setTokenIndex(int index) {
        logger.debug("setTokenIndex(" + index + ")");
        this.index = index;
    }

    public void setType(int ttype) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.type).append(" (").append(this.token.getRow())
                .append(", ").append(this.token.getCol()).append(", ")
                .append(token.getText()).append(')');
        return buffer.toString();
    }
}

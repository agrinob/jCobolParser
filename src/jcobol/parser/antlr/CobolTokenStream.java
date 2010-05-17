package jcobol.parser.antlr;

import java.util.List;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andr&eacute;s Gri&ntilde;&oacute; Brandt <agrinob@hotmail.com>
 */
public class CobolTokenStream implements IntStream, TokenStream {

    private Logger logger = Logger.getLogger(CobolTokenStream.class);
    private final List<AntlrCobolToken> list;
    private int index = 0;
    private int lastMark = 0;

    public CobolTokenStream(final List<AntlrCobolToken> list) {
        this.list = list;
    }

    public int LA(int i) {
        logger.debug("LA(" + i + ")");
        int type = CharStream.EOF;
        int k = index + i - 1;
        if (k >= 0 && k < list.size()) {
            AntlrCobolToken token = list.get(index + i - 1);
            type = token.getType();
        }
        return type;
    }

    public void consume() {
        index++;
        logger.debug("consume() ->" + index);
    }

    public String getSourceName() {
        logger.debug("getSourceName()");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int index() {
        logger.debug("index() ->" + index);
        return index;
    }

    public int mark() {
        logger.debug("mark() ->" + index);
        lastMark = index;
        return index;
    }

    public void release(int marker) {
        logger.debug("relase(" + marker + ")");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void rewind(int marker) {
        logger.debug("rewind(" + marker + ")");
        index = marker;
    }

    public void rewind() {
        logger.debug("rewind()");
        index = lastMark;
    }

    public void seek(int index) {
        logger.debug("seek(" + index + ")");
        this.index = index;
    }

    public int size() {
        logger.debug("size()");
        return list.size();
    }

    public Token LT(int k) {
        assert k != 0;
        Token token = null;
        int i = index + k - 1;

        if (i < 0) {
            token = null;
        } else {
            if (i < list.size()) {
                token = list.get(i);
            } else {
                token = Token.EOF_TOKEN;
            }
        }
        logger.debug("LT(" + k + ") -> list.get(" + i + ") ->" + token);
        return token;
    }

    public Token get(int i) {
        logger.debug("get(" + i + ")");
        index = i;
        return list.get(index);
    }

    public TokenSource getTokenSource() {
        logger.debug("getTokenSource()");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString(int start, int stop) {
        logger.debug("toString(" + start + ", " + stop + ")");
        StringBuffer buffer = new StringBuffer();
        for (int i = start; i <= stop; i++) {
            buffer.append(list.get(i).toString()).append(' ');
        }
        return buffer.toString();
    }

    public String toString(Token start, Token stop) {
        logger.debug("toString(" + start + ", " + stop + ")");
        throw new UnsupportedOperationException("Not supported yet. start=" + start + ", stop=" + stop);
    }
}

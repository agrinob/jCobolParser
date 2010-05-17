// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g 2010-05-01 08:04:01

	package jcobol.parser.divisions;
	

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class IdDivision extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTINUATION", "NEW_PAGE", "COMMENT", "SPECIAL_LINE", "STRING", "START_PSEUDO_TEXT", "PSEUDO_TEXT", "END_PSEUDO_TEXT", "COLON", "COMMA_SEP", "SEMICOLON_SEP", "LEFT_PAREN", "RIGHT_PAREN", "TEXT", "IDENTIFICATION", "ID", "DIVISION", "PROGRAM_ID", "PERIOD", "WORD", "IS", "COMMON", "INITIAL", "PROGRAM", "AUTHOR", "INSTALLATION", "DATE_WRITTEN", "DATE_COMPILED", "SECURITY"
    };
    public static final int AUTHOR=28;
    public static final int END_PSEUDO_TEXT=11;
    public static final int PERIOD=22;
    public static final int INITIAL=26;
    public static final int DATE_WRITTEN=30;
    public static final int CONTINUATION=4;
    public static final int DATE_COMPILED=31;
    public static final int INSTALLATION=29;
    public static final int TEXT=17;
    public static final int IDENTIFICATION=18;
    public static final int ID=19;
    public static final int EOF=-1;
    public static final int START_PSEUDO_TEXT=9;
    public static final int WORD=23;
    public static final int COLON=12;
    public static final int RIGHT_PAREN=16;
    public static final int PROGRAM_ID=21;
    public static final int SPECIAL_LINE=7;
    public static final int IS=24;
    public static final int NEW_PAGE=5;
    public static final int COMMA_SEP=13;
    public static final int SEMICOLON_SEP=14;
    public static final int DIVISION=20;
    public static final int LEFT_PAREN=15;
    public static final int COMMON=25;
    public static final int PROGRAM=27;
    public static final int COMMENT=6;
    public static final int SECURITY=32;
    public static final int PSEUDO_TEXT=10;
    public static final int STRING=8;

    // delegates
    // delegators


        public IdDivision(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public IdDivision(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return IdDivision.tokenNames; }
    public String getGrammarFileName() { return "/home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g"; }


    public static class id_division_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id_division"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:1: id_division : ID DIVISION PERIOD program_id ( clause )* -> ^( ID program_id ( clause )* ) ;
    public final IdDivision.id_division_return id_division() throws RecognitionException {
        IdDivision.id_division_return retval = new IdDivision.id_division_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID1=null;
        Token DIVISION2=null;
        Token PERIOD3=null;
        IdDivision.program_id_return program_id4 = null;

        IdDivision.clause_return clause5 = null;


        CommonTree ID1_tree=null;
        CommonTree DIVISION2_tree=null;
        CommonTree PERIOD3_tree=null;
        RewriteRuleTokenStream stream_DIVISION=new RewriteRuleTokenStream(adaptor,"token DIVISION");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_program_id=new RewriteRuleSubtreeStream(adaptor,"rule program_id");
        RewriteRuleSubtreeStream stream_clause=new RewriteRuleSubtreeStream(adaptor,"rule clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:14: ( ID DIVISION PERIOD program_id ( clause )* -> ^( ID program_id ( clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:16: ID DIVISION PERIOD program_id ( clause )*
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_id_division180);  
            stream_ID.add(ID1);

            DIVISION2=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_id_division182);  
            stream_DIVISION.add(DIVISION2);

            PERIOD3=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_id_division184);  
            stream_PERIOD.add(PERIOD3);

            pushFollow(FOLLOW_program_id_in_id_division186);
            program_id4=program_id();

            state._fsp--;

            stream_program_id.add(program_id4.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:46: ( clause )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=AUTHOR && LA1_0<=SECURITY)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:46: clause
            	    {
            	    pushFollow(FOLLOW_clause_in_id_division188);
            	    clause5=clause();

            	    state._fsp--;

            	    stream_clause.add(clause5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: program_id, clause, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:54: -> ^( ID program_id ( clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:57: ^( ID program_id ( clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);

                adaptor.addChild(root_1, stream_program_id.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:46:73: ( clause )*
                while ( stream_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_clause.nextTree());

                }
                stream_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_division"

    public static class clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:1: clause : ( author | installation | date_written | date_compiled | security );
    public final IdDivision.clause_return clause() throws RecognitionException {
        IdDivision.clause_return retval = new IdDivision.clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        IdDivision.author_return author6 = null;

        IdDivision.installation_return installation7 = null;

        IdDivision.date_written_return date_written8 = null;

        IdDivision.date_compiled_return date_compiled9 = null;

        IdDivision.security_return security10 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:9: ( author | installation | date_written | date_compiled | security )
            int alt2=5;
            switch ( input.LA(1) ) {
            case AUTHOR:
                {
                alt2=1;
                }
                break;
            case INSTALLATION:
                {
                alt2=2;
                }
                break;
            case DATE_WRITTEN:
                {
                alt2=3;
                }
                break;
            case DATE_COMPILED:
                {
                alt2=4;
                }
                break;
            case SECURITY:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:11: author
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_author_in_clause208);
                    author6=author();

                    state._fsp--;

                    adaptor.addChild(root_0, author6.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:20: installation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_installation_in_clause212);
                    installation7=installation();

                    state._fsp--;

                    adaptor.addChild(root_0, installation7.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:35: date_written
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_date_written_in_clause216);
                    date_written8=date_written();

                    state._fsp--;

                    adaptor.addChild(root_0, date_written8.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:50: date_compiled
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_date_compiled_in_clause220);
                    date_compiled9=date_compiled();

                    state._fsp--;

                    adaptor.addChild(root_0, date_compiled9.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:47:66: security
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_security_in_clause224);
                    security10=security();

                    state._fsp--;

                    adaptor.addChild(root_0, security10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "clause"

    public static class program_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program_id"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:1: program_id : PROGRAM_ID PERIOD WORD ( commonInitial )? PERIOD -> ^( PROGRAM_ID WORD ( commonInitial )? ) ;
    public final IdDivision.program_id_return program_id() throws RecognitionException {
        IdDivision.program_id_return retval = new IdDivision.program_id_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROGRAM_ID11=null;
        Token PERIOD12=null;
        Token WORD13=null;
        Token PERIOD15=null;
        IdDivision.commonInitial_return commonInitial14 = null;


        CommonTree PROGRAM_ID11_tree=null;
        CommonTree PERIOD12_tree=null;
        CommonTree WORD13_tree=null;
        CommonTree PERIOD15_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PROGRAM_ID=new RewriteRuleTokenStream(adaptor,"token PROGRAM_ID");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_commonInitial=new RewriteRuleSubtreeStream(adaptor,"rule commonInitial");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:12: ( PROGRAM_ID PERIOD WORD ( commonInitial )? PERIOD -> ^( PROGRAM_ID WORD ( commonInitial )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:14: PROGRAM_ID PERIOD WORD ( commonInitial )? PERIOD
            {
            PROGRAM_ID11=(Token)match(input,PROGRAM_ID,FOLLOW_PROGRAM_ID_in_program_id233);  
            stream_PROGRAM_ID.add(PROGRAM_ID11);

            PERIOD12=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_program_id235);  
            stream_PERIOD.add(PERIOD12);

            WORD13=(Token)match(input,WORD,FOLLOW_WORD_in_program_id237);  
            stream_WORD.add(WORD13);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:37: ( commonInitial )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=IS && LA3_0<=INITIAL)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:37: commonInitial
                    {
                    pushFollow(FOLLOW_commonInitial_in_program_id239);
                    commonInitial14=commonInitial();

                    state._fsp--;

                    stream_commonInitial.add(commonInitial14.getTree());

                    }
                    break;

            }

            PERIOD15=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_program_id242);  
            stream_PERIOD.add(PERIOD15);



            // AST REWRITE
            // elements: PROGRAM_ID, WORD, commonInitial
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:59: -> ^( PROGRAM_ID WORD ( commonInitial )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:62: ^( PROGRAM_ID WORD ( commonInitial )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROGRAM_ID.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:49:80: ( commonInitial )?
                if ( stream_commonInitial.hasNext() ) {
                    adaptor.addChild(root_1, stream_commonInitial.nextTree());

                }
                stream_commonInitial.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program_id"

    public static class commonInitial_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "commonInitial"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:1: commonInitial : ( ( IS )? COMMON ( INITIAL )? PROGRAM -> COMMON ( INITIAL )? | ( IS )? INITIAL ( COMMON )? PROGRAM -> INITIAL ( COMMON )? );
    public final IdDivision.commonInitial_return commonInitial() throws RecognitionException {
        IdDivision.commonInitial_return retval = new IdDivision.commonInitial_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS16=null;
        Token COMMON17=null;
        Token INITIAL18=null;
        Token PROGRAM19=null;
        Token IS20=null;
        Token INITIAL21=null;
        Token COMMON22=null;
        Token PROGRAM23=null;

        CommonTree IS16_tree=null;
        CommonTree COMMON17_tree=null;
        CommonTree INITIAL18_tree=null;
        CommonTree PROGRAM19_tree=null;
        CommonTree IS20_tree=null;
        CommonTree INITIAL21_tree=null;
        CommonTree COMMON22_tree=null;
        CommonTree PROGRAM23_tree=null;
        RewriteRuleTokenStream stream_COMMON=new RewriteRuleTokenStream(adaptor,"token COMMON");
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_INITIAL=new RewriteRuleTokenStream(adaptor,"token INITIAL");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:15: ( ( IS )? COMMON ( INITIAL )? PROGRAM -> COMMON ( INITIAL )? | ( IS )? INITIAL ( COMMON )? PROGRAM -> INITIAL ( COMMON )? )
            int alt8=2;
            switch ( input.LA(1) ) {
            case IS:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==INITIAL) ) {
                    alt8=2;
                }
                else if ( (LA8_1==COMMON) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case COMMON:
                {
                alt8=1;
                }
                break;
            case INITIAL:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:17: ( IS )? COMMON ( INITIAL )? PROGRAM
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:17: ( IS )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==IS) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:17: IS
                            {
                            IS16=(Token)match(input,IS,FOLLOW_IS_in_commonInitial267);  
                            stream_IS.add(IS16);


                            }
                            break;

                    }

                    COMMON17=(Token)match(input,COMMON,FOLLOW_COMMON_in_commonInitial270);  
                    stream_COMMON.add(COMMON17);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:28: ( INITIAL )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==INITIAL) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:28: INITIAL
                            {
                            INITIAL18=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_commonInitial272);  
                            stream_INITIAL.add(INITIAL18);


                            }
                            break;

                    }

                    PROGRAM19=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_commonInitial275);  
                    stream_PROGRAM.add(PROGRAM19);



                    // AST REWRITE
                    // elements: COMMON, INITIAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 52:45: -> COMMON ( INITIAL )?
                    {
                        adaptor.addChild(root_0, stream_COMMON.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:52:55: ( INITIAL )?
                        if ( stream_INITIAL.hasNext() ) {
                            adaptor.addChild(root_0, stream_INITIAL.nextNode());

                        }
                        stream_INITIAL.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:53:5: ( IS )? INITIAL ( COMMON )? PROGRAM
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:53:5: ( IS )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IS) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:53:5: IS
                            {
                            IS20=(Token)match(input,IS,FOLLOW_IS_in_commonInitial288);  
                            stream_IS.add(IS20);


                            }
                            break;

                    }

                    INITIAL21=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_commonInitial291);  
                    stream_INITIAL.add(INITIAL21);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:53:17: ( COMMON )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==COMMON) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:53:17: COMMON
                            {
                            COMMON22=(Token)match(input,COMMON,FOLLOW_COMMON_in_commonInitial293);  
                            stream_COMMON.add(COMMON22);


                            }
                            break;

                    }

                    PROGRAM23=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_commonInitial296);  
                    stream_PROGRAM.add(PROGRAM23);



                    // AST REWRITE
                    // elements: COMMON, INITIAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 53:33: -> INITIAL ( COMMON )?
                    {
                        adaptor.addChild(root_0, stream_INITIAL.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:53:44: ( COMMON )?
                        if ( stream_COMMON.hasNext() ) {
                            adaptor.addChild(root_0, stream_COMMON.nextNode());

                        }
                        stream_COMMON.reset();

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "commonInitial"

    public static class author_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "author"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:1: author : AUTHOR PERIOD ( TEXT )* -> ^( AUTHOR ( TEXT )* ) ;
    public final IdDivision.author_return author() throws RecognitionException {
        IdDivision.author_return retval = new IdDivision.author_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AUTHOR24=null;
        Token PERIOD25=null;
        Token TEXT26=null;

        CommonTree AUTHOR24_tree=null;
        CommonTree PERIOD25_tree=null;
        CommonTree TEXT26_tree=null;
        RewriteRuleTokenStream stream_AUTHOR=new RewriteRuleTokenStream(adaptor,"token AUTHOR");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:9: ( AUTHOR PERIOD ( TEXT )* -> ^( AUTHOR ( TEXT )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:11: AUTHOR PERIOD ( TEXT )*
            {
            AUTHOR24=(Token)match(input,AUTHOR,FOLLOW_AUTHOR_in_author321);  
            stream_AUTHOR.add(AUTHOR24);

            PERIOD25=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_author323);  
            stream_PERIOD.add(PERIOD25);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:25: ( TEXT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==TEXT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:25: TEXT
            	    {
            	    TEXT26=(Token)match(input,TEXT,FOLLOW_TEXT_in_author325);  
            	    stream_TEXT.add(TEXT26);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // AST REWRITE
            // elements: AUTHOR, TEXT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 56:32: -> ^( AUTHOR ( TEXT )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:35: ^( AUTHOR ( TEXT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_AUTHOR.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:56:44: ( TEXT )*
                while ( stream_TEXT.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEXT.nextNode());

                }
                stream_TEXT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "author"

    public static class installation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "installation"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:1: installation : INSTALLATION PERIOD ( TEXT )* -> ^( INSTALLATION ( TEXT )* ) ;
    public final IdDivision.installation_return installation() throws RecognitionException {
        IdDivision.installation_return retval = new IdDivision.installation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INSTALLATION27=null;
        Token PERIOD28=null;
        Token TEXT29=null;

        CommonTree INSTALLATION27_tree=null;
        CommonTree PERIOD28_tree=null;
        CommonTree TEXT29_tree=null;
        RewriteRuleTokenStream stream_INSTALLATION=new RewriteRuleTokenStream(adaptor,"token INSTALLATION");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:14: ( INSTALLATION PERIOD ( TEXT )* -> ^( INSTALLATION ( TEXT )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:16: INSTALLATION PERIOD ( TEXT )*
            {
            INSTALLATION27=(Token)match(input,INSTALLATION,FOLLOW_INSTALLATION_in_installation349);  
            stream_INSTALLATION.add(INSTALLATION27);

            PERIOD28=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_installation352);  
            stream_PERIOD.add(PERIOD28);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:37: ( TEXT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TEXT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:37: TEXT
            	    {
            	    TEXT29=(Token)match(input,TEXT,FOLLOW_TEXT_in_installation354);  
            	    stream_TEXT.add(TEXT29);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);



            // AST REWRITE
            // elements: TEXT, INSTALLATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:43: -> ^( INSTALLATION ( TEXT )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:46: ^( INSTALLATION ( TEXT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_INSTALLATION.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:59:61: ( TEXT )*
                while ( stream_TEXT.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEXT.nextNode());

                }
                stream_TEXT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "installation"

    public static class date_written_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_written"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:1: date_written : DATE_WRITTEN PERIOD ( TEXT )* -> ^( DATE_WRITTEN ( TEXT )* ) ;
    public final IdDivision.date_written_return date_written() throws RecognitionException {
        IdDivision.date_written_return retval = new IdDivision.date_written_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DATE_WRITTEN30=null;
        Token PERIOD31=null;
        Token TEXT32=null;

        CommonTree DATE_WRITTEN30_tree=null;
        CommonTree PERIOD31_tree=null;
        CommonTree TEXT32_tree=null;
        RewriteRuleTokenStream stream_DATE_WRITTEN=new RewriteRuleTokenStream(adaptor,"token DATE_WRITTEN");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:14: ( DATE_WRITTEN PERIOD ( TEXT )* -> ^( DATE_WRITTEN ( TEXT )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:16: DATE_WRITTEN PERIOD ( TEXT )*
            {
            DATE_WRITTEN30=(Token)match(input,DATE_WRITTEN,FOLLOW_DATE_WRITTEN_in_date_written377);  
            stream_DATE_WRITTEN.add(DATE_WRITTEN30);

            PERIOD31=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_date_written380);  
            stream_PERIOD.add(PERIOD31);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:37: ( TEXT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TEXT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:37: TEXT
            	    {
            	    TEXT32=(Token)match(input,TEXT,FOLLOW_TEXT_in_date_written382);  
            	    stream_TEXT.add(TEXT32);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: TEXT, DATE_WRITTEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 62:43: -> ^( DATE_WRITTEN ( TEXT )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:46: ^( DATE_WRITTEN ( TEXT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DATE_WRITTEN.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:62:61: ( TEXT )*
                while ( stream_TEXT.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEXT.nextNode());

                }
                stream_TEXT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "date_written"

    public static class date_compiled_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "date_compiled"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:1: date_compiled : DATE_COMPILED PERIOD ( TEXT )* -> ^( DATE_COMPILED ( TEXT )* ) ;
    public final IdDivision.date_compiled_return date_compiled() throws RecognitionException {
        IdDivision.date_compiled_return retval = new IdDivision.date_compiled_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DATE_COMPILED33=null;
        Token PERIOD34=null;
        Token TEXT35=null;

        CommonTree DATE_COMPILED33_tree=null;
        CommonTree PERIOD34_tree=null;
        CommonTree TEXT35_tree=null;
        RewriteRuleTokenStream stream_DATE_COMPILED=new RewriteRuleTokenStream(adaptor,"token DATE_COMPILED");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:15: ( DATE_COMPILED PERIOD ( TEXT )* -> ^( DATE_COMPILED ( TEXT )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:17: DATE_COMPILED PERIOD ( TEXT )*
            {
            DATE_COMPILED33=(Token)match(input,DATE_COMPILED,FOLLOW_DATE_COMPILED_in_date_compiled405);  
            stream_DATE_COMPILED.add(DATE_COMPILED33);

            PERIOD34=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_date_compiled407);  
            stream_PERIOD.add(PERIOD34);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:38: ( TEXT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TEXT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:38: TEXT
            	    {
            	    TEXT35=(Token)match(input,TEXT,FOLLOW_TEXT_in_date_compiled409);  
            	    stream_TEXT.add(TEXT35);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            // AST REWRITE
            // elements: TEXT, DATE_COMPILED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:44: -> ^( DATE_COMPILED ( TEXT )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:47: ^( DATE_COMPILED ( TEXT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DATE_COMPILED.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:65:63: ( TEXT )*
                while ( stream_TEXT.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEXT.nextNode());

                }
                stream_TEXT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "date_compiled"

    public static class security_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "security"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:1: security : SECURITY PERIOD ( TEXT )* -> ^( SECURITY ( TEXT )* ) ;
    public final IdDivision.security_return security() throws RecognitionException {
        IdDivision.security_return retval = new IdDivision.security_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SECURITY36=null;
        Token PERIOD37=null;
        Token TEXT38=null;

        CommonTree SECURITY36_tree=null;
        CommonTree PERIOD37_tree=null;
        CommonTree TEXT38_tree=null;
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_SECURITY=new RewriteRuleTokenStream(adaptor,"token SECURITY");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:10: ( SECURITY PERIOD ( TEXT )* -> ^( SECURITY ( TEXT )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:12: SECURITY PERIOD ( TEXT )*
            {
            SECURITY36=(Token)match(input,SECURITY,FOLLOW_SECURITY_in_security432);  
            stream_SECURITY.add(SECURITY36);

            PERIOD37=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_security435);  
            stream_PERIOD.add(PERIOD37);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:29: ( TEXT )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TEXT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:29: TEXT
            	    {
            	    TEXT38=(Token)match(input,TEXT,FOLLOW_TEXT_in_security437);  
            	    stream_TEXT.add(TEXT38);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



            // AST REWRITE
            // elements: TEXT, SECURITY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 68:35: -> ^( SECURITY ( TEXT )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:38: ^( SECURITY ( TEXT )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SECURITY.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/IdDivision.g:68:49: ( TEXT )*
                while ( stream_TEXT.hasNext() ) {
                    adaptor.addChild(root_1, stream_TEXT.nextNode());

                }
                stream_TEXT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "security"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_id_division180 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DIVISION_in_id_division182 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_id_division184 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_program_id_in_id_division186 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_clause_in_id_division188 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_author_in_clause208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_installation_in_clause212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_written_in_clause216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_compiled_in_clause220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_security_in_clause224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAM_ID_in_program_id233 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_program_id235 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_WORD_in_program_id237 = new BitSet(new long[]{0x0000000007400000L});
    public static final BitSet FOLLOW_commonInitial_in_program_id239 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_program_id242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_commonInitial267 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_COMMON_in_commonInitial270 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_INITIAL_in_commonInitial272 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PROGRAM_in_commonInitial275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_commonInitial288 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_INITIAL_in_commonInitial291 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_COMMON_in_commonInitial293 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_PROGRAM_in_commonInitial296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTHOR_in_author321 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_author323 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_author325 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_INSTALLATION_in_installation349 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_installation352 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_installation354 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DATE_WRITTEN_in_date_written377 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_date_written380 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_date_written382 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_DATE_COMPILED_in_date_compiled405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_date_compiled407 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_date_compiled409 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_SECURITY_in_security432 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_PERIOD_in_security435 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_TEXT_in_security437 = new BitSet(new long[]{0x0000000000020002L});

}
// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g 2010-05-01 08:05:01

	package jcobol.parser.divisions;
	

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class EnvironmentDivision extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTINUATION", "NEW_PAGE", "COMMENT", "SPECIAL_LINE", "STRING", "START_PSEUDO_TEXT", "PSEUDO_TEXT", "END_PSEUDO_TEXT", "COLON", "COMMA", "SEMI_COLON", "LEFT_PAREN", "RIGHT_PAREN", "TEXT", "PERIOD", "WORD", "P_POSITION", "P_LIST", "P_ORGANIZATION", "ENVIRONMENT", "DIVISION", "CONFIGURATION", "SECTION", "SOURCE_COMPUTER", "WITH", "DEBUGGING", "MODE", "OBJECT_COMPUTER", "MEMORY", "SIZE", "WORDS", "CHARACTERS", "MODULES", "PROGRAM", "COLLATING", "SEQUENCE", "IS", "SEGMENT_LIMIT", "SPECIAL_NAMES", "ENVIRONMENT_NAME", "ON", "STATUS", "OFF", "ALPHABET", "STANDARD_1", "STANDARD_2", "NATIVE", "EBCDIC", "ALSO", "THRU", "THROUGH", "SYMBOLIC", "ARE", "IN", "CLASS", "INPUT_OUTPUT", "FILE_CONTROL", "I_O_CONTROL", "FILE", "ACCESS", "SEQUENTIAL", "RANDOM", "DYNAMIC", "ORGANIZATION", "INDEXED", "RELATIVE", "RESERVE", "PADDING", "RECORD", "DELIMITER", "AREA", "AREAS", "ASSIGN", "TO", "SELECT", "OPTIONAL", "CHARACTER", "KEY", "ALTERNATE", "DUPLICATES", "RERUN", "EVERY", "RECORDS", "END", "REEL", "UNIT", "OF", "POSITION", "MULTIPLE", "SAME", "FOR", "TAPE", "CONTAINS", "SORT", "SORT_MERGE", "CONSOLE", "CRT", "CURRENCY", "SIGN", "CURSOR", "DECIMAL_POINT", "NUMERIC", "LEADING", "TRAILING", "SEPARATE", "BINARY", "LINE"
    };
    public static final int SIGN=102;
    public static final int END_PSEUDO_TEXT=11;
    public static final int P_LIST=21;
    public static final int FILE_CONTROL=60;
    public static final int CONTAINS=96;
    public static final int RECORDS=86;
    public static final int THRU=53;
    public static final int RERUN=84;
    public static final int EOF=-1;
    public static final int I_O_CONTROL=61;
    public static final int CHARACTER=80;
    public static final int PADDING=71;
    public static final int WORD=19;
    public static final int SYMBOLIC=55;
    public static final int ARE=56;
    public static final int INPUT_OUTPUT=59;
    public static final int OFF=46;
    public static final int SORT_MERGE=98;
    public static final int WORDS=34;
    public static final int DIVISION=24;
    public static final int AREAS=75;
    public static final int COMMENT=6;
    public static final int SELECT=78;
    public static final int EBCDIC=51;
    public static final int P_ORGANIZATION=22;
    public static final int RECORD=72;
    public static final int CONSOLE=99;
    public static final int STANDARD_2=49;
    public static final int SECTION=26;
    public static final int SOURCE_COMPUTER=27;
    public static final int PERIOD=18;
    public static final int KEY=81;
    public static final int DUPLICATES=83;
    public static final int EVERY=85;
    public static final int TRAILING=107;
    public static final int ON=44;
    public static final int NATIVE=50;
    public static final int SEPARATE=108;
    public static final int SEMI_COLON=14;
    public static final int ORGANIZATION=67;
    public static final int NUMERIC=105;
    public static final int STANDARD_1=48;
    public static final int FILE=62;
    public static final int OF=90;
    public static final int LEADING=106;
    public static final int ALTERNATE=82;
    public static final int SEQUENCE=39;
    public static final int SPECIAL_NAMES=42;
    public static final int UNIT=89;
    public static final int AREA=74;
    public static final int NEW_PAGE=5;
    public static final int ALSO=52;
    public static final int SEGMENT_LIMIT=41;
    public static final int LEFT_PAREN=15;
    public static final int CURRENCY=101;
    public static final int MEMORY=32;
    public static final int OBJECT_COMPUTER=31;
    public static final int END=87;
    public static final int CURSOR=103;
    public static final int SIZE=33;
    public static final int PSEUDO_TEXT=10;
    public static final int DYNAMIC=66;
    public static final int COLLATING=38;
    public static final int CRT=100;
    public static final int CLASS=58;
    public static final int FOR=94;
    public static final int CONFIGURATION=25;
    public static final int RANDOM=65;
    public static final int START_PSEUDO_TEXT=9;
    public static final int POSITION=91;
    public static final int MULTIPLE=92;
    public static final int CHARACTERS=35;
    public static final int RIGHT_PAREN=16;
    public static final int DECIMAL_POINT=104;
    public static final int IN=57;
    public static final int SPECIAL_LINE=7;
    public static final int COMMA=13;
    public static final int IS=40;
    public static final int DEBUGGING=29;
    public static final int ACCESS=63;
    public static final int MODULES=36;
    public static final int MODE=30;
    public static final int WITH=28;
    public static final int TO=77;
    public static final int STATUS=45;
    public static final int ALPHABET=47;
    public static final int ENVIRONMENT_NAME=43;
    public static final int SORT=97;
    public static final int CONTINUATION=4;
    public static final int RELATIVE=69;
    public static final int RESERVE=70;
    public static final int TEXT=17;
    public static final int REEL=88;
    public static final int LINE=110;
    public static final int SAME=93;
    public static final int OPTIONAL=79;
    public static final int COLON=12;
    public static final int INDEXED=68;
    public static final int ASSIGN=76;
    public static final int THROUGH=54;
    public static final int PROGRAM=37;
    public static final int BINARY=109;
    public static final int TAPE=95;
    public static final int P_POSITION=20;
    public static final int SEQUENTIAL=64;
    public static final int ENVIRONMENT=23;
    public static final int STRING=8;
    public static final int DELIMITER=73;

    // delegates
    // delegators


        public EnvironmentDivision(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public EnvironmentDivision(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return EnvironmentDivision.tokenNames; }
    public String getGrammarFileName() { return "/home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g"; }


    public static class env_division_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "env_division"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:125:1: env_division : ENVIRONMENT DIVISION PERIOD ( env_division_clause )* -> ^( ENVIRONMENT ( env_division_clause )* ) ;
    public final EnvironmentDivision.env_division_return env_division() throws RecognitionException {
        EnvironmentDivision.env_division_return retval = new EnvironmentDivision.env_division_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ENVIRONMENT1=null;
        Token DIVISION2=null;
        Token PERIOD3=null;
        EnvironmentDivision.env_division_clause_return env_division_clause4 = null;


        CommonTree ENVIRONMENT1_tree=null;
        CommonTree DIVISION2_tree=null;
        CommonTree PERIOD3_tree=null;
        RewriteRuleTokenStream stream_DIVISION=new RewriteRuleTokenStream(adaptor,"token DIVISION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_ENVIRONMENT=new RewriteRuleTokenStream(adaptor,"token ENVIRONMENT");
        RewriteRuleSubtreeStream stream_env_division_clause=new RewriteRuleSubtreeStream(adaptor,"rule env_division_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:126:2: ( ENVIRONMENT DIVISION PERIOD ( env_division_clause )* -> ^( ENVIRONMENT ( env_division_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:126:4: ENVIRONMENT DIVISION PERIOD ( env_division_clause )*
            {
            ENVIRONMENT1=(Token)match(input,ENVIRONMENT,FOLLOW_ENVIRONMENT_in_env_division501);  
            stream_ENVIRONMENT.add(ENVIRONMENT1);

            DIVISION2=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_env_division503);  
            stream_DIVISION.add(DIVISION2);

            PERIOD3=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_env_division505);  
            stream_PERIOD.add(PERIOD3);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:126:33: ( env_division_clause )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CONFIGURATION||LA1_0==INPUT_OUTPUT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:126:33: env_division_clause
            	    {
            	    pushFollow(FOLLOW_env_division_clause_in_env_division508);
            	    env_division_clause4=env_division_clause();

            	    state._fsp--;

            	    stream_env_division_clause.add(env_division_clause4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: ENVIRONMENT, env_division_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 126:54: -> ^( ENVIRONMENT ( env_division_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:126:57: ^( ENVIRONMENT ( env_division_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ENVIRONMENT.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:126:71: ( env_division_clause )*
                while ( stream_env_division_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_env_division_clause.nextTree());

                }
                stream_env_division_clause.reset();

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
    // $ANTLR end "env_division"

    public static class env_division_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "env_division_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:127:1: env_division_clause : ( configuration_section | input_output_section );
    public final EnvironmentDivision.env_division_clause_return env_division_clause() throws RecognitionException {
        EnvironmentDivision.env_division_clause_return retval = new EnvironmentDivision.env_division_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.configuration_section_return configuration_section5 = null;

        EnvironmentDivision.input_output_section_return input_output_section6 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:128:2: ( configuration_section | input_output_section )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONFIGURATION) ) {
                alt2=1;
            }
            else if ( (LA2_0==INPUT_OUTPUT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:128:4: configuration_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_configuration_section_in_env_division_clause526);
                    configuration_section5=configuration_section();

                    state._fsp--;

                    adaptor.addChild(root_0, configuration_section5.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:128:28: input_output_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_input_output_section_in_env_division_clause530);
                    input_output_section6=input_output_section();

                    state._fsp--;

                    adaptor.addChild(root_0, input_output_section6.getTree());

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
    // $ANTLR end "env_division_clause"

    public static class configuration_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "configuration_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:129:1: configuration_section : CONFIGURATION SECTION PERIOD ( configuration_section_clause )* ( PERIOD )? -> ^( CONFIGURATION ( configuration_section_clause )* ) ;
    public final EnvironmentDivision.configuration_section_return configuration_section() throws RecognitionException {
        EnvironmentDivision.configuration_section_return retval = new EnvironmentDivision.configuration_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONFIGURATION7=null;
        Token SECTION8=null;
        Token PERIOD9=null;
        Token PERIOD11=null;
        EnvironmentDivision.configuration_section_clause_return configuration_section_clause10 = null;


        CommonTree CONFIGURATION7_tree=null;
        CommonTree SECTION8_tree=null;
        CommonTree PERIOD9_tree=null;
        CommonTree PERIOD11_tree=null;
        RewriteRuleTokenStream stream_CONFIGURATION=new RewriteRuleTokenStream(adaptor,"token CONFIGURATION");
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_configuration_section_clause=new RewriteRuleSubtreeStream(adaptor,"rule configuration_section_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:2: ( CONFIGURATION SECTION PERIOD ( configuration_section_clause )* ( PERIOD )? -> ^( CONFIGURATION ( configuration_section_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:4: CONFIGURATION SECTION PERIOD ( configuration_section_clause )* ( PERIOD )?
            {
            CONFIGURATION7=(Token)match(input,CONFIGURATION,FOLLOW_CONFIGURATION_in_configuration_section538);  
            stream_CONFIGURATION.add(CONFIGURATION7);

            SECTION8=(Token)match(input,SECTION,FOLLOW_SECTION_in_configuration_section540);  
            stream_SECTION.add(SECTION8);

            PERIOD9=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_configuration_section542);  
            stream_PERIOD.add(PERIOD9);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:33: ( configuration_section_clause )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==SOURCE_COMPUTER||LA3_0==OBJECT_COMPUTER||LA3_0==SPECIAL_NAMES) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:33: configuration_section_clause
            	    {
            	    pushFollow(FOLLOW_configuration_section_clause_in_configuration_section544);
            	    configuration_section_clause10=configuration_section_clause();

            	    state._fsp--;

            	    stream_configuration_section_clause.add(configuration_section_clause10.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:63: ( PERIOD )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PERIOD) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:63: PERIOD
                    {
                    PERIOD11=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_configuration_section547);  
                    stream_PERIOD.add(PERIOD11);


                    }
                    break;

            }



            // AST REWRITE
            // elements: CONFIGURATION, configuration_section_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:71: -> ^( CONFIGURATION ( configuration_section_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:74: ^( CONFIGURATION ( configuration_section_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CONFIGURATION.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:130:90: ( configuration_section_clause )*
                while ( stream_configuration_section_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_configuration_section_clause.nextTree());

                }
                stream_configuration_section_clause.reset();

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
    // $ANTLR end "configuration_section"

    public static class configuration_section_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "configuration_section_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:131:1: configuration_section_clause : ( source_computer | object_computer | special_names );
    public final EnvironmentDivision.configuration_section_clause_return configuration_section_clause() throws RecognitionException {
        EnvironmentDivision.configuration_section_clause_return retval = new EnvironmentDivision.configuration_section_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.source_computer_return source_computer12 = null;

        EnvironmentDivision.object_computer_return object_computer13 = null;

        EnvironmentDivision.special_names_return special_names14 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:132:2: ( source_computer | object_computer | special_names )
            int alt5=3;
            switch ( input.LA(1) ) {
            case SOURCE_COMPUTER:
                {
                alt5=1;
                }
                break;
            case OBJECT_COMPUTER:
                {
                alt5=2;
                }
                break;
            case SPECIAL_NAMES:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:132:4: source_computer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_source_computer_in_configuration_section_clause565);
                    source_computer12=source_computer();

                    state._fsp--;

                    adaptor.addChild(root_0, source_computer12.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:132:22: object_computer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_object_computer_in_configuration_section_clause569);
                    object_computer13=object_computer();

                    state._fsp--;

                    adaptor.addChild(root_0, object_computer13.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:132:40: special_names
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_special_names_in_configuration_section_clause573);
                    special_names14=special_names();

                    state._fsp--;

                    adaptor.addChild(root_0, special_names14.getTree());

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
    // $ANTLR end "configuration_section_clause"

    public static class source_computer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "source_computer"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:133:1: source_computer : SOURCE_COMPUTER PERIOD ( source_computer_name )? -> ^( SOURCE_COMPUTER ( source_computer_name )? ) ;
    public final EnvironmentDivision.source_computer_return source_computer() throws RecognitionException {
        EnvironmentDivision.source_computer_return retval = new EnvironmentDivision.source_computer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SOURCE_COMPUTER15=null;
        Token PERIOD16=null;
        EnvironmentDivision.source_computer_name_return source_computer_name17 = null;


        CommonTree SOURCE_COMPUTER15_tree=null;
        CommonTree PERIOD16_tree=null;
        RewriteRuleTokenStream stream_SOURCE_COMPUTER=new RewriteRuleTokenStream(adaptor,"token SOURCE_COMPUTER");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_source_computer_name=new RewriteRuleSubtreeStream(adaptor,"rule source_computer_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:134:2: ( SOURCE_COMPUTER PERIOD ( source_computer_name )? -> ^( SOURCE_COMPUTER ( source_computer_name )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:134:4: SOURCE_COMPUTER PERIOD ( source_computer_name )?
            {
            SOURCE_COMPUTER15=(Token)match(input,SOURCE_COMPUTER,FOLLOW_SOURCE_COMPUTER_in_source_computer581);  
            stream_SOURCE_COMPUTER.add(SOURCE_COMPUTER15);

            PERIOD16=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_source_computer583);  
            stream_PERIOD.add(PERIOD16);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:134:27: ( source_computer_name )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WORD) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:134:27: source_computer_name
                    {
                    pushFollow(FOLLOW_source_computer_name_in_source_computer585);
                    source_computer_name17=source_computer_name();

                    state._fsp--;

                    stream_source_computer_name.add(source_computer_name17.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: SOURCE_COMPUTER, source_computer_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:49: -> ^( SOURCE_COMPUTER ( source_computer_name )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:134:52: ^( SOURCE_COMPUTER ( source_computer_name )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SOURCE_COMPUTER.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:134:70: ( source_computer_name )?
                if ( stream_source_computer_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_source_computer_name.nextTree());

                }
                stream_source_computer_name.reset();

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
    // $ANTLR end "source_computer"

    public static class source_computer_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "source_computer_name"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:135:1: source_computer_name : WORD ( ( WITH )? DEBUGGING MODE )? PERIOD ;
    public final EnvironmentDivision.source_computer_name_return source_computer_name() throws RecognitionException {
        EnvironmentDivision.source_computer_name_return retval = new EnvironmentDivision.source_computer_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD18=null;
        Token WITH19=null;
        Token DEBUGGING20=null;
        Token MODE21=null;
        Token PERIOD22=null;

        CommonTree WORD18_tree=null;
        CommonTree WITH19_tree=null;
        CommonTree DEBUGGING20_tree=null;
        CommonTree MODE21_tree=null;
        CommonTree PERIOD22_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:136:2: ( WORD ( ( WITH )? DEBUGGING MODE )? PERIOD )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:136:4: WORD ( ( WITH )? DEBUGGING MODE )? PERIOD
            {
            root_0 = (CommonTree)adaptor.nil();

            WORD18=(Token)match(input,WORD,FOLLOW_WORD_in_source_computer_name603); 
            WORD18_tree = (CommonTree)adaptor.create(WORD18);
            adaptor.addChild(root_0, WORD18_tree);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:136:9: ( ( WITH )? DEBUGGING MODE )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=WITH && LA8_0<=DEBUGGING)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:136:10: ( WITH )? DEBUGGING MODE
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:136:14: ( WITH )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==WITH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:136:14: WITH
                            {
                            WITH19=(Token)match(input,WITH,FOLLOW_WITH_in_source_computer_name606); 

                            }
                            break;

                    }

                    DEBUGGING20=(Token)match(input,DEBUGGING,FOLLOW_DEBUGGING_in_source_computer_name610); 
                    DEBUGGING20_tree = (CommonTree)adaptor.create(DEBUGGING20);
                    adaptor.addChild(root_0, DEBUGGING20_tree);

                    MODE21=(Token)match(input,MODE,FOLLOW_MODE_in_source_computer_name612); 

                    }
                    break;

            }

            PERIOD22=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_source_computer_name617); 

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
    // $ANTLR end "source_computer_name"

    public static class object_computer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_computer"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:138:1: object_computer : OBJECT_COMPUTER PERIOD ( object_computer_name )? -> ^( OBJECT_COMPUTER ( object_computer_name )? ) ;
    public final EnvironmentDivision.object_computer_return object_computer() throws RecognitionException {
        EnvironmentDivision.object_computer_return retval = new EnvironmentDivision.object_computer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OBJECT_COMPUTER23=null;
        Token PERIOD24=null;
        EnvironmentDivision.object_computer_name_return object_computer_name25 = null;


        CommonTree OBJECT_COMPUTER23_tree=null;
        CommonTree PERIOD24_tree=null;
        RewriteRuleTokenStream stream_OBJECT_COMPUTER=new RewriteRuleTokenStream(adaptor,"token OBJECT_COMPUTER");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_object_computer_name=new RewriteRuleSubtreeStream(adaptor,"rule object_computer_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:139:2: ( OBJECT_COMPUTER PERIOD ( object_computer_name )? -> ^( OBJECT_COMPUTER ( object_computer_name )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:139:4: OBJECT_COMPUTER PERIOD ( object_computer_name )?
            {
            OBJECT_COMPUTER23=(Token)match(input,OBJECT_COMPUTER,FOLLOW_OBJECT_COMPUTER_in_object_computer629);  
            stream_OBJECT_COMPUTER.add(OBJECT_COMPUTER23);

            PERIOD24=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_object_computer631);  
            stream_PERIOD.add(PERIOD24);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:139:27: ( object_computer_name )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WORD) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:139:27: object_computer_name
                    {
                    pushFollow(FOLLOW_object_computer_name_in_object_computer633);
                    object_computer_name25=object_computer_name();

                    state._fsp--;

                    stream_object_computer_name.add(object_computer_name25.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: object_computer_name, OBJECT_COMPUTER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 139:49: -> ^( OBJECT_COMPUTER ( object_computer_name )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:139:52: ^( OBJECT_COMPUTER ( object_computer_name )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_OBJECT_COMPUTER.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:139:70: ( object_computer_name )?
                if ( stream_object_computer_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_object_computer_name.nextTree());

                }
                stream_object_computer_name.reset();

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
    // $ANTLR end "object_computer"

    public static class object_computer_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_computer_name"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:140:1: object_computer_name : WORD ( memory_size )? ( program_collating )? ( segment_limit )? PERIOD ;
    public final EnvironmentDivision.object_computer_name_return object_computer_name() throws RecognitionException {
        EnvironmentDivision.object_computer_name_return retval = new EnvironmentDivision.object_computer_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD26=null;
        Token PERIOD30=null;
        EnvironmentDivision.memory_size_return memory_size27 = null;

        EnvironmentDivision.program_collating_return program_collating28 = null;

        EnvironmentDivision.segment_limit_return segment_limit29 = null;


        CommonTree WORD26_tree=null;
        CommonTree PERIOD30_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:2: ( WORD ( memory_size )? ( program_collating )? ( segment_limit )? PERIOD )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:4: WORD ( memory_size )? ( program_collating )? ( segment_limit )? PERIOD
            {
            root_0 = (CommonTree)adaptor.nil();

            WORD26=(Token)match(input,WORD,FOLLOW_WORD_in_object_computer_name651); 
            WORD26_tree = (CommonTree)adaptor.create(WORD26);
            adaptor.addChild(root_0, WORD26_tree);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:9: ( memory_size )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==MEMORY) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:9: memory_size
                    {
                    pushFollow(FOLLOW_memory_size_in_object_computer_name653);
                    memory_size27=memory_size();

                    state._fsp--;

                    adaptor.addChild(root_0, memory_size27.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:22: ( program_collating )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=PROGRAM && LA11_0<=SEQUENCE)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:22: program_collating
                    {
                    pushFollow(FOLLOW_program_collating_in_object_computer_name656);
                    program_collating28=program_collating();

                    state._fsp--;

                    adaptor.addChild(root_0, program_collating28.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:41: ( segment_limit )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==SEGMENT_LIMIT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:141:41: segment_limit
                    {
                    pushFollow(FOLLOW_segment_limit_in_object_computer_name659);
                    segment_limit29=segment_limit();

                    state._fsp--;

                    adaptor.addChild(root_0, segment_limit29.getTree());

                    }
                    break;

            }

            PERIOD30=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_object_computer_name662); 

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
    // $ANTLR end "object_computer_name"

    public static class memory_size_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memory_size"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:143:1: memory_size : MEMORY ( SIZE )? WORD memory_size_alts -> ^( MEMORY WORD memory_size_alts ) ;
    public final EnvironmentDivision.memory_size_return memory_size() throws RecognitionException {
        EnvironmentDivision.memory_size_return retval = new EnvironmentDivision.memory_size_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MEMORY31=null;
        Token SIZE32=null;
        Token WORD33=null;
        EnvironmentDivision.memory_size_alts_return memory_size_alts34 = null;


        CommonTree MEMORY31_tree=null;
        CommonTree SIZE32_tree=null;
        CommonTree WORD33_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_MEMORY=new RewriteRuleTokenStream(adaptor,"token MEMORY");
        RewriteRuleTokenStream stream_SIZE=new RewriteRuleTokenStream(adaptor,"token SIZE");
        RewriteRuleSubtreeStream stream_memory_size_alts=new RewriteRuleSubtreeStream(adaptor,"rule memory_size_alts");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:144:2: ( MEMORY ( SIZE )? WORD memory_size_alts -> ^( MEMORY WORD memory_size_alts ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:144:4: MEMORY ( SIZE )? WORD memory_size_alts
            {
            MEMORY31=(Token)match(input,MEMORY,FOLLOW_MEMORY_in_memory_size673);  
            stream_MEMORY.add(MEMORY31);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:144:11: ( SIZE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SIZE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:144:11: SIZE
                    {
                    SIZE32=(Token)match(input,SIZE,FOLLOW_SIZE_in_memory_size675);  
                    stream_SIZE.add(SIZE32);


                    }
                    break;

            }

            WORD33=(Token)match(input,WORD,FOLLOW_WORD_in_memory_size678);  
            stream_WORD.add(WORD33);

            pushFollow(FOLLOW_memory_size_alts_in_memory_size680);
            memory_size_alts34=memory_size_alts();

            state._fsp--;

            stream_memory_size_alts.add(memory_size_alts34.getTree());


            // AST REWRITE
            // elements: memory_size_alts, MEMORY, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:39: -> ^( MEMORY WORD memory_size_alts )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:144:42: ^( MEMORY WORD memory_size_alts )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MEMORY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                adaptor.addChild(root_1, stream_memory_size_alts.nextTree());

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
    // $ANTLR end "memory_size"

    public static class memory_size_alts_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memory_size_alts"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:145:1: memory_size_alts : ( CHARACTERS | WORDS | MODULES );
    public final EnvironmentDivision.memory_size_alts_return memory_size_alts() throws RecognitionException {
        EnvironmentDivision.memory_size_alts_return retval = new EnvironmentDivision.memory_size_alts_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set35=null;

        CommonTree set35_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:146:2: ( CHARACTERS | WORDS | MODULES )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=WORDS && input.LA(1)<=MODULES) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set35));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "memory_size_alts"

    public static class program_collating_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program_collating"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:147:1: program_collating : ( PROGRAM )? ( COLLATING )? SEQUENCE ( IS )? WORD -> ^( SEQUENCE WORD ) ;
    public final EnvironmentDivision.program_collating_return program_collating() throws RecognitionException {
        EnvironmentDivision.program_collating_return retval = new EnvironmentDivision.program_collating_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROGRAM36=null;
        Token COLLATING37=null;
        Token SEQUENCE38=null;
        Token IS39=null;
        Token WORD40=null;

        CommonTree PROGRAM36_tree=null;
        CommonTree COLLATING37_tree=null;
        CommonTree SEQUENCE38_tree=null;
        CommonTree IS39_tree=null;
        CommonTree WORD40_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_COLLATING=new RewriteRuleTokenStream(adaptor,"token COLLATING");
        RewriteRuleTokenStream stream_SEQUENCE=new RewriteRuleTokenStream(adaptor,"token SEQUENCE");
        RewriteRuleTokenStream stream_PROGRAM=new RewriteRuleTokenStream(adaptor,"token PROGRAM");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:2: ( ( PROGRAM )? ( COLLATING )? SEQUENCE ( IS )? WORD -> ^( SEQUENCE WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:4: ( PROGRAM )? ( COLLATING )? SEQUENCE ( IS )? WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:4: ( PROGRAM )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PROGRAM) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:4: PROGRAM
                    {
                    PROGRAM36=(Token)match(input,PROGRAM,FOLLOW_PROGRAM_in_program_collating715);  
                    stream_PROGRAM.add(PROGRAM36);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:13: ( COLLATING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COLLATING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:13: COLLATING
                    {
                    COLLATING37=(Token)match(input,COLLATING,FOLLOW_COLLATING_in_program_collating718);  
                    stream_COLLATING.add(COLLATING37);


                    }
                    break;

            }

            SEQUENCE38=(Token)match(input,SEQUENCE,FOLLOW_SEQUENCE_in_program_collating721);  
            stream_SEQUENCE.add(SEQUENCE38);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:33: ( IS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IS) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:33: IS
                    {
                    IS39=(Token)match(input,IS,FOLLOW_IS_in_program_collating723);  
                    stream_IS.add(IS39);


                    }
                    break;

            }

            WORD40=(Token)match(input,WORD,FOLLOW_WORD_in_program_collating726);  
            stream_WORD.add(WORD40);



            // AST REWRITE
            // elements: WORD, SEQUENCE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 148:42: -> ^( SEQUENCE WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:148:45: ^( SEQUENCE WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SEQUENCE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

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
    // $ANTLR end "program_collating"

    public static class segment_limit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "segment_limit"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:149:1: segment_limit : SEGMENT_LIMIT ( IS )? WORD -> ^( SEGMENT_LIMIT WORD ) ;
    public final EnvironmentDivision.segment_limit_return segment_limit() throws RecognitionException {
        EnvironmentDivision.segment_limit_return retval = new EnvironmentDivision.segment_limit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEGMENT_LIMIT41=null;
        Token IS42=null;
        Token WORD43=null;

        CommonTree SEGMENT_LIMIT41_tree=null;
        CommonTree IS42_tree=null;
        CommonTree WORD43_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_SEGMENT_LIMIT=new RewriteRuleTokenStream(adaptor,"token SEGMENT_LIMIT");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:150:2: ( SEGMENT_LIMIT ( IS )? WORD -> ^( SEGMENT_LIMIT WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:150:4: SEGMENT_LIMIT ( IS )? WORD
            {
            SEGMENT_LIMIT41=(Token)match(input,SEGMENT_LIMIT,FOLLOW_SEGMENT_LIMIT_in_segment_limit742);  
            stream_SEGMENT_LIMIT.add(SEGMENT_LIMIT41);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:150:18: ( IS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:150:18: IS
                    {
                    IS42=(Token)match(input,IS,FOLLOW_IS_in_segment_limit744);  
                    stream_IS.add(IS42);


                    }
                    break;

            }

            WORD43=(Token)match(input,WORD,FOLLOW_WORD_in_segment_limit747);  
            stream_WORD.add(WORD43);



            // AST REWRITE
            // elements: WORD, SEGMENT_LIMIT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:29: -> ^( SEGMENT_LIMIT WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:150:32: ^( SEGMENT_LIMIT WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SEGMENT_LIMIT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

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
    // $ANTLR end "segment_limit"

    public static class special_names_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "special_names"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:151:1: special_names : SPECIAL_NAMES PERIOD ( special_names_clause )* -> ^( SPECIAL_NAMES ( special_names_clause )* ) ;
    public final EnvironmentDivision.special_names_return special_names() throws RecognitionException {
        EnvironmentDivision.special_names_return retval = new EnvironmentDivision.special_names_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SPECIAL_NAMES44=null;
        Token PERIOD45=null;
        EnvironmentDivision.special_names_clause_return special_names_clause46 = null;


        CommonTree SPECIAL_NAMES44_tree=null;
        CommonTree PERIOD45_tree=null;
        RewriteRuleTokenStream stream_SPECIAL_NAMES=new RewriteRuleTokenStream(adaptor,"token SPECIAL_NAMES");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_special_names_clause=new RewriteRuleSubtreeStream(adaptor,"rule special_names_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:152:2: ( SPECIAL_NAMES PERIOD ( special_names_clause )* -> ^( SPECIAL_NAMES ( special_names_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:152:4: SPECIAL_NAMES PERIOD ( special_names_clause )*
            {
            SPECIAL_NAMES44=(Token)match(input,SPECIAL_NAMES,FOLLOW_SPECIAL_NAMES_in_special_names767);  
            stream_SPECIAL_NAMES.add(SPECIAL_NAMES44);

            PERIOD45=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_special_names769);  
            stream_PERIOD.add(PERIOD45);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:152:25: ( special_names_clause )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==WORD||LA18_0==ALPHABET||LA18_0==SYMBOLIC||LA18_0==CLASS||(LA18_0>=CONSOLE && LA18_0<=CURRENCY)||(LA18_0>=CURSOR && LA18_0<=NUMERIC)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:152:25: special_names_clause
            	    {
            	    pushFollow(FOLLOW_special_names_clause_in_special_names771);
            	    special_names_clause46=special_names_clause();

            	    state._fsp--;

            	    stream_special_names_clause.add(special_names_clause46.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: SPECIAL_NAMES, special_names_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:47: -> ^( SPECIAL_NAMES ( special_names_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:152:50: ^( SPECIAL_NAMES ( special_names_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SPECIAL_NAMES.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:152:66: ( special_names_clause )*
                while ( stream_special_names_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_special_names_clause.nextTree());

                }
                stream_special_names_clause.reset();

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
    // $ANTLR end "special_names"

    public static class special_names_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "special_names_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:153:1: special_names_clause : ( environment_names | alphabet | symbolic | class_is | console | crt_status | currency | cursor | decimal | numeric );
    public final EnvironmentDivision.special_names_clause_return special_names_clause() throws RecognitionException {
        EnvironmentDivision.special_names_clause_return retval = new EnvironmentDivision.special_names_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.environment_names_return environment_names47 = null;

        EnvironmentDivision.alphabet_return alphabet48 = null;

        EnvironmentDivision.symbolic_return symbolic49 = null;

        EnvironmentDivision.class_is_return class_is50 = null;

        EnvironmentDivision.console_return console51 = null;

        EnvironmentDivision.crt_status_return crt_status52 = null;

        EnvironmentDivision.currency_return currency53 = null;

        EnvironmentDivision.cursor_return cursor54 = null;

        EnvironmentDivision.decimal_return decimal55 = null;

        EnvironmentDivision.numeric_return numeric56 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:2: ( environment_names | alphabet | symbolic | class_is | console | crt_status | currency | cursor | decimal | numeric )
            int alt19=10;
            switch ( input.LA(1) ) {
            case WORD:
                {
                alt19=1;
                }
                break;
            case ALPHABET:
                {
                alt19=2;
                }
                break;
            case SYMBOLIC:
                {
                alt19=3;
                }
                break;
            case CLASS:
                {
                alt19=4;
                }
                break;
            case CONSOLE:
                {
                alt19=5;
                }
                break;
            case CRT:
                {
                alt19=6;
                }
                break;
            case CURRENCY:
                {
                alt19=7;
                }
                break;
            case CURSOR:
                {
                alt19=8;
                }
                break;
            case DECIMAL_POINT:
                {
                alt19=9;
                }
                break;
            case NUMERIC:
                {
                alt19=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:4: environment_names
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_environment_names_in_special_names_clause790);
                    environment_names47=environment_names();

                    state._fsp--;

                    adaptor.addChild(root_0, environment_names47.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:24: alphabet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alphabet_in_special_names_clause794);
                    alphabet48=alphabet();

                    state._fsp--;

                    adaptor.addChild(root_0, alphabet48.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:35: symbolic
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_symbolic_in_special_names_clause798);
                    symbolic49=symbolic();

                    state._fsp--;

                    adaptor.addChild(root_0, symbolic49.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:46: class_is
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_class_is_in_special_names_clause802);
                    class_is50=class_is();

                    state._fsp--;

                    adaptor.addChild(root_0, class_is50.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:57: console
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_console_in_special_names_clause806);
                    console51=console();

                    state._fsp--;

                    adaptor.addChild(root_0, console51.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:67: crt_status
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_crt_status_in_special_names_clause810);
                    crt_status52=crt_status();

                    state._fsp--;

                    adaptor.addChild(root_0, crt_status52.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:80: currency
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_currency_in_special_names_clause814);
                    currency53=currency();

                    state._fsp--;

                    adaptor.addChild(root_0, currency53.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:91: cursor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cursor_in_special_names_clause818);
                    cursor54=cursor();

                    state._fsp--;

                    adaptor.addChild(root_0, cursor54.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:100: decimal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_decimal_in_special_names_clause822);
                    decimal55=decimal();

                    state._fsp--;

                    adaptor.addChild(root_0, decimal55.getTree());

                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:154:110: numeric
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numeric_in_special_names_clause826);
                    numeric56=numeric();

                    state._fsp--;

                    adaptor.addChild(root_0, numeric56.getTree());

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
    // $ANTLR end "special_names_clause"

    public static class console_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "console"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:155:1: console : CONSOLE ( IS )? CRT -> CONSOLE ;
    public final EnvironmentDivision.console_return console() throws RecognitionException {
        EnvironmentDivision.console_return retval = new EnvironmentDivision.console_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONSOLE57=null;
        Token IS58=null;
        Token CRT59=null;

        CommonTree CONSOLE57_tree=null;
        CommonTree IS58_tree=null;
        CommonTree CRT59_tree=null;
        RewriteRuleTokenStream stream_CRT=new RewriteRuleTokenStream(adaptor,"token CRT");
        RewriteRuleTokenStream stream_CONSOLE=new RewriteRuleTokenStream(adaptor,"token CONSOLE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:155:9: ( CONSOLE ( IS )? CRT -> CONSOLE )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:155:11: CONSOLE ( IS )? CRT
            {
            CONSOLE57=(Token)match(input,CONSOLE,FOLLOW_CONSOLE_in_console833);  
            stream_CONSOLE.add(CONSOLE57);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:155:19: ( IS )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:155:19: IS
                    {
                    IS58=(Token)match(input,IS,FOLLOW_IS_in_console835);  
                    stream_IS.add(IS58);


                    }
                    break;

            }

            CRT59=(Token)match(input,CRT,FOLLOW_CRT_in_console838);  
            stream_CRT.add(CRT59);



            // AST REWRITE
            // elements: CONSOLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 155:29: -> CONSOLE
            {
                adaptor.addChild(root_0, stream_CONSOLE.nextNode());

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
    // $ANTLR end "console"

    public static class crt_status_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "crt_status"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:156:1: crt_status : CRT STATUS ( IS )? data_name -> ^( CRT data_name ) ;
    public final EnvironmentDivision.crt_status_return crt_status() throws RecognitionException {
        EnvironmentDivision.crt_status_return retval = new EnvironmentDivision.crt_status_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CRT60=null;
        Token STATUS61=null;
        Token IS62=null;
        EnvironmentDivision.data_name_return data_name63 = null;


        CommonTree CRT60_tree=null;
        CommonTree STATUS61_tree=null;
        CommonTree IS62_tree=null;
        RewriteRuleTokenStream stream_CRT=new RewriteRuleTokenStream(adaptor,"token CRT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_STATUS=new RewriteRuleTokenStream(adaptor,"token STATUS");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:156:11: ( CRT STATUS ( IS )? data_name -> ^( CRT data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:156:13: CRT STATUS ( IS )? data_name
            {
            CRT60=(Token)match(input,CRT,FOLLOW_CRT_in_crt_status850);  
            stream_CRT.add(CRT60);

            STATUS61=(Token)match(input,STATUS,FOLLOW_STATUS_in_crt_status852);  
            stream_STATUS.add(STATUS61);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:156:24: ( IS )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IS) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:156:24: IS
                    {
                    IS62=(Token)match(input,IS,FOLLOW_IS_in_crt_status854);  
                    stream_IS.add(IS62);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_crt_status857);
            data_name63=data_name();

            state._fsp--;

            stream_data_name.add(data_name63.getTree());


            // AST REWRITE
            // elements: CRT, data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:38: -> ^( CRT data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:156:41: ^( CRT data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CRT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

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
    // $ANTLR end "crt_status"

    public static class currency_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "currency"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:1: currency : CURRENCY ( SIGN )? ( IS )? literal -> ^( CURRENCY literal ) ;
    public final EnvironmentDivision.currency_return currency() throws RecognitionException {
        EnvironmentDivision.currency_return retval = new EnvironmentDivision.currency_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CURRENCY64=null;
        Token SIGN65=null;
        Token IS66=null;
        EnvironmentDivision.literal_return literal67 = null;


        CommonTree CURRENCY64_tree=null;
        CommonTree SIGN65_tree=null;
        CommonTree IS66_tree=null;
        RewriteRuleTokenStream stream_SIGN=new RewriteRuleTokenStream(adaptor,"token SIGN");
        RewriteRuleTokenStream stream_CURRENCY=new RewriteRuleTokenStream(adaptor,"token CURRENCY");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:9: ( CURRENCY ( SIGN )? ( IS )? literal -> ^( CURRENCY literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:11: CURRENCY ( SIGN )? ( IS )? literal
            {
            CURRENCY64=(Token)match(input,CURRENCY,FOLLOW_CURRENCY_in_currency871);  
            stream_CURRENCY.add(CURRENCY64);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:20: ( SIGN )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SIGN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:20: SIGN
                    {
                    SIGN65=(Token)match(input,SIGN,FOLLOW_SIGN_in_currency873);  
                    stream_SIGN.add(SIGN65);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:26: ( IS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:26: IS
                    {
                    IS66=(Token)match(input,IS,FOLLOW_IS_in_currency876);  
                    stream_IS.add(IS66);


                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_currency879);
            literal67=literal();

            state._fsp--;

            stream_literal.add(literal67.getTree());


            // AST REWRITE
            // elements: literal, CURRENCY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 157:38: -> ^( CURRENCY literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:157:41: ^( CURRENCY literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CURRENCY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_literal.nextTree());

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
    // $ANTLR end "currency"

    public static class cursor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cursor"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:158:1: cursor : CURSOR ( IS )? data_name -> ^( CURSOR data_name ) ;
    public final EnvironmentDivision.cursor_return cursor() throws RecognitionException {
        EnvironmentDivision.cursor_return retval = new EnvironmentDivision.cursor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CURSOR68=null;
        Token IS69=null;
        EnvironmentDivision.data_name_return data_name70 = null;


        CommonTree CURSOR68_tree=null;
        CommonTree IS69_tree=null;
        RewriteRuleTokenStream stream_CURSOR=new RewriteRuleTokenStream(adaptor,"token CURSOR");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:158:8: ( CURSOR ( IS )? data_name -> ^( CURSOR data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:158:10: CURSOR ( IS )? data_name
            {
            CURSOR68=(Token)match(input,CURSOR,FOLLOW_CURSOR_in_cursor894);  
            stream_CURSOR.add(CURSOR68);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:158:17: ( IS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:158:17: IS
                    {
                    IS69=(Token)match(input,IS,FOLLOW_IS_in_cursor896);  
                    stream_IS.add(IS69);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_cursor899);
            data_name70=data_name();

            state._fsp--;

            stream_data_name.add(data_name70.getTree());


            // AST REWRITE
            // elements: CURSOR, data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 158:32: -> ^( CURSOR data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:158:35: ^( CURSOR data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CURSOR.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

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
    // $ANTLR end "cursor"

    public static class decimal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decimal"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:159:1: decimal : DECIMAL_POINT ( IS )? COMMA -> DECIMAL_POINT ;
    public final EnvironmentDivision.decimal_return decimal() throws RecognitionException {
        EnvironmentDivision.decimal_return retval = new EnvironmentDivision.decimal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DECIMAL_POINT71=null;
        Token IS72=null;
        Token COMMA73=null;

        CommonTree DECIMAL_POINT71_tree=null;
        CommonTree IS72_tree=null;
        CommonTree COMMA73_tree=null;
        RewriteRuleTokenStream stream_DECIMAL_POINT=new RewriteRuleTokenStream(adaptor,"token DECIMAL_POINT");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:159:9: ( DECIMAL_POINT ( IS )? COMMA -> DECIMAL_POINT )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:159:11: DECIMAL_POINT ( IS )? COMMA
            {
            DECIMAL_POINT71=(Token)match(input,DECIMAL_POINT,FOLLOW_DECIMAL_POINT_in_decimal915);  
            stream_DECIMAL_POINT.add(DECIMAL_POINT71);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:159:25: ( IS )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:159:25: IS
                    {
                    IS72=(Token)match(input,IS,FOLLOW_IS_in_decimal917);  
                    stream_IS.add(IS72);


                    }
                    break;

            }

            COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_decimal920);  
            stream_COMMA.add(COMMA73);



            // AST REWRITE
            // elements: DECIMAL_POINT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 159:36: -> DECIMAL_POINT
            {
                adaptor.addChild(root_0, stream_DECIMAL_POINT.nextNode());

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
    // $ANTLR end "decimal"

    public static class numeric_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numeric"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:1: numeric : NUMERIC SIGN ( IS )? leading ( separate )? -> ^( SIGN leading ( separate )? ) ;
    public final EnvironmentDivision.numeric_return numeric() throws RecognitionException {
        EnvironmentDivision.numeric_return retval = new EnvironmentDivision.numeric_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NUMERIC74=null;
        Token SIGN75=null;
        Token IS76=null;
        EnvironmentDivision.leading_return leading77 = null;

        EnvironmentDivision.separate_return separate78 = null;


        CommonTree NUMERIC74_tree=null;
        CommonTree SIGN75_tree=null;
        CommonTree IS76_tree=null;
        RewriteRuleTokenStream stream_SIGN=new RewriteRuleTokenStream(adaptor,"token SIGN");
        RewriteRuleTokenStream stream_NUMERIC=new RewriteRuleTokenStream(adaptor,"token NUMERIC");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_separate=new RewriteRuleSubtreeStream(adaptor,"rule separate");
        RewriteRuleSubtreeStream stream_leading=new RewriteRuleSubtreeStream(adaptor,"rule leading");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:9: ( NUMERIC SIGN ( IS )? leading ( separate )? -> ^( SIGN leading ( separate )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:11: NUMERIC SIGN ( IS )? leading ( separate )?
            {
            NUMERIC74=(Token)match(input,NUMERIC,FOLLOW_NUMERIC_in_numeric932);  
            stream_NUMERIC.add(NUMERIC74);

            SIGN75=(Token)match(input,SIGN,FOLLOW_SIGN_in_numeric934);  
            stream_SIGN.add(SIGN75);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:24: ( IS )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==IS) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:24: IS
                    {
                    IS76=(Token)match(input,IS,FOLLOW_IS_in_numeric936);  
                    stream_IS.add(IS76);


                    }
                    break;

            }

            pushFollow(FOLLOW_leading_in_numeric939);
            leading77=leading();

            state._fsp--;

            stream_leading.add(leading77.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:36: ( separate )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SEPARATE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:36: separate
                    {
                    pushFollow(FOLLOW_separate_in_numeric941);
                    separate78=separate();

                    state._fsp--;

                    stream_separate.add(separate78.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: leading, SIGN, separate
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 160:46: -> ^( SIGN leading ( separate )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:49: ^( SIGN leading ( separate )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SIGN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_leading.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:160:64: ( separate )?
                if ( stream_separate.hasNext() ) {
                    adaptor.addChild(root_1, stream_separate.nextTree());

                }
                stream_separate.reset();

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
    // $ANTLR end "numeric"

    public static class leading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leading"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:161:1: leading : ( LEADING | TRAILING );
    public final EnvironmentDivision.leading_return leading() throws RecognitionException {
        EnvironmentDivision.leading_return retval = new EnvironmentDivision.leading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set79=null;

        CommonTree set79_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:161:9: ( LEADING | TRAILING )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set79=(Token)input.LT(1);
            if ( (input.LA(1)>=LEADING && input.LA(1)<=TRAILING) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set79));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "leading"

    public static class separate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "separate"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:162:1: separate : SEPARATE ( CHARACTERS )? -> SEPARATE ;
    public final EnvironmentDivision.separate_return separate() throws RecognitionException {
        EnvironmentDivision.separate_return retval = new EnvironmentDivision.separate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEPARATE80=null;
        Token CHARACTERS81=null;

        CommonTree SEPARATE80_tree=null;
        CommonTree CHARACTERS81_tree=null;
        RewriteRuleTokenStream stream_CHARACTERS=new RewriteRuleTokenStream(adaptor,"token CHARACTERS");
        RewriteRuleTokenStream stream_SEPARATE=new RewriteRuleTokenStream(adaptor,"token SEPARATE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:162:9: ( SEPARATE ( CHARACTERS )? -> SEPARATE )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:162:11: SEPARATE ( CHARACTERS )?
            {
            SEPARATE80=(Token)match(input,SEPARATE,FOLLOW_SEPARATE_in_separate970);  
            stream_SEPARATE.add(SEPARATE80);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:162:20: ( CHARACTERS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CHARACTERS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:162:20: CHARACTERS
                    {
                    CHARACTERS81=(Token)match(input,CHARACTERS,FOLLOW_CHARACTERS_in_separate972);  
                    stream_CHARACTERS.add(CHARACTERS81);


                    }
                    break;

            }



            // AST REWRITE
            // elements: SEPARATE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 162:33: -> SEPARATE
            {
                adaptor.addChild(root_0, stream_SEPARATE.nextNode());

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
    // $ANTLR end "separate"

    public static class environment_names_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "environment_names"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:163:1: environment_names : (a= WORD ( IS )? b= WORD ( status )? -> ^( ENVIRONMENT_NAME $a $b ( status )? ) | WORD status -> ^( ENVIRONMENT_NAME WORD status ) );
    public final EnvironmentDivision.environment_names_return environment_names() throws RecognitionException {
        EnvironmentDivision.environment_names_return retval = new EnvironmentDivision.environment_names_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token IS82=null;
        Token WORD84=null;
        EnvironmentDivision.status_return status83 = null;

        EnvironmentDivision.status_return status85 = null;


        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree IS82_tree=null;
        CommonTree WORD84_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_status=new RewriteRuleSubtreeStream(adaptor,"rule status");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:2: (a= WORD ( IS )? b= WORD ( status )? -> ^( ENVIRONMENT_NAME $a $b ( status )? ) | WORD status -> ^( ENVIRONMENT_NAME WORD status ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==WORD) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==ON||LA31_1==OFF) ) {
                    alt31=2;
                }
                else if ( (LA31_1==WORD||LA31_1==IS) ) {
                    alt31=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:4: a= WORD ( IS )? b= WORD ( status )?
                    {
                    a=(Token)match(input,WORD,FOLLOW_WORD_in_environment_names988);  
                    stream_WORD.add(a);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:11: ( IS )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IS) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:11: IS
                            {
                            IS82=(Token)match(input,IS,FOLLOW_IS_in_environment_names990);  
                            stream_IS.add(IS82);


                            }
                            break;

                    }

                    b=(Token)match(input,WORD,FOLLOW_WORD_in_environment_names995);  
                    stream_WORD.add(b);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:22: ( status )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ON||LA30_0==OFF) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:22: status
                            {
                            pushFollow(FOLLOW_status_in_environment_names997);
                            status83=status();

                            state._fsp--;

                            stream_status.add(status83.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: a, status, b
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 164:30: -> ^( ENVIRONMENT_NAME $a $b ( status )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:33: ^( ENVIRONMENT_NAME $a $b ( status )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENVIRONMENT_NAME, "ENVIRONMENT_NAME"), root_1);

                        adaptor.addChild(root_1, stream_a.nextNode());
                        adaptor.addChild(root_1, stream_b.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:164:58: ( status )?
                        if ( stream_status.hasNext() ) {
                            adaptor.addChild(root_1, stream_status.nextTree());

                        }
                        stream_status.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:165:4: WORD status
                    {
                    WORD84=(Token)match(input,WORD,FOLLOW_WORD_in_environment_names1019);  
                    stream_WORD.add(WORD84);

                    pushFollow(FOLLOW_status_in_environment_names1021);
                    status85=status();

                    state._fsp--;

                    stream_status.add(status85.getTree());


                    // AST REWRITE
                    // elements: status, WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 165:18: -> ^( ENVIRONMENT_NAME WORD status )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:165:21: ^( ENVIRONMENT_NAME WORD status )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ENVIRONMENT_NAME, "ENVIRONMENT_NAME"), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());
                        adaptor.addChild(root_1, stream_status.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // $ANTLR end "environment_names"

    public static class status_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "status"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:167:1: status : ( on_status ( off_status )? | off_status ( on_status )? );
    public final EnvironmentDivision.status_return status() throws RecognitionException {
        EnvironmentDivision.status_return retval = new EnvironmentDivision.status_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.on_status_return on_status86 = null;

        EnvironmentDivision.off_status_return off_status87 = null;

        EnvironmentDivision.off_status_return off_status88 = null;

        EnvironmentDivision.on_status_return on_status89 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:167:8: ( on_status ( off_status )? | off_status ( on_status )? )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ON) ) {
                alt34=1;
            }
            else if ( (LA34_0==OFF) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:167:10: on_status ( off_status )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_on_status_in_status1042);
                    on_status86=on_status();

                    state._fsp--;

                    adaptor.addChild(root_0, on_status86.getTree());
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:167:20: ( off_status )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==OFF) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:167:20: off_status
                            {
                            pushFollow(FOLLOW_off_status_in_status1044);
                            off_status87=off_status();

                            state._fsp--;

                            adaptor.addChild(root_0, off_status87.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:168:4: off_status ( on_status )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_off_status_in_status1050);
                    off_status88=off_status();

                    state._fsp--;

                    adaptor.addChild(root_0, off_status88.getTree());
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:168:15: ( on_status )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ON) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:168:15: on_status
                            {
                            pushFollow(FOLLOW_on_status_in_status1052);
                            on_status89=on_status();

                            state._fsp--;

                            adaptor.addChild(root_0, on_status89.getTree());

                            }
                            break;

                    }


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
    // $ANTLR end "status"

    public static class on_status_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "on_status"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:170:1: on_status : ON ( STATUS )? ( IS )? WORD -> ^( ON WORD ) ;
    public final EnvironmentDivision.on_status_return on_status() throws RecognitionException {
        EnvironmentDivision.on_status_return retval = new EnvironmentDivision.on_status_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ON90=null;
        Token STATUS91=null;
        Token IS92=null;
        Token WORD93=null;

        CommonTree ON90_tree=null;
        CommonTree STATUS91_tree=null;
        CommonTree IS92_tree=null;
        CommonTree WORD93_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_STATUS=new RewriteRuleTokenStream(adaptor,"token STATUS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:2: ( ON ( STATUS )? ( IS )? WORD -> ^( ON WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:4: ON ( STATUS )? ( IS )? WORD
            {
            ON90=(Token)match(input,ON,FOLLOW_ON_in_on_status1064);  
            stream_ON.add(ON90);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:7: ( STATUS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==STATUS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:7: STATUS
                    {
                    STATUS91=(Token)match(input,STATUS,FOLLOW_STATUS_in_on_status1066);  
                    stream_STATUS.add(STATUS91);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:15: ( IS )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IS) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:15: IS
                    {
                    IS92=(Token)match(input,IS,FOLLOW_IS_in_on_status1069);  
                    stream_IS.add(IS92);


                    }
                    break;

            }

            WORD93=(Token)match(input,WORD,FOLLOW_WORD_in_on_status1072);  
            stream_WORD.add(WORD93);



            // AST REWRITE
            // elements: WORD, ON
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 171:25: -> ^( ON WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:171:28: ^( ON WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ON.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

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
    // $ANTLR end "on_status"

    public static class off_status_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "off_status"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:173:1: off_status : OFF ( STATUS )? ( IS )? WORD -> ^( OFF WORD ) ;
    public final EnvironmentDivision.off_status_return off_status() throws RecognitionException {
        EnvironmentDivision.off_status_return retval = new EnvironmentDivision.off_status_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OFF94=null;
        Token STATUS95=null;
        Token IS96=null;
        Token WORD97=null;

        CommonTree OFF94_tree=null;
        CommonTree STATUS95_tree=null;
        CommonTree IS96_tree=null;
        CommonTree WORD97_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_OFF=new RewriteRuleTokenStream(adaptor,"token OFF");
        RewriteRuleTokenStream stream_STATUS=new RewriteRuleTokenStream(adaptor,"token STATUS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:2: ( OFF ( STATUS )? ( IS )? WORD -> ^( OFF WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:4: OFF ( STATUS )? ( IS )? WORD
            {
            OFF94=(Token)match(input,OFF,FOLLOW_OFF_in_off_status1091);  
            stream_OFF.add(OFF94);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:8: ( STATUS )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==STATUS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:8: STATUS
                    {
                    STATUS95=(Token)match(input,STATUS,FOLLOW_STATUS_in_off_status1093);  
                    stream_STATUS.add(STATUS95);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:16: ( IS )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IS) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:16: IS
                    {
                    IS96=(Token)match(input,IS,FOLLOW_IS_in_off_status1096);  
                    stream_IS.add(IS96);


                    }
                    break;

            }

            WORD97=(Token)match(input,WORD,FOLLOW_WORD_in_off_status1099);  
            stream_WORD.add(WORD97);



            // AST REWRITE
            // elements: OFF, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 174:26: -> ^( OFF WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:174:29: ^( OFF WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_OFF.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

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
    // $ANTLR end "off_status"

    public static class alphabet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alphabet"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:177:1: alphabet : ALPHABET WORD ( IS )? alphabet_alts -> ^( ALPHABET WORD alphabet_alts ) ;
    public final EnvironmentDivision.alphabet_return alphabet() throws RecognitionException {
        EnvironmentDivision.alphabet_return retval = new EnvironmentDivision.alphabet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALPHABET98=null;
        Token WORD99=null;
        Token IS100=null;
        EnvironmentDivision.alphabet_alts_return alphabet_alts101 = null;


        CommonTree ALPHABET98_tree=null;
        CommonTree WORD99_tree=null;
        CommonTree IS100_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_ALPHABET=new RewriteRuleTokenStream(adaptor,"token ALPHABET");
        RewriteRuleSubtreeStream stream_alphabet_alts=new RewriteRuleSubtreeStream(adaptor,"rule alphabet_alts");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:177:9: ( ALPHABET WORD ( IS )? alphabet_alts -> ^( ALPHABET WORD alphabet_alts ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:177:11: ALPHABET WORD ( IS )? alphabet_alts
            {
            ALPHABET98=(Token)match(input,ALPHABET,FOLLOW_ALPHABET_in_alphabet1119);  
            stream_ALPHABET.add(ALPHABET98);

            WORD99=(Token)match(input,WORD,FOLLOW_WORD_in_alphabet1121);  
            stream_WORD.add(WORD99);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:177:25: ( IS )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==IS) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:177:25: IS
                    {
                    IS100=(Token)match(input,IS,FOLLOW_IS_in_alphabet1123);  
                    stream_IS.add(IS100);


                    }
                    break;

            }

            pushFollow(FOLLOW_alphabet_alts_in_alphabet1126);
            alphabet_alts101=alphabet_alts();

            state._fsp--;

            stream_alphabet_alts.add(alphabet_alts101.getTree());


            // AST REWRITE
            // elements: alphabet_alts, ALPHABET, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:43: -> ^( ALPHABET WORD alphabet_alts )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:177:46: ^( ALPHABET WORD alphabet_alts )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ALPHABET.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                adaptor.addChild(root_1, stream_alphabet_alts.nextTree());

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
    // $ANTLR end "alphabet"

    public static class alphabet_alts_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alphabet_alts"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:178:1: alphabet_alts : ( STANDARD_1 | STANDARD_2 | NATIVE | EBCDIC | ( alpha_name )+ );
    public final EnvironmentDivision.alphabet_alts_return alphabet_alts() throws RecognitionException {
        EnvironmentDivision.alphabet_alts_return retval = new EnvironmentDivision.alphabet_alts_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STANDARD_1102=null;
        Token STANDARD_2103=null;
        Token NATIVE104=null;
        Token EBCDIC105=null;
        EnvironmentDivision.alpha_name_return alpha_name106 = null;


        CommonTree STANDARD_1102_tree=null;
        CommonTree STANDARD_2103_tree=null;
        CommonTree NATIVE104_tree=null;
        CommonTree EBCDIC105_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:2: ( STANDARD_1 | STANDARD_2 | NATIVE | EBCDIC | ( alpha_name )+ )
            int alt41=5;
            switch ( input.LA(1) ) {
            case STANDARD_1:
                {
                alt41=1;
                }
                break;
            case STANDARD_2:
                {
                alt41=2;
                }
                break;
            case NATIVE:
                {
                alt41=3;
                }
                break;
            case EBCDIC:
                {
                alt41=4;
                }
                break;
            case STRING:
            case WORD:
            case ALSO:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:4: STANDARD_1
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STANDARD_1102=(Token)match(input,STANDARD_1,FOLLOW_STANDARD_1_in_alphabet_alts1144); 
                    STANDARD_1102_tree = (CommonTree)adaptor.create(STANDARD_1102);
                    adaptor.addChild(root_0, STANDARD_1102_tree);


                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:17: STANDARD_2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    STANDARD_2103=(Token)match(input,STANDARD_2,FOLLOW_STANDARD_2_in_alphabet_alts1148); 
                    STANDARD_2103_tree = (CommonTree)adaptor.create(STANDARD_2103);
                    adaptor.addChild(root_0, STANDARD_2103_tree);


                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:30: NATIVE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NATIVE104=(Token)match(input,NATIVE,FOLLOW_NATIVE_in_alphabet_alts1152); 
                    NATIVE104_tree = (CommonTree)adaptor.create(NATIVE104);
                    adaptor.addChild(root_0, NATIVE104_tree);


                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:39: EBCDIC
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EBCDIC105=(Token)match(input,EBCDIC,FOLLOW_EBCDIC_in_alphabet_alts1156); 
                    EBCDIC105_tree = (CommonTree)adaptor.create(EBCDIC105);
                    adaptor.addChild(root_0, EBCDIC105_tree);


                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:48: ( alpha_name )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:48: ( alpha_name )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==WORD) ) {
                            int LA40_2 = input.LA(2);

                            if ( (LA40_2==EOF||(LA40_2>=PERIOD && LA40_2<=WORD)||LA40_2==CONFIGURATION||LA40_2==SOURCE_COMPUTER||LA40_2==OBJECT_COMPUTER||LA40_2==SPECIAL_NAMES||LA40_2==ALPHABET||(LA40_2>=ALSO && LA40_2<=THRU)||LA40_2==SYMBOLIC||(LA40_2>=CLASS && LA40_2<=INPUT_OUTPUT)||(LA40_2>=CONSOLE && LA40_2<=CURRENCY)||(LA40_2>=CURSOR && LA40_2<=NUMERIC)) ) {
                                alt40=1;
                            }
                            else if ( (LA40_2==STRING) ) {
                                alt40=1;
                            }


                        }
                        else if ( (LA40_0==STRING||LA40_0==ALSO) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:179:48: alpha_name
                    	    {
                    	    pushFollow(FOLLOW_alpha_name_in_alphabet_alts1160);
                    	    alpha_name106=alpha_name();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, alpha_name106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


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
    // $ANTLR end "alphabet_alts"

    public static class alpha_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alpha_name"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:180:1: alpha_name : (a= literal THRU c= literal -> ^( THRU $a $c) | ALSO literal -> ^( ALSO literal ) | literal );
    public final EnvironmentDivision.alpha_name_return alpha_name() throws RecognitionException {
        EnvironmentDivision.alpha_name_return retval = new EnvironmentDivision.alpha_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token THRU107=null;
        Token ALSO108=null;
        EnvironmentDivision.literal_return a = null;

        EnvironmentDivision.literal_return c = null;

        EnvironmentDivision.literal_return literal109 = null;

        EnvironmentDivision.literal_return literal110 = null;


        CommonTree THRU107_tree=null;
        CommonTree ALSO108_tree=null;
        RewriteRuleTokenStream stream_THRU=new RewriteRuleTokenStream(adaptor,"token THRU");
        RewriteRuleTokenStream stream_ALSO=new RewriteRuleTokenStream(adaptor,"token ALSO");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:180:11: (a= literal THRU c= literal -> ^( THRU $a $c) | ALSO literal -> ^( ALSO literal ) | literal )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==STRING||LA42_0==WORD) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==EOF||LA42_1==STRING||(LA42_1>=PERIOD && LA42_1<=WORD)||LA42_1==CONFIGURATION||LA42_1==SOURCE_COMPUTER||LA42_1==OBJECT_COMPUTER||LA42_1==SPECIAL_NAMES||LA42_1==ALPHABET||LA42_1==ALSO||LA42_1==SYMBOLIC||(LA42_1>=CLASS && LA42_1<=INPUT_OUTPUT)||(LA42_1>=CONSOLE && LA42_1<=CURRENCY)||(LA42_1>=CURSOR && LA42_1<=NUMERIC)) ) {
                    alt42=3;
                }
                else if ( (LA42_1==THRU) ) {
                    alt42=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA42_0==ALSO) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:180:13: a= literal THRU c= literal
                    {
                    pushFollow(FOLLOW_literal_in_alpha_name1170);
                    a=literal();

                    state._fsp--;

                    stream_literal.add(a.getTree());
                    THRU107=(Token)match(input,THRU,FOLLOW_THRU_in_alpha_name1172);  
                    stream_THRU.add(THRU107);

                    pushFollow(FOLLOW_literal_in_alpha_name1176);
                    c=literal();

                    state._fsp--;

                    stream_literal.add(c.getTree());


                    // AST REWRITE
                    // elements: THRU, c, a
                    // token labels: 
                    // rule labels: retval, c, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 180:38: -> ^( THRU $a $c)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:180:41: ^( THRU $a $c)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_THRU.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:181:4: ALSO literal
                    {
                    ALSO108=(Token)match(input,ALSO,FOLLOW_ALSO_in_alpha_name1193);  
                    stream_ALSO.add(ALSO108);

                    pushFollow(FOLLOW_literal_in_alpha_name1195);
                    literal109=literal();

                    state._fsp--;

                    stream_literal.add(literal109.getTree());


                    // AST REWRITE
                    // elements: ALSO, literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 181:19: -> ^( ALSO literal )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:181:22: ^( ALSO literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ALSO.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:182:4: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_alpha_name1210);
                    literal110=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal110.getTree());

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
    // $ANTLR end "alpha_name"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:184:1: literal : ( WORD | STRING );
    public final EnvironmentDivision.literal_return literal() throws RecognitionException {
        EnvironmentDivision.literal_return retval = new EnvironmentDivision.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set111=null;

        CommonTree set111_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:184:9: ( WORD | STRING )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set111=(Token)input.LT(1);
            if ( input.LA(1)==STRING||input.LA(1)==WORD ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set111));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "literal"

    public static class symbolic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolic"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:1: symbolic : SYMBOLIC ( CHARACTERS )? symbolic_pair ( in_alphabet )? -> ^( SYMBOLIC symbolic_pair ( in_alphabet )? ) ;
    public final EnvironmentDivision.symbolic_return symbolic() throws RecognitionException {
        EnvironmentDivision.symbolic_return retval = new EnvironmentDivision.symbolic_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYMBOLIC112=null;
        Token CHARACTERS113=null;
        EnvironmentDivision.symbolic_pair_return symbolic_pair114 = null;

        EnvironmentDivision.in_alphabet_return in_alphabet115 = null;


        CommonTree SYMBOLIC112_tree=null;
        CommonTree CHARACTERS113_tree=null;
        RewriteRuleTokenStream stream_SYMBOLIC=new RewriteRuleTokenStream(adaptor,"token SYMBOLIC");
        RewriteRuleTokenStream stream_CHARACTERS=new RewriteRuleTokenStream(adaptor,"token CHARACTERS");
        RewriteRuleSubtreeStream stream_symbolic_pair=new RewriteRuleSubtreeStream(adaptor,"rule symbolic_pair");
        RewriteRuleSubtreeStream stream_in_alphabet=new RewriteRuleSubtreeStream(adaptor,"rule in_alphabet");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:9: ( SYMBOLIC ( CHARACTERS )? symbolic_pair ( in_alphabet )? -> ^( SYMBOLIC symbolic_pair ( in_alphabet )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:11: SYMBOLIC ( CHARACTERS )? symbolic_pair ( in_alphabet )?
            {
            SYMBOLIC112=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_symbolic1234);  
            stream_SYMBOLIC.add(SYMBOLIC112);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:20: ( CHARACTERS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==CHARACTERS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:20: CHARACTERS
                    {
                    CHARACTERS113=(Token)match(input,CHARACTERS,FOLLOW_CHARACTERS_in_symbolic1236);  
                    stream_CHARACTERS.add(CHARACTERS113);


                    }
                    break;

            }

            pushFollow(FOLLOW_symbolic_pair_in_symbolic1239);
            symbolic_pair114=symbolic_pair();

            state._fsp--;

            stream_symbolic_pair.add(symbolic_pair114.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:46: ( in_alphabet )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==IN) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:46: in_alphabet
                    {
                    pushFollow(FOLLOW_in_alphabet_in_symbolic1241);
                    in_alphabet115=in_alphabet();

                    state._fsp--;

                    stream_in_alphabet.add(in_alphabet115.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: in_alphabet, symbolic_pair, SYMBOLIC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 187:59: -> ^( SYMBOLIC symbolic_pair ( in_alphabet )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:62: ^( SYMBOLIC symbolic_pair ( in_alphabet )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SYMBOLIC.nextNode(), root_1);

                adaptor.addChild(root_1, stream_symbolic_pair.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:187:88: ( in_alphabet )?
                if ( stream_in_alphabet.hasNext() ) {
                    adaptor.addChild(root_1, stream_in_alphabet.nextTree());

                }
                stream_in_alphabet.reset();

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
    // $ANTLR end "symbolic"

    public static class symbolic_pair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolic_pair"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:188:1: symbolic_pair : (a= word_list IS b= word_list -> ^( IS $a $b) | word_list -> word_list );
    public final EnvironmentDivision.symbolic_pair_return symbolic_pair() throws RecognitionException {
        EnvironmentDivision.symbolic_pair_return retval = new EnvironmentDivision.symbolic_pair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS116=null;
        EnvironmentDivision.word_list_return a = null;

        EnvironmentDivision.word_list_return b = null;

        EnvironmentDivision.word_list_return word_list117 = null;


        CommonTree IS116_tree=null;
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_word_list=new RewriteRuleSubtreeStream(adaptor,"rule word_list");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:189:2: (a= word_list IS b= word_list -> ^( IS $a $b) | word_list -> word_list )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:189:4: a= word_list IS b= word_list
                    {
                    pushFollow(FOLLOW_word_list_in_symbolic_pair1265);
                    a=word_list();

                    state._fsp--;

                    stream_word_list.add(a.getTree());
                    IS116=(Token)match(input,IS,FOLLOW_IS_in_symbolic_pair1267);  
                    stream_IS.add(IS116);

                    pushFollow(FOLLOW_word_list_in_symbolic_pair1271);
                    b=word_list();

                    state._fsp--;

                    stream_word_list.add(b.getTree());


                    // AST REWRITE
                    // elements: IS, a, b
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 189:32: -> ^( IS $a $b)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:189:35: ^( IS $a $b)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:190:4: word_list
                    {
                    pushFollow(FOLLOW_word_list_in_symbolic_pair1289);
                    word_list117=word_list();

                    state._fsp--;

                    stream_word_list.add(word_list117.getTree());


                    // AST REWRITE
                    // elements: word_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 190:16: -> word_list
                    {
                        adaptor.addChild(root_0, stream_word_list.nextTree());

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
    // $ANTLR end "symbolic_pair"

    public static class word_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "word_list"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:192:1: word_list : ( WORD )+ -> ^( P_LIST ( WORD )+ ) ;
    public final EnvironmentDivision.word_list_return word_list() throws RecognitionException {
        EnvironmentDivision.word_list_return retval = new EnvironmentDivision.word_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD118=null;

        CommonTree WORD118_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:193:2: ( ( WORD )+ -> ^( P_LIST ( WORD )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:193:4: ( WORD )+
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:193:4: ( WORD )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==WORD) ) {
                    int LA46_2 = input.LA(2);

                    if ( (LA46_2==IS) ) {
                        int LA46_3 = input.LA(3);

                        if ( (LA46_3==WORD) ) {
                            alt46=1;
                        }


                    }
                    else if ( (LA46_2==EOF||(LA46_2>=PERIOD && LA46_2<=WORD)||LA46_2==CONFIGURATION||LA46_2==SOURCE_COMPUTER||LA46_2==OBJECT_COMPUTER||LA46_2==SPECIAL_NAMES||LA46_2==ALPHABET||LA46_2==SYMBOLIC||(LA46_2>=IN && LA46_2<=INPUT_OUTPUT)||(LA46_2>=CONSOLE && LA46_2<=CURRENCY)||(LA46_2>=CURSOR && LA46_2<=NUMERIC)) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:193:4: WORD
            	    {
            	    WORD118=(Token)match(input,WORD,FOLLOW_WORD_in_word_list1305);  
            	    stream_WORD.add(WORD118);


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 193:13: -> ^( P_LIST ( WORD )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:193:16: ^( P_LIST ( WORD )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_LIST, "P_LIST"), root_1);

                if ( !(stream_WORD.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_WORD.hasNext() ) {
                    adaptor.addChild(root_1, stream_WORD.nextNode());

                }
                stream_WORD.reset();

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
    // $ANTLR end "word_list"

    public static class in_alphabet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_alphabet"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:194:1: in_alphabet : IN WORD -> ^( IN WORD ) ;
    public final EnvironmentDivision.in_alphabet_return in_alphabet() throws RecognitionException {
        EnvironmentDivision.in_alphabet_return retval = new EnvironmentDivision.in_alphabet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN119=null;
        Token WORD120=null;

        CommonTree IN119_tree=null;
        CommonTree WORD120_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:195:2: ( IN WORD -> ^( IN WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:195:4: IN WORD
            {
            IN119=(Token)match(input,IN,FOLLOW_IN_in_in_alphabet1327);  
            stream_IN.add(IN119);

            WORD120=(Token)match(input,WORD,FOLLOW_WORD_in_in_alphabet1329);  
            stream_WORD.add(WORD120);



            // AST REWRITE
            // elements: IN, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 195:15: -> ^( IN WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:195:18: ^( IN WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_IN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

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
    // $ANTLR end "in_alphabet"

    public static class class_is_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_is"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:1: class_is : CLASS WORD ( IS )? ( simple_pair )* -> ^( CLASS WORD ( simple_pair )* ) ;
    public final EnvironmentDivision.class_is_return class_is() throws RecognitionException {
        EnvironmentDivision.class_is_return retval = new EnvironmentDivision.class_is_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLASS121=null;
        Token WORD122=null;
        Token IS123=null;
        EnvironmentDivision.simple_pair_return simple_pair124 = null;


        CommonTree CLASS121_tree=null;
        CommonTree WORD122_tree=null;
        CommonTree IS123_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_simple_pair=new RewriteRuleSubtreeStream(adaptor,"rule simple_pair");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:9: ( CLASS WORD ( IS )? ( simple_pair )* -> ^( CLASS WORD ( simple_pair )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:11: CLASS WORD ( IS )? ( simple_pair )*
            {
            CLASS121=(Token)match(input,CLASS,FOLLOW_CLASS_in_class_is1347);  
            stream_CLASS.add(CLASS121);

            WORD122=(Token)match(input,WORD,FOLLOW_WORD_in_class_is1349);  
            stream_WORD.add(WORD122);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:22: ( IS )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:22: IS
                    {
                    IS123=(Token)match(input,IS,FOLLOW_IS_in_class_is1351);  
                    stream_IS.add(IS123);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:26: ( simple_pair )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==WORD) ) {
                    int LA48_2 = input.LA(2);

                    if ( (LA48_2==EOF||LA48_2==PERIOD||LA48_2==CONFIGURATION||LA48_2==SOURCE_COMPUTER||LA48_2==OBJECT_COMPUTER||LA48_2==SPECIAL_NAMES||LA48_2==THRU||LA48_2==INPUT_OUTPUT) ) {
                        alt48=1;
                    }
                    else if ( (LA48_2==WORD||LA48_2==ALPHABET||LA48_2==SYMBOLIC||LA48_2==CLASS||(LA48_2>=CONSOLE && LA48_2<=CURRENCY)||(LA48_2>=CURSOR && LA48_2<=NUMERIC)) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:26: simple_pair
            	    {
            	    pushFollow(FOLLOW_simple_pair_in_class_is1354);
            	    simple_pair124=simple_pair();

            	    state._fsp--;

            	    stream_simple_pair.add(simple_pair124.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);



            // AST REWRITE
            // elements: WORD, CLASS, simple_pair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 196:39: -> ^( CLASS WORD ( simple_pair )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:42: ^( CLASS WORD ( simple_pair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CLASS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:196:55: ( simple_pair )*
                while ( stream_simple_pair.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_pair.nextTree());

                }
                stream_simple_pair.reset();

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
    // $ANTLR end "class_is"

    public static class simple_pair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_pair"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:197:1: simple_pair : (a= WORD THRU b= WORD -> ^( THRU $a $b) | WORD );
    public final EnvironmentDivision.simple_pair_return simple_pair() throws RecognitionException {
        EnvironmentDivision.simple_pair_return retval = new EnvironmentDivision.simple_pair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token THRU125=null;
        Token WORD126=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree THRU125_tree=null;
        CommonTree WORD126_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_THRU=new RewriteRuleTokenStream(adaptor,"token THRU");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:198:2: (a= WORD THRU b= WORD -> ^( THRU $a $b) | WORD )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==WORD) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==THRU) ) {
                    alt49=1;
                }
                else if ( (LA49_1==EOF||(LA49_1>=PERIOD && LA49_1<=WORD)||LA49_1==CONFIGURATION||LA49_1==SOURCE_COMPUTER||LA49_1==OBJECT_COMPUTER||LA49_1==SPECIAL_NAMES||LA49_1==ALPHABET||LA49_1==SYMBOLIC||(LA49_1>=CLASS && LA49_1<=INPUT_OUTPUT)||(LA49_1>=CONSOLE && LA49_1<=CURRENCY)||(LA49_1>=CURSOR && LA49_1<=NUMERIC)) ) {
                    alt49=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:198:4: a= WORD THRU b= WORD
                    {
                    a=(Token)match(input,WORD,FOLLOW_WORD_in_simple_pair1376);  
                    stream_WORD.add(a);

                    THRU125=(Token)match(input,THRU,FOLLOW_THRU_in_simple_pair1378);  
                    stream_THRU.add(THRU125);

                    b=(Token)match(input,WORD,FOLLOW_WORD_in_simple_pair1382);  
                    stream_WORD.add(b);



                    // AST REWRITE
                    // elements: THRU, b, a
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 198:24: -> ^( THRU $a $b)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:198:27: ^( THRU $a $b)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_THRU.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_a.nextNode());
                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:199:4: WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    WORD126=(Token)match(input,WORD,FOLLOW_WORD_in_simple_pair1400); 
                    WORD126_tree = (CommonTree)adaptor.create(WORD126);
                    adaptor.addChild(root_0, WORD126_tree);


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
    // $ANTLR end "simple_pair"

    public static class input_output_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input_output_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:201:1: input_output_section : INPUT_OUTPUT SECTION PERIOD ( input_output_clause )* -> ^( INPUT_OUTPUT ( input_output_clause )* ) ;
    public final EnvironmentDivision.input_output_section_return input_output_section() throws RecognitionException {
        EnvironmentDivision.input_output_section_return retval = new EnvironmentDivision.input_output_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INPUT_OUTPUT127=null;
        Token SECTION128=null;
        Token PERIOD129=null;
        EnvironmentDivision.input_output_clause_return input_output_clause130 = null;


        CommonTree INPUT_OUTPUT127_tree=null;
        CommonTree SECTION128_tree=null;
        CommonTree PERIOD129_tree=null;
        RewriteRuleTokenStream stream_INPUT_OUTPUT=new RewriteRuleTokenStream(adaptor,"token INPUT_OUTPUT");
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_input_output_clause=new RewriteRuleSubtreeStream(adaptor,"rule input_output_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:202:2: ( INPUT_OUTPUT SECTION PERIOD ( input_output_clause )* -> ^( INPUT_OUTPUT ( input_output_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:202:4: INPUT_OUTPUT SECTION PERIOD ( input_output_clause )*
            {
            INPUT_OUTPUT127=(Token)match(input,INPUT_OUTPUT,FOLLOW_INPUT_OUTPUT_in_input_output_section1411);  
            stream_INPUT_OUTPUT.add(INPUT_OUTPUT127);

            SECTION128=(Token)match(input,SECTION,FOLLOW_SECTION_in_input_output_section1413);  
            stream_SECTION.add(SECTION128);

            PERIOD129=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_input_output_section1415);  
            stream_PERIOD.add(PERIOD129);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:202:32: ( input_output_clause )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=FILE_CONTROL && LA50_0<=I_O_CONTROL)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:202:32: input_output_clause
            	    {
            	    pushFollow(FOLLOW_input_output_clause_in_input_output_section1417);
            	    input_output_clause130=input_output_clause();

            	    state._fsp--;

            	    stream_input_output_clause.add(input_output_clause130.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);



            // AST REWRITE
            // elements: input_output_clause, INPUT_OUTPUT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 202:53: -> ^( INPUT_OUTPUT ( input_output_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:202:56: ^( INPUT_OUTPUT ( input_output_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_INPUT_OUTPUT.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:202:71: ( input_output_clause )*
                while ( stream_input_output_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_input_output_clause.nextTree());

                }
                stream_input_output_clause.reset();

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
    // $ANTLR end "input_output_section"

    public static class input_output_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "input_output_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:204:1: input_output_clause : ( file_control | i_o_control );
    public final EnvironmentDivision.input_output_clause_return input_output_clause() throws RecognitionException {
        EnvironmentDivision.input_output_clause_return retval = new EnvironmentDivision.input_output_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.file_control_return file_control131 = null;

        EnvironmentDivision.i_o_control_return i_o_control132 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:205:2: ( file_control | i_o_control )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==FILE_CONTROL) ) {
                alt51=1;
            }
            else if ( (LA51_0==I_O_CONTROL) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:205:4: file_control
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_file_control_in_input_output_clause1438);
                    file_control131=file_control();

                    state._fsp--;

                    adaptor.addChild(root_0, file_control131.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:205:19: i_o_control
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_i_o_control_in_input_output_clause1442);
                    i_o_control132=i_o_control();

                    state._fsp--;

                    adaptor.addChild(root_0, i_o_control132.getTree());

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
    // $ANTLR end "input_output_clause"

    public static class file_control_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_control"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:206:1: file_control : FILE_CONTROL PERIOD ( file_control_para )* -> ^( FILE_CONTROL ( file_control_para )* ) ;
    public final EnvironmentDivision.file_control_return file_control() throws RecognitionException {
        EnvironmentDivision.file_control_return retval = new EnvironmentDivision.file_control_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FILE_CONTROL133=null;
        Token PERIOD134=null;
        EnvironmentDivision.file_control_para_return file_control_para135 = null;


        CommonTree FILE_CONTROL133_tree=null;
        CommonTree PERIOD134_tree=null;
        RewriteRuleTokenStream stream_FILE_CONTROL=new RewriteRuleTokenStream(adaptor,"token FILE_CONTROL");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_file_control_para=new RewriteRuleSubtreeStream(adaptor,"rule file_control_para");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:207:2: ( FILE_CONTROL PERIOD ( file_control_para )* -> ^( FILE_CONTROL ( file_control_para )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:207:4: FILE_CONTROL PERIOD ( file_control_para )*
            {
            FILE_CONTROL133=(Token)match(input,FILE_CONTROL,FOLLOW_FILE_CONTROL_in_file_control1451);  
            stream_FILE_CONTROL.add(FILE_CONTROL133);

            PERIOD134=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_file_control1453);  
            stream_PERIOD.add(PERIOD134);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:207:24: ( file_control_para )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==SELECT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:207:24: file_control_para
            	    {
            	    pushFollow(FOLLOW_file_control_para_in_file_control1455);
            	    file_control_para135=file_control_para();

            	    state._fsp--;

            	    stream_file_control_para.add(file_control_para135.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);



            // AST REWRITE
            // elements: FILE_CONTROL, file_control_para
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 207:43: -> ^( FILE_CONTROL ( file_control_para )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:207:46: ^( FILE_CONTROL ( file_control_para )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FILE_CONTROL.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:207:61: ( file_control_para )*
                while ( stream_file_control_para.hasNext() ) {
                    adaptor.addChild(root_1, stream_file_control_para.nextTree());

                }
                stream_file_control_para.reset();

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
    // $ANTLR end "file_control"

    public static class file_control_para_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_control_para"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:209:1: file_control_para : SELECT ( OPTIONAL )? WORD ( file_clause )* PERIOD -> ^( SELECT WORD ( OPTIONAL )? ( file_clause )* ) ;
    public final EnvironmentDivision.file_control_para_return file_control_para() throws RecognitionException {
        EnvironmentDivision.file_control_para_return retval = new EnvironmentDivision.file_control_para_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SELECT136=null;
        Token OPTIONAL137=null;
        Token WORD138=null;
        Token PERIOD140=null;
        EnvironmentDivision.file_clause_return file_clause139 = null;


        CommonTree SELECT136_tree=null;
        CommonTree OPTIONAL137_tree=null;
        CommonTree WORD138_tree=null;
        CommonTree PERIOD140_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_SELECT=new RewriteRuleTokenStream(adaptor,"token SELECT");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_OPTIONAL=new RewriteRuleTokenStream(adaptor,"token OPTIONAL");
        RewriteRuleSubtreeStream stream_file_clause=new RewriteRuleSubtreeStream(adaptor,"rule file_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:2: ( SELECT ( OPTIONAL )? WORD ( file_clause )* PERIOD -> ^( SELECT WORD ( OPTIONAL )? ( file_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:4: SELECT ( OPTIONAL )? WORD ( file_clause )* PERIOD
            {
            SELECT136=(Token)match(input,SELECT,FOLLOW_SELECT_in_file_control_para1475);  
            stream_SELECT.add(SELECT136);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:11: ( OPTIONAL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==OPTIONAL) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:11: OPTIONAL
                    {
                    OPTIONAL137=(Token)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_file_control_para1477);  
                    stream_OPTIONAL.add(OPTIONAL137);


                    }
                    break;

            }

            WORD138=(Token)match(input,WORD,FOLLOW_WORD_in_file_control_para1480);  
            stream_WORD.add(WORD138);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:26: ( file_clause )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==STATUS||(LA54_0>=FILE && LA54_0<=SEQUENTIAL)||(LA54_0>=ORGANIZATION && LA54_0<=RECORD)||LA54_0==ASSIGN||LA54_0==ALTERNATE||(LA54_0>=BINARY && LA54_0<=LINE)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:26: file_clause
            	    {
            	    pushFollow(FOLLOW_file_clause_in_file_control_para1482);
            	    file_clause139=file_clause();

            	    state._fsp--;

            	    stream_file_clause.add(file_clause139.getTree());

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            PERIOD140=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_file_control_para1485);  
            stream_PERIOD.add(PERIOD140);



            // AST REWRITE
            // elements: WORD, SELECT, file_clause, OPTIONAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 210:46: -> ^( SELECT WORD ( OPTIONAL )? ( file_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:49: ^( SELECT WORD ( OPTIONAL )? ( file_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SELECT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:63: ( OPTIONAL )?
                if ( stream_OPTIONAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_OPTIONAL.nextNode());

                }
                stream_OPTIONAL.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:210:73: ( file_clause )*
                while ( stream_file_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_file_clause.nextTree());

                }
                stream_file_clause.reset();

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
    // $ANTLR end "file_control_para"

    public static class file_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:211:1: file_clause : ( assign_clause | reserve_clause | organization_clause | padding_clause | record_delimiter_clause | access_clause | record_key_clause | alternate_clause | file_status_clause );
    public final EnvironmentDivision.file_clause_return file_clause() throws RecognitionException {
        EnvironmentDivision.file_clause_return retval = new EnvironmentDivision.file_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.assign_clause_return assign_clause141 = null;

        EnvironmentDivision.reserve_clause_return reserve_clause142 = null;

        EnvironmentDivision.organization_clause_return organization_clause143 = null;

        EnvironmentDivision.padding_clause_return padding_clause144 = null;

        EnvironmentDivision.record_delimiter_clause_return record_delimiter_clause145 = null;

        EnvironmentDivision.access_clause_return access_clause146 = null;

        EnvironmentDivision.record_key_clause_return record_key_clause147 = null;

        EnvironmentDivision.alternate_clause_return alternate_clause148 = null;

        EnvironmentDivision.file_status_clause_return file_status_clause149 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:212:2: ( assign_clause | reserve_clause | organization_clause | padding_clause | record_delimiter_clause | access_clause | record_key_clause | alternate_clause | file_status_clause )
            int alt55=9;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:212:4: assign_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assign_clause_in_file_clause1510);
                    assign_clause141=assign_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_clause141.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:212:20: reserve_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_reserve_clause_in_file_clause1514);
                    reserve_clause142=reserve_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, reserve_clause142.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:212:37: organization_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_organization_clause_in_file_clause1518);
                    organization_clause143=organization_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, organization_clause143.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:212:59: padding_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_padding_clause_in_file_clause1522);
                    padding_clause144=padding_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, padding_clause144.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:213:5: record_delimiter_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_record_delimiter_clause_in_file_clause1529);
                    record_delimiter_clause145=record_delimiter_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, record_delimiter_clause145.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:213:31: access_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_access_clause_in_file_clause1533);
                    access_clause146=access_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, access_clause146.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:213:47: record_key_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_record_key_clause_in_file_clause1537);
                    record_key_clause147=record_key_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, record_key_clause147.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:213:67: alternate_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_alternate_clause_in_file_clause1541);
                    alternate_clause148=alternate_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, alternate_clause148.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:213:86: file_status_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_file_status_clause_in_file_clause1545);
                    file_status_clause149=file_status_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, file_status_clause149.getTree());

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
    // $ANTLR end "file_clause"

    public static class assign_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:215:1: assign_clause : ASSIGN ( TO )? ( data_or_literal )+ -> ^( ASSIGN ( data_or_literal )+ ) ;
    public final EnvironmentDivision.assign_clause_return assign_clause() throws RecognitionException {
        EnvironmentDivision.assign_clause_return retval = new EnvironmentDivision.assign_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGN150=null;
        Token TO151=null;
        EnvironmentDivision.data_or_literal_return data_or_literal152 = null;


        CommonTree ASSIGN150_tree=null;
        CommonTree TO151_tree=null;
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_data_or_literal=new RewriteRuleSubtreeStream(adaptor,"rule data_or_literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:2: ( ASSIGN ( TO )? ( data_or_literal )+ -> ^( ASSIGN ( data_or_literal )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:4: ASSIGN ( TO )? ( data_or_literal )+
            {
            ASSIGN150=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign_clause1558);  
            stream_ASSIGN.add(ASSIGN150);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:11: ( TO )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==TO) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:11: TO
                    {
                    TO151=(Token)match(input,TO,FOLLOW_TO_in_assign_clause1560);  
                    stream_TO.add(TO151);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:15: ( data_or_literal )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==STRING||LA57_0==WORD) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:15: data_or_literal
            	    {
            	    pushFollow(FOLLOW_data_or_literal_in_assign_clause1563);
            	    data_or_literal152=data_or_literal();

            	    state._fsp--;

            	    stream_data_or_literal.add(data_or_literal152.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);



            // AST REWRITE
            // elements: data_or_literal, ASSIGN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 216:32: -> ^( ASSIGN ( data_or_literal )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:216:35: ^( ASSIGN ( data_or_literal )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGN.nextNode(), root_1);

                if ( !(stream_data_or_literal.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_data_or_literal.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_or_literal.nextTree());

                }
                stream_data_or_literal.reset();

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
    // $ANTLR end "assign_clause"

    public static class reserve_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reserve_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:217:1: reserve_clause : RESERVE WORD ( AREA )? -> ^( RESERVE WORD ) ;
    public final EnvironmentDivision.reserve_clause_return reserve_clause() throws RecognitionException {
        EnvironmentDivision.reserve_clause_return retval = new EnvironmentDivision.reserve_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RESERVE153=null;
        Token WORD154=null;
        Token AREA155=null;

        CommonTree RESERVE153_tree=null;
        CommonTree WORD154_tree=null;
        CommonTree AREA155_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_RESERVE=new RewriteRuleTokenStream(adaptor,"token RESERVE");
        RewriteRuleTokenStream stream_AREA=new RewriteRuleTokenStream(adaptor,"token AREA");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:218:2: ( RESERVE WORD ( AREA )? -> ^( RESERVE WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:218:4: RESERVE WORD ( AREA )?
            {
            RESERVE153=(Token)match(input,RESERVE,FOLLOW_RESERVE_in_reserve_clause1581);  
            stream_RESERVE.add(RESERVE153);

            WORD154=(Token)match(input,WORD,FOLLOW_WORD_in_reserve_clause1583);  
            stream_WORD.add(WORD154);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:218:17: ( AREA )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AREA) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:218:17: AREA
                    {
                    AREA155=(Token)match(input,AREA,FOLLOW_AREA_in_reserve_clause1585);  
                    stream_AREA.add(AREA155);


                    }
                    break;

            }



            // AST REWRITE
            // elements: WORD, RESERVE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 218:25: -> ^( RESERVE WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:218:28: ^( RESERVE WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RESERVE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

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
    // $ANTLR end "reserve_clause"

    public static class organization_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "organization_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:219:1: organization_clause : ( ( ORGANIZATION ( IS )? )? ( bin_line )? SEQUENTIAL -> ^( P_ORGANIZATION SEQUENTIAL ( bin_line )? ) | ( ORGANIZATION ( IS )? )? INDEXED -> ^( P_ORGANIZATION INDEXED ) | ( ORGANIZATION ( IS )? )? RELATIVE -> ^( P_ORGANIZATION RELATIVE ) );
    public final EnvironmentDivision.organization_clause_return organization_clause() throws RecognitionException {
        EnvironmentDivision.organization_clause_return retval = new EnvironmentDivision.organization_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ORGANIZATION156=null;
        Token IS157=null;
        Token SEQUENTIAL159=null;
        Token ORGANIZATION160=null;
        Token IS161=null;
        Token INDEXED162=null;
        Token ORGANIZATION163=null;
        Token IS164=null;
        Token RELATIVE165=null;
        EnvironmentDivision.bin_line_return bin_line158 = null;


        CommonTree ORGANIZATION156_tree=null;
        CommonTree IS157_tree=null;
        CommonTree SEQUENTIAL159_tree=null;
        CommonTree ORGANIZATION160_tree=null;
        CommonTree IS161_tree=null;
        CommonTree INDEXED162_tree=null;
        CommonTree ORGANIZATION163_tree=null;
        CommonTree IS164_tree=null;
        CommonTree RELATIVE165_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_RELATIVE=new RewriteRuleTokenStream(adaptor,"token RELATIVE");
        RewriteRuleTokenStream stream_ORGANIZATION=new RewriteRuleTokenStream(adaptor,"token ORGANIZATION");
        RewriteRuleTokenStream stream_SEQUENTIAL=new RewriteRuleTokenStream(adaptor,"token SEQUENTIAL");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_bin_line=new RewriteRuleSubtreeStream(adaptor,"rule bin_line");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:2: ( ( ORGANIZATION ( IS )? )? ( bin_line )? SEQUENTIAL -> ^( P_ORGANIZATION SEQUENTIAL ( bin_line )? ) | ( ORGANIZATION ( IS )? )? INDEXED -> ^( P_ORGANIZATION INDEXED ) | ( ORGANIZATION ( IS )? )? RELATIVE -> ^( P_ORGANIZATION RELATIVE ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case ORGANIZATION:
                {
                switch ( input.LA(2) ) {
                case IS:
                    {
                    switch ( input.LA(3) ) {
                    case RELATIVE:
                        {
                        alt66=3;
                        }
                        break;
                    case INDEXED:
                        {
                        alt66=2;
                        }
                        break;
                    case SEQUENTIAL:
                    case BINARY:
                    case LINE:
                        {
                        alt66=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 5, input);

                        throw nvae;
                    }

                    }
                    break;
                case RELATIVE:
                    {
                    alt66=3;
                    }
                    break;
                case INDEXED:
                    {
                    alt66=2;
                    }
                    break;
                case SEQUENTIAL:
                case BINARY:
                case LINE:
                    {
                    alt66=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }

                }
                break;
            case SEQUENTIAL:
            case BINARY:
            case LINE:
                {
                alt66=1;
                }
                break;
            case INDEXED:
                {
                alt66=2;
                }
                break;
            case RELATIVE:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:4: ( ORGANIZATION ( IS )? )? ( bin_line )? SEQUENTIAL
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:4: ( ORGANIZATION ( IS )? )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ORGANIZATION) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:5: ORGANIZATION ( IS )?
                            {
                            ORGANIZATION156=(Token)match(input,ORGANIZATION,FOLLOW_ORGANIZATION_in_organization_clause1605);  
                            stream_ORGANIZATION.add(ORGANIZATION156);

                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:18: ( IS )?
                            int alt59=2;
                            int LA59_0 = input.LA(1);

                            if ( (LA59_0==IS) ) {
                                alt59=1;
                            }
                            switch (alt59) {
                                case 1 :
                                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:18: IS
                                    {
                                    IS157=(Token)match(input,IS,FOLLOW_IS_in_organization_clause1607);  
                                    stream_IS.add(IS157);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:24: ( bin_line )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=BINARY && LA61_0<=LINE)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:24: bin_line
                            {
                            pushFollow(FOLLOW_bin_line_in_organization_clause1612);
                            bin_line158=bin_line();

                            state._fsp--;

                            stream_bin_line.add(bin_line158.getTree());

                            }
                            break;

                    }

                    SEQUENTIAL159=(Token)match(input,SEQUENTIAL,FOLLOW_SEQUENTIAL_in_organization_clause1615);  
                    stream_SEQUENTIAL.add(SEQUENTIAL159);



                    // AST REWRITE
                    // elements: bin_line, SEQUENTIAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:45: -> ^( P_ORGANIZATION SEQUENTIAL ( bin_line )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:48: ^( P_ORGANIZATION SEQUENTIAL ( bin_line )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_ORGANIZATION, "P_ORGANIZATION"), root_1);

                        adaptor.addChild(root_1, stream_SEQUENTIAL.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:220:76: ( bin_line )?
                        if ( stream_bin_line.hasNext() ) {
                            adaptor.addChild(root_1, stream_bin_line.nextTree());

                        }
                        stream_bin_line.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:221:4: ( ORGANIZATION ( IS )? )? INDEXED
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:221:4: ( ORGANIZATION ( IS )? )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==ORGANIZATION) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:221:5: ORGANIZATION ( IS )?
                            {
                            ORGANIZATION160=(Token)match(input,ORGANIZATION,FOLLOW_ORGANIZATION_in_organization_clause1632);  
                            stream_ORGANIZATION.add(ORGANIZATION160);

                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:221:18: ( IS )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==IS) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:221:18: IS
                                    {
                                    IS161=(Token)match(input,IS,FOLLOW_IS_in_organization_clause1634);  
                                    stream_IS.add(IS161);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    INDEXED162=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_organization_clause1639);  
                    stream_INDEXED.add(INDEXED162);



                    // AST REWRITE
                    // elements: INDEXED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:34: -> ^( P_ORGANIZATION INDEXED )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:221:37: ^( P_ORGANIZATION INDEXED )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_ORGANIZATION, "P_ORGANIZATION"), root_1);

                        adaptor.addChild(root_1, stream_INDEXED.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:222:4: ( ORGANIZATION ( IS )? )? RELATIVE
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:222:4: ( ORGANIZATION ( IS )? )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==ORGANIZATION) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:222:5: ORGANIZATION ( IS )?
                            {
                            ORGANIZATION163=(Token)match(input,ORGANIZATION,FOLLOW_ORGANIZATION_in_organization_clause1655);  
                            stream_ORGANIZATION.add(ORGANIZATION163);

                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:222:18: ( IS )?
                            int alt64=2;
                            int LA64_0 = input.LA(1);

                            if ( (LA64_0==IS) ) {
                                alt64=1;
                            }
                            switch (alt64) {
                                case 1 :
                                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:222:18: IS
                                    {
                                    IS164=(Token)match(input,IS,FOLLOW_IS_in_organization_clause1657);  
                                    stream_IS.add(IS164);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    RELATIVE165=(Token)match(input,RELATIVE,FOLLOW_RELATIVE_in_organization_clause1662);  
                    stream_RELATIVE.add(RELATIVE165);



                    // AST REWRITE
                    // elements: RELATIVE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 222:35: -> ^( P_ORGANIZATION RELATIVE )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:222:38: ^( P_ORGANIZATION RELATIVE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_ORGANIZATION, "P_ORGANIZATION"), root_1);

                        adaptor.addChild(root_1, stream_RELATIVE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // $ANTLR end "organization_clause"

    public static class bin_line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bin_line"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:224:1: bin_line : ( BINARY | LINE );
    public final EnvironmentDivision.bin_line_return bin_line() throws RecognitionException {
        EnvironmentDivision.bin_line_return retval = new EnvironmentDivision.bin_line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set166=null;

        CommonTree set166_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:224:9: ( BINARY | LINE )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set166=(Token)input.LT(1);
            if ( (input.LA(1)>=BINARY && input.LA(1)<=LINE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set166));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "bin_line"

    public static class padding_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "padding_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:225:1: padding_clause : PADDING ( CHARACTER )? ( IS )? data_or_literal -> ^( PADDING data_or_literal ) ;
    public final EnvironmentDivision.padding_clause_return padding_clause() throws RecognitionException {
        EnvironmentDivision.padding_clause_return retval = new EnvironmentDivision.padding_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PADDING167=null;
        Token CHARACTER168=null;
        Token IS169=null;
        EnvironmentDivision.data_or_literal_return data_or_literal170 = null;


        CommonTree PADDING167_tree=null;
        CommonTree CHARACTER168_tree=null;
        CommonTree IS169_tree=null;
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
        RewriteRuleTokenStream stream_PADDING=new RewriteRuleTokenStream(adaptor,"token PADDING");
        RewriteRuleSubtreeStream stream_data_or_literal=new RewriteRuleSubtreeStream(adaptor,"rule data_or_literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:2: ( PADDING ( CHARACTER )? ( IS )? data_or_literal -> ^( PADDING data_or_literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:4: PADDING ( CHARACTER )? ( IS )? data_or_literal
            {
            PADDING167=(Token)match(input,PADDING,FOLLOW_PADDING_in_padding_clause1693);  
            stream_PADDING.add(PADDING167);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:12: ( CHARACTER )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==CHARACTER) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:12: CHARACTER
                    {
                    CHARACTER168=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_padding_clause1695);  
                    stream_CHARACTER.add(CHARACTER168);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:23: ( IS )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==IS) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:23: IS
                    {
                    IS169=(Token)match(input,IS,FOLLOW_IS_in_padding_clause1698);  
                    stream_IS.add(IS169);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_or_literal_in_padding_clause1701);
            data_or_literal170=data_or_literal();

            state._fsp--;

            stream_data_or_literal.add(data_or_literal170.getTree());


            // AST REWRITE
            // elements: data_or_literal, PADDING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:43: -> ^( PADDING data_or_literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:226:46: ^( PADDING data_or_literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PADDING.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_or_literal.nextTree());

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
    // $ANTLR end "padding_clause"

    public static class record_delimiter_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_delimiter_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:227:1: record_delimiter_clause : ( RECORD DELIMITER ( IS )? STANDARD_1 -> ^( DELIMITER STANDARD_1 ) | RECORD DELIMITER ( IS )? WORD -> ^( DELIMITER WORD ) );
    public final EnvironmentDivision.record_delimiter_clause_return record_delimiter_clause() throws RecognitionException {
        EnvironmentDivision.record_delimiter_clause_return retval = new EnvironmentDivision.record_delimiter_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD171=null;
        Token DELIMITER172=null;
        Token IS173=null;
        Token STANDARD_1174=null;
        Token RECORD175=null;
        Token DELIMITER176=null;
        Token IS177=null;
        Token WORD178=null;

        CommonTree RECORD171_tree=null;
        CommonTree DELIMITER172_tree=null;
        CommonTree IS173_tree=null;
        CommonTree STANDARD_1174_tree=null;
        CommonTree RECORD175_tree=null;
        CommonTree DELIMITER176_tree=null;
        CommonTree IS177_tree=null;
        CommonTree WORD178_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_STANDARD_1=new RewriteRuleTokenStream(adaptor,"token STANDARD_1");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_DELIMITER=new RewriteRuleTokenStream(adaptor,"token DELIMITER");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:228:2: ( RECORD DELIMITER ( IS )? STANDARD_1 -> ^( DELIMITER STANDARD_1 ) | RECORD DELIMITER ( IS )? WORD -> ^( DELIMITER WORD ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RECORD) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==DELIMITER) ) {
                    switch ( input.LA(3) ) {
                    case IS:
                        {
                        int LA71_3 = input.LA(4);

                        if ( (LA71_3==STANDARD_1) ) {
                            alt71=1;
                        }
                        else if ( (LA71_3==WORD) ) {
                            alt71=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 71, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        alt71=2;
                        }
                        break;
                    case STANDARD_1:
                        {
                        alt71=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:228:4: RECORD DELIMITER ( IS )? STANDARD_1
                    {
                    RECORD171=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_delimiter_clause1717);  
                    stream_RECORD.add(RECORD171);

                    DELIMITER172=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_record_delimiter_clause1719);  
                    stream_DELIMITER.add(DELIMITER172);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:228:21: ( IS )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==IS) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:228:21: IS
                            {
                            IS173=(Token)match(input,IS,FOLLOW_IS_in_record_delimiter_clause1721);  
                            stream_IS.add(IS173);


                            }
                            break;

                    }

                    STANDARD_1174=(Token)match(input,STANDARD_1,FOLLOW_STANDARD_1_in_record_delimiter_clause1724);  
                    stream_STANDARD_1.add(STANDARD_1174);



                    // AST REWRITE
                    // elements: DELIMITER, STANDARD_1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:36: -> ^( DELIMITER STANDARD_1 )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:228:39: ^( DELIMITER STANDARD_1 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DELIMITER.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_STANDARD_1.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:229:4: RECORD DELIMITER ( IS )? WORD
                    {
                    RECORD175=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_delimiter_clause1737);  
                    stream_RECORD.add(RECORD175);

                    DELIMITER176=(Token)match(input,DELIMITER,FOLLOW_DELIMITER_in_record_delimiter_clause1739);  
                    stream_DELIMITER.add(DELIMITER176);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:229:21: ( IS )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==IS) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:229:21: IS
                            {
                            IS177=(Token)match(input,IS,FOLLOW_IS_in_record_delimiter_clause1741);  
                            stream_IS.add(IS177);


                            }
                            break;

                    }

                    WORD178=(Token)match(input,WORD,FOLLOW_WORD_in_record_delimiter_clause1744);  
                    stream_WORD.add(WORD178);



                    // AST REWRITE
                    // elements: WORD, DELIMITER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 229:30: -> ^( DELIMITER WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:229:33: ^( DELIMITER WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DELIMITER.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // $ANTLR end "record_delimiter_clause"

    public static class access_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:231:1: access_clause : ACCESS ( MODE )? ( IS )? access_clause_alt ( relative_clause )? -> ^( ACCESS access_clause_alt ( relative_clause )? ) ;
    public final EnvironmentDivision.access_clause_return access_clause() throws RecognitionException {
        EnvironmentDivision.access_clause_return retval = new EnvironmentDivision.access_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ACCESS179=null;
        Token MODE180=null;
        Token IS181=null;
        EnvironmentDivision.access_clause_alt_return access_clause_alt182 = null;

        EnvironmentDivision.relative_clause_return relative_clause183 = null;


        CommonTree ACCESS179_tree=null;
        CommonTree MODE180_tree=null;
        CommonTree IS181_tree=null;
        RewriteRuleTokenStream stream_ACCESS=new RewriteRuleTokenStream(adaptor,"token ACCESS");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_MODE=new RewriteRuleTokenStream(adaptor,"token MODE");
        RewriteRuleSubtreeStream stream_access_clause_alt=new RewriteRuleSubtreeStream(adaptor,"rule access_clause_alt");
        RewriteRuleSubtreeStream stream_relative_clause=new RewriteRuleSubtreeStream(adaptor,"rule relative_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:2: ( ACCESS ( MODE )? ( IS )? access_clause_alt ( relative_clause )? -> ^( ACCESS access_clause_alt ( relative_clause )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:4: ACCESS ( MODE )? ( IS )? access_clause_alt ( relative_clause )?
            {
            ACCESS179=(Token)match(input,ACCESS,FOLLOW_ACCESS_in_access_clause1762);  
            stream_ACCESS.add(ACCESS179);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:11: ( MODE )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==MODE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:11: MODE
                    {
                    MODE180=(Token)match(input,MODE,FOLLOW_MODE_in_access_clause1764);  
                    stream_MODE.add(MODE180);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:17: ( IS )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==IS) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:17: IS
                    {
                    IS181=(Token)match(input,IS,FOLLOW_IS_in_access_clause1767);  
                    stream_IS.add(IS181);


                    }
                    break;

            }

            pushFollow(FOLLOW_access_clause_alt_in_access_clause1770);
            access_clause_alt182=access_clause_alt();

            state._fsp--;

            stream_access_clause_alt.add(access_clause_alt182.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:39: ( relative_clause )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RELATIVE) ) {
                int LA74_1 = input.LA(2);

                if ( (LA74_1==WORD||LA74_1==IS||LA74_1==KEY) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:39: relative_clause
                    {
                    pushFollow(FOLLOW_relative_clause_in_access_clause1772);
                    relative_clause183=relative_clause();

                    state._fsp--;

                    stream_relative_clause.add(relative_clause183.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ACCESS, relative_clause, access_clause_alt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 232:56: -> ^( ACCESS access_clause_alt ( relative_clause )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:59: ^( ACCESS access_clause_alt ( relative_clause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ACCESS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_access_clause_alt.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:232:86: ( relative_clause )?
                if ( stream_relative_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_relative_clause.nextTree());

                }
                stream_relative_clause.reset();

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
    // $ANTLR end "access_clause"

    public static class access_clause_alt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access_clause_alt"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:233:1: access_clause_alt : ( SEQUENTIAL | RANDOM | DYNAMIC );
    public final EnvironmentDivision.access_clause_alt_return access_clause_alt() throws RecognitionException {
        EnvironmentDivision.access_clause_alt_return retval = new EnvironmentDivision.access_clause_alt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set184=null;

        CommonTree set184_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:234:2: ( SEQUENTIAL | RANDOM | DYNAMIC )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set184=(Token)input.LT(1);
            if ( (input.LA(1)>=SEQUENTIAL && input.LA(1)<=DYNAMIC) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set184));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "access_clause_alt"

    public static class relative_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relative_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:235:1: relative_clause : RELATIVE ( KEY )? ( IS )? data_name -> ^( RELATIVE data_name ) ;
    public final EnvironmentDivision.relative_clause_return relative_clause() throws RecognitionException {
        EnvironmentDivision.relative_clause_return retval = new EnvironmentDivision.relative_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RELATIVE185=null;
        Token KEY186=null;
        Token IS187=null;
        EnvironmentDivision.data_name_return data_name188 = null;


        CommonTree RELATIVE185_tree=null;
        CommonTree KEY186_tree=null;
        CommonTree IS187_tree=null;
        RewriteRuleTokenStream stream_RELATIVE=new RewriteRuleTokenStream(adaptor,"token RELATIVE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:2: ( RELATIVE ( KEY )? ( IS )? data_name -> ^( RELATIVE data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:4: RELATIVE ( KEY )? ( IS )? data_name
            {
            RELATIVE185=(Token)match(input,RELATIVE,FOLLOW_RELATIVE_in_relative_clause1809);  
            stream_RELATIVE.add(RELATIVE185);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:13: ( KEY )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==KEY) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:13: KEY
                    {
                    KEY186=(Token)match(input,KEY,FOLLOW_KEY_in_relative_clause1811);  
                    stream_KEY.add(KEY186);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:18: ( IS )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IS) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:18: IS
                    {
                    IS187=(Token)match(input,IS,FOLLOW_IS_in_relative_clause1814);  
                    stream_IS.add(IS187);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_relative_clause1817);
            data_name188=data_name();

            state._fsp--;

            stream_data_name.add(data_name188.getTree());


            // AST REWRITE
            // elements: data_name, RELATIVE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 236:32: -> ^( RELATIVE data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:236:35: ^( RELATIVE data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RELATIVE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

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
    // $ANTLR end "relative_clause"

    public static class file_status_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_status_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:237:1: file_status_clause : ( FILE )? STATUS ( IS )? data_name -> ^( STATUS data_name ) ;
    public final EnvironmentDivision.file_status_clause_return file_status_clause() throws RecognitionException {
        EnvironmentDivision.file_status_clause_return retval = new EnvironmentDivision.file_status_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FILE189=null;
        Token STATUS190=null;
        Token IS191=null;
        EnvironmentDivision.data_name_return data_name192 = null;


        CommonTree FILE189_tree=null;
        CommonTree STATUS190_tree=null;
        CommonTree IS191_tree=null;
        RewriteRuleTokenStream stream_FILE=new RewriteRuleTokenStream(adaptor,"token FILE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_STATUS=new RewriteRuleTokenStream(adaptor,"token STATUS");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:2: ( ( FILE )? STATUS ( IS )? data_name -> ^( STATUS data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:4: ( FILE )? STATUS ( IS )? data_name
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:4: ( FILE )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==FILE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:4: FILE
                    {
                    FILE189=(Token)match(input,FILE,FOLLOW_FILE_in_file_status_clause1835);  
                    stream_FILE.add(FILE189);


                    }
                    break;

            }

            STATUS190=(Token)match(input,STATUS,FOLLOW_STATUS_in_file_status_clause1838);  
            stream_STATUS.add(STATUS190);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:17: ( IS )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==IS) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:17: IS
                    {
                    IS191=(Token)match(input,IS,FOLLOW_IS_in_file_status_clause1840);  
                    stream_IS.add(IS191);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_file_status_clause1843);
            data_name192=data_name();

            state._fsp--;

            stream_data_name.add(data_name192.getTree());


            // AST REWRITE
            // elements: STATUS, data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:31: -> ^( STATUS data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:238:34: ^( STATUS data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_STATUS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

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
    // $ANTLR end "file_status_clause"

    public static class record_key_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_key_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:239:1: record_key_clause : RECORD ( KEY )? ( IS )? data_name -> ^( RECORD data_name ) ;
    public final EnvironmentDivision.record_key_clause_return record_key_clause() throws RecognitionException {
        EnvironmentDivision.record_key_clause_return retval = new EnvironmentDivision.record_key_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD193=null;
        Token KEY194=null;
        Token IS195=null;
        EnvironmentDivision.data_name_return data_name196 = null;


        CommonTree RECORD193_tree=null;
        CommonTree KEY194_tree=null;
        CommonTree IS195_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:2: ( RECORD ( KEY )? ( IS )? data_name -> ^( RECORD data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:4: RECORD ( KEY )? ( IS )? data_name
            {
            RECORD193=(Token)match(input,RECORD,FOLLOW_RECORD_in_record_key_clause1859);  
            stream_RECORD.add(RECORD193);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:11: ( KEY )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==KEY) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:11: KEY
                    {
                    KEY194=(Token)match(input,KEY,FOLLOW_KEY_in_record_key_clause1861);  
                    stream_KEY.add(KEY194);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:16: ( IS )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==IS) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:16: IS
                    {
                    IS195=(Token)match(input,IS,FOLLOW_IS_in_record_key_clause1864);  
                    stream_IS.add(IS195);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_record_key_clause1867);
            data_name196=data_name();

            state._fsp--;

            stream_data_name.add(data_name196.getTree());


            // AST REWRITE
            // elements: data_name, RECORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 240:30: -> ^( RECORD data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:240:33: ^( RECORD data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

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
    // $ANTLR end "record_key_clause"

    public static class alternate_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alternate_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:241:1: alternate_clause : ALTERNATE RECORD ( KEY )? ( IS )? data_name ( ( WITH )? DUPLICATES )? -> ^( ALTERNATE data_name ( DUPLICATES )? ) ;
    public final EnvironmentDivision.alternate_clause_return alternate_clause() throws RecognitionException {
        EnvironmentDivision.alternate_clause_return retval = new EnvironmentDivision.alternate_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALTERNATE197=null;
        Token RECORD198=null;
        Token KEY199=null;
        Token IS200=null;
        Token WITH202=null;
        Token DUPLICATES203=null;
        EnvironmentDivision.data_name_return data_name201 = null;


        CommonTree ALTERNATE197_tree=null;
        CommonTree RECORD198_tree=null;
        CommonTree KEY199_tree=null;
        CommonTree IS200_tree=null;
        CommonTree WITH202_tree=null;
        CommonTree DUPLICATES203_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_DUPLICATES=new RewriteRuleTokenStream(adaptor,"token DUPLICATES");
        RewriteRuleTokenStream stream_ALTERNATE=new RewriteRuleTokenStream(adaptor,"token ALTERNATE");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:2: ( ALTERNATE RECORD ( KEY )? ( IS )? data_name ( ( WITH )? DUPLICATES )? -> ^( ALTERNATE data_name ( DUPLICATES )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:4: ALTERNATE RECORD ( KEY )? ( IS )? data_name ( ( WITH )? DUPLICATES )?
            {
            ALTERNATE197=(Token)match(input,ALTERNATE,FOLLOW_ALTERNATE_in_alternate_clause1884);  
            stream_ALTERNATE.add(ALTERNATE197);

            RECORD198=(Token)match(input,RECORD,FOLLOW_RECORD_in_alternate_clause1886);  
            stream_RECORD.add(RECORD198);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:21: ( KEY )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==KEY) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:21: KEY
                    {
                    KEY199=(Token)match(input,KEY,FOLLOW_KEY_in_alternate_clause1888);  
                    stream_KEY.add(KEY199);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:26: ( IS )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==IS) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:26: IS
                    {
                    IS200=(Token)match(input,IS,FOLLOW_IS_in_alternate_clause1891);  
                    stream_IS.add(IS200);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_alternate_clause1894);
            data_name201=data_name();

            state._fsp--;

            stream_data_name.add(data_name201.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:40: ( ( WITH )? DUPLICATES )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==WITH||LA84_0==DUPLICATES) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:41: ( WITH )? DUPLICATES
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:41: ( WITH )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==WITH) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:41: WITH
                            {
                            WITH202=(Token)match(input,WITH,FOLLOW_WITH_in_alternate_clause1897);  
                            stream_WITH.add(WITH202);


                            }
                            break;

                    }

                    DUPLICATES203=(Token)match(input,DUPLICATES,FOLLOW_DUPLICATES_in_alternate_clause1900);  
                    stream_DUPLICATES.add(DUPLICATES203);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ALTERNATE, data_name, DUPLICATES
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 242:60: -> ^( ALTERNATE data_name ( DUPLICATES )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:63: ^( ALTERNATE data_name ( DUPLICATES )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ALTERNATE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:242:85: ( DUPLICATES )?
                if ( stream_DUPLICATES.hasNext() ) {
                    adaptor.addChild(root_1, stream_DUPLICATES.nextNode());

                }
                stream_DUPLICATES.reset();

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
    // $ANTLR end "alternate_clause"

    public static class i_o_control_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "i_o_control"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:243:1: i_o_control : I_O_CONTROL PERIOD ( i_o_control_para )* ( PERIOD )? -> ^( I_O_CONTROL ( i_o_control_para )* ) ;
    public final EnvironmentDivision.i_o_control_return i_o_control() throws RecognitionException {
        EnvironmentDivision.i_o_control_return retval = new EnvironmentDivision.i_o_control_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token I_O_CONTROL204=null;
        Token PERIOD205=null;
        Token PERIOD207=null;
        EnvironmentDivision.i_o_control_para_return i_o_control_para206 = null;


        CommonTree I_O_CONTROL204_tree=null;
        CommonTree PERIOD205_tree=null;
        CommonTree PERIOD207_tree=null;
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_I_O_CONTROL=new RewriteRuleTokenStream(adaptor,"token I_O_CONTROL");
        RewriteRuleSubtreeStream stream_i_o_control_para=new RewriteRuleSubtreeStream(adaptor,"rule i_o_control_para");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:2: ( I_O_CONTROL PERIOD ( i_o_control_para )* ( PERIOD )? -> ^( I_O_CONTROL ( i_o_control_para )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:4: I_O_CONTROL PERIOD ( i_o_control_para )* ( PERIOD )?
            {
            I_O_CONTROL204=(Token)match(input,I_O_CONTROL,FOLLOW_I_O_CONTROL_in_i_o_control1922);  
            stream_I_O_CONTROL.add(I_O_CONTROL204);

            PERIOD205=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_i_o_control1924);  
            stream_PERIOD.add(PERIOD205);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:23: ( i_o_control_para )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==RERUN||(LA85_0>=MULTIPLE && LA85_0<=SAME)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:23: i_o_control_para
            	    {
            	    pushFollow(FOLLOW_i_o_control_para_in_i_o_control1926);
            	    i_o_control_para206=i_o_control_para();

            	    state._fsp--;

            	    stream_i_o_control_para.add(i_o_control_para206.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:41: ( PERIOD )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==PERIOD) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:41: PERIOD
                    {
                    PERIOD207=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_i_o_control1929);  
                    stream_PERIOD.add(PERIOD207);


                    }
                    break;

            }



            // AST REWRITE
            // elements: i_o_control_para, I_O_CONTROL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:49: -> ^( I_O_CONTROL ( i_o_control_para )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:52: ^( I_O_CONTROL ( i_o_control_para )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_I_O_CONTROL.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:244:66: ( i_o_control_para )*
                while ( stream_i_o_control_para.hasNext() ) {
                    adaptor.addChild(root_1, stream_i_o_control_para.nextTree());

                }
                stream_i_o_control_para.reset();

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
    // $ANTLR end "i_o_control"

    public static class i_o_control_para_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "i_o_control_para"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:246:1: i_o_control_para : ( rerun_clause | same_clause | multiple_clause );
    public final EnvironmentDivision.i_o_control_para_return i_o_control_para() throws RecognitionException {
        EnvironmentDivision.i_o_control_para_return retval = new EnvironmentDivision.i_o_control_para_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.rerun_clause_return rerun_clause208 = null;

        EnvironmentDivision.same_clause_return same_clause209 = null;

        EnvironmentDivision.multiple_clause_return multiple_clause210 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:247:2: ( rerun_clause | same_clause | multiple_clause )
            int alt87=3;
            switch ( input.LA(1) ) {
            case RERUN:
                {
                alt87=1;
                }
                break;
            case SAME:
                {
                alt87=2;
                }
                break;
            case MULTIPLE:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:247:4: rerun_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_rerun_clause_in_i_o_control_para1949);
                    rerun_clause208=rerun_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, rerun_clause208.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:247:19: same_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_same_clause_in_i_o_control_para1953);
                    same_clause209=same_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, same_clause209.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:247:33: multiple_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_multiple_clause_in_i_o_control_para1957);
                    multiple_clause210=multiple_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, multiple_clause210.getTree());

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
    // $ANTLR end "i_o_control_para"

    public static class rerun_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rerun_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:249:1: rerun_clause : RERUN ON WORD every -> ^( RERUN WORD every ) ;
    public final EnvironmentDivision.rerun_clause_return rerun_clause() throws RecognitionException {
        EnvironmentDivision.rerun_clause_return retval = new EnvironmentDivision.rerun_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RERUN211=null;
        Token ON212=null;
        Token WORD213=null;
        EnvironmentDivision.every_return every214 = null;


        CommonTree RERUN211_tree=null;
        CommonTree ON212_tree=null;
        CommonTree WORD213_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_RERUN=new RewriteRuleTokenStream(adaptor,"token RERUN");
        RewriteRuleSubtreeStream stream_every=new RewriteRuleSubtreeStream(adaptor,"rule every");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:250:2: ( RERUN ON WORD every -> ^( RERUN WORD every ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:250:4: RERUN ON WORD every
            {
            RERUN211=(Token)match(input,RERUN,FOLLOW_RERUN_in_rerun_clause1968);  
            stream_RERUN.add(RERUN211);

            ON212=(Token)match(input,ON,FOLLOW_ON_in_rerun_clause1970);  
            stream_ON.add(ON212);

            WORD213=(Token)match(input,WORD,FOLLOW_WORD_in_rerun_clause1972);  
            stream_WORD.add(WORD213);

            pushFollow(FOLLOW_every_in_rerun_clause1974);
            every214=every();

            state._fsp--;

            stream_every.add(every214.getTree());


            // AST REWRITE
            // elements: WORD, RERUN, every
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 250:27: -> ^( RERUN WORD every )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:250:30: ^( RERUN WORD every )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RERUN.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                adaptor.addChild(root_1, stream_every.nextTree());

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
    // $ANTLR end "rerun_clause"

    public static class every_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "every"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:1: every : ( ( EVERY )? count= WORD RECORD ( OF )? filename= WORD -> ^( RECORD $filename $count) | ( EVERY )? END ( OF )? REEL ( OF )? filename= WORD -> ^( REEL $filename) | ( EVERY )? END ( OF )? UNIT ( OF )? filename= WORD -> ^( UNIT $filename) );
    public final EnvironmentDivision.every_return every() throws RecognitionException {
        EnvironmentDivision.every_return retval = new EnvironmentDivision.every_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token count=null;
        Token filename=null;
        Token EVERY215=null;
        Token RECORD216=null;
        Token OF217=null;
        Token EVERY218=null;
        Token END219=null;
        Token OF220=null;
        Token REEL221=null;
        Token OF222=null;
        Token EVERY223=null;
        Token END224=null;
        Token OF225=null;
        Token UNIT226=null;
        Token OF227=null;

        CommonTree count_tree=null;
        CommonTree filename_tree=null;
        CommonTree EVERY215_tree=null;
        CommonTree RECORD216_tree=null;
        CommonTree OF217_tree=null;
        CommonTree EVERY218_tree=null;
        CommonTree END219_tree=null;
        CommonTree OF220_tree=null;
        CommonTree REEL221_tree=null;
        CommonTree OF222_tree=null;
        CommonTree EVERY223_tree=null;
        CommonTree END224_tree=null;
        CommonTree OF225_tree=null;
        CommonTree UNIT226_tree=null;
        CommonTree OF227_tree=null;
        RewriteRuleTokenStream stream_EVERY=new RewriteRuleTokenStream(adaptor,"token EVERY");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_UNIT=new RewriteRuleTokenStream(adaptor,"token UNIT");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_REEL=new RewriteRuleTokenStream(adaptor,"token REEL");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:7: ( ( EVERY )? count= WORD RECORD ( OF )? filename= WORD -> ^( RECORD $filename $count) | ( EVERY )? END ( OF )? REEL ( OF )? filename= WORD -> ^( REEL $filename) | ( EVERY )? END ( OF )? UNIT ( OF )? filename= WORD -> ^( UNIT $filename) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case EVERY:
                {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==END) ) {
                    switch ( input.LA(3) ) {
                    case OF:
                        {
                        int LA96_4 = input.LA(4);

                        if ( (LA96_4==REEL) ) {
                            alt96=2;
                        }
                        else if ( (LA96_4==UNIT) ) {
                            alt96=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 96, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case REEL:
                        {
                        alt96=2;
                        }
                        break;
                    case UNIT:
                        {
                        alt96=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA96_1==WORD) ) {
                    alt96=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;
                }
                }
                break;
            case WORD:
                {
                alt96=1;
                }
                break;
            case END:
                {
                switch ( input.LA(2) ) {
                case OF:
                    {
                    int LA96_4 = input.LA(3);

                    if ( (LA96_4==REEL) ) {
                        alt96=2;
                    }
                    else if ( (LA96_4==UNIT) ) {
                        alt96=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case REEL:
                    {
                    alt96=2;
                    }
                    break;
                case UNIT:
                    {
                    alt96=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:9: ( EVERY )? count= WORD RECORD ( OF )? filename= WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:9: ( EVERY )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==EVERY) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:9: EVERY
                            {
                            EVERY215=(Token)match(input,EVERY,FOLLOW_EVERY_in_every1996);  
                            stream_EVERY.add(EVERY215);


                            }
                            break;

                    }

                    count=(Token)match(input,WORD,FOLLOW_WORD_in_every2001);  
                    stream_WORD.add(count);

                    RECORD216=(Token)match(input,RECORD,FOLLOW_RECORD_in_every2003);  
                    stream_RECORD.add(RECORD216);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:34: ( OF )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==OF) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:34: OF
                            {
                            OF217=(Token)match(input,OF,FOLLOW_OF_in_every2005);  
                            stream_OF.add(OF217);


                            }
                            break;

                    }

                    filename=(Token)match(input,WORD,FOLLOW_WORD_in_every2010);  
                    stream_WORD.add(filename);



                    // AST REWRITE
                    // elements: filename, count, RECORD
                    // token labels: count, filename
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_count=new RewriteRuleTokenStream(adaptor,"token count",count);
                    RewriteRuleTokenStream stream_filename=new RewriteRuleTokenStream(adaptor,"token filename",filename);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 252:53: -> ^( RECORD $filename $count)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:252:56: ^( RECORD $filename $count)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_filename.nextNode());
                        adaptor.addChild(root_1, stream_count.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:4: ( EVERY )? END ( OF )? REEL ( OF )? filename= WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:4: ( EVERY )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==EVERY) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:4: EVERY
                            {
                            EVERY218=(Token)match(input,EVERY,FOLLOW_EVERY_in_every2029);  
                            stream_EVERY.add(EVERY218);


                            }
                            break;

                    }

                    END219=(Token)match(input,END,FOLLOW_END_in_every2032);  
                    stream_END.add(END219);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:15: ( OF )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==OF) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:15: OF
                            {
                            OF220=(Token)match(input,OF,FOLLOW_OF_in_every2034);  
                            stream_OF.add(OF220);


                            }
                            break;

                    }

                    REEL221=(Token)match(input,REEL,FOLLOW_REEL_in_every2037);  
                    stream_REEL.add(REEL221);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:24: ( OF )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==OF) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:24: OF
                            {
                            OF222=(Token)match(input,OF,FOLLOW_OF_in_every2039);  
                            stream_OF.add(OF222);


                            }
                            break;

                    }

                    filename=(Token)match(input,WORD,FOLLOW_WORD_in_every2044);  
                    stream_WORD.add(filename);



                    // AST REWRITE
                    // elements: REEL, filename
                    // token labels: filename
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_filename=new RewriteRuleTokenStream(adaptor,"token filename",filename);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 253:43: -> ^( REEL $filename)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:253:46: ^( REEL $filename)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_REEL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_filename.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:4: ( EVERY )? END ( OF )? UNIT ( OF )? filename= WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:4: ( EVERY )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==EVERY) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:4: EVERY
                            {
                            EVERY223=(Token)match(input,EVERY,FOLLOW_EVERY_in_every2059);  
                            stream_EVERY.add(EVERY223);


                            }
                            break;

                    }

                    END224=(Token)match(input,END,FOLLOW_END_in_every2062);  
                    stream_END.add(END224);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:15: ( OF )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==OF) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:15: OF
                            {
                            OF225=(Token)match(input,OF,FOLLOW_OF_in_every2064);  
                            stream_OF.add(OF225);


                            }
                            break;

                    }

                    UNIT226=(Token)match(input,UNIT,FOLLOW_UNIT_in_every2067);  
                    stream_UNIT.add(UNIT226);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:24: ( OF )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==OF) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:24: OF
                            {
                            OF227=(Token)match(input,OF,FOLLOW_OF_in_every2069);  
                            stream_OF.add(OF227);


                            }
                            break;

                    }

                    filename=(Token)match(input,WORD,FOLLOW_WORD_in_every2074);  
                    stream_WORD.add(filename);



                    // AST REWRITE
                    // elements: UNIT, filename
                    // token labels: filename
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_filename=new RewriteRuleTokenStream(adaptor,"token filename",filename);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 254:43: -> ^( UNIT $filename)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:254:46: ^( UNIT $filename)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_UNIT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_filename.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // $ANTLR end "every"

    public static class same_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "same_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:256:1: same_clause : ( SAME ( RECORD )? ( AREA )? ( FOR )? WORD -> ^( SAME WORD ) | SAME SORT ( AREA )? ( FOR )? WORD -> ^( SORT WORD ) | SAME SORT_MERGE ( AREA )? ( FOR )? WORD -> ^( SORT_MERGE WORD ) );
    public final EnvironmentDivision.same_clause_return same_clause() throws RecognitionException {
        EnvironmentDivision.same_clause_return retval = new EnvironmentDivision.same_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SAME228=null;
        Token RECORD229=null;
        Token AREA230=null;
        Token FOR231=null;
        Token WORD232=null;
        Token SAME233=null;
        Token SORT234=null;
        Token AREA235=null;
        Token FOR236=null;
        Token WORD237=null;
        Token SAME238=null;
        Token SORT_MERGE239=null;
        Token AREA240=null;
        Token FOR241=null;
        Token WORD242=null;

        CommonTree SAME228_tree=null;
        CommonTree RECORD229_tree=null;
        CommonTree AREA230_tree=null;
        CommonTree FOR231_tree=null;
        CommonTree WORD232_tree=null;
        CommonTree SAME233_tree=null;
        CommonTree SORT234_tree=null;
        CommonTree AREA235_tree=null;
        CommonTree FOR236_tree=null;
        CommonTree WORD237_tree=null;
        CommonTree SAME238_tree=null;
        CommonTree SORT_MERGE239_tree=null;
        CommonTree AREA240_tree=null;
        CommonTree FOR241_tree=null;
        CommonTree WORD242_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_SORT=new RewriteRuleTokenStream(adaptor,"token SORT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_AREA=new RewriteRuleTokenStream(adaptor,"token AREA");
        RewriteRuleTokenStream stream_SAME=new RewriteRuleTokenStream(adaptor,"token SAME");
        RewriteRuleTokenStream stream_SORT_MERGE=new RewriteRuleTokenStream(adaptor,"token SORT_MERGE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:2: ( SAME ( RECORD )? ( AREA )? ( FOR )? WORD -> ^( SAME WORD ) | SAME SORT ( AREA )? ( FOR )? WORD -> ^( SORT WORD ) | SAME SORT_MERGE ( AREA )? ( FOR )? WORD -> ^( SORT_MERGE WORD ) )
            int alt104=3;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==SAME) ) {
                switch ( input.LA(2) ) {
                case SORT:
                    {
                    alt104=2;
                    }
                    break;
                case SORT_MERGE:
                    {
                    alt104=3;
                    }
                    break;
                case WORD:
                case RECORD:
                case AREA:
                case FOR:
                    {
                    alt104=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 104, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:4: SAME ( RECORD )? ( AREA )? ( FOR )? WORD
                    {
                    SAME228=(Token)match(input,SAME,FOLLOW_SAME_in_same_clause2095);  
                    stream_SAME.add(SAME228);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:9: ( RECORD )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==RECORD) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:9: RECORD
                            {
                            RECORD229=(Token)match(input,RECORD,FOLLOW_RECORD_in_same_clause2097);  
                            stream_RECORD.add(RECORD229);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:17: ( AREA )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==AREA) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:17: AREA
                            {
                            AREA230=(Token)match(input,AREA,FOLLOW_AREA_in_same_clause2100);  
                            stream_AREA.add(AREA230);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:23: ( FOR )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==FOR) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:23: FOR
                            {
                            FOR231=(Token)match(input,FOR,FOLLOW_FOR_in_same_clause2103);  
                            stream_FOR.add(FOR231);


                            }
                            break;

                    }

                    WORD232=(Token)match(input,WORD,FOLLOW_WORD_in_same_clause2106);  
                    stream_WORD.add(WORD232);



                    // AST REWRITE
                    // elements: SAME, WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 257:35: -> ^( SAME WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:257:38: ^( SAME WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SAME.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:258:4: SAME SORT ( AREA )? ( FOR )? WORD
                    {
                    SAME233=(Token)match(input,SAME,FOLLOW_SAME_in_same_clause2121);  
                    stream_SAME.add(SAME233);

                    SORT234=(Token)match(input,SORT,FOLLOW_SORT_in_same_clause2123);  
                    stream_SORT.add(SORT234);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:258:14: ( AREA )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==AREA) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:258:14: AREA
                            {
                            AREA235=(Token)match(input,AREA,FOLLOW_AREA_in_same_clause2125);  
                            stream_AREA.add(AREA235);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:258:20: ( FOR )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==FOR) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:258:20: FOR
                            {
                            FOR236=(Token)match(input,FOR,FOLLOW_FOR_in_same_clause2128);  
                            stream_FOR.add(FOR236);


                            }
                            break;

                    }

                    WORD237=(Token)match(input,WORD,FOLLOW_WORD_in_same_clause2131);  
                    stream_WORD.add(WORD237);



                    // AST REWRITE
                    // elements: SORT, WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 258:32: -> ^( SORT WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:258:35: ^( SORT WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SORT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:259:4: SAME SORT_MERGE ( AREA )? ( FOR )? WORD
                    {
                    SAME238=(Token)match(input,SAME,FOLLOW_SAME_in_same_clause2146);  
                    stream_SAME.add(SAME238);

                    SORT_MERGE239=(Token)match(input,SORT_MERGE,FOLLOW_SORT_MERGE_in_same_clause2148);  
                    stream_SORT_MERGE.add(SORT_MERGE239);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:259:20: ( AREA )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==AREA) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:259:20: AREA
                            {
                            AREA240=(Token)match(input,AREA,FOLLOW_AREA_in_same_clause2150);  
                            stream_AREA.add(AREA240);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:259:26: ( FOR )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==FOR) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:259:26: FOR
                            {
                            FOR241=(Token)match(input,FOR,FOLLOW_FOR_in_same_clause2153);  
                            stream_FOR.add(FOR241);


                            }
                            break;

                    }

                    WORD242=(Token)match(input,WORD,FOLLOW_WORD_in_same_clause2156);  
                    stream_WORD.add(WORD242);



                    // AST REWRITE
                    // elements: WORD, SORT_MERGE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 259:38: -> ^( SORT_MERGE WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:259:41: ^( SORT_MERGE WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SORT_MERGE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // $ANTLR end "same_clause"

    public static class multiple_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiple_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:261:1: multiple_clause : MULTIPLE FILE ( TAPE )? ( CONTAINS )? ( position )+ -> ^( MULTIPLE ( position )+ ) ;
    public final EnvironmentDivision.multiple_clause_return multiple_clause() throws RecognitionException {
        EnvironmentDivision.multiple_clause_return retval = new EnvironmentDivision.multiple_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULTIPLE243=null;
        Token FILE244=null;
        Token TAPE245=null;
        Token CONTAINS246=null;
        EnvironmentDivision.position_return position247 = null;


        CommonTree MULTIPLE243_tree=null;
        CommonTree FILE244_tree=null;
        CommonTree TAPE245_tree=null;
        CommonTree CONTAINS246_tree=null;
        RewriteRuleTokenStream stream_FILE=new RewriteRuleTokenStream(adaptor,"token FILE");
        RewriteRuleTokenStream stream_TAPE=new RewriteRuleTokenStream(adaptor,"token TAPE");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleTokenStream stream_MULTIPLE=new RewriteRuleTokenStream(adaptor,"token MULTIPLE");
        RewriteRuleSubtreeStream stream_position=new RewriteRuleSubtreeStream(adaptor,"rule position");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:2: ( MULTIPLE FILE ( TAPE )? ( CONTAINS )? ( position )+ -> ^( MULTIPLE ( position )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:4: MULTIPLE FILE ( TAPE )? ( CONTAINS )? ( position )+
            {
            MULTIPLE243=(Token)match(input,MULTIPLE,FOLLOW_MULTIPLE_in_multiple_clause2177);  
            stream_MULTIPLE.add(MULTIPLE243);

            FILE244=(Token)match(input,FILE,FOLLOW_FILE_in_multiple_clause2179);  
            stream_FILE.add(FILE244);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:18: ( TAPE )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==TAPE) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:18: TAPE
                    {
                    TAPE245=(Token)match(input,TAPE,FOLLOW_TAPE_in_multiple_clause2181);  
                    stream_TAPE.add(TAPE245);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:24: ( CONTAINS )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==CONTAINS) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:24: CONTAINS
                    {
                    CONTAINS246=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_multiple_clause2184);  
                    stream_CONTAINS.add(CONTAINS246);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:34: ( position )+
            int cnt107=0;
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==WORD) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:34: position
            	    {
            	    pushFollow(FOLLOW_position_in_multiple_clause2187);
            	    position247=position();

            	    state._fsp--;

            	    stream_position.add(position247.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt107 >= 1 ) break loop107;
                        EarlyExitException eee =
                            new EarlyExitException(107, input);
                        throw eee;
                }
                cnt107++;
            } while (true);



            // AST REWRITE
            // elements: position, MULTIPLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 262:45: -> ^( MULTIPLE ( position )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:262:48: ^( MULTIPLE ( position )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MULTIPLE.nextNode(), root_1);

                if ( !(stream_position.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_position.hasNext() ) {
                    adaptor.addChild(root_1, stream_position.nextTree());

                }
                stream_position.reset();

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
    // $ANTLR end "multiple_clause"

    public static class position_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "position"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:264:1: position : (filename= WORD -> ^( P_POSITION $filename) | filename= WORD POSITION count= WORD -> ^( P_POSITION $filename $count) );
    public final EnvironmentDivision.position_return position() throws RecognitionException {
        EnvironmentDivision.position_return retval = new EnvironmentDivision.position_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token filename=null;
        Token count=null;
        Token POSITION248=null;

        CommonTree filename_tree=null;
        CommonTree count_tree=null;
        CommonTree POSITION248_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_POSITION=new RewriteRuleTokenStream(adaptor,"token POSITION");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:264:9: (filename= WORD -> ^( P_POSITION $filename) | filename= WORD POSITION count= WORD -> ^( P_POSITION $filename $count) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==WORD) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==POSITION) ) {
                    alt108=2;
                }
                else if ( (LA108_1==EOF||(LA108_1>=PERIOD && LA108_1<=WORD)||LA108_1==CONFIGURATION||(LA108_1>=INPUT_OUTPUT && LA108_1<=I_O_CONTROL)||LA108_1==RERUN||(LA108_1>=MULTIPLE && LA108_1<=SAME)) ) {
                    alt108=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:264:11: filename= WORD
                    {
                    filename=(Token)match(input,WORD,FOLLOW_WORD_in_position2208);  
                    stream_WORD.add(filename);



                    // AST REWRITE
                    // elements: filename
                    // token labels: filename
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_filename=new RewriteRuleTokenStream(adaptor,"token filename",filename);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 264:29: -> ^( P_POSITION $filename)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:264:32: ^( P_POSITION $filename)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_POSITION, "P_POSITION"), root_1);

                        adaptor.addChild(root_1, stream_filename.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:265:4: filename= WORD POSITION count= WORD
                    {
                    filename=(Token)match(input,WORD,FOLLOW_WORD_in_position2228);  
                    stream_WORD.add(filename);

                    POSITION248=(Token)match(input,POSITION,FOLLOW_POSITION_in_position2230);  
                    stream_POSITION.add(POSITION248);

                    count=(Token)match(input,WORD,FOLLOW_WORD_in_position2234);  
                    stream_WORD.add(count);



                    // AST REWRITE
                    // elements: filename, count
                    // token labels: count, filename
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_count=new RewriteRuleTokenStream(adaptor,"token count",count);
                    RewriteRuleTokenStream stream_filename=new RewriteRuleTokenStream(adaptor,"token filename",filename);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 265:39: -> ^( P_POSITION $filename $count)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:265:42: ^( P_POSITION $filename $count)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_POSITION, "P_POSITION"), root_1);

                        adaptor.addChild(root_1, stream_filename.nextNode());
                        adaptor.addChild(root_1, stream_count.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

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
    // $ANTLR end "position"

    public static class data_or_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_or_literal"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:268:1: data_or_literal : ( data_name | literal );
    public final EnvironmentDivision.data_or_literal_return data_or_literal() throws RecognitionException {
        EnvironmentDivision.data_or_literal_return retval = new EnvironmentDivision.data_or_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        EnvironmentDivision.data_name_return data_name249 = null;

        EnvironmentDivision.literal_return literal250 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:272:2: ( data_name | literal )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==WORD) ) {
                alt109=1;
            }
            else if ( (LA109_0==STRING) ) {
                alt109=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:272:4: data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_data_name_in_data_or_literal2262);
                    data_name249=data_name();

                    state._fsp--;

                    adaptor.addChild(root_0, data_name249.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:272:16: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_data_or_literal2266);
                    literal250=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal250.getTree());

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
    // $ANTLR end "data_or_literal"

    public static class data_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_name"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:273:1: data_name : WORD ( in_of )* -> ^( WORD ( in_of )* ) ;
    public final EnvironmentDivision.data_name_return data_name() throws RecognitionException {
        EnvironmentDivision.data_name_return retval = new EnvironmentDivision.data_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD251=null;
        EnvironmentDivision.in_of_return in_of252 = null;


        CommonTree WORD251_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleSubtreeStream stream_in_of=new RewriteRuleSubtreeStream(adaptor,"rule in_of");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:274:2: ( WORD ( in_of )* -> ^( WORD ( in_of )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:274:4: WORD ( in_of )*
            {
            WORD251=(Token)match(input,WORD,FOLLOW_WORD_in_data_name2274);  
            stream_WORD.add(WORD251);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:274:9: ( in_of )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==IN||LA110_0==OF) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:274:9: in_of
            	    {
            	    pushFollow(FOLLOW_in_of_in_data_name2276);
            	    in_of252=in_of();

            	    state._fsp--;

            	    stream_in_of.add(in_of252.getTree());

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);



            // AST REWRITE
            // elements: in_of, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 274:18: -> ^( WORD ( in_of )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:274:21: ^( WORD ( in_of )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WORD.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:274:28: ( in_of )*
                while ( stream_in_of.hasNext() ) {
                    adaptor.addChild(root_1, stream_in_of.nextTree());

                }
                stream_in_of.reset();

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
    // $ANTLR end "data_name"

    public static class in_of_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "in_of"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:275:1: in_of : ( IN | OF ) WORD -> WORD ;
    public final EnvironmentDivision.in_of_return in_of() throws RecognitionException {
        EnvironmentDivision.in_of_return retval = new EnvironmentDivision.in_of_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN253=null;
        Token OF254=null;
        Token WORD255=null;

        CommonTree IN253_tree=null;
        CommonTree OF254_tree=null;
        CommonTree WORD255_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:275:7: ( ( IN | OF ) WORD -> WORD )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:275:9: ( IN | OF ) WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:275:9: ( IN | OF )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==IN) ) {
                alt111=1;
            }
            else if ( (LA111_0==OF) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:275:10: IN
                    {
                    IN253=(Token)match(input,IN,FOLLOW_IN_in_in_of2296);  
                    stream_IN.add(IN253);


                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/EnvironmentDivision.g:275:15: OF
                    {
                    OF254=(Token)match(input,OF,FOLLOW_OF_in_in_of2300);  
                    stream_OF.add(OF254);


                    }
                    break;

            }

            WORD255=(Token)match(input,WORD,FOLLOW_WORD_in_in_of2303);  
            stream_WORD.add(WORD255);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 275:26: -> WORD
            {
                adaptor.addChild(root_0, stream_WORD.nextNode());

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
    // $ANTLR end "in_of"

    // Delegated rules


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String DFA45_eotS =
        "\10\uffff";
    static final String DFA45_eofS =
        "\1\uffff\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff";
    static final String DFA45_minS =
        "\1\23\1\22\1\uffff\1\22\1\uffff\1\23\1\22\1\uffff";
    static final String DFA45_maxS =
        "\1\23\1\151\1\uffff\1\151\1\uffff\1\23\1\151\1\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\2\uffff\1\1";
    static final String DFA45_specialS =
        "\10\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1",
            "\1\4\1\3\5\uffff\1\4\1\uffff\1\4\3\uffff\1\4\10\uffff\1\2\1"+
            "\uffff\1\4\4\uffff\1\4\7\uffff\1\4\1\uffff\3\4\47\uffff\3\4"+
            "\1\uffff\3\4",
            "",
            "\1\4\1\6\5\uffff\1\4\1\uffff\1\4\3\uffff\1\4\10\uffff\1\5\1"+
            "\uffff\1\4\1\uffff\1\4\1\uffff\2\4\7\uffff\1\4\1\uffff\3\4\47"+
            "\uffff\3\4\1\uffff\3\4",
            "",
            "\1\7",
            "\1\4\1\6\5\uffff\1\4\1\uffff\1\4\3\uffff\1\4\10\uffff\1\5\1"+
            "\uffff\1\4\1\uffff\1\4\1\uffff\2\4\7\uffff\1\4\1\uffff\3\4\47"+
            "\uffff\3\4\1\uffff\3\4",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "188:1: symbolic_pair : (a= word_list IS b= word_list -> ^( IS $a $b) | word_list -> word_list );";
        }
    }
    static final String DFA55_eotS =
        "\13\uffff";
    static final String DFA55_eofS =
        "\13\uffff";
    static final String DFA55_minS =
        "\1\55\4\uffff\1\23\5\uffff";
    static final String DFA55_maxS =
        "\1\156\4\uffff\1\121\5\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\10\1\11\1\5\1\7";
    static final String DFA55_specialS =
        "\13\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\10\20\uffff\1\10\1\6\1\3\2\uffff\3\3\1\2\1\4\1\5\3\uffff"+
            "\1\1\5\uffff\1\7\32\uffff\2\3",
            "",
            "",
            "",
            "",
            "\1\12\24\uffff\1\12\40\uffff\1\11\7\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "211:1: file_clause : ( assign_clause | reserve_clause | organization_clause | padding_clause | record_delimiter_clause | access_clause | record_key_clause | alternate_clause | file_status_clause );";
        }
    }
 

    public static final BitSet FOLLOW_ENVIRONMENT_in_env_division501 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DIVISION_in_env_division503 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_env_division505 = new BitSet(new long[]{0x0800000002000002L});
    public static final BitSet FOLLOW_env_division_clause_in_env_division508 = new BitSet(new long[]{0x0800000002000002L});
    public static final BitSet FOLLOW_configuration_section_in_env_division_clause526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_input_output_section_in_env_division_clause530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONFIGURATION_in_configuration_section538 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SECTION_in_configuration_section540 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_configuration_section542 = new BitSet(new long[]{0x0000040088040002L});
    public static final BitSet FOLLOW_configuration_section_clause_in_configuration_section544 = new BitSet(new long[]{0x0000040088040002L});
    public static final BitSet FOLLOW_PERIOD_in_configuration_section547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_computer_in_configuration_section_clause565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_computer_in_configuration_section_clause569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_special_names_in_configuration_section_clause573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_COMPUTER_in_source_computer581 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_source_computer583 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_source_computer_name_in_source_computer585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_source_computer_name603 = new BitSet(new long[]{0x0000000030040000L});
    public static final BitSet FOLLOW_WITH_in_source_computer_name606 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_DEBUGGING_in_source_computer_name610 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_MODE_in_source_computer_name612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_source_computer_name617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBJECT_COMPUTER_in_object_computer629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_object_computer631 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_object_computer_name_in_object_computer633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_object_computer_name651 = new BitSet(new long[]{0x000002E100040000L});
    public static final BitSet FOLLOW_memory_size_in_object_computer_name653 = new BitSet(new long[]{0x000002E000040000L});
    public static final BitSet FOLLOW_program_collating_in_object_computer_name656 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_segment_limit_in_object_computer_name659 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_object_computer_name662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MEMORY_in_memory_size673 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_SIZE_in_memory_size675 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_memory_size678 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_memory_size_alts_in_memory_size680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_memory_size_alts0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROGRAM_in_program_collating715 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_COLLATING_in_program_collating718 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SEQUENCE_in_program_collating721 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_program_collating723 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_program_collating726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEGMENT_LIMIT_in_segment_limit742 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_segment_limit744 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_segment_limit747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPECIAL_NAMES_in_special_names767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_special_names769 = new BitSet(new long[]{0x0480800000080002L,0x000003B800000000L});
    public static final BitSet FOLLOW_special_names_clause_in_special_names771 = new BitSet(new long[]{0x0480800000080002L,0x000003B800000000L});
    public static final BitSet FOLLOW_environment_names_in_special_names_clause790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alphabet_in_special_names_clause794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbolic_in_special_names_clause798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_is_in_special_names_clause802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_console_in_special_names_clause806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_crt_status_in_special_names_clause810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_currency_in_special_names_clause814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_in_special_names_clause818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimal_in_special_names_clause822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_in_special_names_clause826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSOLE_in_console833 = new BitSet(new long[]{0x0000010000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IS_in_console835 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_CRT_in_console838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CRT_in_crt_status850 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STATUS_in_crt_status852 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_crt_status854 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_data_name_in_crt_status857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURRENCY_in_currency871 = new BitSet(new long[]{0x0000010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_SIGN_in_currency873 = new BitSet(new long[]{0x0000010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_currency876 = new BitSet(new long[]{0x0000010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_literal_in_currency879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURSOR_in_cursor894 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_cursor896 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_data_name_in_cursor899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_POINT_in_decimal915 = new BitSet(new long[]{0x0000010000002000L});
    public static final BitSet FOLLOW_IS_in_decimal917 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_decimal920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMERIC_in_numeric932 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_SIGN_in_numeric934 = new BitSet(new long[]{0x0000010000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_IS_in_numeric936 = new BitSet(new long[]{0x0000010000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_leading_in_numeric939 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_separate_in_numeric941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_leading0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPARATE_in_separate970 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_CHARACTERS_in_separate972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_environment_names988 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_environment_names990 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_environment_names995 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_status_in_environment_names997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_environment_names1019 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_status_in_environment_names1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_on_status_in_status1042 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_off_status_in_status1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_off_status_in_status1050 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_on_status_in_status1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_on_status1064 = new BitSet(new long[]{0x0000210000080000L});
    public static final BitSet FOLLOW_STATUS_in_on_status1066 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_on_status1069 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_on_status1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_off_status1091 = new BitSet(new long[]{0x0000210000080000L});
    public static final BitSet FOLLOW_STATUS_in_off_status1093 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_off_status1096 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_off_status1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHABET_in_alphabet1119 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_alphabet1121 = new BitSet(new long[]{0x001F010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_IS_in_alphabet1123 = new BitSet(new long[]{0x001F010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_alphabet_alts_in_alphabet1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STANDARD_1_in_alphabet_alts1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STANDARD_2_in_alphabet_alts1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_alphabet_alts1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EBCDIC_in_alphabet_alts1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alpha_name_in_alphabet_alts1160 = new BitSet(new long[]{0x001F010000080102L,0x0000004000000000L});
    public static final BitSet FOLLOW_literal_in_alpha_name1170 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THRU_in_alpha_name1172 = new BitSet(new long[]{0x0000010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_literal_in_alpha_name1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALSO_in_alpha_name1193 = new BitSet(new long[]{0x0000010000080100L,0x0000004000000000L});
    public static final BitSet FOLLOW_literal_in_alpha_name1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_alpha_name1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_symbolic1234 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_CHARACTERS_in_symbolic1236 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_symbolic_pair_in_symbolic1239 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_in_alphabet_in_symbolic1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_word_list_in_symbolic_pair1265 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_symbolic_pair1267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_word_list_in_symbolic_pair1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_word_list_in_symbolic_pair1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_word_list1305 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_IN_in_in_alphabet1327 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_in_alphabet1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class_is1347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_class_is1349 = new BitSet(new long[]{0x0000010000080002L});
    public static final BitSet FOLLOW_IS_in_class_is1351 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_simple_pair_in_class_is1354 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_WORD_in_simple_pair1376 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THRU_in_simple_pair1378 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_simple_pair1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_simple_pair1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INPUT_OUTPUT_in_input_output_section1411 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_SECTION_in_input_output_section1413 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_input_output_section1415 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_input_output_clause_in_input_output_section1417 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_file_control_in_input_output_clause1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_i_o_control_in_input_output_clause1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILE_CONTROL_in_file_control1451 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_file_control1453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_file_control_para_in_file_control1455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_SELECT_in_file_control_para1475 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008000L});
    public static final BitSet FOLLOW_OPTIONAL_in_file_control_para1477 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_file_control_para1480 = new BitSet(new long[]{0xC000200000040000L,0x00006000000411F9L});
    public static final BitSet FOLLOW_file_clause_in_file_control_para1482 = new BitSet(new long[]{0xC000200000040000L,0x00006000000411F9L});
    public static final BitSet FOLLOW_PERIOD_in_file_control_para1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_clause_in_file_clause1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reserve_clause_in_file_clause1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_organization_clause_in_file_clause1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_padding_clause_in_file_clause1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_delimiter_clause_in_file_clause1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_clause_in_file_clause1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_key_clause_in_file_clause1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alternate_clause_in_file_clause1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_status_clause_in_file_clause1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assign_clause1558 = new BitSet(new long[]{0x0000010000080100L,0x0000004000002000L});
    public static final BitSet FOLLOW_TO_in_assign_clause1560 = new BitSet(new long[]{0x0000010000080100L,0x0000004000002000L});
    public static final BitSet FOLLOW_data_or_literal_in_assign_clause1563 = new BitSet(new long[]{0x0000010000080102L,0x0000004000002000L});
    public static final BitSet FOLLOW_RESERVE_in_reserve_clause1581 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_reserve_clause1583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_AREA_in_reserve_clause1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORGANIZATION_in_organization_clause1605 = new BitSet(new long[]{0x0000010000000000L,0x0000600000000001L});
    public static final BitSet FOLLOW_IS_in_organization_clause1607 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000001L});
    public static final BitSet FOLLOW_bin_line_in_organization_clause1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEQUENTIAL_in_organization_clause1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORGANIZATION_in_organization_clause1632 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IS_in_organization_clause1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_INDEXED_in_organization_clause1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORGANIZATION_in_organization_clause1655 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IS_in_organization_clause1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RELATIVE_in_organization_clause1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bin_line0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PADDING_in_padding_clause1693 = new BitSet(new long[]{0x0000010000080100L,0x0000004000012000L});
    public static final BitSet FOLLOW_CHARACTER_in_padding_clause1695 = new BitSet(new long[]{0x0000010000080100L,0x0000004000002000L});
    public static final BitSet FOLLOW_IS_in_padding_clause1698 = new BitSet(new long[]{0x0000010000080100L,0x0000004000002000L});
    public static final BitSet FOLLOW_data_or_literal_in_padding_clause1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_delimiter_clause1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DELIMITER_in_record_delimiter_clause1719 = new BitSet(new long[]{0x0001010000000000L});
    public static final BitSet FOLLOW_IS_in_record_delimiter_clause1721 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_STANDARD_1_in_record_delimiter_clause1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_delimiter_clause1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DELIMITER_in_record_delimiter_clause1739 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_record_delimiter_clause1741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_record_delimiter_clause1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_in_access_clause1762 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_MODE_in_access_clause1764 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_IS_in_access_clause1767 = new BitSet(new long[]{0x0000010040000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_access_clause_alt_in_access_clause1770 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_relative_clause_in_access_clause1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access_clause_alt0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELATIVE_in_relative_clause1809 = new BitSet(new long[]{0x0000010000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_relative_clause1811 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_relative_clause1814 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_data_name_in_relative_clause1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FILE_in_file_status_clause1835 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_STATUS_in_file_status_clause1838 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_file_status_clause1840 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_data_name_in_file_status_clause1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record_key_clause1859 = new BitSet(new long[]{0x0000010000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_record_key_clause1861 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_record_key_clause1864 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_data_name_in_record_key_clause1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTERNATE_in_alternate_clause1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RECORD_in_alternate_clause1886 = new BitSet(new long[]{0x0000010000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_alternate_clause1888 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_IS_in_alternate_clause1891 = new BitSet(new long[]{0x0000010000080000L});
    public static final BitSet FOLLOW_data_name_in_alternate_clause1894 = new BitSet(new long[]{0x0000000010000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_WITH_in_alternate_clause1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DUPLICATES_in_alternate_clause1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_I_O_CONTROL_in_i_o_control1922 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_PERIOD_in_i_o_control1924 = new BitSet(new long[]{0x0000000000040002L,0x0000000030100000L});
    public static final BitSet FOLLOW_i_o_control_para_in_i_o_control1926 = new BitSet(new long[]{0x0000000000040002L,0x0000000030100000L});
    public static final BitSet FOLLOW_PERIOD_in_i_o_control1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rerun_clause_in_i_o_control_para1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_same_clause_in_i_o_control_para1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiple_clause_in_i_o_control_para1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RERUN_in_rerun_clause1968 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ON_in_rerun_clause1970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_rerun_clause1972 = new BitSet(new long[]{0x0000000000080000L,0x0000000000A00000L});
    public static final BitSet FOLLOW_every_in_rerun_clause1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_in_every1996 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_every2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RECORD_in_every2003 = new BitSet(new long[]{0x0000000000080000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OF_in_every2005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_every2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_in_every2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_every2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000005000000L});
    public static final BitSet FOLLOW_OF_in_every2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_REEL_in_every2037 = new BitSet(new long[]{0x0000000000080000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OF_in_every2039 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_every2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVERY_in_every2059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_END_in_every2062 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_OF_in_every2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_UNIT_in_every2067 = new BitSet(new long[]{0x0000000000080000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OF_in_every2069 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_every2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAME_in_same_clause2095 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000500L});
    public static final BitSet FOLLOW_RECORD_in_same_clause2097 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000400L});
    public static final BitSet FOLLOW_AREA_in_same_clause2100 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000000L});
    public static final BitSet FOLLOW_FOR_in_same_clause2103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_same_clause2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAME_in_same_clause2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_SORT_in_same_clause2123 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000400L});
    public static final BitSet FOLLOW_AREA_in_same_clause2125 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000000L});
    public static final BitSet FOLLOW_FOR_in_same_clause2128 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_same_clause2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAME_in_same_clause2146 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_SORT_MERGE_in_same_clause2148 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000400L});
    public static final BitSet FOLLOW_AREA_in_same_clause2150 = new BitSet(new long[]{0x0000000000080000L,0x0000000040000000L});
    public static final BitSet FOLLOW_FOR_in_same_clause2153 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_same_clause2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTIPLE_in_multiple_clause2177 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_FILE_in_multiple_clause2179 = new BitSet(new long[]{0x0000000000080000L,0x0000000180000000L});
    public static final BitSet FOLLOW_TAPE_in_multiple_clause2181 = new BitSet(new long[]{0x0000000000080000L,0x0000000180000000L});
    public static final BitSet FOLLOW_CONTAINS_in_multiple_clause2184 = new BitSet(new long[]{0x0000000000080000L,0x0000000180000000L});
    public static final BitSet FOLLOW_position_in_multiple_clause2187 = new BitSet(new long[]{0x0000000000080002L,0x0000000180000000L});
    public static final BitSet FOLLOW_WORD_in_position2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_position2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_POSITION_in_position2230 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_position2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_name_in_data_or_literal2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_data_or_literal2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_data_name2274 = new BitSet(new long[]{0x0200000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_in_of_in_data_name2276 = new BitSet(new long[]{0x0200000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_IN_in_in_of2296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_OF_in_in_of2300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WORD_in_in_of2303 = new BitSet(new long[]{0x0000000000000002L});

}
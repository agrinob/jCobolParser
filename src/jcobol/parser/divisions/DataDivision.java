// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g 2010-05-01 08:02:01

	package jcobol.parser.divisions;
	

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class DataDivision extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONTINUATION", "NEW_PAGE", "COMMENT", "SPECIAL_LINE", "START_DEBUG", "END_DEBUG", "STRING", "START_PSEUDO_TEXT", "PSEUDO_TEXT", "END_PSEUDO_TEXT", "COLON", "COMMA", "SEMI_COLON", "LEFT_PAREN", "RIGHT_PAREN", "TEXT", "PERIOD", "WORD", "AMPERSAND", "P_PAIR", "P_FROM", "P_SIGN", "P_USAGE", "P_RECORD", "P_DATA_RECORD", "P_ERROR_KEY", "P_DESTINATION_TABLE", "P_DESTINATION_COUNT", "P_MESSAGE_COUNT", "P_END_KEY", "P_STATUS_KEY", "P_TEXT_LENGTH", "P_SYMBOLIC_SOURCE", "P_MESSAGE_DATE", "P_MESSAGE_TIME", "P_SYMBOLIC_DESTINATION", "P_SYMBOLIC_TERMINAL", "P_PAREN_EXP", "P_OP_LESS", "P_OP_GREATER", "P_OP_EQUAL", "P_OP_LESS_EQUAL", "P_OP_GREATER_EQUAL", "P_OP_TRIMMED_RIGHT", "P_OP_TRIMMED_LEFT", "P_OP_TRIMMED_BOTH", "P_OP_CASE_INSENSITIVE", "P_OP_CASE_SENSITIVE", "P_EXCLUSIVE_OR", "P_SCREEN_GROUP", "P_LIMIT", "P_HEADING", "P_FIRST_DETAIL", "P_LAST_DETAIL", "P_FOOTING", "P_REPORT_SECTION", "P_REPORT_GROUP", "P_REPORT_HEADING", "P_PAGE_HEADING", "P_CONTROL_HEADING", "P_CONTROL_FOOTING", "P_PAGE_FOOTING", "P_REPORT_FOOTING", "P_DETAIL", "RH", "PH", "CH", "DE", "CF", "PF", "RF", "GROUP", "INDICATE", "TYPE", "SUM", "UPON", "RESET", "SCREEN", "BACKGROUND", "FOREGROUND", "AUTO", "SECURE", "REQUIRED", "FULL", "BELL", "BEEP", "BLINK", "ERASE", "EOS", "LINE", "REMAINDER", "EOL", "DATA", "DIVISION", "FILE", "SECTION", "FD", "SD", "EXTERNAL", "GLOBAL", "IS", "BLOCK", "CONTAINS", "TO", "CHARACTERS", "CHARACTER", "RECORDS", "WORKING_STORAGE", "LINKAGE", "RECORD", "VARYING", "SIZE", "IN", "FROM", "DEPENDING", "LABEL", "VALUE", "OF", "ARE", "STANDARD", "OMITTED", "ON", "FOOTING", "TOP", "BOTTOM", "AT", "WITH", "LINES", "LINAGE", "BLANK", "WHEN", "ZERO", "ZEROS", "ZEROES", "JUSTIFIED", "JUST", "RIGHT", "OCCURS", "TIMES", "ASCENDING", "DESCENDING", "KEY", "INDEXED", "BY", "PICTURE", "PIC", "REDEFINES", "RENAMES", "THRU", "THROUGH", "SIGN", "LEADING", "TRAILING", "SEPARATE", "SYNC", "SYNCHRONIZED", "LEFT", "USAGE", "BINARY", "COMP", "COMP_1", "COMP_2", "COMP_3", "COMP_4", "COMP_5", "COMP_6", "COMPUTATIONAL", "COMPUTATIONAL_1", "COMPUTATIONAL_2", "COMPUTATIONAL_3", "COMPUTATIONAL_4", "COMPUTATIONAL_5", "COMPUTATIONAL_6", "COMPUTATIONAL_7", "COMPUTATIONAL_8", "DISPLAY", "PACKED_DECIMAL", "INDEX", "POINTER", "SPACE", "SPACES", "QUOTE", "QUOTES", "HIGH_VALUE", "HIGH_VALUES", "LOW_VALUE", "LOW_VALUES", "NULL", "NULLS", "ALL", "COMMUNICATION", "SYMBOLIC", "QUEUE", "SUB_QUEUE_1", "SUB_QUEUE_2", "SUB_QUEUE_3", "MESSAGE", "DATE", "TIME", "CD", "FOR", "INITIAL", "INPUT", "OUTPUT", "I_O", "STATUS", "END", "COUNT", "LENGTH", "SOURCE", "DESTINATION", "TABLE", "ERROR", "TERMINAL", "SET", "FALSE", "CODE_SET", "NEXT", "START", "DATE_COMPILED", "OP_PLUS", "OP_MINUS", "OP_MUL", "OP_DIV", "OP_EXP", "AND", "EXCLUSIVE", "OR", "NOT", "OP_LESS", "LESS", "EQUAL", "THAN", "GREATER", "OP_LESS_EQUAL", "OP_GREATER", "OP_GREATER_EQUAL", "OP_EQUAL", "LIKE", "TRIMMED", "CASE_INSENSITIVE", "CASE_SENSITIVE", "COLUMN", "COL", "PLUS", "REVERSE", "REVERSED", "REVERSE_VIDEO", "UNDERLINE", "NUMBER", "USING", "LOWLIGHT", "HIGHLIGHT", "NO", "REPORT", "CODE", "CONTROL", "FINAL", "PAGE", "LIMIT", "HEADING", "FIRST", "DETAIL", "LAST", "RD"
    };
    public static final int HIGH_VALUES=188;
    public static final int P_SYMBOLIC_TERMINAL=40;
    public static final int CONTAINS=106;
    public static final int POINTER=182;
    public static final int CODE_SET=220;
    public static final int P_REPORT_SECTION=59;
    public static final int RECORDS=110;
    public static final int NOT=232;
    public static final int QUOTES=186;
    public static final int DE=71;
    public static final int EOF=-1;
    public static final int P_MESSAGE_TIME=38;
    public static final int CHARACTER=109;
    public static final int TYPE=77;
    public static final int SYMBOLIC=195;
    public static final int FINAL=261;
    public static final int BELL=88;
    public static final int EOL=95;
    public static final int FD=100;
    public static final int ARE=122;
    public static final int P_TEXT_LENGTH=35;
    public static final int USING=254;
    public static final int P_OP_TRIMMED_LEFT=48;
    public static final int P_ERROR_KEY=29;
    public static final int I_O=208;
    public static final int EOS=92;
    public static final int DIVISION=97;
    public static final int P_HEADING=55;
    public static final int P_OP_CASE_SENSITIVE=51;
    public static final int END_DEBUG=9;
    public static final int P_RECORD=27;
    public static final int FOOTING=126;
    public static final int P_FIRST_DETAIL=56;
    public static final int OP_GREATER=239;
    public static final int PIC=149;
    public static final int CONTROL=260;
    public static final int DESTINATION=214;
    public static final int P_MESSAGE_DATE=37;
    public static final int KEY=145;
    public static final int INITIAL=205;
    public static final int BLANK=133;
    public static final int NUMBER=253;
    public static final int P_CONTROL_FOOTING=64;
    public static final int REVERSE_VIDEO=251;
    public static final int TRAILING=156;
    public static final int ZEROS=136;
    public static final int SEPARATE=157;
    public static final int SEMI_COLON=16;
    public static final int WORKING_STORAGE=111;
    public static final int P_LIMIT=54;
    public static final int VALUE=120;
    public static final int FILE=98;
    public static final int LEADING=155;
    public static final int GROUP=75;
    public static final int DEPENDING=118;
    public static final int LEFT_PAREN=17;
    public static final int OP_EQUAL=241;
    public static final int REVERSE=249;
    public static final int END=210;
    public static final int SIZE=115;
    public static final int PSEUDO_TEXT=12;
    public static final int RH=68;
    public static final int ERASE=91;
    public static final int RF=74;
    public static final int RD=268;
    public static final int REPORT=258;
    public static final int P_SIGN=25;
    public static final int TRIMMED=243;
    public static final int OCCURS=141;
    public static final int INPUT=206;
    public static final int LINES=131;
    public static final int TABLE=215;
    public static final int SOURCE=213;
    public static final int P_PAIR=23;
    public static final int COMPUTATIONAL_7=177;
    public static final int COMPUTATIONAL_8=178;
    public static final int COMPUTATIONAL_5=175;
    public static final int COMPUTATIONAL_6=176;
    public static final int CASE_INSENSITIVE=244;
    public static final int SUM=78;
    public static final int P_PAGE_FOOTING=65;
    public static final int COMPUTATIONAL_3=173;
    public static final int COMPUTATIONAL_4=174;
    public static final int ASCENDING=143;
    public static final int COMPUTATIONAL_1=171;
    public static final int START_PSEUDO_TEXT=11;
    public static final int COMPUTATIONAL_2=172;
    public static final int ZERO=135;
    public static final int AT=129;
    public static final int TIME=202;
    public static final int RIGHT_PAREN=18;
    public static final int OP_LESS_EQUAL=238;
    public static final int LEFT=160;
    public static final int COLUMN=246;
    public static final int OP_EXP=228;
    public static final int AUTO=84;
    public static final int MESSAGE=200;
    public static final int PLUS=248;
    public static final int P_OP_CASE_INSENSITIVE=50;
    public static final int COMMUNICATION=194;
    public static final int STANDARD=123;
    public static final int P_FROM=24;
    public static final int LIKE=242;
    public static final int BY=147;
    public static final int TO=107;
    public static final int HIGHLIGHT=256;
    public static final int AMPERSAND=22;
    public static final int CASE_SENSITIVE=245;
    public static final int SET=218;
    public static final int CONTINUATION=4;
    public static final int RIGHT=140;
    public static final int DATE_COMPILED=223;
    public static final int TEXT=19;
    public static final int HEADING=264;
    public static final int P_DATA_RECORD=28;
    public static final int LOW_VALUE=189;
    public static final int LINE=93;
    public static final int COLON=14;
    public static final int SD=101;
    public static final int NULLS=192;
    public static final int P_SYMBOLIC_SOURCE=36;
    public static final int OMITTED=124;
    public static final int ZEROES=137;
    public static final int P_DESTINATION_TABLE=30;
    public static final int WHEN=134;
    public static final int BLOCK=105;
    public static final int P_OP_TRIMMED_BOTH=49;
    public static final int P_PAREN_EXP=41;
    public static final int START=222;
    public static final int CH=70;
    public static final int CF=72;
    public static final int CD=203;
    public static final int BLINK=90;
    public static final int DESCENDING=144;
    public static final int FIRST=265;
    public static final int STRING=10;
    public static final int P_OP_GREATER=43;
    public static final int SIGN=154;
    public static final int END_PSEUDO_TEXT=13;
    public static final int EXTERNAL=102;
    public static final int LOWLIGHT=255;
    public static final int P_PAGE_HEADING=62;
    public static final int P_OP_LESS=42;
    public static final int REDEFINES=150;
    public static final int SCREEN=81;
    public static final int P_USAGE=26;
    public static final int RESET=80;
    public static final int VARYING=114;
    public static final int P_END_KEY=33;
    public static final int P_REPORT_HEADING=61;
    public static final int COUNT=211;
    public static final int THRU=152;
    public static final int BEEP=89;
    public static final int P_CONTROL_HEADING=63;
    public static final int CODE=259;
    public static final int WORD=21;
    public static final int PACKED_DECIMAL=180;
    public static final int QUOTE=185;
    public static final int GREATER=237;
    public static final int SUB_QUEUE_3=199;
    public static final int FULL=87;
    public static final int THAN=236;
    public static final int OP_MINUS=225;
    public static final int SUB_QUEUE_1=197;
    public static final int SUB_QUEUE_2=198;
    public static final int P_DETAIL=67;
    public static final int COL=247;
    public static final int QUEUE=196;
    public static final int LESS=234;
    public static final int P_REPORT_GROUP=60;
    public static final int P_OP_EQUAL=44;
    public static final int LAST=267;
    public static final int LINKAGE=112;
    public static final int COMMENT=6;
    public static final int OP_GREATER_EQUAL=240;
    public static final int RECORD=113;
    public static final int START_DEBUG=8;
    public static final int SECTION=99;
    public static final int PERIOD=20;
    public static final int NULL=191;
    public static final int NO=257;
    public static final int ON=125;
    public static final int RENAMES=151;
    public static final int OP_DIV=227;
    public static final int LINAGE=132;
    public static final int DETAIL=266;
    public static final int ERROR=216;
    public static final int OF=121;
    public static final int UNDERLINE=252;
    public static final int REMAINDER=94;
    public static final int SPACES=184;
    public static final int HIGH_VALUE=187;
    public static final int NEW_PAGE=5;
    public static final int DISPLAY=179;
    public static final int OR=231;
    public static final int BOTTOM=128;
    public static final int JUSTIFIED=138;
    public static final int PH=69;
    public static final int P_DESTINATION_COUNT=31;
    public static final int FROM=117;
    public static final int FALSE=219;
    public static final int P_OP_TRIMMED_RIGHT=47;
    public static final int PF=73;
    public static final int OUTPUT=207;
    public static final int REVERSED=250;
    public static final int FOREGROUND=83;
    public static final int LIMIT=263;
    public static final int OP_MUL=226;
    public static final int FOR=204;
    public static final int EXCLUSIVE=230;
    public static final int AND=229;
    public static final int SPACE=183;
    public static final int OP_LESS=233;
    public static final int LENGTH=212;
    public static final int USAGE=161;
    public static final int CHARACTERS=108;
    public static final int INDEX=181;
    public static final int BACKGROUND=82;
    public static final int SYNCHRONIZED=159;
    public static final int IN=116;
    public static final int SPECIAL_LINE=7;
    public static final int P_SYMBOLIC_DESTINATION=39;
    public static final int COMMA=15;
    public static final int IS=104;
    public static final int EQUAL=235;
    public static final int ALL=193;
    public static final int NEXT=221;
    public static final int P_MESSAGE_COUNT=32;
    public static final int WITH=130;
    public static final int P_OP_GREATER_EQUAL=46;
    public static final int OP_PLUS=224;
    public static final int SYNC=158;
    public static final int TERMINAL=217;
    public static final int STATUS=209;
    public static final int INDICATE=76;
    public static final int UPON=79;
    public static final int P_FOOTING=58;
    public static final int COMP=163;
    public static final int REQUIRED=86;
    public static final int COMP_1=164;
    public static final int COMP_3=166;
    public static final int COMP_2=165;
    public static final int COMP_5=168;
    public static final int P_SCREEN_GROUP=53;
    public static final int COMP_4=167;
    public static final int SECURE=85;
    public static final int COMP_6=169;
    public static final int P_LAST_DETAIL=57;
    public static final int INDEXED=146;
    public static final int PICTURE=148;
    public static final int P_REPORT_FOOTING=66;
    public static final int PAGE=262;
    public static final int LOW_VALUES=190;
    public static final int LABEL=119;
    public static final int COMPUTATIONAL=170;
    public static final int P_STATUS_KEY=34;
    public static final int JUST=139;
    public static final int THROUGH=153;
    public static final int P_EXCLUSIVE_OR=52;
    public static final int BINARY=162;
    public static final int DATE=201;
    public static final int GLOBAL=103;
    public static final int TIMES=142;
    public static final int TOP=127;
    public static final int DATA=96;
    public static final int P_OP_LESS_EQUAL=45;

    // delegates
    // delegators


        public DataDivision(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DataDivision(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return DataDivision.tokenNames; }
    public String getGrammarFileName() { return "/home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g"; }


    public static class data_div_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_div"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:291:1: data_div : DATA DIVISION PERIOD ( data_div_section )* -> ^( DATA ( data_div_section )* ) ;
    public final DataDivision.data_div_return data_div() throws RecognitionException {
        DataDivision.data_div_return retval = new DataDivision.data_div_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DATA1=null;
        Token DIVISION2=null;
        Token PERIOD3=null;
        DataDivision.data_div_section_return data_div_section4 = null;


        CommonTree DATA1_tree=null;
        CommonTree DIVISION2_tree=null;
        CommonTree PERIOD3_tree=null;
        RewriteRuleTokenStream stream_DIVISION=new RewriteRuleTokenStream(adaptor,"token DIVISION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_data_div_section=new RewriteRuleSubtreeStream(adaptor,"rule data_div_section");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:291:9: ( DATA DIVISION PERIOD ( data_div_section )* -> ^( DATA ( data_div_section )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:291:11: DATA DIVISION PERIOD ( data_div_section )*
            {
            DATA1=(Token)match(input,DATA,FOLLOW_DATA_in_data_div1173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA.add(DATA1);

            DIVISION2=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_data_div1175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DIVISION.add(DIVISION2);

            PERIOD3=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_data_div1177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD3);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:291:32: ( data_div_section )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SCREEN||LA1_0==FILE||(LA1_0>=WORKING_STORAGE && LA1_0<=LINKAGE)||LA1_0==COMMUNICATION||LA1_0==REPORT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_div_section
            	    {
            	    pushFollow(FOLLOW_data_div_section_in_data_div1179);
            	    data_div_section4=data_div_section();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_div_section.add(data_div_section4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);



            // AST REWRITE
            // elements: data_div_section, DATA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 291:50: -> ^( DATA ( data_div_section )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:291:53: ^( DATA ( data_div_section )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:291:60: ( data_div_section )*
                while ( stream_data_div_section.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_div_section.nextTree());

                }
                stream_data_div_section.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "data_div"

    public static class data_div_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_div_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:292:1: data_div_section : ( file_section | working_storage_section | linkage_section | communication_section | screen_section | report_section );
    public final DataDivision.data_div_section_return data_div_section() throws RecognitionException {
        DataDivision.data_div_section_return retval = new DataDivision.data_div_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.file_section_return file_section5 = null;

        DataDivision.working_storage_section_return working_storage_section6 = null;

        DataDivision.linkage_section_return linkage_section7 = null;

        DataDivision.communication_section_return communication_section8 = null;

        DataDivision.screen_section_return screen_section9 = null;

        DataDivision.report_section_return report_section10 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:2: ( file_section | working_storage_section | linkage_section | communication_section | screen_section | report_section )
            int alt2=6;
            switch ( input.LA(1) ) {
            case FILE:
                {
                alt2=1;
                }
                break;
            case WORKING_STORAGE:
                {
                alt2=2;
                }
                break;
            case LINKAGE:
                {
                alt2=3;
                }
                break;
            case COMMUNICATION:
                {
                alt2=4;
                }
                break;
            case SCREEN:
                {
                alt2=5;
                }
                break;
            case REPORT:
                {
                alt2=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:4: file_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_file_section_in_data_div_section1197);
                    file_section5=file_section();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, file_section5.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:19: working_storage_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_working_storage_section_in_data_div_section1201);
                    working_storage_section6=working_storage_section();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, working_storage_section6.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:45: linkage_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_linkage_section_in_data_div_section1205);
                    linkage_section7=linkage_section();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, linkage_section7.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:63: communication_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_communication_section_in_data_div_section1209);
                    communication_section8=communication_section();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, communication_section8.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:87: screen_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_screen_section_in_data_div_section1213);
                    screen_section9=screen_section();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, screen_section9.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:293:104: report_section
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_report_section_in_data_div_section1217);
                    report_section10=report_section();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, report_section10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "data_div_section"

    public static class working_storage_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "working_storage_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:294:1: working_storage_section : WORKING_STORAGE SECTION PERIOD ( record_description_entry )* -> ^( WORKING_STORAGE ( record_description_entry )* ) ;
    public final DataDivision.working_storage_section_return working_storage_section() throws RecognitionException {
        DataDivision.working_storage_section_return retval = new DataDivision.working_storage_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORKING_STORAGE11=null;
        Token SECTION12=null;
        Token PERIOD13=null;
        DataDivision.record_description_entry_return record_description_entry14 = null;


        CommonTree WORKING_STORAGE11_tree=null;
        CommonTree SECTION12_tree=null;
        CommonTree PERIOD13_tree=null;
        RewriteRuleTokenStream stream_WORKING_STORAGE=new RewriteRuleTokenStream(adaptor,"token WORKING_STORAGE");
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_record_description_entry=new RewriteRuleSubtreeStream(adaptor,"rule record_description_entry");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:295:2: ( WORKING_STORAGE SECTION PERIOD ( record_description_entry )* -> ^( WORKING_STORAGE ( record_description_entry )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:295:4: WORKING_STORAGE SECTION PERIOD ( record_description_entry )*
            {
            WORKING_STORAGE11=(Token)match(input,WORKING_STORAGE,FOLLOW_WORKING_STORAGE_in_working_storage_section1225); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORKING_STORAGE.add(WORKING_STORAGE11);

            SECTION12=(Token)match(input,SECTION,FOLLOW_SECTION_in_working_storage_section1227); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SECTION.add(SECTION12);

            PERIOD13=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_working_storage_section1229); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD13);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:295:35: ( record_description_entry )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: record_description_entry
            	    {
            	    pushFollow(FOLLOW_record_description_entry_in_working_storage_section1231);
            	    record_description_entry14=record_description_entry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_record_description_entry.add(record_description_entry14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);



            // AST REWRITE
            // elements: record_description_entry, WORKING_STORAGE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 295:62: -> ^( WORKING_STORAGE ( record_description_entry )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:295:65: ^( WORKING_STORAGE ( record_description_entry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WORKING_STORAGE.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:295:83: ( record_description_entry )*
                while ( stream_record_description_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_record_description_entry.nextTree());

                }
                stream_record_description_entry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "working_storage_section"

    public static class linkage_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "linkage_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:296:1: linkage_section : LINKAGE SECTION PERIOD ( record_description_entry )* -> ^( LINKAGE ( record_description_entry )* ) ;
    public final DataDivision.linkage_section_return linkage_section() throws RecognitionException {
        DataDivision.linkage_section_return retval = new DataDivision.linkage_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINKAGE15=null;
        Token SECTION16=null;
        Token PERIOD17=null;
        DataDivision.record_description_entry_return record_description_entry18 = null;


        CommonTree LINKAGE15_tree=null;
        CommonTree SECTION16_tree=null;
        CommonTree PERIOD17_tree=null;
        RewriteRuleTokenStream stream_LINKAGE=new RewriteRuleTokenStream(adaptor,"token LINKAGE");
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_record_description_entry=new RewriteRuleSubtreeStream(adaptor,"rule record_description_entry");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:297:2: ( LINKAGE SECTION PERIOD ( record_description_entry )* -> ^( LINKAGE ( record_description_entry )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:297:4: LINKAGE SECTION PERIOD ( record_description_entry )*
            {
            LINKAGE15=(Token)match(input,LINKAGE,FOLLOW_LINKAGE_in_linkage_section1250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LINKAGE.add(LINKAGE15);

            SECTION16=(Token)match(input,SECTION,FOLLOW_SECTION_in_linkage_section1252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SECTION.add(SECTION16);

            PERIOD17=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_linkage_section1254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD17);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:297:27: ( record_description_entry )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WORD) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: record_description_entry
            	    {
            	    pushFollow(FOLLOW_record_description_entry_in_linkage_section1256);
            	    record_description_entry18=record_description_entry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_record_description_entry.add(record_description_entry18.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



            // AST REWRITE
            // elements: LINKAGE, record_description_entry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 297:55: -> ^( LINKAGE ( record_description_entry )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:297:58: ^( LINKAGE ( record_description_entry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_LINKAGE.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:297:68: ( record_description_entry )*
                while ( stream_record_description_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_record_description_entry.nextTree());

                }
                stream_record_description_entry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "linkage_section"

    public static class file_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:298:1: file_section : FILE SECTION PERIOD ( file_record )* -> ^( FILE ( file_record )* ) ;
    public final DataDivision.file_section_return file_section() throws RecognitionException {
        DataDivision.file_section_return retval = new DataDivision.file_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FILE19=null;
        Token SECTION20=null;
        Token PERIOD21=null;
        DataDivision.file_record_return file_record22 = null;


        CommonTree FILE19_tree=null;
        CommonTree SECTION20_tree=null;
        CommonTree PERIOD21_tree=null;
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_FILE=new RewriteRuleTokenStream(adaptor,"token FILE");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_file_record=new RewriteRuleSubtreeStream(adaptor,"rule file_record");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:302:2: ( FILE SECTION PERIOD ( file_record )* -> ^( FILE ( file_record )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:302:4: FILE SECTION PERIOD ( file_record )*
            {
            FILE19=(Token)match(input,FILE,FOLLOW_FILE_in_file_section1281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FILE.add(FILE19);

            SECTION20=(Token)match(input,SECTION,FOLLOW_SECTION_in_file_section1283); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SECTION.add(SECTION20);

            PERIOD21=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_file_section1285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD21);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:302:24: ( file_record )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=FD && LA5_0<=SD)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: file_record
            	    {
            	    pushFollow(FOLLOW_file_record_in_file_section1287);
            	    file_record22=file_record();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_file_record.add(file_record22.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: file_record, FILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 302:40: -> ^( FILE ( file_record )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:302:43: ^( FILE ( file_record )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FILE.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:302:50: ( file_record )*
                while ( stream_file_record.hasNext() ) {
                    adaptor.addChild(root_1, stream_file_record.nextTree());

                }
                stream_file_record.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "file_section"

    public static class file_record_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_record"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:303:1: file_record : file_description_entry ( record_description_entry )* -> ^( file_description_entry ( record_description_entry )* ) ;
    public final DataDivision.file_record_return file_record() throws RecognitionException {
        DataDivision.file_record_return retval = new DataDivision.file_record_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.file_description_entry_return file_description_entry23 = null;

        DataDivision.record_description_entry_return record_description_entry24 = null;


        RewriteRuleSubtreeStream stream_file_description_entry=new RewriteRuleSubtreeStream(adaptor,"rule file_description_entry");
        RewriteRuleSubtreeStream stream_record_description_entry=new RewriteRuleSubtreeStream(adaptor,"rule record_description_entry");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:304:2: ( file_description_entry ( record_description_entry )* -> ^( file_description_entry ( record_description_entry )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:304:4: file_description_entry ( record_description_entry )*
            {
            pushFollow(FOLLOW_file_description_entry_in_file_record1308);
            file_description_entry23=file_description_entry();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_file_description_entry.add(file_description_entry23.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:304:27: ( record_description_entry )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==WORD) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: record_description_entry
            	    {
            	    pushFollow(FOLLOW_record_description_entry_in_file_record1310);
            	    record_description_entry24=record_description_entry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_record_description_entry.add(record_description_entry24.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);



            // AST REWRITE
            // elements: record_description_entry, file_description_entry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 304:54: -> ^( file_description_entry ( record_description_entry )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:304:57: ^( file_description_entry ( record_description_entry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_file_description_entry.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:304:82: ( record_description_entry )*
                while ( stream_record_description_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_record_description_entry.nextTree());

                }
                stream_record_description_entry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "file_record"

    public static class file_description_entry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_description_entry"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:305:1: file_description_entry : file_type WORD ( file_clause )* PERIOD -> ^( file_type WORD ( file_clause )* ) ;
    public final DataDivision.file_description_entry_return file_description_entry() throws RecognitionException {
        DataDivision.file_description_entry_return retval = new DataDivision.file_description_entry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD26=null;
        Token PERIOD28=null;
        DataDivision.file_type_return file_type25 = null;

        DataDivision.file_clause_return file_clause27 = null;


        CommonTree WORD26_tree=null;
        CommonTree PERIOD28_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_file_clause=new RewriteRuleSubtreeStream(adaptor,"rule file_clause");
        RewriteRuleSubtreeStream stream_file_type=new RewriteRuleSubtreeStream(adaptor,"rule file_type");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:306:2: ( file_type WORD ( file_clause )* PERIOD -> ^( file_type WORD ( file_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:306:4: file_type WORD ( file_clause )* PERIOD
            {
            pushFollow(FOLLOW_file_type_in_file_description_entry1329);
            file_type25=file_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_file_type.add(file_type25.getTree());
            WORD26=(Token)match(input,WORD,FOLLOW_WORD_in_file_description_entry1331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD26);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:306:19: ( file_clause )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DATA||(LA7_0>=EXTERNAL && LA7_0<=BLOCK)||LA7_0==RECORD||(LA7_0>=LABEL && LA7_0<=VALUE)||LA7_0==LINAGE||LA7_0==CODE_SET||LA7_0==REPORT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: file_clause
            	    {
            	    pushFollow(FOLLOW_file_clause_in_file_description_entry1333);
            	    file_clause27=file_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_file_clause.add(file_clause27.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            PERIOD28=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_file_description_entry1336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD28);



            // AST REWRITE
            // elements: file_clause, WORD, file_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 306:39: -> ^( file_type WORD ( file_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:306:42: ^( file_type WORD ( file_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_file_type.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:306:59: ( file_clause )*
                while ( stream_file_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_file_clause.nextTree());

                }
                stream_file_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "file_description_entry"

    public static class file_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_type"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:307:1: file_type : ( FD | SD );
    public final DataDivision.file_type_return file_type() throws RecognitionException {
        DataDivision.file_type_return retval = new DataDivision.file_type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:307:10: ( FD | SD )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set29=(Token)input.LT(1);
            if ( (input.LA(1)>=FD && input.LA(1)<=SD) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set29));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "file_type"

    public static class file_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:308:1: file_clause : ( external | global | block | record | label | value_of | data | linage | code_set | report );
    public final DataDivision.file_clause_return file_clause() throws RecognitionException {
        DataDivision.file_clause_return retval = new DataDivision.file_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.external_return external30 = null;

        DataDivision.global_return global31 = null;

        DataDivision.block_return block32 = null;

        DataDivision.record_return record33 = null;

        DataDivision.label_return label34 = null;

        DataDivision.value_of_return value_of35 = null;

        DataDivision.data_return data36 = null;

        DataDivision.linage_return linage37 = null;

        DataDivision.code_set_return code_set38 = null;

        DataDivision.report_return report39 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:2: ( external | global | block | record | label | value_of | data | linage | code_set | report )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:4: external
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_external_in_file_clause1369);
                    external30=external();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, external30.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:15: global
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_global_in_file_clause1373);
                    global31=global();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, global31.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:24: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_block_in_file_clause1377);
                    block32=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block32.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:32: record
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_record_in_file_clause1381);
                    record33=record();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, record33.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:41: label
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_label_in_file_clause1385);
                    label34=label();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, label34.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:49: value_of
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_of_in_file_clause1389);
                    value_of35=value_of();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value_of35.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:60: data
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_data_in_file_clause1393);
                    data36=data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data36.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:67: linage
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_linage_in_file_clause1397);
                    linage37=linage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, linage37.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:76: code_set
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_code_set_in_file_clause1401);
                    code_set38=code_set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, code_set38.getTree());

                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:309:87: report
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_report_in_file_clause1405);
                    report39=report();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, report39.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class external_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "external"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:310:1: external : ( IS )? EXTERNAL -> ^( EXTERNAL ) ;
    public final DataDivision.external_return external() throws RecognitionException {
        DataDivision.external_return retval = new DataDivision.external_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS40=null;
        Token EXTERNAL41=null;

        CommonTree IS40_tree=null;
        CommonTree EXTERNAL41_tree=null;
        RewriteRuleTokenStream stream_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token EXTERNAL");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:310:9: ( ( IS )? EXTERNAL -> ^( EXTERNAL ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:310:11: ( IS )? EXTERNAL
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:310:11: ( IS )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS40=(Token)match(input,IS,FOLLOW_IS_in_external1412); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS40);


                    }
                    break;

            }

            EXTERNAL41=(Token)match(input,EXTERNAL,FOLLOW_EXTERNAL_in_external1415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EXTERNAL.add(EXTERNAL41);



            // AST REWRITE
            // elements: EXTERNAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 310:27: -> ^( EXTERNAL )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:310:30: ^( EXTERNAL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_EXTERNAL.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "external"

    public static class global_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "global"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:311:1: global : ( IS )? GLOBAL -> ^( GLOBAL ) ;
    public final DataDivision.global_return global() throws RecognitionException {
        DataDivision.global_return retval = new DataDivision.global_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS42=null;
        Token GLOBAL43=null;

        CommonTree IS42_tree=null;
        CommonTree GLOBAL43_tree=null;
        RewriteRuleTokenStream stream_GLOBAL=new RewriteRuleTokenStream(adaptor,"token GLOBAL");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:311:8: ( ( IS )? GLOBAL -> ^( GLOBAL ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:311:10: ( IS )? GLOBAL
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:311:10: ( IS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS42=(Token)match(input,IS,FOLLOW_IS_in_global1431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS42);


                    }
                    break;

            }

            GLOBAL43=(Token)match(input,GLOBAL,FOLLOW_GLOBAL_in_global1434); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GLOBAL.add(GLOBAL43);



            // AST REWRITE
            // elements: GLOBAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 311:24: -> ^( GLOBAL )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:311:27: ^( GLOBAL )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_GLOBAL.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "global"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:312:1: block : ( BLOCK ( CONTAINS )? range RECORD -> ^( BLOCK range RECORD ) | BLOCK ( CONTAINS )? range ( CHARACTERS )? -> ^( BLOCK range ) );
    public final DataDivision.block_return block() throws RecognitionException {
        DataDivision.block_return retval = new DataDivision.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BLOCK44=null;
        Token CONTAINS45=null;
        Token RECORD47=null;
        Token BLOCK48=null;
        Token CONTAINS49=null;
        Token CHARACTERS51=null;
        DataDivision.range_return range46 = null;

        DataDivision.range_return range50 = null;


        CommonTree BLOCK44_tree=null;
        CommonTree CONTAINS45_tree=null;
        CommonTree RECORD47_tree=null;
        CommonTree BLOCK48_tree=null;
        CommonTree CONTAINS49_tree=null;
        CommonTree CHARACTERS51_tree=null;
        RewriteRuleTokenStream stream_CHARACTERS=new RewriteRuleTokenStream(adaptor,"token CHARACTERS");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_BLOCK=new RewriteRuleTokenStream(adaptor,"token BLOCK");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:312:7: ( BLOCK ( CONTAINS )? range RECORD -> ^( BLOCK range RECORD ) | BLOCK ( CONTAINS )? range ( CHARACTERS )? -> ^( BLOCK range ) )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:312:9: BLOCK ( CONTAINS )? range RECORD
                    {
                    BLOCK44=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block1450); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BLOCK.add(BLOCK44);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:312:15: ( CONTAINS )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==CONTAINS) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CONTAINS
                            {
                            CONTAINS45=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_block1452); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS45);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_range_in_block1455);
                    range46=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range.add(range46.getTree());
                    RECORD47=(Token)match(input,RECORD,FOLLOW_RECORD_in_block1457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECORD.add(RECORD47);



                    // AST REWRITE
                    // elements: RECORD, range, BLOCK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 312:39: -> ^( BLOCK range RECORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:312:42: ^( BLOCK range RECORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BLOCK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_range.nextTree());
                        adaptor.addChild(root_1, stream_RECORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:313:4: BLOCK ( CONTAINS )? range ( CHARACTERS )?
                    {
                    BLOCK48=(Token)match(input,BLOCK,FOLLOW_BLOCK_in_block1473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BLOCK.add(BLOCK48);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:313:10: ( CONTAINS )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==CONTAINS) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CONTAINS
                            {
                            CONTAINS49=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_block1475); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS49);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_range_in_block1478);
                    range50=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range.add(range50.getTree());
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:313:26: ( CHARACTERS )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CHARACTERS) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CHARACTERS
                            {
                            CHARACTERS51=(Token)match(input,CHARACTERS,FOLLOW_CHARACTERS_in_block1480); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CHARACTERS.add(CHARACTERS51);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: range, BLOCK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 313:38: -> ^( BLOCK range )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:313:41: ^( BLOCK range )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BLOCK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_range.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "block"

    public static class record_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:314:1: record : ( RECORD ( CONTAINS )? range ( CHARACTERS )? -> ^( RECORD range ) | RECORD varying -> ^( RECORD varying ) );
    public final DataDivision.record_return record() throws RecognitionException {
        DataDivision.record_return retval = new DataDivision.record_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD52=null;
        Token CONTAINS53=null;
        Token CHARACTERS55=null;
        Token RECORD56=null;
        DataDivision.range_return range54 = null;

        DataDivision.varying_return varying57 = null;


        CommonTree RECORD52_tree=null;
        CommonTree CONTAINS53_tree=null;
        CommonTree CHARACTERS55_tree=null;
        CommonTree RECORD56_tree=null;
        RewriteRuleTokenStream stream_CHARACTERS=new RewriteRuleTokenStream(adaptor,"token CHARACTERS");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_CONTAINS=new RewriteRuleTokenStream(adaptor,"token CONTAINS");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        RewriteRuleSubtreeStream stream_varying=new RewriteRuleSubtreeStream(adaptor,"rule varying");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:314:8: ( RECORD ( CONTAINS )? range ( CHARACTERS )? -> ^( RECORD range ) | RECORD varying -> ^( RECORD varying ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RECORD) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==IS||LA17_1==VARYING) ) {
                    alt17=2;
                }
                else if ( (LA17_1==WORD||LA17_1==CONTAINS) ) {
                    alt17=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:314:10: RECORD ( CONTAINS )? range ( CHARACTERS )?
                    {
                    RECORD52=(Token)match(input,RECORD,FOLLOW_RECORD_in_record1496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECORD.add(RECORD52);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:314:17: ( CONTAINS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==CONTAINS) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CONTAINS
                            {
                            CONTAINS53=(Token)match(input,CONTAINS,FOLLOW_CONTAINS_in_record1498); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CONTAINS.add(CONTAINS53);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_range_in_record1501);
                    range54=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range.add(range54.getTree());
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:314:33: ( CHARACTERS )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==CHARACTERS) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CHARACTERS
                            {
                            CHARACTERS55=(Token)match(input,CHARACTERS,FOLLOW_CHARACTERS_in_record1503); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_CHARACTERS.add(CHARACTERS55);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: range, RECORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 314:45: -> ^( RECORD range )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:314:48: ^( RECORD range )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_range.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:315:4: RECORD varying
                    {
                    RECORD56=(Token)match(input,RECORD,FOLLOW_RECORD_in_record1517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECORD.add(RECORD56);

                    pushFollow(FOLLOW_varying_in_record1519);
                    varying57=varying();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varying.add(varying57.getTree());


                    // AST REWRITE
                    // elements: RECORD, varying
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 315:22: -> ^( RECORD varying )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:315:25: ^( RECORD varying )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_varying.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "record"

    public static class range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:317:1: range : (a= WORD TO b= WORD -> ^( P_PAIR $a $b) | a= WORD -> ^( P_PAIR $a) );
    public final DataDivision.range_return range() throws RecognitionException {
        DataDivision.range_return retval = new DataDivision.range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a=null;
        Token b=null;
        Token TO58=null;

        CommonTree a_tree=null;
        CommonTree b_tree=null;
        CommonTree TO58_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:317:7: (a= WORD TO b= WORD -> ^( P_PAIR $a $b) | a= WORD -> ^( P_PAIR $a) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==WORD) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==TO) ) {
                    alt18=1;
                }
                else if ( (LA18_1==EOF||(LA18_1>=TEXT && LA18_1<=PERIOD)||LA18_1==SCREEN||LA18_1==DATA||LA18_1==FILE||(LA18_1>=EXTERNAL && LA18_1<=BLOCK)||LA18_1==CHARACTERS||(LA18_1>=WORKING_STORAGE && LA18_1<=RECORD)||(LA18_1>=DEPENDING && LA18_1<=VALUE)||(LA18_1>=LINAGE && LA18_1<=BLANK)||LA18_1==JUST||(LA18_1>=OCCURS && LA18_1<=DESCENDING)||LA18_1==INDEXED||(LA18_1>=PIC && LA18_1<=RENAMES)||(LA18_1>=SIGN && LA18_1<=TRAILING)||LA18_1==SYNC||(LA18_1>=USAGE && LA18_1<=COMP_6)||(LA18_1>=DISPLAY && LA18_1<=POINTER)||(LA18_1>=COMMUNICATION && LA18_1<=MESSAGE)||LA18_1==CD||(LA18_1>=STATUS && LA18_1<=COUNT)||(LA18_1>=SOURCE && LA18_1<=DESTINATION)||(LA18_1>=ERROR && LA18_1<=TERMINAL)||LA18_1==CODE_SET||LA18_1==REPORT) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:317:9: a= WORD TO b= WORD
                    {
                    a=(Token)match(input,WORD,FOLLOW_WORD_in_range1541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(a);

                    TO58=(Token)match(input,TO,FOLLOW_TO_in_range1543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TO.add(TO58);

                    b=(Token)match(input,WORD,FOLLOW_WORD_in_range1547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(b);



                    // AST REWRITE
                    // elements: b, a
                    // token labels: b, a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 317:29: -> ^( P_PAIR $a $b)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:317:32: ^( P_PAIR $a $b)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_PAIR, "P_PAIR"), root_1);

                        adaptor.addChild(root_1, stream_a.nextNode());
                        adaptor.addChild(root_1, stream_b.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:318:4: a= WORD
                    {
                    a=(Token)match(input,WORD,FOLLOW_WORD_in_range1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(a);



                    // AST REWRITE
                    // elements: a
                    // token labels: a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 318:18: -> ^( P_PAIR $a)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:318:21: ^( P_PAIR $a)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_PAIR, "P_PAIR"), root_1);

                        adaptor.addChild(root_1, stream_a.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "range"

    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "label"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:320:1: label : ( LABEL RECORD ( IS )? STANDARD -> ^( LABEL STANDARD ) | LABEL RECORD ( IS )? OMITTED -> ^( LABEL OMITTED ) | LABEL RECORD ( IS )? WORD -> ^( LABEL WORD ) );
    public final DataDivision.label_return label() throws RecognitionException {
        DataDivision.label_return retval = new DataDivision.label_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LABEL59=null;
        Token RECORD60=null;
        Token IS61=null;
        Token STANDARD62=null;
        Token LABEL63=null;
        Token RECORD64=null;
        Token IS65=null;
        Token OMITTED66=null;
        Token LABEL67=null;
        Token RECORD68=null;
        Token IS69=null;
        Token WORD70=null;

        CommonTree LABEL59_tree=null;
        CommonTree RECORD60_tree=null;
        CommonTree IS61_tree=null;
        CommonTree STANDARD62_tree=null;
        CommonTree LABEL63_tree=null;
        CommonTree RECORD64_tree=null;
        CommonTree IS65_tree=null;
        CommonTree OMITTED66_tree=null;
        CommonTree LABEL67_tree=null;
        CommonTree RECORD68_tree=null;
        CommonTree IS69_tree=null;
        CommonTree WORD70_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_OMITTED=new RewriteRuleTokenStream(adaptor,"token OMITTED");
        RewriteRuleTokenStream stream_LABEL=new RewriteRuleTokenStream(adaptor,"token LABEL");
        RewriteRuleTokenStream stream_STANDARD=new RewriteRuleTokenStream(adaptor,"token STANDARD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:320:7: ( LABEL RECORD ( IS )? STANDARD -> ^( LABEL STANDARD ) | LABEL RECORD ( IS )? OMITTED -> ^( LABEL OMITTED ) | LABEL RECORD ( IS )? WORD -> ^( LABEL WORD ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LABEL) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RECORD) ) {
                    switch ( input.LA(3) ) {
                    case IS:
                        {
                        switch ( input.LA(4) ) {
                        case OMITTED:
                            {
                            alt22=2;
                            }
                            break;
                        case STANDARD:
                            {
                            alt22=1;
                            }
                            break;
                        case WORD:
                            {
                            alt22=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case OMITTED:
                        {
                        alt22=2;
                        }
                        break;
                    case WORD:
                        {
                        alt22=3;
                        }
                        break;
                    case STANDARD:
                        {
                        alt22=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:320:9: LABEL RECORD ( IS )? STANDARD
                    {
                    LABEL59=(Token)match(input,LABEL,FOLLOW_LABEL_in_label1595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LABEL.add(LABEL59);

                    RECORD60=(Token)match(input,RECORD,FOLLOW_RECORD_in_label1597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECORD.add(RECORD60);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:320:22: ( IS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==IS) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS61=(Token)match(input,IS,FOLLOW_IS_in_label1599); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS61);


                            }
                            break;

                    }

                    STANDARD62=(Token)match(input,STANDARD,FOLLOW_STANDARD_in_label1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STANDARD.add(STANDARD62);



                    // AST REWRITE
                    // elements: STANDARD, LABEL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 320:36: -> ^( LABEL STANDARD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:320:39: ^( LABEL STANDARD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LABEL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_STANDARD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:321:4: LABEL RECORD ( IS )? OMITTED
                    {
                    LABEL63=(Token)match(input,LABEL,FOLLOW_LABEL_in_label1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LABEL.add(LABEL63);

                    RECORD64=(Token)match(input,RECORD,FOLLOW_RECORD_in_label1618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECORD.add(RECORD64);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:321:17: ( IS )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==IS) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS65=(Token)match(input,IS,FOLLOW_IS_in_label1620); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS65);


                            }
                            break;

                    }

                    OMITTED66=(Token)match(input,OMITTED,FOLLOW_OMITTED_in_label1623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OMITTED.add(OMITTED66);



                    // AST REWRITE
                    // elements: LABEL, OMITTED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 321:30: -> ^( LABEL OMITTED )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:321:33: ^( LABEL OMITTED )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LABEL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_OMITTED.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:322:4: LABEL RECORD ( IS )? WORD
                    {
                    LABEL67=(Token)match(input,LABEL,FOLLOW_LABEL_in_label1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LABEL.add(LABEL67);

                    RECORD68=(Token)match(input,RECORD,FOLLOW_RECORD_in_label1639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RECORD.add(RECORD68);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:322:17: ( IS )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==IS) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS69=(Token)match(input,IS,FOLLOW_IS_in_label1641); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS69);


                            }
                            break;

                    }

                    WORD70=(Token)match(input,WORD,FOLLOW_WORD_in_label1644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD70);



                    // AST REWRITE
                    // elements: WORD, LABEL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 322:28: -> ^( LABEL WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:322:31: ^( LABEL WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LABEL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "label"

    public static class code_set_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "code_set"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:324:1: code_set : CODE_SET ( IS )? WORD -> ^( CODE_SET WORD ) ;
    public final DataDivision.code_set_return code_set() throws RecognitionException {
        DataDivision.code_set_return retval = new DataDivision.code_set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CODE_SET71=null;
        Token IS72=null;
        Token WORD73=null;

        CommonTree CODE_SET71_tree=null;
        CommonTree IS72_tree=null;
        CommonTree WORD73_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_CODE_SET=new RewriteRuleTokenStream(adaptor,"token CODE_SET");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:324:9: ( CODE_SET ( IS )? WORD -> ^( CODE_SET WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:324:11: CODE_SET ( IS )? WORD
            {
            CODE_SET71=(Token)match(input,CODE_SET,FOLLOW_CODE_SET_in_code_set1662); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CODE_SET.add(CODE_SET71);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:324:20: ( IS )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS72=(Token)match(input,IS,FOLLOW_IS_in_code_set1664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS72);


                    }
                    break;

            }

            WORD73=(Token)match(input,WORD,FOLLOW_WORD_in_code_set1667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD73);



            // AST REWRITE
            // elements: WORD, CODE_SET
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 324:31: -> ^( CODE_SET WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:324:34: ^( CODE_SET WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CODE_SET.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "code_set"

    public static class report_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:325:1: report : REPORT ( IS )? ( WORD )+ -> ^( REPORT ( WORD )+ ) ;
    public final DataDivision.report_return report() throws RecognitionException {
        DataDivision.report_return retval = new DataDivision.report_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REPORT74=null;
        Token IS75=null;
        Token WORD76=null;

        CommonTree REPORT74_tree=null;
        CommonTree IS75_tree=null;
        CommonTree WORD76_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_REPORT=new RewriteRuleTokenStream(adaptor,"token REPORT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:325:8: ( REPORT ( IS )? ( WORD )+ -> ^( REPORT ( WORD )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:325:10: REPORT ( IS )? ( WORD )+
            {
            REPORT74=(Token)match(input,REPORT,FOLLOW_REPORT_in_report1685); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REPORT.add(REPORT74);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:325:17: ( IS )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IS) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS75=(Token)match(input,IS,FOLLOW_IS_in_report1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS75);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:325:21: ( WORD )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==WORD) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: WORD
            	    {
            	    WORD76=(Token)match(input,WORD,FOLLOW_WORD_in_report1690); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_WORD.add(WORD76);


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);



            // AST REWRITE
            // elements: REPORT, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 325:29: -> ^( REPORT ( WORD )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:325:32: ^( REPORT ( WORD )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_REPORT.nextNode(), root_1);

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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report"

    public static class value_of_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value_of"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:326:1: value_of : VALUE OF ( value_is )+ -> ^( VALUE ( value_is )+ ) ;
    public final DataDivision.value_of_return value_of() throws RecognitionException {
        DataDivision.value_of_return retval = new DataDivision.value_of_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VALUE77=null;
        Token OF78=null;
        DataDivision.value_is_return value_is79 = null;


        CommonTree VALUE77_tree=null;
        CommonTree OF78_tree=null;
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_value_is=new RewriteRuleSubtreeStream(adaptor,"rule value_is");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:326:9: ( VALUE OF ( value_is )+ -> ^( VALUE ( value_is )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:326:11: VALUE OF ( value_is )+
            {
            VALUE77=(Token)match(input,VALUE,FOLLOW_VALUE_in_value_of1708); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VALUE.add(VALUE77);

            OF78=(Token)match(input,OF,FOLLOW_OF_in_value_of1710); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF78);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:326:20: ( value_is )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==WORD) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: value_is
            	    {
            	    pushFollow(FOLLOW_value_is_in_value_of1712);
            	    value_is79=value_is();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_value_is.add(value_is79.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);



            // AST REWRITE
            // elements: value_is, VALUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 326:32: -> ^( VALUE ( value_is )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:326:35: ^( VALUE ( value_is )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_VALUE.nextNode(), root_1);

                if ( !(stream_value_is.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_value_is.hasNext() ) {
                    adaptor.addChild(root_1, stream_value_is.nextTree());

                }
                stream_value_is.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "value_of"

    public static class value_is_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value_is"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:327:1: value_is : a= WORD ( IS )? b= data_or_literal -> ^( P_PAIR $a $b) ;
    public final DataDivision.value_is_return value_is() throws RecognitionException {
        DataDivision.value_is_return retval = new DataDivision.value_is_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token a=null;
        Token IS80=null;
        DataDivision.data_or_literal_return b = null;


        CommonTree a_tree=null;
        CommonTree IS80_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_data_or_literal=new RewriteRuleSubtreeStream(adaptor,"rule data_or_literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:327:9: (a= WORD ( IS )? b= data_or_literal -> ^( P_PAIR $a $b) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:327:11: a= WORD ( IS )? b= data_or_literal
            {
            a=(Token)match(input,WORD,FOLLOW_WORD_in_value_is1735); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(a);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:327:18: ( IS )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS80=(Token)match(input,IS,FOLLOW_IS_in_value_is1737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS80);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_or_literal_in_value_is1742);
            b=data_or_literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_or_literal.add(b.getTree());


            // AST REWRITE
            // elements: a, b
            // token labels: a
            // rule labels: retval, b
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 327:41: -> ^( P_PAIR $a $b)
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:327:44: ^( P_PAIR $a $b)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_PAIR, "P_PAIR"), root_1);

                adaptor.addChild(root_1, stream_a.nextNode());
                adaptor.addChild(root_1, stream_b.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "value_is"

    public static class data_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:328:1: data : DATA RECORD ( IS )? ( data_name )+ -> ^( P_DATA_RECORD ( data_name )+ ) ;
    public final DataDivision.data_return data() throws RecognitionException {
        DataDivision.data_return retval = new DataDivision.data_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DATA81=null;
        Token RECORD82=null;
        Token IS83=null;
        DataDivision.data_name_return data_name84 = null;


        CommonTree DATA81_tree=null;
        CommonTree RECORD82_tree=null;
        CommonTree IS83_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:328:6: ( DATA RECORD ( IS )? ( data_name )+ -> ^( P_DATA_RECORD ( data_name )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:328:8: DATA RECORD ( IS )? ( data_name )+
            {
            DATA81=(Token)match(input,DATA,FOLLOW_DATA_in_data1762); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATA.add(DATA81);

            RECORD82=(Token)match(input,RECORD,FOLLOW_RECORD_in_data1764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD82);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:328:20: ( IS )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IS) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS83=(Token)match(input,IS,FOLLOW_IS_in_data1766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS83);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:328:24: ( data_name )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==WORD) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
            	    {
            	    pushFollow(FOLLOW_data_name_in_data1769);
            	    data_name84=data_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_name.add(data_name84.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);



            // AST REWRITE
            // elements: data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 328:36: -> ^( P_DATA_RECORD ( data_name )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:328:39: ^( P_DATA_RECORD ( data_name )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_DATA_RECORD, "P_DATA_RECORD"), root_1);

                if ( !(stream_data_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_data_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_name.nextTree());

                }
                stream_data_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "data"

    public static class linage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "linage"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:1: linage : LINAGE ( IS )? WORD ( LINE )? ( footing )? ( top )? ( bottom )? -> ^( LINAGE WORD ( footing )? ( top )? ( bottom )? ) ;
    public final DataDivision.linage_return linage() throws RecognitionException {
        DataDivision.linage_return retval = new DataDivision.linage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINAGE85=null;
        Token IS86=null;
        Token WORD87=null;
        Token LINE88=null;
        DataDivision.footing_return footing89 = null;

        DataDivision.top_return top90 = null;

        DataDivision.bottom_return bottom91 = null;


        CommonTree LINAGE85_tree=null;
        CommonTree IS86_tree=null;
        CommonTree WORD87_tree=null;
        CommonTree LINE88_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_LINAGE=new RewriteRuleTokenStream(adaptor,"token LINAGE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
        RewriteRuleSubtreeStream stream_bottom=new RewriteRuleSubtreeStream(adaptor,"rule bottom");
        RewriteRuleSubtreeStream stream_footing=new RewriteRuleSubtreeStream(adaptor,"rule footing");
        RewriteRuleSubtreeStream stream_top=new RewriteRuleSubtreeStream(adaptor,"rule top");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:8: ( LINAGE ( IS )? WORD ( LINE )? ( footing )? ( top )? ( bottom )? -> ^( LINAGE WORD ( footing )? ( top )? ( bottom )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:10: LINAGE ( IS )? WORD ( LINE )? ( footing )? ( top )? ( bottom )?
            {
            LINAGE85=(Token)match(input,LINAGE,FOLLOW_LINAGE_in_linage1787); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LINAGE.add(LINAGE85);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:17: ( IS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IS) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS86=(Token)match(input,IS,FOLLOW_IS_in_linage1789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS86);


                    }
                    break;

            }

            WORD87=(Token)match(input,WORD,FOLLOW_WORD_in_linage1792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD87);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:26: ( LINE )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LINE) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred45_DataDivision()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: LINE
                    {
                    LINE88=(Token)match(input,LINE,FOLLOW_LINE_in_linage1794); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LINE.add(LINE88);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:32: ( footing )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==FOOTING||LA32_0==WITH) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: footing
                    {
                    pushFollow(FOLLOW_footing_in_linage1797);
                    footing89=footing();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_footing.add(footing89.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:41: ( top )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case LINE:
                    {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==AT) ) {
                        int LA33_2 = input.LA(3);

                        if ( (LA33_2==TOP) ) {
                            alt33=1;
                        }
                    }
                    else if ( (LA33_1==TOP) ) {
                        alt33=1;
                    }
                    }
                    break;
                case AT:
                    {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==TOP) ) {
                        alt33=1;
                    }
                    }
                    break;
                case TOP:
                    {
                    alt33=1;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: top
                    {
                    pushFollow(FOLLOW_top_in_linage1800);
                    top90=top();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_top.add(top90.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:46: ( bottom )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LINE||(LA34_0>=BOTTOM && LA34_0<=AT)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: bottom
                    {
                    pushFollow(FOLLOW_bottom_in_linage1803);
                    bottom91=bottom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bottom.add(bottom91.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: bottom, LINAGE, footing, top, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 329:54: -> ^( LINAGE WORD ( footing )? ( top )? ( bottom )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:57: ^( LINAGE WORD ( footing )? ( top )? ( bottom )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_LINAGE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:71: ( footing )?
                if ( stream_footing.hasNext() ) {
                    adaptor.addChild(root_1, stream_footing.nextTree());

                }
                stream_footing.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:80: ( top )?
                if ( stream_top.hasNext() ) {
                    adaptor.addChild(root_1, stream_top.nextTree());

                }
                stream_top.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:85: ( bottom )?
                if ( stream_bottom.hasNext() ) {
                    adaptor.addChild(root_1, stream_bottom.nextTree());

                }
                stream_bottom.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "linage"

    public static class varying_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varying"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:1: varying : ( IS )? VARYING ( IN )? ( SIZE )? ( from )? ( to )? ( CHARACTERS )? ( depending )? -> ^( VARYING ( from )? ( to )? ( depending )? ) ;
    public final DataDivision.varying_return varying() throws RecognitionException {
        DataDivision.varying_return retval = new DataDivision.varying_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS92=null;
        Token VARYING93=null;
        Token IN94=null;
        Token SIZE95=null;
        Token CHARACTERS98=null;
        DataDivision.from_return from96 = null;

        DataDivision.to_return to97 = null;

        DataDivision.depending_return depending99 = null;


        CommonTree IS92_tree=null;
        CommonTree VARYING93_tree=null;
        CommonTree IN94_tree=null;
        CommonTree SIZE95_tree=null;
        CommonTree CHARACTERS98_tree=null;
        RewriteRuleTokenStream stream_CHARACTERS=new RewriteRuleTokenStream(adaptor,"token CHARACTERS");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_VARYING=new RewriteRuleTokenStream(adaptor,"token VARYING");
        RewriteRuleTokenStream stream_SIZE=new RewriteRuleTokenStream(adaptor,"token SIZE");
        RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to");
        RewriteRuleSubtreeStream stream_depending=new RewriteRuleSubtreeStream(adaptor,"rule depending");
        RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:9: ( ( IS )? VARYING ( IN )? ( SIZE )? ( from )? ( to )? ( CHARACTERS )? ( depending )? -> ^( VARYING ( from )? ( to )? ( depending )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:11: ( IS )? VARYING ( IN )? ( SIZE )? ( from )? ( to )? ( CHARACTERS )? ( depending )?
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:11: ( IS )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IS) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS92=(Token)match(input,IS,FOLLOW_IS_in_varying1828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS92);


                    }
                    break;

            }

            VARYING93=(Token)match(input,VARYING,FOLLOW_VARYING_in_varying1831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARYING.add(VARYING93);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:23: ( IN )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==IN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IN
                    {
                    IN94=(Token)match(input,IN,FOLLOW_IN_in_varying1833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN94);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:27: ( SIZE )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==SIZE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SIZE
                    {
                    SIZE95=(Token)match(input,SIZE,FOLLOW_SIZE_in_varying1836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZE.add(SIZE95);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:33: ( from )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==WORD||LA38_0==FROM) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: from
                    {
                    pushFollow(FOLLOW_from_in_varying1839);
                    from96=from();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_from.add(from96.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:39: ( to )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==TO) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: to
                    {
                    pushFollow(FOLLOW_to_in_varying1842);
                    to97=to();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_to.add(to97.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:43: ( CHARACTERS )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==CHARACTERS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CHARACTERS
                    {
                    CHARACTERS98=(Token)match(input,CHARACTERS,FOLLOW_CHARACTERS_in_varying1845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTERS.add(CHARACTERS98);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:55: ( depending )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DEPENDING) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: depending
                    {
                    pushFollow(FOLLOW_depending_in_varying1848);
                    depending99=depending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_depending.add(depending99.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: depending, VARYING, to, from
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 330:66: -> ^( VARYING ( from )? ( to )? ( depending )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:69: ^( VARYING ( from )? ( to )? ( depending )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_VARYING.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:79: ( from )?
                if ( stream_from.hasNext() ) {
                    adaptor.addChild(root_1, stream_from.nextTree());

                }
                stream_from.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:85: ( to )?
                if ( stream_to.hasNext() ) {
                    adaptor.addChild(root_1, stream_to.nextTree());

                }
                stream_to.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:330:89: ( depending )?
                if ( stream_depending.hasNext() ) {
                    adaptor.addChild(root_1, stream_depending.nextTree());

                }
                stream_depending.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "varying"

    public static class from_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "from"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:331:1: from : ( FROM )? WORD -> ^( P_FROM WORD ) ;
    public final DataDivision.from_return from() throws RecognitionException {
        DataDivision.from_return retval = new DataDivision.from_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FROM100=null;
        Token WORD101=null;

        CommonTree FROM100_tree=null;
        CommonTree WORD101_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:331:6: ( ( FROM )? WORD -> ^( P_FROM WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:331:8: ( FROM )? WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:331:8: ( FROM )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==FROM) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: FROM
                    {
                    FROM100=(Token)match(input,FROM,FOLLOW_FROM_in_from1871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(FROM100);


                    }
                    break;

            }

            WORD101=(Token)match(input,WORD,FOLLOW_WORD_in_from1874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD101);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 331:23: -> ^( P_FROM WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:331:26: ^( P_FROM WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_FROM, "P_FROM"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "from"

    public static class to_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "to"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:332:1: to : TO WORD -> ^( TO WORD ) ;
    public final DataDivision.to_return to() throws RecognitionException {
        DataDivision.to_return retval = new DataDivision.to_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TO102=null;
        Token WORD103=null;

        CommonTree TO102_tree=null;
        CommonTree WORD103_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:332:4: ( TO WORD -> ^( TO WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:332:6: TO WORD
            {
            TO102=(Token)match(input,TO,FOLLOW_TO_in_to1893); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TO.add(TO102);

            WORD103=(Token)match(input,WORD,FOLLOW_WORD_in_to1895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD103);



            // AST REWRITE
            // elements: WORD, TO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 332:19: -> ^( TO WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:332:22: ^( TO WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TO.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "to"

    public static class depending_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "depending"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:333:1: depending : DEPENDING ( ON )? data_name -> ^( DEPENDING data_name ) ;
    public final DataDivision.depending_return depending() throws RecognitionException {
        DataDivision.depending_return retval = new DataDivision.depending_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEPENDING104=null;
        Token ON105=null;
        DataDivision.data_name_return data_name106 = null;


        CommonTree DEPENDING104_tree=null;
        CommonTree ON105_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_DEPENDING=new RewriteRuleTokenStream(adaptor,"token DEPENDING");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:334:2: ( DEPENDING ( ON )? data_name -> ^( DEPENDING data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:334:4: DEPENDING ( ON )? data_name
            {
            DEPENDING104=(Token)match(input,DEPENDING,FOLLOW_DEPENDING_in_depending1916); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEPENDING.add(DEPENDING104);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:334:14: ( ON )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ON) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: ON
                    {
                    ON105=(Token)match(input,ON,FOLLOW_ON_in_depending1918); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ON.add(ON105);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_depending1921);
            data_name106=data_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_name.add(data_name106.getTree());


            // AST REWRITE
            // elements: DEPENDING, data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 334:31: -> ^( DEPENDING data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:334:34: ^( DEPENDING data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_DEPENDING.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "depending"

    public static class footing_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "footing"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:335:1: footing : ( WITH )? FOOTING ( AT )? data_or_literal -> ^( FOOTING data_or_literal ) ;
    public final DataDivision.footing_return footing() throws RecognitionException {
        DataDivision.footing_return retval = new DataDivision.footing_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH107=null;
        Token FOOTING108=null;
        Token AT109=null;
        DataDivision.data_or_literal_return data_or_literal110 = null;


        CommonTree WITH107_tree=null;
        CommonTree FOOTING108_tree=null;
        CommonTree AT109_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_FOOTING=new RewriteRuleTokenStream(adaptor,"token FOOTING");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_data_or_literal=new RewriteRuleSubtreeStream(adaptor,"rule data_or_literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:335:9: ( ( WITH )? FOOTING ( AT )? data_or_literal -> ^( FOOTING data_or_literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:335:11: ( WITH )? FOOTING ( AT )? data_or_literal
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:335:11: ( WITH )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==WITH) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: WITH
                    {
                    WITH107=(Token)match(input,WITH,FOLLOW_WITH_in_footing1940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WITH.add(WITH107);


                    }
                    break;

            }

            FOOTING108=(Token)match(input,FOOTING,FOLLOW_FOOTING_in_footing1943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOOTING.add(FOOTING108);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:335:25: ( AT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: AT
                    {
                    AT109=(Token)match(input,AT,FOLLOW_AT_in_footing1945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT109);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_or_literal_in_footing1948);
            data_or_literal110=data_or_literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_or_literal.add(data_or_literal110.getTree());


            // AST REWRITE
            // elements: data_or_literal, FOOTING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 335:46: -> ^( FOOTING data_or_literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:335:49: ^( FOOTING data_or_literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FOOTING.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_or_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "footing"

    public static class top_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "top"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:336:1: top : ( LINE )? ( AT )? TOP data_or_literal -> ^( TOP data_or_literal ) ;
    public final DataDivision.top_return top() throws RecognitionException {
        DataDivision.top_return retval = new DataDivision.top_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINE111=null;
        Token AT112=null;
        Token TOP113=null;
        DataDivision.data_or_literal_return data_or_literal114 = null;


        CommonTree LINE111_tree=null;
        CommonTree AT112_tree=null;
        CommonTree TOP113_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_TOP=new RewriteRuleTokenStream(adaptor,"token TOP");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
        RewriteRuleSubtreeStream stream_data_or_literal=new RewriteRuleSubtreeStream(adaptor,"rule data_or_literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:336:5: ( ( LINE )? ( AT )? TOP data_or_literal -> ^( TOP data_or_literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:336:7: ( LINE )? ( AT )? TOP data_or_literal
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:336:7: ( LINE )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LINE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: LINE
                    {
                    LINE111=(Token)match(input,LINE,FOLLOW_LINE_in_top1964); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LINE.add(LINE111);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:336:13: ( AT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==AT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: AT
                    {
                    AT112=(Token)match(input,AT,FOLLOW_AT_in_top1967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT112);


                    }
                    break;

            }

            TOP113=(Token)match(input,TOP,FOLLOW_TOP_in_top1970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TOP.add(TOP113);

            pushFollow(FOLLOW_data_or_literal_in_top1972);
            data_or_literal114=data_or_literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_or_literal.add(data_or_literal114.getTree());


            // AST REWRITE
            // elements: TOP, data_or_literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 336:39: -> ^( TOP data_or_literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:336:42: ^( TOP data_or_literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TOP.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_or_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "top"

    public static class bottom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bottom"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:337:1: bottom : ( LINE )? ( AT )? BOTTOM data_or_literal -> ^( BOTTOM data_or_literal ) ;
    public final DataDivision.bottom_return bottom() throws RecognitionException {
        DataDivision.bottom_return retval = new DataDivision.bottom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINE115=null;
        Token AT116=null;
        Token BOTTOM117=null;
        DataDivision.data_or_literal_return data_or_literal118 = null;


        CommonTree LINE115_tree=null;
        CommonTree AT116_tree=null;
        CommonTree BOTTOM117_tree=null;
        RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
        RewriteRuleTokenStream stream_BOTTOM=new RewriteRuleTokenStream(adaptor,"token BOTTOM");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
        RewriteRuleSubtreeStream stream_data_or_literal=new RewriteRuleSubtreeStream(adaptor,"rule data_or_literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:337:8: ( ( LINE )? ( AT )? BOTTOM data_or_literal -> ^( BOTTOM data_or_literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:337:10: ( LINE )? ( AT )? BOTTOM data_or_literal
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:337:10: ( LINE )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LINE) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: LINE
                    {
                    LINE115=(Token)match(input,LINE,FOLLOW_LINE_in_bottom1989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LINE.add(LINE115);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:337:16: ( AT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==AT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: AT
                    {
                    AT116=(Token)match(input,AT,FOLLOW_AT_in_bottom1992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AT.add(AT116);


                    }
                    break;

            }

            BOTTOM117=(Token)match(input,BOTTOM,FOLLOW_BOTTOM_in_bottom1995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BOTTOM.add(BOTTOM117);

            pushFollow(FOLLOW_data_or_literal_in_bottom1997);
            data_or_literal118=data_or_literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_or_literal.add(data_or_literal118.getTree());


            // AST REWRITE
            // elements: BOTTOM, data_or_literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 337:44: -> ^( BOTTOM data_or_literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:337:47: ^( BOTTOM data_or_literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_BOTTOM.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_or_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "bottom"

    public static class record_description_entry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_description_entry"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:342:1: record_description_entry : level= WORD (name= WORD )? ( record_clause )* PERIOD -> ^( P_RECORD $level ( $name)? ( record_clause )* ) ;
    public final DataDivision.record_description_entry_return record_description_entry() throws RecognitionException {
        DataDivision.record_description_entry_return retval = new DataDivision.record_description_entry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token level=null;
        Token name=null;
        Token PERIOD120=null;
        DataDivision.record_clause_return record_clause119 = null;


        CommonTree level_tree=null;
        CommonTree name_tree=null;
        CommonTree PERIOD120_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_record_clause=new RewriteRuleSubtreeStream(adaptor,"rule record_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:2: (level= WORD (name= WORD )? ( record_clause )* PERIOD -> ^( P_RECORD $level ( $name)? ( record_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:4: level= WORD (name= WORD )? ( record_clause )* PERIOD
            {
            level=(Token)match(input,WORD,FOLLOW_WORD_in_record_description_entry2020); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(level);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:19: (name= WORD )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==WORD) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: name= WORD
                    {
                    name=(Token)match(input,WORD,FOLLOW_WORD_in_record_description_entry2024); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(name);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:26: ( record_clause )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=EXTERNAL && LA51_0<=IS)||LA51_0==VALUE||LA51_0==BLANK||LA51_0==JUST||LA51_0==OCCURS||(LA51_0>=PIC && LA51_0<=RENAMES)||(LA51_0>=SIGN && LA51_0<=TRAILING)||LA51_0==SYNC||(LA51_0>=USAGE && LA51_0<=COMP_6)||(LA51_0>=DISPLAY && LA51_0<=POINTER)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: record_clause
            	    {
            	    pushFollow(FOLLOW_record_clause_in_record_description_entry2027);
            	    record_clause119=record_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_record_clause.add(record_clause119.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            PERIOD120=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_record_description_entry2030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD120);



            // AST REWRITE
            // elements: name, record_clause, level
            // token labels: level, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_level=new RewriteRuleTokenStream(adaptor,"token level",level);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:48: -> ^( P_RECORD $level ( $name)? ( record_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:51: ^( P_RECORD $level ( $name)? ( record_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_RECORD, "P_RECORD"), root_1);

                adaptor.addChild(root_1, stream_level.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:69: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:343:76: ( record_clause )*
                while ( stream_record_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_record_clause.nextTree());

                }
                stream_record_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "record_description_entry"

    public static class record_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "record_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:345:1: record_clause : ( renames | redefines | blank_zero | external | global | justified | occurs | picture | sign | sync | usage | value );
    public final DataDivision.record_clause_return record_clause() throws RecognitionException {
        DataDivision.record_clause_return retval = new DataDivision.record_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.renames_return renames121 = null;

        DataDivision.redefines_return redefines122 = null;

        DataDivision.blank_zero_return blank_zero123 = null;

        DataDivision.external_return external124 = null;

        DataDivision.global_return global125 = null;

        DataDivision.justified_return justified126 = null;

        DataDivision.occurs_return occurs127 = null;

        DataDivision.picture_return picture128 = null;

        DataDivision.sign_return sign129 = null;

        DataDivision.sync_return sync130 = null;

        DataDivision.usage_return usage131 = null;

        DataDivision.value_return value132 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:2: ( renames | redefines | blank_zero | external | global | justified | occurs | picture | sign | sync | usage | value )
            int alt52=12;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:4: renames
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_renames_in_record_clause2055);
                    renames121=renames();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, renames121.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:14: redefines
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_redefines_in_record_clause2059);
                    redefines122=redefines();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, redefines122.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:26: blank_zero
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blank_zero_in_record_clause2063);
                    blank_zero123=blank_zero();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blank_zero123.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:39: external
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_external_in_record_clause2067);
                    external124=external();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, external124.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:50: global
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_global_in_record_clause2071);
                    global125=global();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, global125.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:59: justified
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_justified_in_record_clause2075);
                    justified126=justified();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, justified126.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:71: occurs
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_occurs_in_record_clause2079);
                    occurs127=occurs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, occurs127.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:80: picture
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_picture_in_record_clause2083);
                    picture128=picture();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, picture128.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:90: sign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sign_in_record_clause2087);
                    sign129=sign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sign129.getTree());

                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:97: sync
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sync_in_record_clause2091);
                    sync130=sync();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sync130.getTree());

                    }
                    break;
                case 11 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:104: usage
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_usage_in_record_clause2095);
                    usage131=usage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usage131.getTree());

                    }
                    break;
                case 12 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:346:112: value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_in_record_clause2099);
                    value132=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value132.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "record_clause"

    public static class blank_zero_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blank_zero"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:347:1: blank_zero : BLANK ( WHEN )? ZERO -> ^( BLANK ZERO ) ;
    public final DataDivision.blank_zero_return blank_zero() throws RecognitionException {
        DataDivision.blank_zero_return retval = new DataDivision.blank_zero_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BLANK133=null;
        Token WHEN134=null;
        Token ZERO135=null;

        CommonTree BLANK133_tree=null;
        CommonTree WHEN134_tree=null;
        CommonTree ZERO135_tree=null;
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_BLANK=new RewriteRuleTokenStream(adaptor,"token BLANK");
        RewriteRuleTokenStream stream_ZERO=new RewriteRuleTokenStream(adaptor,"token ZERO");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:348:2: ( BLANK ( WHEN )? ZERO -> ^( BLANK ZERO ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:348:4: BLANK ( WHEN )? ZERO
            {
            BLANK133=(Token)match(input,BLANK,FOLLOW_BLANK_in_blank_zero2107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BLANK.add(BLANK133);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:348:10: ( WHEN )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==WHEN) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: WHEN
                    {
                    WHEN134=(Token)match(input,WHEN,FOLLOW_WHEN_in_blank_zero2109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHEN.add(WHEN134);


                    }
                    break;

            }

            ZERO135=(Token)match(input,ZERO,FOLLOW_ZERO_in_blank_zero2112); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ZERO.add(ZERO135);



            // AST REWRITE
            // elements: BLANK, ZERO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 348:24: -> ^( BLANK ZERO )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:348:27: ^( BLANK ZERO )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_BLANK.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ZERO.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "blank_zero"

    public static class justified_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "justified"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:349:1: justified : JUST ( RIGHT )? -> ^( JUST ) ;
    public final DataDivision.justified_return justified() throws RecognitionException {
        DataDivision.justified_return retval = new DataDivision.justified_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JUST136=null;
        Token RIGHT137=null;

        CommonTree JUST136_tree=null;
        CommonTree RIGHT137_tree=null;
        RewriteRuleTokenStream stream_JUST=new RewriteRuleTokenStream(adaptor,"token JUST");
        RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:350:2: ( JUST ( RIGHT )? -> ^( JUST ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:350:4: JUST ( RIGHT )?
            {
            JUST136=(Token)match(input,JUST,FOLLOW_JUST_in_justified2131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_JUST.add(JUST136);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:350:9: ( RIGHT )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RIGHT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: RIGHT
                    {
                    RIGHT137=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_justified2133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT.add(RIGHT137);


                    }
                    break;

            }



            // AST REWRITE
            // elements: JUST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 350:20: -> ^( JUST )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:350:23: ^( JUST )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_JUST.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "justified"

    public static class occurs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "occurs"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:1: occurs : OCCURS range ( TIMES )? ( depending )? ( order )* ( indexed )? -> ^( OCCURS range ( depending )? ( order )* ( indexed )? ) ;
    public final DataDivision.occurs_return occurs() throws RecognitionException {
        DataDivision.occurs_return retval = new DataDivision.occurs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OCCURS138=null;
        Token TIMES140=null;
        DataDivision.range_return range139 = null;

        DataDivision.depending_return depending141 = null;

        DataDivision.order_return order142 = null;

        DataDivision.indexed_return indexed143 = null;


        CommonTree OCCURS138_tree=null;
        CommonTree TIMES140_tree=null;
        RewriteRuleTokenStream stream_TIMES=new RewriteRuleTokenStream(adaptor,"token TIMES");
        RewriteRuleTokenStream stream_OCCURS=new RewriteRuleTokenStream(adaptor,"token OCCURS");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        RewriteRuleSubtreeStream stream_order=new RewriteRuleSubtreeStream(adaptor,"rule order");
        RewriteRuleSubtreeStream stream_indexed=new RewriteRuleSubtreeStream(adaptor,"rule indexed");
        RewriteRuleSubtreeStream stream_depending=new RewriteRuleSubtreeStream(adaptor,"rule depending");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:8: ( OCCURS range ( TIMES )? ( depending )? ( order )* ( indexed )? -> ^( OCCURS range ( depending )? ( order )* ( indexed )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:10: OCCURS range ( TIMES )? ( depending )? ( order )* ( indexed )?
            {
            OCCURS138=(Token)match(input,OCCURS,FOLLOW_OCCURS_in_occurs2152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OCCURS.add(OCCURS138);

            pushFollow(FOLLOW_range_in_occurs2154);
            range139=range();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_range.add(range139.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:23: ( TIMES )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==TIMES) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: TIMES
                    {
                    TIMES140=(Token)match(input,TIMES,FOLLOW_TIMES_in_occurs2156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TIMES.add(TIMES140);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:30: ( depending )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==DEPENDING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: depending
                    {
                    pushFollow(FOLLOW_depending_in_occurs2159);
                    depending141=depending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_depending.add(depending141.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:41: ( order )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=ASCENDING && LA57_0<=DESCENDING)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: order
            	    {
            	    pushFollow(FOLLOW_order_in_occurs2162);
            	    order142=order();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_order.add(order142.getTree());

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:48: ( indexed )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==INDEXED) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: indexed
                    {
                    pushFollow(FOLLOW_indexed_in_occurs2165);
                    indexed143=indexed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexed.add(indexed143.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: indexed, OCCURS, range, depending, order
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 351:58: -> ^( OCCURS range ( depending )? ( order )* ( indexed )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:61: ^( OCCURS range ( depending )? ( order )* ( indexed )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_OCCURS.nextNode(), root_1);

                adaptor.addChild(root_1, stream_range.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:76: ( depending )?
                if ( stream_depending.hasNext() ) {
                    adaptor.addChild(root_1, stream_depending.nextTree());

                }
                stream_depending.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:87: ( order )*
                while ( stream_order.hasNext() ) {
                    adaptor.addChild(root_1, stream_order.nextTree());

                }
                stream_order.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:351:94: ( indexed )?
                if ( stream_indexed.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexed.nextTree());

                }
                stream_indexed.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "occurs"

    public static class order_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "order"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:1: order : ( ASCENDING ( KEY )? ( IS )? ( data_name )+ -> ^( ASCENDING ( data_name )+ ) | DESCENDING ( KEY )? ( IS )? ( data_name )+ -> ^( DESCENDING ( data_name )+ ) );
    public final DataDivision.order_return order() throws RecognitionException {
        DataDivision.order_return retval = new DataDivision.order_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASCENDING144=null;
        Token KEY145=null;
        Token IS146=null;
        Token DESCENDING148=null;
        Token KEY149=null;
        Token IS150=null;
        DataDivision.data_name_return data_name147 = null;

        DataDivision.data_name_return data_name151 = null;


        CommonTree ASCENDING144_tree=null;
        CommonTree KEY145_tree=null;
        CommonTree IS146_tree=null;
        CommonTree DESCENDING148_tree=null;
        CommonTree KEY149_tree=null;
        CommonTree IS150_tree=null;
        RewriteRuleTokenStream stream_DESCENDING=new RewriteRuleTokenStream(adaptor,"token DESCENDING");
        RewriteRuleTokenStream stream_ASCENDING=new RewriteRuleTokenStream(adaptor,"token ASCENDING");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:7: ( ASCENDING ( KEY )? ( IS )? ( data_name )+ -> ^( ASCENDING ( data_name )+ ) | DESCENDING ( KEY )? ( IS )? ( data_name )+ -> ^( DESCENDING ( data_name )+ ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ASCENDING) ) {
                alt65=1;
            }
            else if ( (LA65_0==DESCENDING) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:9: ASCENDING ( KEY )? ( IS )? ( data_name )+
                    {
                    ASCENDING144=(Token)match(input,ASCENDING,FOLLOW_ASCENDING_in_order2191); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASCENDING.add(ASCENDING144);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:20: ( KEY )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==KEY) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: KEY
                            {
                            KEY145=(Token)match(input,KEY,FOLLOW_KEY_in_order2194); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KEY.add(KEY145);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:25: ( IS )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==IS) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS146=(Token)match(input,IS,FOLLOW_IS_in_order2197); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS146);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:29: ( data_name )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==WORD) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
                    	    {
                    	    pushFollow(FOLLOW_data_name_in_order2200);
                    	    data_name147=data_name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_name.add(data_name147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);



                    // AST REWRITE
                    // elements: ASCENDING, data_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 352:42: -> ^( ASCENDING ( data_name )+ )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:352:45: ^( ASCENDING ( data_name )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ASCENDING.nextNode(), root_1);

                        if ( !(stream_data_name.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_data_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_name.nextTree());

                        }
                        stream_data_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:353:4: DESCENDING ( KEY )? ( IS )? ( data_name )+
                    {
                    DESCENDING148=(Token)match(input,DESCENDING,FOLLOW_DESCENDING_in_order2217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESCENDING.add(DESCENDING148);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:353:15: ( KEY )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==KEY) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: KEY
                            {
                            KEY149=(Token)match(input,KEY,FOLLOW_KEY_in_order2219); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KEY.add(KEY149);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:353:20: ( IS )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==IS) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS150=(Token)match(input,IS,FOLLOW_IS_in_order2222); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS150);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:353:24: ( data_name )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==WORD) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
                    	    {
                    	    pushFollow(FOLLOW_data_name_in_order2225);
                    	    data_name151=data_name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_name.add(data_name151.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);



                    // AST REWRITE
                    // elements: DESCENDING, data_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 353:37: -> ^( DESCENDING ( data_name )+ )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:353:40: ^( DESCENDING ( data_name )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DESCENDING.nextNode(), root_1);

                        if ( !(stream_data_name.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_data_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_name.nextTree());

                        }
                        stream_data_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "order"

    public static class indexed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexed"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:355:1: indexed : INDEXED ( BY )? ( data_name )+ -> ^( INDEXED ( data_name )+ ) ;
    public final DataDivision.indexed_return indexed() throws RecognitionException {
        DataDivision.indexed_return retval = new DataDivision.indexed_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDEXED152=null;
        Token BY153=null;
        DataDivision.data_name_return data_name154 = null;


        CommonTree INDEXED152_tree=null;
        CommonTree BY153_tree=null;
        RewriteRuleTokenStream stream_INDEXED=new RewriteRuleTokenStream(adaptor,"token INDEXED");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:355:9: ( INDEXED ( BY )? ( data_name )+ -> ^( INDEXED ( data_name )+ ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:355:11: INDEXED ( BY )? ( data_name )+
            {
            INDEXED152=(Token)match(input,INDEXED,FOLLOW_INDEXED_in_indexed2246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDEXED.add(INDEXED152);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:355:19: ( BY )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==BY) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: BY
                    {
                    BY153=(Token)match(input,BY,FOLLOW_BY_in_indexed2248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BY.add(BY153);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:355:23: ( data_name )+
            int cnt67=0;
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==WORD) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
            	    {
            	    pushFollow(FOLLOW_data_name_in_indexed2251);
            	    data_name154=data_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_name.add(data_name154.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);



            // AST REWRITE
            // elements: data_name, INDEXED
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 355:37: -> ^( INDEXED ( data_name )+ )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:355:40: ^( INDEXED ( data_name )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_INDEXED.nextNode(), root_1);

                if ( !(stream_data_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_data_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_name.nextTree());

                }
                stream_data_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "indexed"

    public static class picture_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "picture"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:356:1: picture : PIC ( IS )? WORD -> ^( PIC WORD ) ;
    public final DataDivision.picture_return picture() throws RecognitionException {
        DataDivision.picture_return retval = new DataDivision.picture_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PIC155=null;
        Token IS156=null;
        Token WORD157=null;

        CommonTree PIC155_tree=null;
        CommonTree IS156_tree=null;
        CommonTree WORD157_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PIC=new RewriteRuleTokenStream(adaptor,"token PIC");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:356:9: ( PIC ( IS )? WORD -> ^( PIC WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:356:11: PIC ( IS )? WORD
            {
            PIC155=(Token)match(input,PIC,FOLLOW_PIC_in_picture2272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PIC.add(PIC155);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:356:15: ( IS )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==IS) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS156=(Token)match(input,IS,FOLLOW_IS_in_picture2274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS156);


                    }
                    break;

            }

            WORD157=(Token)match(input,WORD,FOLLOW_WORD_in_picture2277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD157);



            // AST REWRITE
            // elements: WORD, PIC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 356:28: -> ^( PIC WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:356:31: ^( PIC WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PIC.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "picture"

    public static class redefines_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "redefines"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:357:1: redefines : REDEFINES data_name -> ^( REDEFINES data_name ) ;
    public final DataDivision.redefines_return redefines() throws RecognitionException {
        DataDivision.redefines_return retval = new DataDivision.redefines_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REDEFINES158=null;
        DataDivision.data_name_return data_name159 = null;


        CommonTree REDEFINES158_tree=null;
        RewriteRuleTokenStream stream_REDEFINES=new RewriteRuleTokenStream(adaptor,"token REDEFINES");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:358:2: ( REDEFINES data_name -> ^( REDEFINES data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:358:4: REDEFINES data_name
            {
            REDEFINES158=(Token)match(input,REDEFINES,FOLLOW_REDEFINES_in_redefines2297); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REDEFINES.add(REDEFINES158);

            pushFollow(FOLLOW_data_name_in_redefines2299);
            data_name159=data_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_name.add(data_name159.getTree());


            // AST REWRITE
            // elements: data_name, REDEFINES
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 358:27: -> ^( REDEFINES data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:358:30: ^( REDEFINES data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_REDEFINES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "redefines"

    public static class renames_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "renames"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:1: renames : RENAMES a= data_name ( THRU b= data_name )? -> ^( RENAMES $a ( $b)? ) ;
    public final DataDivision.renames_return renames() throws RecognitionException {
        DataDivision.renames_return retval = new DataDivision.renames_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RENAMES160=null;
        Token THRU161=null;
        DataDivision.data_name_return a = null;

        DataDivision.data_name_return b = null;


        CommonTree RENAMES160_tree=null;
        CommonTree THRU161_tree=null;
        RewriteRuleTokenStream stream_RENAMES=new RewriteRuleTokenStream(adaptor,"token RENAMES");
        RewriteRuleTokenStream stream_THRU=new RewriteRuleTokenStream(adaptor,"token THRU");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:9: ( RENAMES a= data_name ( THRU b= data_name )? -> ^( RENAMES $a ( $b)? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:11: RENAMES a= data_name ( THRU b= data_name )?
            {
            RENAMES160=(Token)match(input,RENAMES,FOLLOW_RENAMES_in_renames2317); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RENAMES.add(RENAMES160);

            pushFollow(FOLLOW_data_name_in_renames2321);
            a=data_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_name.add(a.getTree());
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:31: ( THRU b= data_name )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==THRU) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:32: THRU b= data_name
                    {
                    THRU161=(Token)match(input,THRU,FOLLOW_THRU_in_renames2324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THRU.add(THRU161);

                    pushFollow(FOLLOW_data_name_in_renames2328);
                    b=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_data_name.add(b.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: b, a, RENAMES
            // token labels: 
            // rule labels: retval, b, a
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
            RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 359:52: -> ^( RENAMES $a ( $b)? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:55: ^( RENAMES $a ( $b)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RENAMES.nextNode(), root_1);

                adaptor.addChild(root_1, stream_a.nextTree());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:359:68: ( $b)?
                if ( stream_b.hasNext() ) {
                    adaptor.addChild(root_1, stream_b.nextTree());

                }
                stream_b.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "renames"

    public static class sign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sign"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:1: sign : ( ( SIGN ( IS )? )? LEADING ( separate )? -> ^( P_SIGN LEADING ( separate )? ) | ( SIGN ( IS )? )? TRAILING ( separate )? -> ^( P_SIGN TRAILING ( separate )? ) );
    public final DataDivision.sign_return sign() throws RecognitionException {
        DataDivision.sign_return retval = new DataDivision.sign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SIGN162=null;
        Token IS163=null;
        Token LEADING164=null;
        Token SIGN166=null;
        Token IS167=null;
        Token TRAILING168=null;
        DataDivision.separate_return separate165 = null;

        DataDivision.separate_return separate169 = null;


        CommonTree SIGN162_tree=null;
        CommonTree IS163_tree=null;
        CommonTree LEADING164_tree=null;
        CommonTree SIGN166_tree=null;
        CommonTree IS167_tree=null;
        CommonTree TRAILING168_tree=null;
        RewriteRuleTokenStream stream_SIGN=new RewriteRuleTokenStream(adaptor,"token SIGN");
        RewriteRuleTokenStream stream_TRAILING=new RewriteRuleTokenStream(adaptor,"token TRAILING");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_LEADING=new RewriteRuleTokenStream(adaptor,"token LEADING");
        RewriteRuleSubtreeStream stream_separate=new RewriteRuleSubtreeStream(adaptor,"rule separate");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:6: ( ( SIGN ( IS )? )? LEADING ( separate )? -> ^( P_SIGN LEADING ( separate )? ) | ( SIGN ( IS )? )? TRAILING ( separate )? -> ^( P_SIGN TRAILING ( separate )? ) )
            int alt76=2;
            switch ( input.LA(1) ) {
            case SIGN:
                {
                switch ( input.LA(2) ) {
                case IS:
                    {
                    int LA76_4 = input.LA(3);

                    if ( (LA76_4==LEADING) ) {
                        alt76=1;
                    }
                    else if ( (LA76_4==TRAILING) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case LEADING:
                    {
                    alt76=1;
                    }
                    break;
                case TRAILING:
                    {
                    alt76=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }

                }
                break;
            case LEADING:
                {
                alt76=1;
                }
                break;
            case TRAILING:
                {
                alt76=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:8: ( SIGN ( IS )? )? LEADING ( separate )?
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:8: ( SIGN ( IS )? )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==SIGN) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:9: SIGN ( IS )?
                            {
                            SIGN162=(Token)match(input,SIGN,FOLLOW_SIGN_in_sign2352); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIGN.add(SIGN162);

                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:14: ( IS )?
                            int alt70=2;
                            int LA70_0 = input.LA(1);

                            if ( (LA70_0==IS) ) {
                                alt70=1;
                            }
                            switch (alt70) {
                                case 1 :
                                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                                    {
                                    IS163=(Token)match(input,IS,FOLLOW_IS_in_sign2354); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_IS.add(IS163);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    LEADING164=(Token)match(input,LEADING,FOLLOW_LEADING_in_sign2359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEADING.add(LEADING164);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:28: ( separate )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==SEPARATE) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: separate
                            {
                            pushFollow(FOLLOW_separate_in_sign2361);
                            separate165=separate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_separate.add(separate165.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: LEADING, separate
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 360:40: -> ^( P_SIGN LEADING ( separate )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:43: ^( P_SIGN LEADING ( separate )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_SIGN, "P_SIGN"), root_1);

                        adaptor.addChild(root_1, stream_LEADING.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:360:60: ( separate )?
                        if ( stream_separate.hasNext() ) {
                            adaptor.addChild(root_1, stream_separate.nextTree());

                        }
                        stream_separate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:4: ( SIGN ( IS )? )? TRAILING ( separate )?
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:4: ( SIGN ( IS )? )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==SIGN) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:5: SIGN ( IS )?
                            {
                            SIGN166=(Token)match(input,SIGN,FOLLOW_SIGN_in_sign2381); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SIGN.add(SIGN166);

                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:10: ( IS )?
                            int alt73=2;
                            int LA73_0 = input.LA(1);

                            if ( (LA73_0==IS) ) {
                                alt73=1;
                            }
                            switch (alt73) {
                                case 1 :
                                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                                    {
                                    IS167=(Token)match(input,IS,FOLLOW_IS_in_sign2383); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_IS.add(IS167);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    TRAILING168=(Token)match(input,TRAILING,FOLLOW_TRAILING_in_sign2388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRAILING.add(TRAILING168);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:25: ( separate )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==SEPARATE) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: separate
                            {
                            pushFollow(FOLLOW_separate_in_sign2390);
                            separate169=separate();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_separate.add(separate169.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: separate, TRAILING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 361:37: -> ^( P_SIGN TRAILING ( separate )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:40: ^( P_SIGN TRAILING ( separate )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_SIGN, "P_SIGN"), root_1);

                        adaptor.addChild(root_1, stream_TRAILING.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:361:58: ( separate )?
                        if ( stream_separate.hasNext() ) {
                            adaptor.addChild(root_1, stream_separate.nextTree());

                        }
                        stream_separate.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "sign"

    public static class separate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "separate"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:363:1: separate : SEPARATE ( CHARACTER )? -> SEPARATE ;
    public final DataDivision.separate_return separate() throws RecognitionException {
        DataDivision.separate_return retval = new DataDivision.separate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEPARATE170=null;
        Token CHARACTER171=null;

        CommonTree SEPARATE170_tree=null;
        CommonTree CHARACTER171_tree=null;
        RewriteRuleTokenStream stream_SEPARATE=new RewriteRuleTokenStream(adaptor,"token SEPARATE");
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:363:9: ( SEPARATE ( CHARACTER )? -> SEPARATE )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:363:11: SEPARATE ( CHARACTER )?
            {
            SEPARATE170=(Token)match(input,SEPARATE,FOLLOW_SEPARATE_in_separate2412); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEPARATE.add(SEPARATE170);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:363:20: ( CHARACTER )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==CHARACTER) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: CHARACTER
                    {
                    CHARACTER171=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_separate2414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER171);


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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 363:34: -> SEPARATE
            {
                adaptor.addChild(root_0, stream_SEPARATE.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class sync_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sync"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:364:1: sync : ( SYNC -> SYNC | SYNC LEFT -> ^( SYNC LEFT ) | SYNC RIGHT -> ^( SYNC RIGHT ) );
    public final DataDivision.sync_return sync() throws RecognitionException {
        DataDivision.sync_return retval = new DataDivision.sync_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYNC172=null;
        Token SYNC173=null;
        Token LEFT174=null;
        Token SYNC175=null;
        Token RIGHT176=null;

        CommonTree SYNC172_tree=null;
        CommonTree SYNC173_tree=null;
        CommonTree LEFT174_tree=null;
        CommonTree SYNC175_tree=null;
        CommonTree RIGHT176_tree=null;
        RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
        RewriteRuleTokenStream stream_SYNC=new RewriteRuleTokenStream(adaptor,"token SYNC");
        RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:364:6: ( SYNC -> SYNC | SYNC LEFT -> ^( SYNC LEFT ) | SYNC RIGHT -> ^( SYNC RIGHT ) )
            int alt78=3;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==SYNC) ) {
                switch ( input.LA(2) ) {
                case LEFT:
                    {
                    alt78=2;
                    }
                    break;
                case RIGHT:
                    {
                    alt78=3;
                    }
                    break;
                case EOF:
                case PERIOD:
                case EXTERNAL:
                case GLOBAL:
                case IS:
                case VALUE:
                case BLANK:
                case JUST:
                case OCCURS:
                case PIC:
                case REDEFINES:
                case RENAMES:
                case SIGN:
                case LEADING:
                case TRAILING:
                case SYNC:
                case USAGE:
                case BINARY:
                case COMP:
                case COMP_1:
                case COMP_2:
                case COMP_3:
                case COMP_4:
                case COMP_5:
                case COMP_6:
                case DISPLAY:
                case PACKED_DECIMAL:
                case INDEX:
                case POINTER:
                    {
                    alt78=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:364:8: SYNC
                    {
                    SYNC172=(Token)match(input,SYNC,FOLLOW_SYNC_in_sync2429); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYNC.add(SYNC172);



                    // AST REWRITE
                    // elements: SYNC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 364:18: -> SYNC
                    {
                        adaptor.addChild(root_0, stream_SYNC.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:365:4: SYNC LEFT
                    {
                    SYNC173=(Token)match(input,SYNC,FOLLOW_SYNC_in_sync2443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYNC.add(SYNC173);

                    LEFT174=(Token)match(input,LEFT,FOLLOW_LEFT_in_sync2445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT.add(LEFT174);



                    // AST REWRITE
                    // elements: SYNC, LEFT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 365:18: -> ^( SYNC LEFT )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:365:21: ^( SYNC LEFT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SYNC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_LEFT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:366:4: SYNC RIGHT
                    {
                    SYNC175=(Token)match(input,SYNC,FOLLOW_SYNC_in_sync2462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYNC.add(SYNC175);

                    RIGHT176=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_sync2464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT.add(RIGHT176);



                    // AST REWRITE
                    // elements: SYNC, RIGHT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 366:19: -> ^( SYNC RIGHT )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:366:22: ^( SYNC RIGHT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SYNC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_RIGHT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "sync"

    public static class usage_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "usage"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:1: usage : ( USAGE ( IS )? )? use -> ^( P_USAGE use ) ;
    public final DataDivision.usage_return usage() throws RecognitionException {
        DataDivision.usage_return retval = new DataDivision.usage_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token USAGE177=null;
        Token IS178=null;
        DataDivision.use_return use179 = null;


        CommonTree USAGE177_tree=null;
        CommonTree IS178_tree=null;
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_USAGE=new RewriteRuleTokenStream(adaptor,"token USAGE");
        RewriteRuleSubtreeStream stream_use=new RewriteRuleSubtreeStream(adaptor,"rule use");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:7: ( ( USAGE ( IS )? )? use -> ^( P_USAGE use ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:9: ( USAGE ( IS )? )? use
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:9: ( USAGE ( IS )? )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==USAGE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:10: USAGE ( IS )?
                    {
                    USAGE177=(Token)match(input,USAGE,FOLLOW_USAGE_in_usage2486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USAGE.add(USAGE177);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:16: ( IS )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==IS) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS178=(Token)match(input,IS,FOLLOW_IS_in_usage2488); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS178);


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_use_in_usage2493);
            use179=use();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_use.add(use179.getTree());


            // AST REWRITE
            // elements: use
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 368:29: -> ^( P_USAGE use )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:368:32: ^( P_USAGE use )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_USAGE, "P_USAGE"), root_1);

                adaptor.addChild(root_1, stream_use.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "usage"

    public static class use_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:369:1: use : ( BINARY | PACKED_DECIMAL | DISPLAY | INDEX | POINTER | COMP | COMP_1 | COMP_2 | COMP_3 | COMP_4 | COMP_5 | COMP_6 );
    public final DataDivision.use_return use() throws RecognitionException {
        DataDivision.use_return retval = new DataDivision.use_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set180=null;

        CommonTree set180_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:369:5: ( BINARY | PACKED_DECIMAL | DISPLAY | INDEX | POINTER | COMP | COMP_1 | COMP_2 | COMP_3 | COMP_4 | COMP_5 | COMP_6 )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set180=(Token)input.LT(1);
            if ( (input.LA(1)>=BINARY && input.LA(1)<=COMP_6)||(input.LA(1)>=DISPLAY && input.LA(1)<=POINTER) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set180));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "use"

    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:1: value : ( VALUE ( logical_value )+ ( when )? -> ^( VALUE ( logical_value )+ ( when )? ) | VALUE ( IS )? constant_expression -> ^( VALUE constant_expression ) );
    public final DataDivision.value_return value() throws RecognitionException {
        DataDivision.value_return retval = new DataDivision.value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VALUE181=null;
        Token VALUE184=null;
        Token IS185=null;
        DataDivision.logical_value_return logical_value182 = null;

        DataDivision.when_return when183 = null;

        DataDivision.constant_expression_return constant_expression186 = null;


        CommonTree VALUE181_tree=null;
        CommonTree VALUE184_tree=null;
        CommonTree IS185_tree=null;
        RewriteRuleTokenStream stream_VALUE=new RewriteRuleTokenStream(adaptor,"token VALUE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_when=new RewriteRuleSubtreeStream(adaptor,"rule when");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_logical_value=new RewriteRuleSubtreeStream(adaptor,"rule logical_value");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:7: ( VALUE ( logical_value )+ ( when )? -> ^( VALUE ( logical_value )+ ( when )? ) | VALUE ( IS )? constant_expression -> ^( VALUE constant_expression ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==VALUE) ) {
                switch ( input.LA(2) ) {
                case IS:
                    {
                    switch ( input.LA(3) ) {
                    case STRING:
                    case ZERO:
                    case SPACE:
                    case QUOTE:
                    case HIGH_VALUE:
                    case LOW_VALUE:
                    case NULL:
                    case ALL:
                    case OP_LESS:
                    case LESS:
                    case EQUAL:
                    case GREATER:
                    case OP_LESS_EQUAL:
                    case OP_GREATER:
                    case OP_GREATER_EQUAL:
                    case OP_EQUAL:
                    case LIKE:
                        {
                        alt84=1;
                        }
                        break;
                    case NOT:
                        {
                        int LA84_5 = input.LA(4);

                        if ( (LA84_5==LEFT_PAREN||LA84_5==WORD||LA84_5==SIZE||LA84_5==LENGTH||(LA84_5>=NEXT && LA84_5<=DATE_COMPILED)||LA84_5==NOT) ) {
                            alt84=2;
                        }
                        else if ( ((LA84_5>=OP_LESS && LA84_5<=EQUAL)||(LA84_5>=GREATER && LA84_5<=LIKE)) ) {
                            alt84=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA84_4 = input.LA(4);

                        if ( (synpred119_DataDivision()) ) {
                            alt84=1;
                        }
                        else if ( (true) ) {
                            alt84=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 84, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LEFT_PAREN:
                    case SIZE:
                    case LENGTH:
                    case NEXT:
                    case START:
                    case DATE_COMPILED:
                        {
                        alt84=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case LEFT_PAREN:
                case SIZE:
                case LENGTH:
                case NEXT:
                case START:
                case DATE_COMPILED:
                    {
                    alt84=2;
                    }
                    break;
                case WORD:
                    {
                    int LA84_4 = input.LA(3);

                    if ( (synpred119_DataDivision()) ) {
                        alt84=1;
                    }
                    else if ( (true) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case NOT:
                    {
                    int LA84_5 = input.LA(3);

                    if ( (LA84_5==LEFT_PAREN||LA84_5==WORD||LA84_5==SIZE||LA84_5==LENGTH||(LA84_5>=NEXT && LA84_5<=DATE_COMPILED)||LA84_5==NOT) ) {
                        alt84=2;
                    }
                    else if ( ((LA84_5>=OP_LESS && LA84_5<=EQUAL)||(LA84_5>=GREATER && LA84_5<=LIKE)) ) {
                        alt84=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case STRING:
                case ZERO:
                case SPACE:
                case QUOTE:
                case HIGH_VALUE:
                case LOW_VALUE:
                case NULL:
                case ALL:
                case OP_LESS:
                case LESS:
                case EQUAL:
                case GREATER:
                case OP_LESS_EQUAL:
                case OP_GREATER:
                case OP_GREATER_EQUAL:
                case OP_EQUAL:
                case LIKE:
                    {
                    alt84=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:9: VALUE ( logical_value )+ ( when )?
                    {
                    VALUE181=(Token)match(input,VALUE,FOLLOW_VALUE_in_value2564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VALUE.add(VALUE181);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:15: ( logical_value )+
                    int cnt81=0;
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==IS) ) {
                            int LA81_2 = input.LA(2);

                            if ( (LA81_2==STRING||LA81_2==WORD||LA81_2==ZERO||LA81_2==SPACE||LA81_2==QUOTE||LA81_2==HIGH_VALUE||LA81_2==LOW_VALUE||LA81_2==NULL||LA81_2==ALL||(LA81_2>=NOT && LA81_2<=EQUAL)||(LA81_2>=GREATER && LA81_2<=LIKE)) ) {
                                alt81=1;
                            }


                        }
                        else if ( (LA81_0==STRING||LA81_0==WORD||LA81_0==ZERO||LA81_0==SPACE||LA81_0==QUOTE||LA81_0==HIGH_VALUE||LA81_0==LOW_VALUE||LA81_0==NULL||LA81_0==ALL||(LA81_0>=NOT && LA81_0<=EQUAL)||(LA81_0>=GREATER && LA81_0<=LIKE)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: logical_value
                    	    {
                    	    pushFollow(FOLLOW_logical_value_in_value2566);
                    	    logical_value182=logical_value();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_logical_value.add(logical_value182.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt81 >= 1 ) break loop81;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(81, input);
                                throw eee;
                        }
                        cnt81++;
                    } while (true);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:30: ( when )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==TO||LA82_0==WHEN||(LA82_0>=SET && LA82_0<=FALSE)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: when
                            {
                            pushFollow(FOLLOW_when_in_value2569);
                            when183=when();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_when.add(when183.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: VALUE, when, logical_value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 372:38: -> ^( VALUE ( logical_value )+ ( when )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:41: ^( VALUE ( logical_value )+ ( when )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_VALUE.nextNode(), root_1);

                        if ( !(stream_logical_value.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_logical_value.hasNext() ) {
                            adaptor.addChild(root_1, stream_logical_value.nextTree());

                        }
                        stream_logical_value.reset();
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:64: ( when )?
                        if ( stream_when.hasNext() ) {
                            adaptor.addChild(root_1, stream_when.nextTree());

                        }
                        stream_when.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:373:4: VALUE ( IS )? constant_expression
                    {
                    VALUE184=(Token)match(input,VALUE,FOLLOW_VALUE_in_value2589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VALUE.add(VALUE184);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:373:10: ( IS )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==IS) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS185=(Token)match(input,IS,FOLLOW_IS_in_value2591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS185);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_constant_expression_in_value2594);
                    constant_expression186=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression186.getTree());


                    // AST REWRITE
                    // elements: constant_expression, VALUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 373:36: -> ^( VALUE constant_expression )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:373:39: ^( VALUE constant_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_VALUE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_constant_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "value"

    public static class logical_value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_value"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:376:1: logical_value : ( ( IS )? a= literal THRU b= literal -> ^( P_PAIR $a $b) | ( IS )? NOT relational_operator literal -> ^( NOT relational_operator literal ) | ( IS )? relational_operator literal -> ^( relational_operator literal ) | ( IS )? literal -> literal );
    public final DataDivision.logical_value_return logical_value() throws RecognitionException {
        DataDivision.logical_value_return retval = new DataDivision.logical_value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IS187=null;
        Token THRU188=null;
        Token IS189=null;
        Token NOT190=null;
        Token IS193=null;
        Token IS196=null;
        DataDivision.literal_return a = null;

        DataDivision.literal_return b = null;

        DataDivision.relational_operator_return relational_operator191 = null;

        DataDivision.literal_return literal192 = null;

        DataDivision.relational_operator_return relational_operator194 = null;

        DataDivision.literal_return literal195 = null;

        DataDivision.literal_return literal197 = null;


        CommonTree IS187_tree=null;
        CommonTree THRU188_tree=null;
        CommonTree IS189_tree=null;
        CommonTree NOT190_tree=null;
        CommonTree IS193_tree=null;
        CommonTree IS196_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_THRU=new RewriteRuleTokenStream(adaptor,"token THRU");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_relational_operator=new RewriteRuleSubtreeStream(adaptor,"rule relational_operator");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:377:2: ( ( IS )? a= literal THRU b= literal -> ^( P_PAIR $a $b) | ( IS )? NOT relational_operator literal -> ^( NOT relational_operator literal ) | ( IS )? relational_operator literal -> ^( relational_operator literal ) | ( IS )? literal -> literal )
            int alt89=4;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:377:4: ( IS )? a= literal THRU b= literal
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:377:4: ( IS )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==IS) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS187=(Token)match(input,IS,FOLLOW_IS_in_logical_value2615); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS187);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_literal_in_logical_value2620);
                    a=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(a.getTree());
                    THRU188=(Token)match(input,THRU,FOLLOW_THRU_in_logical_value2622); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THRU.add(THRU188);

                    pushFollow(FOLLOW_literal_in_logical_value2626);
                    b=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(b.getTree());


                    // AST REWRITE
                    // elements: a, b
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 377:35: -> ^( P_PAIR $a $b)
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:377:38: ^( P_PAIR $a $b)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_PAIR, "P_PAIR"), root_1);

                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:378:4: ( IS )? NOT relational_operator literal
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:378:4: ( IS )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==IS) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS189=(Token)match(input,IS,FOLLOW_IS_in_logical_value2645); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS189);


                            }
                            break;

                    }

                    NOT190=(Token)match(input,NOT,FOLLOW_NOT_in_logical_value2648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT190);

                    pushFollow(FOLLOW_relational_operator_in_logical_value2650);
                    relational_operator191=relational_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relational_operator.add(relational_operator191.getTree());
                    pushFollow(FOLLOW_literal_in_logical_value2652);
                    literal192=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal192.getTree());


                    // AST REWRITE
                    // elements: NOT, relational_operator, literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 378:41: -> ^( NOT relational_operator literal )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:378:44: ^( NOT relational_operator literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_relational_operator.nextTree());
                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:379:4: ( IS )? relational_operator literal
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:379:4: ( IS )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==IS) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS193=(Token)match(input,IS,FOLLOW_IS_in_logical_value2668); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS193);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_relational_operator_in_logical_value2671);
                    relational_operator194=relational_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relational_operator.add(relational_operator194.getTree());
                    pushFollow(FOLLOW_literal_in_logical_value2673);
                    literal195=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal195.getTree());


                    // AST REWRITE
                    // elements: relational_operator, literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 379:38: -> ^( relational_operator literal )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:379:41: ^( relational_operator literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_relational_operator.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:380:4: ( IS )? literal
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:380:4: ( IS )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==IS) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS196=(Token)match(input,IS,FOLLOW_IS_in_logical_value2688); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS196);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_literal_in_logical_value2691);
                    literal197=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal197.getTree());


                    // AST REWRITE
                    // elements: literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 380:20: -> literal
                    {
                        adaptor.addChild(root_0, stream_literal.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "logical_value"

    public static class relational_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_operator"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:382:1: relational_operator : ( LESS ( THAN )? -> P_OP_LESS | LESS ( THAN )? OR EQUAL -> P_OP_LESS_EQUAL | GREATER ( THAN )? -> P_OP_GREATER | GREATER ( THAN )? OR EQUAL -> P_OP_GREATER_EQUAL | EQUAL -> P_OP_EQUAL | LIKE TRIMMED RIGHT -> P_OP_TRIMMED_RIGHT | LIKE TRIMMED LEFT -> P_OP_TRIMMED_LEFT | LIKE TRIMMED -> P_OP_TRIMMED_BOTH | LIKE CASE_INSENSITIVE -> P_OP_CASE_INSENSITIVE | LIKE CASE_SENSITIVE -> P_OP_CASE_SENSITIVE | OP_LESS -> P_OP_LESS | OP_LESS_EQUAL -> P_OP_LESS_EQUAL | OP_GREATER -> P_OP_GREATER | OP_GREATER_EQUAL -> P_OP_GREATER_EQUAL | OP_EQUAL -> P_OP_EQUAL );
    public final DataDivision.relational_operator_return relational_operator() throws RecognitionException {
        DataDivision.relational_operator_return retval = new DataDivision.relational_operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LESS198=null;
        Token THAN199=null;
        Token LESS200=null;
        Token THAN201=null;
        Token OR202=null;
        Token EQUAL203=null;
        Token GREATER204=null;
        Token THAN205=null;
        Token GREATER206=null;
        Token THAN207=null;
        Token OR208=null;
        Token EQUAL209=null;
        Token EQUAL210=null;
        Token LIKE211=null;
        Token TRIMMED212=null;
        Token RIGHT213=null;
        Token LIKE214=null;
        Token TRIMMED215=null;
        Token LEFT216=null;
        Token LIKE217=null;
        Token TRIMMED218=null;
        Token LIKE219=null;
        Token CASE_INSENSITIVE220=null;
        Token LIKE221=null;
        Token CASE_SENSITIVE222=null;
        Token OP_LESS223=null;
        Token OP_LESS_EQUAL224=null;
        Token OP_GREATER225=null;
        Token OP_GREATER_EQUAL226=null;
        Token OP_EQUAL227=null;

        CommonTree LESS198_tree=null;
        CommonTree THAN199_tree=null;
        CommonTree LESS200_tree=null;
        CommonTree THAN201_tree=null;
        CommonTree OR202_tree=null;
        CommonTree EQUAL203_tree=null;
        CommonTree GREATER204_tree=null;
        CommonTree THAN205_tree=null;
        CommonTree GREATER206_tree=null;
        CommonTree THAN207_tree=null;
        CommonTree OR208_tree=null;
        CommonTree EQUAL209_tree=null;
        CommonTree EQUAL210_tree=null;
        CommonTree LIKE211_tree=null;
        CommonTree TRIMMED212_tree=null;
        CommonTree RIGHT213_tree=null;
        CommonTree LIKE214_tree=null;
        CommonTree TRIMMED215_tree=null;
        CommonTree LEFT216_tree=null;
        CommonTree LIKE217_tree=null;
        CommonTree TRIMMED218_tree=null;
        CommonTree LIKE219_tree=null;
        CommonTree CASE_INSENSITIVE220_tree=null;
        CommonTree LIKE221_tree=null;
        CommonTree CASE_SENSITIVE222_tree=null;
        CommonTree OP_LESS223_tree=null;
        CommonTree OP_LESS_EQUAL224_tree=null;
        CommonTree OP_GREATER225_tree=null;
        CommonTree OP_GREATER_EQUAL226_tree=null;
        CommonTree OP_EQUAL227_tree=null;
        RewriteRuleTokenStream stream_OP_GREATER_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_GREATER_EQUAL");
        RewriteRuleTokenStream stream_OP_GREATER=new RewriteRuleTokenStream(adaptor,"token OP_GREATER");
        RewriteRuleTokenStream stream_GREATER=new RewriteRuleTokenStream(adaptor,"token GREATER");
        RewriteRuleTokenStream stream_THAN=new RewriteRuleTokenStream(adaptor,"token THAN");
        RewriteRuleTokenStream stream_OP_LESS_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_LESS_EQUAL");
        RewriteRuleTokenStream stream_TRIMMED=new RewriteRuleTokenStream(adaptor,"token TRIMMED");
        RewriteRuleTokenStream stream_LEFT=new RewriteRuleTokenStream(adaptor,"token LEFT");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleTokenStream stream_LESS=new RewriteRuleTokenStream(adaptor,"token LESS");
        RewriteRuleTokenStream stream_CASE_SENSITIVE=new RewriteRuleTokenStream(adaptor,"token CASE_SENSITIVE");
        RewriteRuleTokenStream stream_RIGHT=new RewriteRuleTokenStream(adaptor,"token RIGHT");
        RewriteRuleTokenStream stream_OP_EQUAL=new RewriteRuleTokenStream(adaptor,"token OP_EQUAL");
        RewriteRuleTokenStream stream_CASE_INSENSITIVE=new RewriteRuleTokenStream(adaptor,"token CASE_INSENSITIVE");
        RewriteRuleTokenStream stream_OP_LESS=new RewriteRuleTokenStream(adaptor,"token OP_LESS");
        RewriteRuleTokenStream stream_LIKE=new RewriteRuleTokenStream(adaptor,"token LIKE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:383:2: ( LESS ( THAN )? -> P_OP_LESS | LESS ( THAN )? OR EQUAL -> P_OP_LESS_EQUAL | GREATER ( THAN )? -> P_OP_GREATER | GREATER ( THAN )? OR EQUAL -> P_OP_GREATER_EQUAL | EQUAL -> P_OP_EQUAL | LIKE TRIMMED RIGHT -> P_OP_TRIMMED_RIGHT | LIKE TRIMMED LEFT -> P_OP_TRIMMED_LEFT | LIKE TRIMMED -> P_OP_TRIMMED_BOTH | LIKE CASE_INSENSITIVE -> P_OP_CASE_INSENSITIVE | LIKE CASE_SENSITIVE -> P_OP_CASE_SENSITIVE | OP_LESS -> P_OP_LESS | OP_LESS_EQUAL -> P_OP_LESS_EQUAL | OP_GREATER -> P_OP_GREATER | OP_GREATER_EQUAL -> P_OP_GREATER_EQUAL | OP_EQUAL -> P_OP_EQUAL )
            int alt94=15;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:383:4: LESS ( THAN )?
                    {
                    LESS198=(Token)match(input,LESS,FOLLOW_LESS_in_relational_operator2709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LESS.add(LESS198);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:383:9: ( THAN )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==THAN) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: THAN
                            {
                            THAN199=(Token)match(input,THAN,FOLLOW_THAN_in_relational_operator2711); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THAN.add(THAN199);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 383:19: -> P_OP_LESS
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_LESS, "P_OP_LESS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:384:4: LESS ( THAN )? OR EQUAL
                    {
                    LESS200=(Token)match(input,LESS,FOLLOW_LESS_in_relational_operator2725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LESS.add(LESS200);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:384:9: ( THAN )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==THAN) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: THAN
                            {
                            THAN201=(Token)match(input,THAN,FOLLOW_THAN_in_relational_operator2727); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THAN.add(THAN201);


                            }
                            break;

                    }

                    OR202=(Token)match(input,OR,FOLLOW_OR_in_relational_operator2730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR202);

                    EQUAL203=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relational_operator2732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL203);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 384:27: -> P_OP_LESS_EQUAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_LESS_EQUAL, "P_OP_LESS_EQUAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:385:4: GREATER ( THAN )?
                    {
                    GREATER204=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_operator2744); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER.add(GREATER204);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:385:12: ( THAN )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==THAN) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: THAN
                            {
                            THAN205=(Token)match(input,THAN,FOLLOW_THAN_in_relational_operator2746); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THAN.add(THAN205);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 385:22: -> P_OP_GREATER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_GREATER, "P_OP_GREATER"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:386:4: GREATER ( THAN )? OR EQUAL
                    {
                    GREATER206=(Token)match(input,GREATER,FOLLOW_GREATER_in_relational_operator2760); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER.add(GREATER206);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:386:12: ( THAN )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==THAN) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: THAN
                            {
                            THAN207=(Token)match(input,THAN,FOLLOW_THAN_in_relational_operator2762); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_THAN.add(THAN207);


                            }
                            break;

                    }

                    OR208=(Token)match(input,OR,FOLLOW_OR_in_relational_operator2765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR208);

                    EQUAL209=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relational_operator2767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL209);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 386:30: -> P_OP_GREATER_EQUAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_GREATER_EQUAL, "P_OP_GREATER_EQUAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:387:4: EQUAL
                    {
                    EQUAL210=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_relational_operator2779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL210);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 387:15: -> P_OP_EQUAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_EQUAL, "P_OP_EQUAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:388:4: LIKE TRIMMED RIGHT
                    {
                    LIKE211=(Token)match(input,LIKE,FOLLOW_LIKE_in_relational_operator2793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIKE.add(LIKE211);

                    TRIMMED212=(Token)match(input,TRIMMED,FOLLOW_TRIMMED_in_relational_operator2795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRIMMED.add(TRIMMED212);

                    RIGHT213=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_relational_operator2797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT.add(RIGHT213);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 388:26: -> P_OP_TRIMMED_RIGHT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_TRIMMED_RIGHT, "P_OP_TRIMMED_RIGHT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:389:4: LIKE TRIMMED LEFT
                    {
                    LIKE214=(Token)match(input,LIKE,FOLLOW_LIKE_in_relational_operator2809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIKE.add(LIKE214);

                    TRIMMED215=(Token)match(input,TRIMMED,FOLLOW_TRIMMED_in_relational_operator2811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRIMMED.add(TRIMMED215);

                    LEFT216=(Token)match(input,LEFT,FOLLOW_LEFT_in_relational_operator2813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT.add(LEFT216);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 389:25: -> P_OP_TRIMMED_LEFT
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_TRIMMED_LEFT, "P_OP_TRIMMED_LEFT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:390:4: LIKE TRIMMED
                    {
                    LIKE217=(Token)match(input,LIKE,FOLLOW_LIKE_in_relational_operator2825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIKE.add(LIKE217);

                    TRIMMED218=(Token)match(input,TRIMMED,FOLLOW_TRIMMED_in_relational_operator2827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRIMMED.add(TRIMMED218);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 390:22: -> P_OP_TRIMMED_BOTH
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_TRIMMED_BOTH, "P_OP_TRIMMED_BOTH"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:391:4: LIKE CASE_INSENSITIVE
                    {
                    LIKE219=(Token)match(input,LIKE,FOLLOW_LIKE_in_relational_operator2841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIKE.add(LIKE219);

                    CASE_INSENSITIVE220=(Token)match(input,CASE_INSENSITIVE,FOLLOW_CASE_INSENSITIVE_in_relational_operator2843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE_INSENSITIVE.add(CASE_INSENSITIVE220);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 391:29: -> P_OP_CASE_INSENSITIVE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_CASE_INSENSITIVE, "P_OP_CASE_INSENSITIVE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:392:4: LIKE CASE_SENSITIVE
                    {
                    LIKE221=(Token)match(input,LIKE,FOLLOW_LIKE_in_relational_operator2855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIKE.add(LIKE221);

                    CASE_SENSITIVE222=(Token)match(input,CASE_SENSITIVE,FOLLOW_CASE_SENSITIVE_in_relational_operator2857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE_SENSITIVE.add(CASE_SENSITIVE222);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 392:27: -> P_OP_CASE_SENSITIVE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_CASE_SENSITIVE, "P_OP_CASE_SENSITIVE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:394:4: OP_LESS
                    {
                    OP_LESS223=(Token)match(input,OP_LESS,FOLLOW_OP_LESS_in_relational_operator2871); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_LESS.add(OP_LESS223);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 394:17: -> P_OP_LESS
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_LESS, "P_OP_LESS"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:395:4: OP_LESS_EQUAL
                    {
                    OP_LESS_EQUAL224=(Token)match(input,OP_LESS_EQUAL,FOLLOW_OP_LESS_EQUAL_in_relational_operator2885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_LESS_EQUAL.add(OP_LESS_EQUAL224);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 395:22: -> P_OP_LESS_EQUAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_LESS_EQUAL, "P_OP_LESS_EQUAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:396:4: OP_GREATER
                    {
                    OP_GREATER225=(Token)match(input,OP_GREATER,FOLLOW_OP_GREATER_in_relational_operator2898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_GREATER.add(OP_GREATER225);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 396:19: -> P_OP_GREATER
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_GREATER, "P_OP_GREATER"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:397:4: OP_GREATER_EQUAL
                    {
                    OP_GREATER_EQUAL226=(Token)match(input,OP_GREATER_EQUAL,FOLLOW_OP_GREATER_EQUAL_in_relational_operator2911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_GREATER_EQUAL.add(OP_GREATER_EQUAL226);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 397:24: -> P_OP_GREATER_EQUAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_GREATER_EQUAL, "P_OP_GREATER_EQUAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:398:4: OP_EQUAL
                    {
                    OP_EQUAL227=(Token)match(input,OP_EQUAL,FOLLOW_OP_EQUAL_in_relational_operator2923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OP_EQUAL.add(OP_EQUAL227);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 398:17: -> P_OP_EQUAL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_OP_EQUAL, "P_OP_EQUAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "relational_operator"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:400:1: literal : ( ( value_item AMPERSAND )+ value_item -> ^( AMPERSAND ( value_item )+ ) | value_item );
    public final DataDivision.literal_return literal() throws RecognitionException {
        DataDivision.literal_return retval = new DataDivision.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AMPERSAND229=null;
        DataDivision.value_item_return value_item228 = null;

        DataDivision.value_item_return value_item230 = null;

        DataDivision.value_item_return value_item231 = null;


        CommonTree AMPERSAND229_tree=null;
        RewriteRuleTokenStream stream_AMPERSAND=new RewriteRuleTokenStream(adaptor,"token AMPERSAND");
        RewriteRuleSubtreeStream stream_value_item=new RewriteRuleSubtreeStream(adaptor,"rule value_item");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:401:2: ( ( value_item AMPERSAND )+ value_item -> ^( AMPERSAND ( value_item )+ ) | value_item )
            int alt96=2;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:401:4: ( value_item AMPERSAND )+ value_item
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:401:4: ( value_item AMPERSAND )+
                    int cnt95=0;
                    loop95:
                    do {
                        int alt95=2;
                        alt95 = dfa95.predict(input);
                        switch (alt95) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:401:5: value_item AMPERSAND
                    	    {
                    	    pushFollow(FOLLOW_value_item_in_literal2944);
                    	    value_item228=value_item();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_value_item.add(value_item228.getTree());
                    	    AMPERSAND229=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_literal2946); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_AMPERSAND.add(AMPERSAND229);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt95 >= 1 ) break loop95;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(95, input);
                                throw eee;
                        }
                        cnt95++;
                    } while (true);

                    pushFollow(FOLLOW_value_item_in_literal2950);
                    value_item230=value_item();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value_item.add(value_item230.getTree());


                    // AST REWRITE
                    // elements: value_item, AMPERSAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 401:41: -> ^( AMPERSAND ( value_item )+ )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:401:44: ^( AMPERSAND ( value_item )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_AMPERSAND.nextNode(), root_1);

                        if ( !(stream_value_item.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_value_item.hasNext() ) {
                            adaptor.addChild(root_1, stream_value_item.nextTree());

                        }
                        stream_value_item.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:402:4: value_item
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_item_in_literal2966);
                    value_item231=value_item();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value_item231.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class value_item_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value_item"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:404:1: value_item : ( ( ALL )? data_name | ( ALL )? STRING | ( ALL )? figurative_constant );
    public final DataDivision.value_item_return value_item() throws RecognitionException {
        DataDivision.value_item_return retval = new DataDivision.value_item_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ALL232=null;
        Token ALL234=null;
        Token STRING235=null;
        Token ALL236=null;
        DataDivision.data_name_return data_name233 = null;

        DataDivision.figurative_constant_return figurative_constant237 = null;


        CommonTree ALL232_tree=null;
        CommonTree ALL234_tree=null;
        CommonTree STRING235_tree=null;
        CommonTree ALL236_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:405:2: ( ( ALL )? data_name | ( ALL )? STRING | ( ALL )? figurative_constant )
            int alt100=3;
            switch ( input.LA(1) ) {
            case ALL:
                {
                switch ( input.LA(2) ) {
                case STRING:
                    {
                    alt100=2;
                    }
                    break;
                case WORD:
                    {
                    alt100=1;
                    }
                    break;
                case ZERO:
                case SPACE:
                case QUOTE:
                case HIGH_VALUE:
                case LOW_VALUE:
                case NULL:
                    {
                    alt100=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 100, 1, input);

                    throw nvae;
                }

                }
                break;
            case WORD:
                {
                alt100=1;
                }
                break;
            case STRING:
                {
                alt100=2;
                }
                break;
            case ZERO:
            case SPACE:
            case QUOTE:
            case HIGH_VALUE:
            case LOW_VALUE:
            case NULL:
                {
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:405:4: ( ALL )? data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:405:4: ( ALL )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==ALL) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: ALL
                            {
                            ALL232=(Token)match(input,ALL,FOLLOW_ALL_in_value_item2976); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ALL232_tree = (CommonTree)adaptor.create(ALL232);
                            adaptor.addChild(root_0, ALL232_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_data_name_in_value_item2979);
                    data_name233=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_name233.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:406:4: ( ALL )? STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:406:4: ( ALL )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==ALL) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: ALL
                            {
                            ALL234=(Token)match(input,ALL,FOLLOW_ALL_in_value_item2984); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ALL234_tree = (CommonTree)adaptor.create(ALL234);
                            adaptor.addChild(root_0, ALL234_tree);
                            }

                            }
                            break;

                    }

                    STRING235=(Token)match(input,STRING,FOLLOW_STRING_in_value_item2987); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING235_tree = (CommonTree)adaptor.create(STRING235);
                    adaptor.addChild(root_0, STRING235_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:407:4: ( ALL )? figurative_constant
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:407:4: ( ALL )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==ALL) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: ALL
                            {
                            ALL236=(Token)match(input,ALL,FOLLOW_ALL_in_value_item2992); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ALL236_tree = (CommonTree)adaptor.create(ALL236);
                            adaptor.addChild(root_0, ALL236_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_figurative_constant_in_value_item2995);
                    figurative_constant237=figurative_constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, figurative_constant237.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "value_item"

    public static class figurative_constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "figurative_constant"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:409:1: figurative_constant : ( SPACE | ZERO | HIGH_VALUE | LOW_VALUE | QUOTE | NULL );
    public final DataDivision.figurative_constant_return figurative_constant() throws RecognitionException {
        DataDivision.figurative_constant_return retval = new DataDivision.figurative_constant_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set238=null;

        CommonTree set238_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:410:2: ( SPACE | ZERO | HIGH_VALUE | LOW_VALUE | QUOTE | NULL )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set238=(Token)input.LT(1);
            if ( input.LA(1)==ZERO||input.LA(1)==SPACE||input.LA(1)==QUOTE||input.LA(1)==HIGH_VALUE||input.LA(1)==LOW_VALUE||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set238));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "figurative_constant"

    public static class when_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "when"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:1: when : ( WHEN )? ( SET )? ( TO )? FALSE ( IS )? literal -> ^( FALSE literal ) ;
    public final DataDivision.when_return when() throws RecognitionException {
        DataDivision.when_return retval = new DataDivision.when_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHEN239=null;
        Token SET240=null;
        Token TO241=null;
        Token FALSE242=null;
        Token IS243=null;
        DataDivision.literal_return literal244 = null;


        CommonTree WHEN239_tree=null;
        CommonTree SET240_tree=null;
        CommonTree TO241_tree=null;
        CommonTree FALSE242_tree=null;
        CommonTree IS243_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:6: ( ( WHEN )? ( SET )? ( TO )? FALSE ( IS )? literal -> ^( FALSE literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:8: ( WHEN )? ( SET )? ( TO )? FALSE ( IS )? literal
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:8: ( WHEN )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==WHEN) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: WHEN
                    {
                    WHEN239=(Token)match(input,WHEN,FOLLOW_WHEN_in_when3033); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHEN.add(WHEN239);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:14: ( SET )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==SET) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SET
                    {
                    SET240=(Token)match(input,SET,FOLLOW_SET_in_when3036); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SET.add(SET240);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:19: ( TO )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==TO) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: TO
                    {
                    TO241=(Token)match(input,TO,FOLLOW_TO_in_when3039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TO.add(TO241);


                    }
                    break;

            }

            FALSE242=(Token)match(input,FALSE,FOLLOW_FALSE_in_when3042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FALSE.add(FALSE242);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:29: ( IS )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==IS) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS243=(Token)match(input,IS,FOLLOW_IS_in_when3044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS243);


                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_when3047);
            literal244=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_literal.add(literal244.getTree());


            // AST REWRITE
            // elements: FALSE, literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 411:42: -> ^( FALSE literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:411:45: ^( FALSE literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FALSE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "when"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:413:1: operator : ( OP_PLUS | OP_MINUS | OP_MUL | OP_DIV | OP_EXP | AND | EXCLUSIVE OR -> P_EXCLUSIVE_OR | OR );
    public final DataDivision.operator_return operator() throws RecognitionException {
        DataDivision.operator_return retval = new DataDivision.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OP_PLUS245=null;
        Token OP_MINUS246=null;
        Token OP_MUL247=null;
        Token OP_DIV248=null;
        Token OP_EXP249=null;
        Token AND250=null;
        Token EXCLUSIVE251=null;
        Token OR252=null;
        Token OR253=null;

        CommonTree OP_PLUS245_tree=null;
        CommonTree OP_MINUS246_tree=null;
        CommonTree OP_MUL247_tree=null;
        CommonTree OP_DIV248_tree=null;
        CommonTree OP_EXP249_tree=null;
        CommonTree AND250_tree=null;
        CommonTree EXCLUSIVE251_tree=null;
        CommonTree OR252_tree=null;
        CommonTree OR253_tree=null;
        RewriteRuleTokenStream stream_EXCLUSIVE=new RewriteRuleTokenStream(adaptor,"token EXCLUSIVE");
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:413:9: ( OP_PLUS | OP_MINUS | OP_MUL | OP_DIV | OP_EXP | AND | EXCLUSIVE OR -> P_EXCLUSIVE_OR | OR )
            int alt105=8;
            switch ( input.LA(1) ) {
            case OP_PLUS:
                {
                alt105=1;
                }
                break;
            case OP_MINUS:
                {
                alt105=2;
                }
                break;
            case OP_MUL:
                {
                alt105=3;
                }
                break;
            case OP_DIV:
                {
                alt105=4;
                }
                break;
            case OP_EXP:
                {
                alt105=5;
                }
                break;
            case AND:
                {
                alt105=6;
                }
                break;
            case EXCLUSIVE:
                {
                alt105=7;
                }
                break;
            case OR:
                {
                alt105=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:413:11: OP_PLUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OP_PLUS245=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_operator3064); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_PLUS245_tree = (CommonTree)adaptor.create(OP_PLUS245);
                    adaptor.addChild(root_0, OP_PLUS245_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:414:4: OP_MINUS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OP_MINUS246=(Token)match(input,OP_MINUS,FOLLOW_OP_MINUS_in_operator3073); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MINUS246_tree = (CommonTree)adaptor.create(OP_MINUS246);
                    adaptor.addChild(root_0, OP_MINUS246_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:415:4: OP_MUL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OP_MUL247=(Token)match(input,OP_MUL,FOLLOW_OP_MUL_in_operator3078); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_MUL247_tree = (CommonTree)adaptor.create(OP_MUL247);
                    adaptor.addChild(root_0, OP_MUL247_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:416:4: OP_DIV
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OP_DIV248=(Token)match(input,OP_DIV,FOLLOW_OP_DIV_in_operator3083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_DIV248_tree = (CommonTree)adaptor.create(OP_DIV248);
                    adaptor.addChild(root_0, OP_DIV248_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:417:4: OP_EXP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OP_EXP249=(Token)match(input,OP_EXP,FOLLOW_OP_EXP_in_operator3088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_EXP249_tree = (CommonTree)adaptor.create(OP_EXP249);
                    adaptor.addChild(root_0, OP_EXP249_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:418:4: AND
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AND250=(Token)match(input,AND,FOLLOW_AND_in_operator3093); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND250_tree = (CommonTree)adaptor.create(AND250);
                    adaptor.addChild(root_0, AND250_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:419:4: EXCLUSIVE OR
                    {
                    EXCLUSIVE251=(Token)match(input,EXCLUSIVE,FOLLOW_EXCLUSIVE_in_operator3098); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXCLUSIVE.add(EXCLUSIVE251);

                    OR252=(Token)match(input,OR,FOLLOW_OR_in_operator3100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OR.add(OR252);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 419:18: -> P_EXCLUSIVE_OR
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_EXCLUSIVE_OR, "P_EXCLUSIVE_OR"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:420:4: OR
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OR253=(Token)match(input,OR,FOLLOW_OR_in_operator3110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR253_tree = (CommonTree)adaptor.create(OR253);
                    adaptor.addChild(root_0, OR253_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "operator"

    public static class basic_exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "basic_exp"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:422:1: basic_exp : ( NEXT -> ^( NEXT ) | LENGTH ( OF )? literal -> ^( LENGTH literal ) | SIZE ( OF )? literal -> ^( SIZE literal ) | START ( OF )? WORD -> ^( START WORD ) | DATE_COMPILED -> ^( DATE_COMPILED ) | WORD -> ^( WORD ) );
    public final DataDivision.basic_exp_return basic_exp() throws RecognitionException {
        DataDivision.basic_exp_return retval = new DataDivision.basic_exp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEXT254=null;
        Token LENGTH255=null;
        Token OF256=null;
        Token SIZE258=null;
        Token OF259=null;
        Token START261=null;
        Token OF262=null;
        Token WORD263=null;
        Token DATE_COMPILED264=null;
        Token WORD265=null;
        DataDivision.literal_return literal257 = null;

        DataDivision.literal_return literal260 = null;


        CommonTree NEXT254_tree=null;
        CommonTree LENGTH255_tree=null;
        CommonTree OF256_tree=null;
        CommonTree SIZE258_tree=null;
        CommonTree OF259_tree=null;
        CommonTree START261_tree=null;
        CommonTree OF262_tree=null;
        CommonTree WORD263_tree=null;
        CommonTree DATE_COMPILED264_tree=null;
        CommonTree WORD265_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_START=new RewriteRuleTokenStream(adaptor,"token START");
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_DATE_COMPILED=new RewriteRuleTokenStream(adaptor,"token DATE_COMPILED");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_SIZE=new RewriteRuleTokenStream(adaptor,"token SIZE");
        RewriteRuleTokenStream stream_LENGTH=new RewriteRuleTokenStream(adaptor,"token LENGTH");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:423:2: ( NEXT -> ^( NEXT ) | LENGTH ( OF )? literal -> ^( LENGTH literal ) | SIZE ( OF )? literal -> ^( SIZE literal ) | START ( OF )? WORD -> ^( START WORD ) | DATE_COMPILED -> ^( DATE_COMPILED ) | WORD -> ^( WORD ) )
            int alt109=6;
            switch ( input.LA(1) ) {
            case NEXT:
                {
                alt109=1;
                }
                break;
            case LENGTH:
                {
                alt109=2;
                }
                break;
            case SIZE:
                {
                alt109=3;
                }
                break;
            case START:
                {
                alt109=4;
                }
                break;
            case DATE_COMPILED:
                {
                alt109=5;
                }
                break;
            case WORD:
                {
                alt109=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:423:4: NEXT
                    {
                    NEXT254=(Token)match(input,NEXT,FOLLOW_NEXT_in_basic_exp3121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT254);



                    // AST REWRITE
                    // elements: NEXT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 423:11: -> ^( NEXT )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:423:14: ^( NEXT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_NEXT.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:424:4: LENGTH ( OF )? literal
                    {
                    LENGTH255=(Token)match(input,LENGTH,FOLLOW_LENGTH_in_basic_exp3134); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LENGTH.add(LENGTH255);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:424:11: ( OF )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==OF) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: OF
                            {
                            OF256=(Token)match(input,OF,FOLLOW_OF_in_basic_exp3136); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF256);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_literal_in_basic_exp3139);
                    literal257=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal257.getTree());


                    // AST REWRITE
                    // elements: literal, LENGTH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 424:23: -> ^( LENGTH literal )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:424:26: ^( LENGTH literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_LENGTH.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:425:4: SIZE ( OF )? literal
                    {
                    SIZE258=(Token)match(input,SIZE,FOLLOW_SIZE_in_basic_exp3153); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SIZE.add(SIZE258);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:425:9: ( OF )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==OF) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: OF
                            {
                            OF259=(Token)match(input,OF,FOLLOW_OF_in_basic_exp3155); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF259);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_literal_in_basic_exp3158);
                    literal260=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_literal.add(literal260.getTree());


                    // AST REWRITE
                    // elements: SIZE, literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 425:21: -> ^( SIZE literal )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:425:24: ^( SIZE literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SIZE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:426:4: START ( OF )? WORD
                    {
                    START261=(Token)match(input,START,FOLLOW_START_in_basic_exp3171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_START.add(START261);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:426:10: ( OF )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==OF) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: OF
                            {
                            OF262=(Token)match(input,OF,FOLLOW_OF_in_basic_exp3173); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_OF.add(OF262);


                            }
                            break;

                    }

                    WORD263=(Token)match(input,WORD,FOLLOW_WORD_in_basic_exp3176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD263);



                    // AST REWRITE
                    // elements: START, WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 426:20: -> ^( START WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:426:23: ^( START WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_START.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:427:4: DATE_COMPILED
                    {
                    DATE_COMPILED264=(Token)match(input,DATE_COMPILED,FOLLOW_DATE_COMPILED_in_basic_exp3190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATE_COMPILED.add(DATE_COMPILED264);



                    // AST REWRITE
                    // elements: DATE_COMPILED
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 427:19: -> ^( DATE_COMPILED )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:427:22: ^( DATE_COMPILED )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_DATE_COMPILED.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:428:4: WORD
                    {
                    WORD265=(Token)match(input,WORD,FOLLOW_WORD_in_basic_exp3202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD265);



                    // AST REWRITE
                    // elements: WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 428:11: -> ^( WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:428:14: ^( WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_WORD.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "basic_exp"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:430:1: expression : ( basic_exp | NOT expression -> ^( NOT expression ) | LEFT_PAREN expression RIGHT_PAREN -> ^( P_PAREN_EXP expression ) );
    public final DataDivision.expression_return expression() throws RecognitionException {
        DataDivision.expression_return retval = new DataDivision.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT267=null;
        Token LEFT_PAREN269=null;
        Token RIGHT_PAREN271=null;
        DataDivision.basic_exp_return basic_exp266 = null;

        DataDivision.expression_return expression268 = null;

        DataDivision.expression_return expression270 = null;


        CommonTree NOT267_tree=null;
        CommonTree LEFT_PAREN269_tree=null;
        CommonTree RIGHT_PAREN271_tree=null;
        RewriteRuleTokenStream stream_LEFT_PAREN=new RewriteRuleTokenStream(adaptor,"token LEFT_PAREN");
        RewriteRuleTokenStream stream_RIGHT_PAREN=new RewriteRuleTokenStream(adaptor,"token RIGHT_PAREN");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:431:2: ( basic_exp | NOT expression -> ^( NOT expression ) | LEFT_PAREN expression RIGHT_PAREN -> ^( P_PAREN_EXP expression ) )
            int alt110=3;
            switch ( input.LA(1) ) {
            case WORD:
            case SIZE:
            case LENGTH:
            case NEXT:
            case START:
            case DATE_COMPILED:
                {
                alt110=1;
                }
                break;
            case NOT:
                {
                alt110=2;
                }
                break;
            case LEFT_PAREN:
                {
                alt110=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:431:4: basic_exp
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_basic_exp_in_expression3220);
                    basic_exp266=basic_exp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, basic_exp266.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:432:4: NOT expression
                    {
                    NOT267=(Token)match(input,NOT,FOLLOW_NOT_in_expression3230); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT.add(NOT267);

                    pushFollow(FOLLOW_expression_in_expression3232);
                    expression268=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression268.getTree());


                    // AST REWRITE
                    // elements: expression, NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 432:22: -> ^( NOT expression )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:432:25: ^( NOT expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:433:4: LEFT_PAREN expression RIGHT_PAREN
                    {
                    LEFT_PAREN269=(Token)match(input,LEFT_PAREN,FOLLOW_LEFT_PAREN_in_expression3250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PAREN.add(LEFT_PAREN269);

                    pushFollow(FOLLOW_expression_in_expression3252);
                    expression270=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression270.getTree());
                    RIGHT_PAREN271=(Token)match(input,RIGHT_PAREN,FOLLOW_RIGHT_PAREN_in_expression3254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PAREN.add(RIGHT_PAREN271);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 433:38: -> ^( P_PAREN_EXP expression )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:433:41: ^( P_PAREN_EXP expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_PAREN_EXP, "P_PAREN_EXP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expression"

    public static class constant_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant_expression"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:435:1: constant_expression : ( expression operator constant_expression -> ^( operator expression constant_expression ) | expression );
    public final DataDivision.constant_expression_return constant_expression() throws RecognitionException {
        DataDivision.constant_expression_return retval = new DataDivision.constant_expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.expression_return expression272 = null;

        DataDivision.operator_return operator273 = null;

        DataDivision.constant_expression_return constant_expression274 = null;

        DataDivision.expression_return expression275 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:436:2: ( expression operator constant_expression -> ^( operator expression constant_expression ) | expression )
            int alt111=2;
            alt111 = dfa111.predict(input);
            switch (alt111) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:436:4: expression operator constant_expression
                    {
                    pushFollow(FOLLOW_expression_in_constant_expression3272);
                    expression272=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression272.getTree());
                    pushFollow(FOLLOW_operator_in_constant_expression3274);
                    operator273=operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_operator.add(operator273.getTree());
                    pushFollow(FOLLOW_constant_expression_in_constant_expression3276);
                    constant_expression274=constant_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression274.getTree());


                    // AST REWRITE
                    // elements: expression, constant_expression, operator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 436:44: -> ^( operator expression constant_expression )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:436:47: ^( operator expression constant_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_operator.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_constant_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:437:4: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_constant_expression3291);
                    expression275=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression275.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "constant_expression"

    public static class communication_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "communication_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:439:1: communication_section : COMMUNICATION SECTION PERIOD ( cd_entry )* -> ^( COMMUNICATION ( cd_entry )* ) ;
    public final DataDivision.communication_section_return communication_section() throws RecognitionException {
        DataDivision.communication_section_return retval = new DataDivision.communication_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMUNICATION276=null;
        Token SECTION277=null;
        Token PERIOD278=null;
        DataDivision.cd_entry_return cd_entry279 = null;


        CommonTree COMMUNICATION276_tree=null;
        CommonTree SECTION277_tree=null;
        CommonTree PERIOD278_tree=null;
        RewriteRuleTokenStream stream_COMMUNICATION=new RewriteRuleTokenStream(adaptor,"token COMMUNICATION");
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_cd_entry=new RewriteRuleSubtreeStream(adaptor,"rule cd_entry");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:443:2: ( COMMUNICATION SECTION PERIOD ( cd_entry )* -> ^( COMMUNICATION ( cd_entry )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:443:4: COMMUNICATION SECTION PERIOD ( cd_entry )*
            {
            COMMUNICATION276=(Token)match(input,COMMUNICATION,FOLLOW_COMMUNICATION_in_communication_section3304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMUNICATION.add(COMMUNICATION276);

            SECTION277=(Token)match(input,SECTION,FOLLOW_SECTION_in_communication_section3306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SECTION.add(SECTION277);

            PERIOD278=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_communication_section3308); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD278);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:443:33: ( cd_entry )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==CD) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: cd_entry
            	    {
            	    pushFollow(FOLLOW_cd_entry_in_communication_section3310);
            	    cd_entry279=cd_entry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cd_entry.add(cd_entry279.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);



            // AST REWRITE
            // elements: cd_entry, COMMUNICATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 443:46: -> ^( COMMUNICATION ( cd_entry )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:443:49: ^( COMMUNICATION ( cd_entry )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_COMMUNICATION.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:443:65: ( cd_entry )*
                while ( stream_cd_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_cd_entry.nextTree());

                }
                stream_cd_entry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "communication_section"

    public static class cd_entry_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cd_entry"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:444:1: cd_entry : ( cd_input | cd_output | cd_io );
    public final DataDivision.cd_entry_return cd_entry() throws RecognitionException {
        DataDivision.cd_entry_return retval = new DataDivision.cd_entry_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.cd_input_return cd_input280 = null;

        DataDivision.cd_output_return cd_output281 = null;

        DataDivision.cd_io_return cd_io282 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:444:9: ( cd_input | cd_output | cd_io )
            int alt113=3;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==CD) ) {
                int LA113_1 = input.LA(2);

                if ( (LA113_1==WORD) ) {
                    switch ( input.LA(3) ) {
                    case FOR:
                        {
                        switch ( input.LA(4) ) {
                        case INITIAL:
                            {
                            int LA113_4 = input.LA(5);

                            if ( (LA113_4==I_O) ) {
                                alt113=3;
                            }
                            else if ( (LA113_4==INPUT) ) {
                                alt113=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 113, 4, input);

                                throw nvae;
                            }
                            }
                            break;
                        case I_O:
                            {
                            alt113=3;
                            }
                            break;
                        case OUTPUT:
                            {
                            alt113=2;
                            }
                            break;
                        case INPUT:
                            {
                            alt113=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 113, 3, input);

                            throw nvae;
                        }

                        }
                        break;
                    case INITIAL:
                        {
                        int LA113_4 = input.LA(4);

                        if ( (LA113_4==I_O) ) {
                            alt113=3;
                        }
                        else if ( (LA113_4==INPUT) ) {
                            alt113=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 113, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case INPUT:
                        {
                        alt113=1;
                        }
                        break;
                    case I_O:
                        {
                        alt113=3;
                        }
                        break;
                    case OUTPUT:
                        {
                        alt113=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 113, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:444:11: cd_input
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cd_input_in_cd_entry3330);
                    cd_input280=cd_input();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cd_input280.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:444:22: cd_output
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cd_output_in_cd_entry3334);
                    cd_output281=cd_output();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cd_output281.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:444:35: cd_io
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_cd_io_in_cd_entry3339);
                    cd_io282=cd_io();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cd_io282.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "cd_entry"

    public static class cd_input_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cd_input"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:1: cd_input : CD WORD ( FOR )? ( INITIAL )? INPUT ( cd_clause )* -> ^( CD INPUT WORD ( INITIAL )? ( cd_clause )* ) ;
    public final DataDivision.cd_input_return cd_input() throws RecognitionException {
        DataDivision.cd_input_return retval = new DataDivision.cd_input_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CD283=null;
        Token WORD284=null;
        Token FOR285=null;
        Token INITIAL286=null;
        Token INPUT287=null;
        DataDivision.cd_clause_return cd_clause288 = null;


        CommonTree CD283_tree=null;
        CommonTree WORD284_tree=null;
        CommonTree FOR285_tree=null;
        CommonTree INITIAL286_tree=null;
        CommonTree INPUT287_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_INPUT=new RewriteRuleTokenStream(adaptor,"token INPUT");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleTokenStream stream_INITIAL=new RewriteRuleTokenStream(adaptor,"token INITIAL");
        RewriteRuleSubtreeStream stream_cd_clause=new RewriteRuleSubtreeStream(adaptor,"rule cd_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:9: ( CD WORD ( FOR )? ( INITIAL )? INPUT ( cd_clause )* -> ^( CD INPUT WORD ( INITIAL )? ( cd_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:11: CD WORD ( FOR )? ( INITIAL )? INPUT ( cd_clause )*
            {
            CD283=(Token)match(input,CD,FOLLOW_CD_in_cd_input3345); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CD.add(CD283);

            WORD284=(Token)match(input,WORD,FOLLOW_WORD_in_cd_input3347); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD284);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:19: ( FOR )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==FOR) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: FOR
                    {
                    FOR285=(Token)match(input,FOR,FOLLOW_FOR_in_cd_input3349); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR285);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:24: ( INITIAL )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==INITIAL) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: INITIAL
                    {
                    INITIAL286=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_cd_input3352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INITIAL.add(INITIAL286);


                    }
                    break;

            }

            INPUT287=(Token)match(input,INPUT,FOLLOW_INPUT_in_cd_input3355); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INPUT.add(INPUT287);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:39: ( cd_clause )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==TEXT||(LA116_0>=SYMBOLIC && LA116_0<=MESSAGE)||(LA116_0>=STATUS && LA116_0<=COUNT)||(LA116_0>=SOURCE && LA116_0<=DESTINATION)||(LA116_0>=ERROR && LA116_0<=TERMINAL)) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: cd_clause
            	    {
            	    pushFollow(FOLLOW_cd_clause_in_cd_input3357);
            	    cd_clause288=cd_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cd_clause.add(cd_clause288.getTree());

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);



            // AST REWRITE
            // elements: cd_clause, WORD, INPUT, CD, INITIAL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 445:50: -> ^( CD INPUT WORD ( INITIAL )? ( cd_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:53: ^( CD INPUT WORD ( INITIAL )? ( cd_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CD.nextNode(), root_1);

                adaptor.addChild(root_1, stream_INPUT.nextNode());
                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:71: ( INITIAL )?
                if ( stream_INITIAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_INITIAL.nextNode());

                }
                stream_INITIAL.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:445:81: ( cd_clause )*
                while ( stream_cd_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_cd_clause.nextTree());

                }
                stream_cd_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "cd_input"

    public static class cd_output_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cd_output"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:1: cd_output : CD WORD ( FOR )? OUTPUT ( cd_clause )* -> ^( CD OUTPUT WORD ( cd_clause )* ) ;
    public final DataDivision.cd_output_return cd_output() throws RecognitionException {
        DataDivision.cd_output_return retval = new DataDivision.cd_output_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CD289=null;
        Token WORD290=null;
        Token FOR291=null;
        Token OUTPUT292=null;
        DataDivision.cd_clause_return cd_clause293 = null;


        CommonTree CD289_tree=null;
        CommonTree WORD290_tree=null;
        CommonTree FOR291_tree=null;
        CommonTree OUTPUT292_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleTokenStream stream_OUTPUT=new RewriteRuleTokenStream(adaptor,"token OUTPUT");
        RewriteRuleSubtreeStream stream_cd_clause=new RewriteRuleSubtreeStream(adaptor,"rule cd_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:10: ( CD WORD ( FOR )? OUTPUT ( cd_clause )* -> ^( CD OUTPUT WORD ( cd_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:12: CD WORD ( FOR )? OUTPUT ( cd_clause )*
            {
            CD289=(Token)match(input,CD,FOLLOW_CD_in_cd_output3383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CD.add(CD289);

            WORD290=(Token)match(input,WORD,FOLLOW_WORD_in_cd_output3385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD290);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:20: ( FOR )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==FOR) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: FOR
                    {
                    FOR291=(Token)match(input,FOR,FOLLOW_FOR_in_cd_output3387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR291);


                    }
                    break;

            }

            OUTPUT292=(Token)match(input,OUTPUT,FOLLOW_OUTPUT_in_cd_output3390); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OUTPUT.add(OUTPUT292);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:32: ( cd_clause )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==TEXT||(LA118_0>=SYMBOLIC && LA118_0<=MESSAGE)||(LA118_0>=STATUS && LA118_0<=COUNT)||(LA118_0>=SOURCE && LA118_0<=DESTINATION)||(LA118_0>=ERROR && LA118_0<=TERMINAL)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: cd_clause
            	    {
            	    pushFollow(FOLLOW_cd_clause_in_cd_output3392);
            	    cd_clause293=cd_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cd_clause.add(cd_clause293.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);



            // AST REWRITE
            // elements: OUTPUT, WORD, cd_clause, CD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 446:44: -> ^( CD OUTPUT WORD ( cd_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:47: ^( CD OUTPUT WORD ( cd_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CD.nextNode(), root_1);

                adaptor.addChild(root_1, stream_OUTPUT.nextNode());
                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:446:67: ( cd_clause )*
                while ( stream_cd_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_cd_clause.nextTree());

                }
                stream_cd_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "cd_output"

    public static class cd_io_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cd_io"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:1: cd_io : CD WORD ( FOR )? ( INITIAL )? I_O ( cd_clause )* -> ^( CD I_O WORD ( INITIAL )? ( cd_clause )* ) ;
    public final DataDivision.cd_io_return cd_io() throws RecognitionException {
        DataDivision.cd_io_return retval = new DataDivision.cd_io_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CD294=null;
        Token WORD295=null;
        Token FOR296=null;
        Token INITIAL297=null;
        Token I_O298=null;
        DataDivision.cd_clause_return cd_clause299 = null;


        CommonTree CD294_tree=null;
        CommonTree WORD295_tree=null;
        CommonTree FOR296_tree=null;
        CommonTree INITIAL297_tree=null;
        CommonTree I_O298_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_CD=new RewriteRuleTokenStream(adaptor,"token CD");
        RewriteRuleTokenStream stream_INITIAL=new RewriteRuleTokenStream(adaptor,"token INITIAL");
        RewriteRuleTokenStream stream_I_O=new RewriteRuleTokenStream(adaptor,"token I_O");
        RewriteRuleSubtreeStream stream_cd_clause=new RewriteRuleSubtreeStream(adaptor,"rule cd_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:7: ( CD WORD ( FOR )? ( INITIAL )? I_O ( cd_clause )* -> ^( CD I_O WORD ( INITIAL )? ( cd_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:9: CD WORD ( FOR )? ( INITIAL )? I_O ( cd_clause )*
            {
            CD294=(Token)match(input,CD,FOLLOW_CD_in_cd_io3417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CD.add(CD294);

            WORD295=(Token)match(input,WORD,FOLLOW_WORD_in_cd_io3419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD295);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:17: ( FOR )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==FOR) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: FOR
                    {
                    FOR296=(Token)match(input,FOR,FOLLOW_FOR_in_cd_io3421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR296);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:22: ( INITIAL )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==INITIAL) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: INITIAL
                    {
                    INITIAL297=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_cd_io3424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INITIAL.add(INITIAL297);


                    }
                    break;

            }

            I_O298=(Token)match(input,I_O,FOLLOW_I_O_in_cd_io3427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_I_O.add(I_O298);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:35: ( cd_clause )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==TEXT||(LA121_0>=SYMBOLIC && LA121_0<=MESSAGE)||(LA121_0>=STATUS && LA121_0<=COUNT)||(LA121_0>=SOURCE && LA121_0<=DESTINATION)||(LA121_0>=ERROR && LA121_0<=TERMINAL)) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: cd_clause
            	    {
            	    pushFollow(FOLLOW_cd_clause_in_cd_io3429);
            	    cd_clause299=cd_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cd_clause.add(cd_clause299.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);



            // AST REWRITE
            // elements: cd_clause, I_O, CD, INITIAL, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 447:46: -> ^( CD I_O WORD ( INITIAL )? ( cd_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:49: ^( CD I_O WORD ( INITIAL )? ( cd_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CD.nextNode(), root_1);

                adaptor.addChild(root_1, stream_I_O.nextNode());
                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:67: ( INITIAL )?
                if ( stream_INITIAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_INITIAL.nextNode());

                }
                stream_INITIAL.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:447:77: ( cd_clause )*
                while ( stream_cd_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_cd_clause.nextTree());

                }
                stream_cd_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "cd_io"

    public static class cd_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cd_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:449:1: cd_clause : ( queue | message_date | message_time | source | text_length | end_key | status_key | error_key | message_count | destination_count | destination_table | symbolic_destination | symbolic_terminal );
    public final DataDivision.cd_clause_return cd_clause() throws RecognitionException {
        DataDivision.cd_clause_return retval = new DataDivision.cd_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.queue_return queue300 = null;

        DataDivision.message_date_return message_date301 = null;

        DataDivision.message_time_return message_time302 = null;

        DataDivision.source_return source303 = null;

        DataDivision.text_length_return text_length304 = null;

        DataDivision.end_key_return end_key305 = null;

        DataDivision.status_key_return status_key306 = null;

        DataDivision.error_key_return error_key307 = null;

        DataDivision.message_count_return message_count308 = null;

        DataDivision.destination_count_return destination_count309 = null;

        DataDivision.destination_table_return destination_table310 = null;

        DataDivision.symbolic_destination_return symbolic_destination311 = null;

        DataDivision.symbolic_terminal_return symbolic_terminal312 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:2: ( queue | message_date | message_time | source | text_length | end_key | status_key | error_key | message_count | destination_count | destination_table | symbolic_destination | symbolic_terminal )
            int alt122=13;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:4: queue
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_queue_in_cd_clause3460);
                    queue300=queue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, queue300.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:12: message_date
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_message_date_in_cd_clause3464);
                    message_date301=message_date();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_date301.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:27: message_time
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_message_time_in_cd_clause3468);
                    message_time302=message_time();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_time302.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:42: source
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_source_in_cd_clause3472);
                    source303=source();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, source303.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:51: text_length
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_text_length_in_cd_clause3476);
                    text_length304=text_length();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, text_length304.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:65: end_key
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_end_key_in_cd_clause3480);
                    end_key305=end_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, end_key305.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:75: status_key
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_status_key_in_cd_clause3484);
                    status_key306=status_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, status_key306.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:450:88: error_key
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_error_key_in_cd_clause3488);
                    error_key307=error_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, error_key307.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:451:3: message_count
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_message_count_in_cd_clause3495);
                    message_count308=message_count();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, message_count308.getTree());

                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:451:19: destination_count
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_destination_count_in_cd_clause3499);
                    destination_count309=destination_count();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, destination_count309.getTree());

                    }
                    break;
                case 11 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:451:39: destination_table
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_destination_table_in_cd_clause3503);
                    destination_table310=destination_table();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, destination_table310.getTree());

                    }
                    break;
                case 12 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:451:59: symbolic_destination
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_symbolic_destination_in_cd_clause3507);
                    symbolic_destination311=symbolic_destination();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolic_destination311.getTree());

                    }
                    break;
                case 13 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:451:82: symbolic_terminal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_symbolic_terminal_in_cd_clause3511);
                    symbolic_terminal312=symbolic_terminal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, symbolic_terminal312.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "cd_clause"

    public static class queue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "queue"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:452:1: queue : ( ( SYMBOLIC )? QUEUE ( IS )? WORD -> ^( QUEUE WORD ) | ( SYMBOLIC )? SUB_QUEUE_1 ( IS )? WORD -> ^( SUB_QUEUE_1 WORD ) | ( SYMBOLIC )? SUB_QUEUE_2 ( IS )? WORD -> ^( SUB_QUEUE_2 WORD ) | ( SYMBOLIC )? SUB_QUEUE_3 ( IS )? WORD -> ^( SUB_QUEUE_3 WORD ) );
    public final DataDivision.queue_return queue() throws RecognitionException {
        DataDivision.queue_return retval = new DataDivision.queue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYMBOLIC313=null;
        Token QUEUE314=null;
        Token IS315=null;
        Token WORD316=null;
        Token SYMBOLIC317=null;
        Token SUB_QUEUE_1318=null;
        Token IS319=null;
        Token WORD320=null;
        Token SYMBOLIC321=null;
        Token SUB_QUEUE_2322=null;
        Token IS323=null;
        Token WORD324=null;
        Token SYMBOLIC325=null;
        Token SUB_QUEUE_3326=null;
        Token IS327=null;
        Token WORD328=null;

        CommonTree SYMBOLIC313_tree=null;
        CommonTree QUEUE314_tree=null;
        CommonTree IS315_tree=null;
        CommonTree WORD316_tree=null;
        CommonTree SYMBOLIC317_tree=null;
        CommonTree SUB_QUEUE_1318_tree=null;
        CommonTree IS319_tree=null;
        CommonTree WORD320_tree=null;
        CommonTree SYMBOLIC321_tree=null;
        CommonTree SUB_QUEUE_2322_tree=null;
        CommonTree IS323_tree=null;
        CommonTree WORD324_tree=null;
        CommonTree SYMBOLIC325_tree=null;
        CommonTree SUB_QUEUE_3326_tree=null;
        CommonTree IS327_tree=null;
        CommonTree WORD328_tree=null;
        RewriteRuleTokenStream stream_SYMBOLIC=new RewriteRuleTokenStream(adaptor,"token SYMBOLIC");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_SUB_QUEUE_3=new RewriteRuleTokenStream(adaptor,"token SUB_QUEUE_3");
        RewriteRuleTokenStream stream_SUB_QUEUE_1=new RewriteRuleTokenStream(adaptor,"token SUB_QUEUE_1");
        RewriteRuleTokenStream stream_SUB_QUEUE_2=new RewriteRuleTokenStream(adaptor,"token SUB_QUEUE_2");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_QUEUE=new RewriteRuleTokenStream(adaptor,"token QUEUE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:452:7: ( ( SYMBOLIC )? QUEUE ( IS )? WORD -> ^( QUEUE WORD ) | ( SYMBOLIC )? SUB_QUEUE_1 ( IS )? WORD -> ^( SUB_QUEUE_1 WORD ) | ( SYMBOLIC )? SUB_QUEUE_2 ( IS )? WORD -> ^( SUB_QUEUE_2 WORD ) | ( SYMBOLIC )? SUB_QUEUE_3 ( IS )? WORD -> ^( SUB_QUEUE_3 WORD ) )
            int alt131=4;
            switch ( input.LA(1) ) {
            case SYMBOLIC:
                {
                switch ( input.LA(2) ) {
                case SUB_QUEUE_1:
                    {
                    alt131=2;
                    }
                    break;
                case SUB_QUEUE_2:
                    {
                    alt131=3;
                    }
                    break;
                case SUB_QUEUE_3:
                    {
                    alt131=4;
                    }
                    break;
                case QUEUE:
                    {
                    alt131=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 1, input);

                    throw nvae;
                }

                }
                break;
            case QUEUE:
                {
                alt131=1;
                }
                break;
            case SUB_QUEUE_1:
                {
                alt131=2;
                }
                break;
            case SUB_QUEUE_2:
                {
                alt131=3;
                }
                break;
            case SUB_QUEUE_3:
                {
                alt131=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:452:9: ( SYMBOLIC )? QUEUE ( IS )? WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:452:9: ( SYMBOLIC )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==SYMBOLIC) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                            {
                            SYMBOLIC313=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_queue3518); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC313);


                            }
                            break;

                    }

                    QUEUE314=(Token)match(input,QUEUE,FOLLOW_QUEUE_in_queue3521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUEUE.add(QUEUE314);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:452:25: ( IS )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==IS) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS315=(Token)match(input,IS,FOLLOW_IS_in_queue3523); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS315);


                            }
                            break;

                    }

                    WORD316=(Token)match(input,WORD,FOLLOW_WORD_in_queue3526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD316);



                    // AST REWRITE
                    // elements: QUEUE, WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 452:35: -> ^( QUEUE WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:452:38: ^( QUEUE WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_QUEUE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:453:4: ( SYMBOLIC )? SUB_QUEUE_1 ( IS )? WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:453:4: ( SYMBOLIC )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==SYMBOLIC) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                            {
                            SYMBOLIC317=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_queue3540); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC317);


                            }
                            break;

                    }

                    SUB_QUEUE_1318=(Token)match(input,SUB_QUEUE_1,FOLLOW_SUB_QUEUE_1_in_queue3543); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB_QUEUE_1.add(SUB_QUEUE_1318);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:453:26: ( IS )?
                    int alt126=2;
                    int LA126_0 = input.LA(1);

                    if ( (LA126_0==IS) ) {
                        alt126=1;
                    }
                    switch (alt126) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS319=(Token)match(input,IS,FOLLOW_IS_in_queue3545); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS319);


                            }
                            break;

                    }

                    WORD320=(Token)match(input,WORD,FOLLOW_WORD_in_queue3548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD320);



                    // AST REWRITE
                    // elements: WORD, SUB_QUEUE_1
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 453:35: -> ^( SUB_QUEUE_1 WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:453:38: ^( SUB_QUEUE_1 WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SUB_QUEUE_1.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:454:4: ( SYMBOLIC )? SUB_QUEUE_2 ( IS )? WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:454:4: ( SYMBOLIC )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==SYMBOLIC) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                            {
                            SYMBOLIC321=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_queue3561); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC321);


                            }
                            break;

                    }

                    SUB_QUEUE_2322=(Token)match(input,SUB_QUEUE_2,FOLLOW_SUB_QUEUE_2_in_queue3564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB_QUEUE_2.add(SUB_QUEUE_2322);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:454:26: ( IS )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==IS) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS323=(Token)match(input,IS,FOLLOW_IS_in_queue3566); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS323);


                            }
                            break;

                    }

                    WORD324=(Token)match(input,WORD,FOLLOW_WORD_in_queue3569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD324);



                    // AST REWRITE
                    // elements: WORD, SUB_QUEUE_2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 454:35: -> ^( SUB_QUEUE_2 WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:454:38: ^( SUB_QUEUE_2 WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SUB_QUEUE_2.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:455:4: ( SYMBOLIC )? SUB_QUEUE_3 ( IS )? WORD
                    {
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:455:4: ( SYMBOLIC )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==SYMBOLIC) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                            {
                            SYMBOLIC325=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_queue3582); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC325);


                            }
                            break;

                    }

                    SUB_QUEUE_3326=(Token)match(input,SUB_QUEUE_3,FOLLOW_SUB_QUEUE_3_in_queue3585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUB_QUEUE_3.add(SUB_QUEUE_3326);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:455:26: ( IS )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==IS) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS327=(Token)match(input,IS,FOLLOW_IS_in_queue3587); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS327);


                            }
                            break;

                    }

                    WORD328=(Token)match(input,WORD,FOLLOW_WORD_in_queue3590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD328);



                    // AST REWRITE
                    // elements: SUB_QUEUE_3, WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 455:35: -> ^( SUB_QUEUE_3 WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:455:38: ^( SUB_QUEUE_3 WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_SUB_QUEUE_3.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "queue"

    public static class message_date_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_date"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:457:1: message_date : MESSAGE DATE ( IS )? WORD -> ^( P_MESSAGE_DATE WORD ) ;
    public final DataDivision.message_date_return message_date() throws RecognitionException {
        DataDivision.message_date_return retval = new DataDivision.message_date_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MESSAGE329=null;
        Token DATE330=null;
        Token IS331=null;
        Token WORD332=null;

        CommonTree MESSAGE329_tree=null;
        CommonTree DATE330_tree=null;
        CommonTree IS331_tree=null;
        CommonTree WORD332_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_DATE=new RewriteRuleTokenStream(adaptor,"token DATE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:458:2: ( MESSAGE DATE ( IS )? WORD -> ^( P_MESSAGE_DATE WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:458:4: MESSAGE DATE ( IS )? WORD
            {
            MESSAGE329=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_date3608); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MESSAGE.add(MESSAGE329);

            DATE330=(Token)match(input,DATE,FOLLOW_DATE_in_message_date3610); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DATE.add(DATE330);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:458:17: ( IS )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==IS) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS331=(Token)match(input,IS,FOLLOW_IS_in_message_date3612); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS331);


                    }
                    break;

            }

            WORD332=(Token)match(input,WORD,FOLLOW_WORD_in_message_date3615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD332);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 458:27: -> ^( P_MESSAGE_DATE WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:458:30: ^( P_MESSAGE_DATE WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_MESSAGE_DATE, "P_MESSAGE_DATE"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "message_date"

    public static class message_time_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_time"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:459:1: message_time : MESSAGE TIME ( IS )? WORD -> ^( P_MESSAGE_TIME WORD ) ;
    public final DataDivision.message_time_return message_time() throws RecognitionException {
        DataDivision.message_time_return retval = new DataDivision.message_time_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MESSAGE333=null;
        Token TIME334=null;
        Token IS335=null;
        Token WORD336=null;

        CommonTree MESSAGE333_tree=null;
        CommonTree TIME334_tree=null;
        CommonTree IS335_tree=null;
        CommonTree WORD336_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_TIME=new RewriteRuleTokenStream(adaptor,"token TIME");
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:460:2: ( MESSAGE TIME ( IS )? WORD -> ^( P_MESSAGE_TIME WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:460:4: MESSAGE TIME ( IS )? WORD
            {
            MESSAGE333=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_time3632); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MESSAGE.add(MESSAGE333);

            TIME334=(Token)match(input,TIME,FOLLOW_TIME_in_message_time3634); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TIME.add(TIME334);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:460:17: ( IS )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==IS) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS335=(Token)match(input,IS,FOLLOW_IS_in_message_time3636); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS335);


                    }
                    break;

            }

            WORD336=(Token)match(input,WORD,FOLLOW_WORD_in_message_time3639); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD336);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 460:27: -> ^( P_MESSAGE_TIME WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:460:30: ^( P_MESSAGE_TIME WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_MESSAGE_TIME, "P_MESSAGE_TIME"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "message_time"

    public static class source_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "source"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:461:1: source : ( SYMBOLIC )? SOURCE ( IS )? WORD -> ^( P_SYMBOLIC_SOURCE WORD ) ;
    public final DataDivision.source_return source() throws RecognitionException {
        DataDivision.source_return retval = new DataDivision.source_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYMBOLIC337=null;
        Token SOURCE338=null;
        Token IS339=null;
        Token WORD340=null;

        CommonTree SYMBOLIC337_tree=null;
        CommonTree SOURCE338_tree=null;
        CommonTree IS339_tree=null;
        CommonTree WORD340_tree=null;
        RewriteRuleTokenStream stream_SYMBOLIC=new RewriteRuleTokenStream(adaptor,"token SYMBOLIC");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_SOURCE=new RewriteRuleTokenStream(adaptor,"token SOURCE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:461:8: ( ( SYMBOLIC )? SOURCE ( IS )? WORD -> ^( P_SYMBOLIC_SOURCE WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:461:10: ( SYMBOLIC )? SOURCE ( IS )? WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:461:10: ( SYMBOLIC )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==SYMBOLIC) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                    {
                    SYMBOLIC337=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_source3655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC337);


                    }
                    break;

            }

            SOURCE338=(Token)match(input,SOURCE,FOLLOW_SOURCE_in_source3658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SOURCE.add(SOURCE338);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:461:27: ( IS )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==IS) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS339=(Token)match(input,IS,FOLLOW_IS_in_source3660); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS339);


                    }
                    break;

            }

            WORD340=(Token)match(input,WORD,FOLLOW_WORD_in_source3663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD340);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 461:36: -> ^( P_SYMBOLIC_SOURCE WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:461:39: ^( P_SYMBOLIC_SOURCE WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_SYMBOLIC_SOURCE, "P_SYMBOLIC_SOURCE"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "source"

    public static class text_length_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "text_length"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:462:1: text_length : TEXT LENGTH ( IS )? WORD -> ^( P_TEXT_LENGTH WORD ) ;
    public final DataDivision.text_length_return text_length() throws RecognitionException {
        DataDivision.text_length_return retval = new DataDivision.text_length_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT341=null;
        Token LENGTH342=null;
        Token IS343=null;
        Token WORD344=null;

        CommonTree TEXT341_tree=null;
        CommonTree LENGTH342_tree=null;
        CommonTree IS343_tree=null;
        CommonTree WORD344_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_TEXT=new RewriteRuleTokenStream(adaptor,"token TEXT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_LENGTH=new RewriteRuleTokenStream(adaptor,"token LENGTH");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:463:2: ( TEXT LENGTH ( IS )? WORD -> ^( P_TEXT_LENGTH WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:463:4: TEXT LENGTH ( IS )? WORD
            {
            TEXT341=(Token)match(input,TEXT,FOLLOW_TEXT_in_text_length3679); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TEXT.add(TEXT341);

            LENGTH342=(Token)match(input,LENGTH,FOLLOW_LENGTH_in_text_length3681); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LENGTH.add(LENGTH342);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:463:16: ( IS )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==IS) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS343=(Token)match(input,IS,FOLLOW_IS_in_text_length3683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS343);


                    }
                    break;

            }

            WORD344=(Token)match(input,WORD,FOLLOW_WORD_in_text_length3686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD344);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 463:26: -> ^( P_TEXT_LENGTH WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:463:29: ^( P_TEXT_LENGTH WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_TEXT_LENGTH, "P_TEXT_LENGTH"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "text_length"

    public static class status_key_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "status_key"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:464:1: status_key : STATUS KEY ( IS )? WORD -> ^( P_STATUS_KEY WORD ) ;
    public final DataDivision.status_key_return status_key() throws RecognitionException {
        DataDivision.status_key_return retval = new DataDivision.status_key_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STATUS345=null;
        Token KEY346=null;
        Token IS347=null;
        Token WORD348=null;

        CommonTree STATUS345_tree=null;
        CommonTree KEY346_tree=null;
        CommonTree IS347_tree=null;
        CommonTree WORD348_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");
        RewriteRuleTokenStream stream_STATUS=new RewriteRuleTokenStream(adaptor,"token STATUS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:465:2: ( STATUS KEY ( IS )? WORD -> ^( P_STATUS_KEY WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:465:4: STATUS KEY ( IS )? WORD
            {
            STATUS345=(Token)match(input,STATUS,FOLLOW_STATUS_in_status_key3703); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STATUS.add(STATUS345);

            KEY346=(Token)match(input,KEY,FOLLOW_KEY_in_status_key3705); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEY.add(KEY346);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:465:15: ( IS )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==IS) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS347=(Token)match(input,IS,FOLLOW_IS_in_status_key3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS347);


                    }
                    break;

            }

            WORD348=(Token)match(input,WORD,FOLLOW_WORD_in_status_key3710); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD348);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 465:25: -> ^( P_STATUS_KEY WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:465:28: ^( P_STATUS_KEY WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_STATUS_KEY, "P_STATUS_KEY"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "status_key"

    public static class end_key_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "end_key"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:466:1: end_key : END KEY ( IS )? WORD -> ^( P_END_KEY WORD ) ;
    public final DataDivision.end_key_return end_key() throws RecognitionException {
        DataDivision.end_key_return retval = new DataDivision.end_key_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token END349=null;
        Token KEY350=null;
        Token IS351=null;
        Token WORD352=null;

        CommonTree END349_tree=null;
        CommonTree KEY350_tree=null;
        CommonTree IS351_tree=null;
        CommonTree WORD352_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:466:9: ( END KEY ( IS )? WORD -> ^( P_END_KEY WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:466:11: END KEY ( IS )? WORD
            {
            END349=(Token)match(input,END,FOLLOW_END_in_end_key3726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END349);

            KEY350=(Token)match(input,KEY,FOLLOW_KEY_in_end_key3728); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEY.add(KEY350);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:466:19: ( IS )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==IS) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS351=(Token)match(input,IS,FOLLOW_IS_in_end_key3730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS351);


                    }
                    break;

            }

            WORD352=(Token)match(input,WORD,FOLLOW_WORD_in_end_key3733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD352);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 466:29: -> ^( P_END_KEY WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:466:32: ^( P_END_KEY WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_END_KEY, "P_END_KEY"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "end_key"

    public static class message_count_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message_count"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:467:1: message_count : ( MESSAGE )? COUNT ( IS )? WORD -> ^( P_MESSAGE_COUNT WORD ) ;
    public final DataDivision.message_count_return message_count() throws RecognitionException {
        DataDivision.message_count_return retval = new DataDivision.message_count_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MESSAGE353=null;
        Token COUNT354=null;
        Token IS355=null;
        Token WORD356=null;

        CommonTree MESSAGE353_tree=null;
        CommonTree COUNT354_tree=null;
        CommonTree IS355_tree=null;
        CommonTree WORD356_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_MESSAGE=new RewriteRuleTokenStream(adaptor,"token MESSAGE");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:468:2: ( ( MESSAGE )? COUNT ( IS )? WORD -> ^( P_MESSAGE_COUNT WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:468:4: ( MESSAGE )? COUNT ( IS )? WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:468:4: ( MESSAGE )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==MESSAGE) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: MESSAGE
                    {
                    MESSAGE353=(Token)match(input,MESSAGE,FOLLOW_MESSAGE_in_message_count3751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MESSAGE.add(MESSAGE353);


                    }
                    break;

            }

            COUNT354=(Token)match(input,COUNT,FOLLOW_COUNT_in_message_count3754); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT354);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:468:19: ( IS )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==IS) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS355=(Token)match(input,IS,FOLLOW_IS_in_message_count3756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS355);


                    }
                    break;

            }

            WORD356=(Token)match(input,WORD,FOLLOW_WORD_in_message_count3759); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD356);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 468:29: -> ^( P_MESSAGE_COUNT WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:468:32: ^( P_MESSAGE_COUNT WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_MESSAGE_COUNT, "P_MESSAGE_COUNT"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "message_count"

    public static class destination_count_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "destination_count"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:469:1: destination_count : DESTINATION COUNT ( IS )? WORD -> ^( P_DESTINATION_COUNT WORD ) ;
    public final DataDivision.destination_count_return destination_count() throws RecognitionException {
        DataDivision.destination_count_return retval = new DataDivision.destination_count_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESTINATION357=null;
        Token COUNT358=null;
        Token IS359=null;
        Token WORD360=null;

        CommonTree DESTINATION357_tree=null;
        CommonTree COUNT358_tree=null;
        CommonTree IS359_tree=null;
        CommonTree WORD360_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_COUNT=new RewriteRuleTokenStream(adaptor,"token COUNT");
        RewriteRuleTokenStream stream_DESTINATION=new RewriteRuleTokenStream(adaptor,"token DESTINATION");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:470:2: ( DESTINATION COUNT ( IS )? WORD -> ^( P_DESTINATION_COUNT WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:470:4: DESTINATION COUNT ( IS )? WORD
            {
            DESTINATION357=(Token)match(input,DESTINATION,FOLLOW_DESTINATION_in_destination_count3776); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTINATION.add(DESTINATION357);

            COUNT358=(Token)match(input,COUNT,FOLLOW_COUNT_in_destination_count3778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COUNT.add(COUNT358);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:470:22: ( IS )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==IS) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS359=(Token)match(input,IS,FOLLOW_IS_in_destination_count3780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS359);


                    }
                    break;

            }

            WORD360=(Token)match(input,WORD,FOLLOW_WORD_in_destination_count3783); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD360);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 470:31: -> ^( P_DESTINATION_COUNT WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:470:34: ^( P_DESTINATION_COUNT WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_DESTINATION_COUNT, "P_DESTINATION_COUNT"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "destination_count"

    public static class destination_table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "destination_table"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:471:1: destination_table : DESTINATION TABLE occurs -> ^( P_DESTINATION_TABLE occurs ) ;
    public final DataDivision.destination_table_return destination_table() throws RecognitionException {
        DataDivision.destination_table_return retval = new DataDivision.destination_table_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DESTINATION361=null;
        Token TABLE362=null;
        DataDivision.occurs_return occurs363 = null;


        CommonTree DESTINATION361_tree=null;
        CommonTree TABLE362_tree=null;
        RewriteRuleTokenStream stream_TABLE=new RewriteRuleTokenStream(adaptor,"token TABLE");
        RewriteRuleTokenStream stream_DESTINATION=new RewriteRuleTokenStream(adaptor,"token DESTINATION");
        RewriteRuleSubtreeStream stream_occurs=new RewriteRuleSubtreeStream(adaptor,"rule occurs");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:472:2: ( DESTINATION TABLE occurs -> ^( P_DESTINATION_TABLE occurs ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:472:4: DESTINATION TABLE occurs
            {
            DESTINATION361=(Token)match(input,DESTINATION,FOLLOW_DESTINATION_in_destination_table3799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTINATION.add(DESTINATION361);

            TABLE362=(Token)match(input,TABLE,FOLLOW_TABLE_in_destination_table3801); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TABLE.add(TABLE362);

            pushFollow(FOLLOW_occurs_in_destination_table3803);
            occurs363=occurs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_occurs.add(occurs363.getTree());


            // AST REWRITE
            // elements: occurs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 472:29: -> ^( P_DESTINATION_TABLE occurs )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:472:32: ^( P_DESTINATION_TABLE occurs )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_DESTINATION_TABLE, "P_DESTINATION_TABLE"), root_1);

                adaptor.addChild(root_1, stream_occurs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "destination_table"

    public static class error_key_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "error_key"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:473:1: error_key : ERROR KEY ( IS )? WORD -> ^( P_ERROR_KEY WORD ) ;
    public final DataDivision.error_key_return error_key() throws RecognitionException {
        DataDivision.error_key_return retval = new DataDivision.error_key_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ERROR364=null;
        Token KEY365=null;
        Token IS366=null;
        Token WORD367=null;

        CommonTree ERROR364_tree=null;
        CommonTree KEY365_tree=null;
        CommonTree IS366_tree=null;
        CommonTree WORD367_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_ERROR=new RewriteRuleTokenStream(adaptor,"token ERROR");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_KEY=new RewriteRuleTokenStream(adaptor,"token KEY");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:474:2: ( ERROR KEY ( IS )? WORD -> ^( P_ERROR_KEY WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:474:4: ERROR KEY ( IS )? WORD
            {
            ERROR364=(Token)match(input,ERROR,FOLLOW_ERROR_in_error_key3819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ERROR.add(ERROR364);

            KEY365=(Token)match(input,KEY,FOLLOW_KEY_in_error_key3821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KEY.add(KEY365);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:474:14: ( IS )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==IS) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS366=(Token)match(input,IS,FOLLOW_IS_in_error_key3823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS366);


                    }
                    break;

            }

            WORD367=(Token)match(input,WORD,FOLLOW_WORD_in_error_key3826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD367);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 474:24: -> ^( P_ERROR_KEY WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:474:27: ^( P_ERROR_KEY WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_ERROR_KEY, "P_ERROR_KEY"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "error_key"

    public static class symbolic_destination_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolic_destination"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:475:1: symbolic_destination : ( SYMBOLIC )? DESTINATION ( IS )? WORD -> ^( P_SYMBOLIC_DESTINATION WORD ) ;
    public final DataDivision.symbolic_destination_return symbolic_destination() throws RecognitionException {
        DataDivision.symbolic_destination_return retval = new DataDivision.symbolic_destination_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYMBOLIC368=null;
        Token DESTINATION369=null;
        Token IS370=null;
        Token WORD371=null;

        CommonTree SYMBOLIC368_tree=null;
        CommonTree DESTINATION369_tree=null;
        CommonTree IS370_tree=null;
        CommonTree WORD371_tree=null;
        RewriteRuleTokenStream stream_SYMBOLIC=new RewriteRuleTokenStream(adaptor,"token SYMBOLIC");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_DESTINATION=new RewriteRuleTokenStream(adaptor,"token DESTINATION");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:476:2: ( ( SYMBOLIC )? DESTINATION ( IS )? WORD -> ^( P_SYMBOLIC_DESTINATION WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:476:4: ( SYMBOLIC )? DESTINATION ( IS )? WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:476:4: ( SYMBOLIC )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==SYMBOLIC) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                    {
                    SYMBOLIC368=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_symbolic_destination3845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC368);


                    }
                    break;

            }

            DESTINATION369=(Token)match(input,DESTINATION,FOLLOW_DESTINATION_in_symbolic_destination3848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DESTINATION.add(DESTINATION369);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:476:26: ( IS )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==IS) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS370=(Token)match(input,IS,FOLLOW_IS_in_symbolic_destination3850); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS370);


                    }
                    break;

            }

            WORD371=(Token)match(input,WORD,FOLLOW_WORD_in_symbolic_destination3853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD371);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 476:35: -> ^( P_SYMBOLIC_DESTINATION WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:476:38: ^( P_SYMBOLIC_DESTINATION WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_SYMBOLIC_DESTINATION, "P_SYMBOLIC_DESTINATION"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "symbolic_destination"

    public static class symbolic_terminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "symbolic_terminal"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:477:1: symbolic_terminal : ( SYMBOLIC )? TERMINAL ( IS )? WORD -> ^( P_SYMBOLIC_TERMINAL WORD ) ;
    public final DataDivision.symbolic_terminal_return symbolic_terminal() throws RecognitionException {
        DataDivision.symbolic_terminal_return retval = new DataDivision.symbolic_terminal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYMBOLIC372=null;
        Token TERMINAL373=null;
        Token IS374=null;
        Token WORD375=null;

        CommonTree SYMBOLIC372_tree=null;
        CommonTree TERMINAL373_tree=null;
        CommonTree IS374_tree=null;
        CommonTree WORD375_tree=null;
        RewriteRuleTokenStream stream_SYMBOLIC=new RewriteRuleTokenStream(adaptor,"token SYMBOLIC");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_TERMINAL=new RewriteRuleTokenStream(adaptor,"token TERMINAL");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:478:2: ( ( SYMBOLIC )? TERMINAL ( IS )? WORD -> ^( P_SYMBOLIC_TERMINAL WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:478:4: ( SYMBOLIC )? TERMINAL ( IS )? WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:478:4: ( SYMBOLIC )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==SYMBOLIC) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: SYMBOLIC
                    {
                    SYMBOLIC372=(Token)match(input,SYMBOLIC,FOLLOW_SYMBOLIC_in_symbolic_terminal3870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SYMBOLIC.add(SYMBOLIC372);


                    }
                    break;

            }

            TERMINAL373=(Token)match(input,TERMINAL,FOLLOW_TERMINAL_in_symbolic_terminal3873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TERMINAL.add(TERMINAL373);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:478:23: ( IS )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==IS) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS374=(Token)match(input,IS,FOLLOW_IS_in_symbolic_terminal3875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS374);


                    }
                    break;

            }

            WORD375=(Token)match(input,WORD,FOLLOW_WORD_in_symbolic_terminal3878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD375);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 478:32: -> ^( P_SYMBOLIC_TERMINAL WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:478:35: ^( P_SYMBOLIC_TERMINAL WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_SYMBOLIC_TERMINAL, "P_SYMBOLIC_TERMINAL"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "symbolic_terminal"

    public static class screen_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "screen_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:480:1: screen_section : SCREEN SECTION PERIOD ( screen_group )* -> ^( SCREEN ( screen_group )* ) ;
    public final DataDivision.screen_section_return screen_section() throws RecognitionException {
        DataDivision.screen_section_return retval = new DataDivision.screen_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SCREEN376=null;
        Token SECTION377=null;
        Token PERIOD378=null;
        DataDivision.screen_group_return screen_group379 = null;


        CommonTree SCREEN376_tree=null;
        CommonTree SECTION377_tree=null;
        CommonTree PERIOD378_tree=null;
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_SCREEN=new RewriteRuleTokenStream(adaptor,"token SCREEN");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_screen_group=new RewriteRuleSubtreeStream(adaptor,"rule screen_group");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:484:2: ( SCREEN SECTION PERIOD ( screen_group )* -> ^( SCREEN ( screen_group )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:484:4: SCREEN SECTION PERIOD ( screen_group )*
            {
            SCREEN376=(Token)match(input,SCREEN,FOLLOW_SCREEN_in_screen_section3900); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SCREEN.add(SCREEN376);

            SECTION377=(Token)match(input,SECTION,FOLLOW_SECTION_in_screen_section3902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SECTION.add(SECTION377);

            PERIOD378=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_screen_section3904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD378);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:484:26: ( screen_group )*
            loop147:
            do {
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==WORD) ) {
                    alt147=1;
                }


                switch (alt147) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: screen_group
            	    {
            	    pushFollow(FOLLOW_screen_group_in_screen_section3906);
            	    screen_group379=screen_group();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_screen_group.add(screen_group379.getTree());

            	    }
            	    break;

            	default :
            	    break loop147;
                }
            } while (true);



            // AST REWRITE
            // elements: screen_group, SCREEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 484:42: -> ^( SCREEN ( screen_group )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:484:45: ^( SCREEN ( screen_group )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SCREEN.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:484:54: ( screen_group )*
                while ( stream_screen_group.hasNext() ) {
                    adaptor.addChild(root_1, stream_screen_group.nextTree());

                }
                stream_screen_group.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "screen_section"

    public static class screen_group_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "screen_group"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:485:1: screen_group : level= WORD name= WORD ( screen_group_clause )* PERIOD -> ^( P_SCREEN_GROUP ( screen_group_clause )* ) ;
    public final DataDivision.screen_group_return screen_group() throws RecognitionException {
        DataDivision.screen_group_return retval = new DataDivision.screen_group_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token level=null;
        Token name=null;
        Token PERIOD381=null;
        DataDivision.screen_group_clause_return screen_group_clause380 = null;


        CommonTree level_tree=null;
        CommonTree name_tree=null;
        CommonTree PERIOD381_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_screen_group_clause=new RewriteRuleSubtreeStream(adaptor,"rule screen_group_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:486:3: (level= WORD name= WORD ( screen_group_clause )* PERIOD -> ^( P_SCREEN_GROUP ( screen_group_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:486:5: level= WORD name= WORD ( screen_group_clause )* PERIOD
            {
            level=(Token)match(input,WORD,FOLLOW_WORD_in_screen_group3931); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(level);

            name=(Token)match(input,WORD,FOLLOW_WORD_in_screen_group3935); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(name);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:486:26: ( screen_group_clause )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( ((LA148_0>=BACKGROUND && LA148_0<=ERASE)||LA148_0==LINE||LA148_0==VALUE||LA148_0==BLANK||LA148_0==PIC||(LA148_0>=SIGN && LA148_0<=TRAILING)||(LA148_0>=USAGE && LA148_0<=COMP_6)||(LA148_0>=DISPLAY && LA148_0<=POINTER)||LA148_0==COL||(LA148_0>=REVERSE && LA148_0<=UNDERLINE)||(LA148_0>=LOWLIGHT && LA148_0<=NO)) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: screen_group_clause
            	    {
            	    pushFollow(FOLLOW_screen_group_clause_in_screen_group3937);
            	    screen_group_clause380=screen_group_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_screen_group_clause.add(screen_group_clause380.getTree());

            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);

            PERIOD381=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_screen_group3940); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD381);



            // AST REWRITE
            // elements: screen_group_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 486:53: -> ^( P_SCREEN_GROUP ( screen_group_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:486:56: ^( P_SCREEN_GROUP ( screen_group_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_SCREEN_GROUP, "P_SCREEN_GROUP"), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:486:73: ( screen_group_clause )*
                while ( stream_screen_group_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_screen_group_clause.nextTree());

                }
                stream_screen_group_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "screen_group"

    public static class screen_group_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "screen_group_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:487:1: screen_group_clause : ( background | foreground | usage | sign | AUTO | SECURE | REQUIRED | FULL | BELL | BEEP | BLINK | BLANK | erase | REVERSE | REVERSED | REVERSE_VIDEO | LOWLIGHT | highlight | UNDERLINE | line_number | col_number | value | screen_pic | AUTO );
    public final DataDivision.screen_group_clause_return screen_group_clause() throws RecognitionException {
        DataDivision.screen_group_clause_return retval = new DataDivision.screen_group_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AUTO386=null;
        Token SECURE387=null;
        Token REQUIRED388=null;
        Token FULL389=null;
        Token BELL390=null;
        Token BEEP391=null;
        Token BLINK392=null;
        Token BLANK393=null;
        Token REVERSE395=null;
        Token REVERSED396=null;
        Token REVERSE_VIDEO397=null;
        Token LOWLIGHT398=null;
        Token UNDERLINE400=null;
        Token AUTO405=null;
        DataDivision.background_return background382 = null;

        DataDivision.foreground_return foreground383 = null;

        DataDivision.usage_return usage384 = null;

        DataDivision.sign_return sign385 = null;

        DataDivision.erase_return erase394 = null;

        DataDivision.highlight_return highlight399 = null;

        DataDivision.line_number_return line_number401 = null;

        DataDivision.col_number_return col_number402 = null;

        DataDivision.value_return value403 = null;

        DataDivision.screen_pic_return screen_pic404 = null;


        CommonTree AUTO386_tree=null;
        CommonTree SECURE387_tree=null;
        CommonTree REQUIRED388_tree=null;
        CommonTree FULL389_tree=null;
        CommonTree BELL390_tree=null;
        CommonTree BEEP391_tree=null;
        CommonTree BLINK392_tree=null;
        CommonTree BLANK393_tree=null;
        CommonTree REVERSE395_tree=null;
        CommonTree REVERSED396_tree=null;
        CommonTree REVERSE_VIDEO397_tree=null;
        CommonTree LOWLIGHT398_tree=null;
        CommonTree UNDERLINE400_tree=null;
        CommonTree AUTO405_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:2: ( background | foreground | usage | sign | AUTO | SECURE | REQUIRED | FULL | BELL | BEEP | BLINK | BLANK | erase | REVERSE | REVERSED | REVERSE_VIDEO | LOWLIGHT | highlight | UNDERLINE | line_number | col_number | value | screen_pic | AUTO )
            int alt149=24;
            alt149 = dfa149.predict(input);
            switch (alt149) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:4: background
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_background_in_screen_group_clause3956);
                    background382=background();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, background382.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:17: foreground
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_foreground_in_screen_group_clause3960);
                    foreground383=foreground();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, foreground383.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:30: usage
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_usage_in_screen_group_clause3964);
                    usage384=usage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usage384.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:38: sign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sign_in_screen_group_clause3968);
                    sign385=sign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sign385.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:45: AUTO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AUTO386=(Token)match(input,AUTO,FOLLOW_AUTO_in_screen_group_clause3972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AUTO386_tree = (CommonTree)adaptor.create(AUTO386);
                    adaptor.addChild(root_0, AUTO386_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:52: SECURE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SECURE387=(Token)match(input,SECURE,FOLLOW_SECURE_in_screen_group_clause3976); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SECURE387_tree = (CommonTree)adaptor.create(SECURE387);
                    adaptor.addChild(root_0, SECURE387_tree);
                    }

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:61: REQUIRED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REQUIRED388=(Token)match(input,REQUIRED,FOLLOW_REQUIRED_in_screen_group_clause3980); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REQUIRED388_tree = (CommonTree)adaptor.create(REQUIRED388);
                    adaptor.addChild(root_0, REQUIRED388_tree);
                    }

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:72: FULL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FULL389=(Token)match(input,FULL,FOLLOW_FULL_in_screen_group_clause3984); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FULL389_tree = (CommonTree)adaptor.create(FULL389);
                    adaptor.addChild(root_0, FULL389_tree);
                    }

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:79: BELL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BELL390=(Token)match(input,BELL,FOLLOW_BELL_in_screen_group_clause3988); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BELL390_tree = (CommonTree)adaptor.create(BELL390);
                    adaptor.addChild(root_0, BELL390_tree);
                    }

                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:86: BEEP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BEEP391=(Token)match(input,BEEP,FOLLOW_BEEP_in_screen_group_clause3992); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BEEP391_tree = (CommonTree)adaptor.create(BEEP391);
                    adaptor.addChild(root_0, BEEP391_tree);
                    }

                    }
                    break;
                case 11 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:93: BLINK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLINK392=(Token)match(input,BLINK,FOLLOW_BLINK_in_screen_group_clause3996); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BLINK392_tree = (CommonTree)adaptor.create(BLINK392);
                    adaptor.addChild(root_0, BLINK392_tree);
                    }

                    }
                    break;
                case 12 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:101: BLANK
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BLANK393=(Token)match(input,BLANK,FOLLOW_BLANK_in_screen_group_clause4000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BLANK393_tree = (CommonTree)adaptor.create(BLANK393);
                    adaptor.addChild(root_0, BLANK393_tree);
                    }

                    }
                    break;
                case 13 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:4: erase
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_erase_in_screen_group_clause4005);
                    erase394=erase();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, erase394.getTree());

                    }
                    break;
                case 14 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:12: REVERSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REVERSE395=(Token)match(input,REVERSE,FOLLOW_REVERSE_in_screen_group_clause4009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REVERSE395_tree = (CommonTree)adaptor.create(REVERSE395);
                    adaptor.addChild(root_0, REVERSE395_tree);
                    }

                    }
                    break;
                case 15 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:22: REVERSED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REVERSED396=(Token)match(input,REVERSED,FOLLOW_REVERSED_in_screen_group_clause4013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REVERSED396_tree = (CommonTree)adaptor.create(REVERSED396);
                    adaptor.addChild(root_0, REVERSED396_tree);
                    }

                    }
                    break;
                case 16 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:33: REVERSE_VIDEO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    REVERSE_VIDEO397=(Token)match(input,REVERSE_VIDEO,FOLLOW_REVERSE_VIDEO_in_screen_group_clause4017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REVERSE_VIDEO397_tree = (CommonTree)adaptor.create(REVERSE_VIDEO397);
                    adaptor.addChild(root_0, REVERSE_VIDEO397_tree);
                    }

                    }
                    break;
                case 17 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:49: LOWLIGHT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    LOWLIGHT398=(Token)match(input,LOWLIGHT,FOLLOW_LOWLIGHT_in_screen_group_clause4021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOWLIGHT398_tree = (CommonTree)adaptor.create(LOWLIGHT398);
                    adaptor.addChild(root_0, LOWLIGHT398_tree);
                    }

                    }
                    break;
                case 18 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:60: highlight
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_highlight_in_screen_group_clause4025);
                    highlight399=highlight();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, highlight399.getTree());

                    }
                    break;
                case 19 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:72: UNDERLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNDERLINE400=(Token)match(input,UNDERLINE,FOLLOW_UNDERLINE_in_screen_group_clause4029); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNDERLINE400_tree = (CommonTree)adaptor.create(UNDERLINE400);
                    adaptor.addChild(root_0, UNDERLINE400_tree);
                    }

                    }
                    break;
                case 20 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:84: line_number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_line_number_in_screen_group_clause4033);
                    line_number401=line_number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_number401.getTree());

                    }
                    break;
                case 21 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:98: col_number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_col_number_in_screen_group_clause4037);
                    col_number402=col_number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, col_number402.getTree());

                    }
                    break;
                case 22 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:489:111: value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_in_screen_group_clause4041);
                    value403=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value403.getTree());

                    }
                    break;
                case 23 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:490:4: screen_pic
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_screen_pic_in_screen_group_clause4046);
                    screen_pic404=screen_pic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, screen_pic404.getTree());

                    }
                    break;
                case 24 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:490:17: AUTO
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    AUTO405=(Token)match(input,AUTO,FOLLOW_AUTO_in_screen_group_clause4050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AUTO405_tree = (CommonTree)adaptor.create(AUTO405);
                    adaptor.addChild(root_0, AUTO405_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "screen_group_clause"

    public static class background_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "background"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:492:1: background : BACKGROUND ( IS )? WORD -> ^( BACKGROUND WORD ) ;
    public final DataDivision.background_return background() throws RecognitionException {
        DataDivision.background_return retval = new DataDivision.background_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BACKGROUND406=null;
        Token IS407=null;
        Token WORD408=null;

        CommonTree BACKGROUND406_tree=null;
        CommonTree IS407_tree=null;
        CommonTree WORD408_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_BACKGROUND=new RewriteRuleTokenStream(adaptor,"token BACKGROUND");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:493:2: ( BACKGROUND ( IS )? WORD -> ^( BACKGROUND WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:493:4: BACKGROUND ( IS )? WORD
            {
            BACKGROUND406=(Token)match(input,BACKGROUND,FOLLOW_BACKGROUND_in_background4060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BACKGROUND.add(BACKGROUND406);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:493:15: ( IS )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==IS) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS407=(Token)match(input,IS,FOLLOW_IS_in_background4062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS407);


                    }
                    break;

            }

            WORD408=(Token)match(input,WORD,FOLLOW_WORD_in_background4065); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD408);



            // AST REWRITE
            // elements: BACKGROUND, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 493:24: -> ^( BACKGROUND WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:493:27: ^( BACKGROUND WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_BACKGROUND.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "background"

    public static class foreground_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreground"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:494:1: foreground : FOREGROUND ( IS )? WORD -> ^( FOREGROUND WORD ) ;
    public final DataDivision.foreground_return foreground() throws RecognitionException {
        DataDivision.foreground_return retval = new DataDivision.foreground_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOREGROUND409=null;
        Token IS410=null;
        Token WORD411=null;

        CommonTree FOREGROUND409_tree=null;
        CommonTree IS410_tree=null;
        CommonTree WORD411_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_FOREGROUND=new RewriteRuleTokenStream(adaptor,"token FOREGROUND");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:495:2: ( FOREGROUND ( IS )? WORD -> ^( FOREGROUND WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:495:4: FOREGROUND ( IS )? WORD
            {
            FOREGROUND409=(Token)match(input,FOREGROUND,FOLLOW_FOREGROUND_in_foreground4081); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOREGROUND.add(FOREGROUND409);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:495:15: ( IS )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==IS) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS410=(Token)match(input,IS,FOLLOW_IS_in_foreground4083); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS410);


                    }
                    break;

            }

            WORD411=(Token)match(input,WORD,FOLLOW_WORD_in_foreground4086); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD411);



            // AST REWRITE
            // elements: WORD, FOREGROUND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 495:24: -> ^( FOREGROUND WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:495:27: ^( FOREGROUND WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FOREGROUND.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "foreground"

    public static class blank_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blank"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:496:1: blank : ( BLANK SCREEN -> ^( BLANK SCREEN ) | BLANK LINE -> ^( BLANK LINE ) | BLANK REMAINDER -> ^( BLANK REMAINDER ) );
    public final DataDivision.blank_return blank() throws RecognitionException {
        DataDivision.blank_return retval = new DataDivision.blank_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BLANK412=null;
        Token SCREEN413=null;
        Token BLANK414=null;
        Token LINE415=null;
        Token BLANK416=null;
        Token REMAINDER417=null;

        CommonTree BLANK412_tree=null;
        CommonTree SCREEN413_tree=null;
        CommonTree BLANK414_tree=null;
        CommonTree LINE415_tree=null;
        CommonTree BLANK416_tree=null;
        CommonTree REMAINDER417_tree=null;
        RewriteRuleTokenStream stream_REMAINDER=new RewriteRuleTokenStream(adaptor,"token REMAINDER");
        RewriteRuleTokenStream stream_SCREEN=new RewriteRuleTokenStream(adaptor,"token SCREEN");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
        RewriteRuleTokenStream stream_BLANK=new RewriteRuleTokenStream(adaptor,"token BLANK");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:496:7: ( BLANK SCREEN -> ^( BLANK SCREEN ) | BLANK LINE -> ^( BLANK LINE ) | BLANK REMAINDER -> ^( BLANK REMAINDER ) )
            int alt152=3;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==BLANK) ) {
                switch ( input.LA(2) ) {
                case SCREEN:
                    {
                    alt152=1;
                    }
                    break;
                case LINE:
                    {
                    alt152=2;
                    }
                    break;
                case REMAINDER:
                    {
                    alt152=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 152, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:496:9: BLANK SCREEN
                    {
                    BLANK412=(Token)match(input,BLANK,FOLLOW_BLANK_in_blank4101); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BLANK.add(BLANK412);

                    SCREEN413=(Token)match(input,SCREEN,FOLLOW_SCREEN_in_blank4103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCREEN.add(SCREEN413);



                    // AST REWRITE
                    // elements: SCREEN, BLANK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 496:23: -> ^( BLANK SCREEN )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:496:26: ^( BLANK SCREEN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BLANK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_SCREEN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:497:4: BLANK LINE
                    {
                    BLANK414=(Token)match(input,BLANK,FOLLOW_BLANK_in_blank4117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BLANK.add(BLANK414);

                    LINE415=(Token)match(input,LINE,FOLLOW_LINE_in_blank4119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LINE.add(LINE415);



                    // AST REWRITE
                    // elements: BLANK, LINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 497:16: -> ^( BLANK LINE )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:497:19: ^( BLANK LINE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BLANK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_LINE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:498:4: BLANK REMAINDER
                    {
                    BLANK416=(Token)match(input,BLANK,FOLLOW_BLANK_in_blank4133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BLANK.add(BLANK416);

                    REMAINDER417=(Token)match(input,REMAINDER,FOLLOW_REMAINDER_in_blank4135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REMAINDER.add(REMAINDER417);



                    // AST REWRITE
                    // elements: REMAINDER, BLANK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 498:21: -> ^( BLANK REMAINDER )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:498:24: ^( BLANK REMAINDER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_BLANK.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_REMAINDER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "blank"

    public static class erase_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "erase"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:500:1: erase : ( ERASE EOS -> ^( ERASE EOS ) | ERASE EOL -> ^( ERASE EOL ) | ERASE SCREEN -> ^( ERASE SCREEN ) );
    public final DataDivision.erase_return erase() throws RecognitionException {
        DataDivision.erase_return retval = new DataDivision.erase_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ERASE418=null;
        Token EOS419=null;
        Token ERASE420=null;
        Token EOL421=null;
        Token ERASE422=null;
        Token SCREEN423=null;

        CommonTree ERASE418_tree=null;
        CommonTree EOS419_tree=null;
        CommonTree ERASE420_tree=null;
        CommonTree EOL421_tree=null;
        CommonTree ERASE422_tree=null;
        CommonTree SCREEN423_tree=null;
        RewriteRuleTokenStream stream_ERASE=new RewriteRuleTokenStream(adaptor,"token ERASE");
        RewriteRuleTokenStream stream_EOL=new RewriteRuleTokenStream(adaptor,"token EOL");
        RewriteRuleTokenStream stream_SCREEN=new RewriteRuleTokenStream(adaptor,"token SCREEN");
        RewriteRuleTokenStream stream_EOS=new RewriteRuleTokenStream(adaptor,"token EOS");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:500:7: ( ERASE EOS -> ^( ERASE EOS ) | ERASE EOL -> ^( ERASE EOL ) | ERASE SCREEN -> ^( ERASE SCREEN ) )
            int alt153=3;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==ERASE) ) {
                switch ( input.LA(2) ) {
                case EOS:
                    {
                    alt153=1;
                    }
                    break;
                case EOL:
                    {
                    alt153=2;
                    }
                    break;
                case SCREEN:
                    {
                    alt153=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 153, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;
            }
            switch (alt153) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:500:9: ERASE EOS
                    {
                    ERASE418=(Token)match(input,ERASE,FOLLOW_ERASE_in_erase4154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ERASE.add(ERASE418);

                    EOS419=(Token)match(input,EOS,FOLLOW_EOS_in_erase4156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOS.add(EOS419);



                    // AST REWRITE
                    // elements: EOS, ERASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 500:20: -> ^( ERASE EOS )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:500:23: ^( ERASE EOS )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ERASE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_EOS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:501:4: ERASE EOL
                    {
                    ERASE420=(Token)match(input,ERASE,FOLLOW_ERASE_in_erase4170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ERASE.add(ERASE420);

                    EOL421=(Token)match(input,EOL,FOLLOW_EOL_in_erase4172); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOL.add(EOL421);



                    // AST REWRITE
                    // elements: ERASE, EOL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 501:15: -> ^( ERASE EOL )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:501:18: ^( ERASE EOL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ERASE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_EOL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:502:4: ERASE SCREEN
                    {
                    ERASE422=(Token)match(input,ERASE,FOLLOW_ERASE_in_erase4187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ERASE.add(ERASE422);

                    SCREEN423=(Token)match(input,SCREEN,FOLLOW_SCREEN_in_erase4189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SCREEN.add(SCREEN423);



                    // AST REWRITE
                    // elements: SCREEN, ERASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 502:18: -> ^( ERASE SCREEN )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:502:21: ^( ERASE SCREEN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_ERASE.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_SCREEN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "erase"

    public static class highlight_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "highlight"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:504:1: highlight : ( HIGHLIGHT | NO HIGHLIGHT );
    public final DataDivision.highlight_return highlight() throws RecognitionException {
        DataDivision.highlight_return retval = new DataDivision.highlight_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HIGHLIGHT424=null;
        Token NO425=null;
        Token HIGHLIGHT426=null;

        CommonTree HIGHLIGHT424_tree=null;
        CommonTree NO425_tree=null;
        CommonTree HIGHLIGHT426_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:505:2: ( HIGHLIGHT | NO HIGHLIGHT )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==HIGHLIGHT) ) {
                alt154=1;
            }
            else if ( (LA154_0==NO) ) {
                alt154=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:505:4: HIGHLIGHT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    HIGHLIGHT424=(Token)match(input,HIGHLIGHT,FOLLOW_HIGHLIGHT_in_highlight4208); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HIGHLIGHT424_tree = (CommonTree)adaptor.create(HIGHLIGHT424);
                    adaptor.addChild(root_0, HIGHLIGHT424_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:506:4: NO HIGHLIGHT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NO425=(Token)match(input,NO,FOLLOW_NO_in_highlight4213); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NO425_tree = (CommonTree)adaptor.create(NO425);
                    adaptor.addChild(root_0, NO425_tree);
                    }
                    HIGHLIGHT426=(Token)match(input,HIGHLIGHT,FOLLOW_HIGHLIGHT_in_highlight4215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HIGHLIGHT426_tree = (CommonTree)adaptor.create(HIGHLIGHT426);
                    adaptor.addChild(root_0, HIGHLIGHT426_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "highlight"

    public static class line_number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "line_number"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:508:1: line_number : LINE ( NUMBER )? ( IS )? pos ;
    public final DataDivision.line_number_return line_number() throws RecognitionException {
        DataDivision.line_number_return retval = new DataDivision.line_number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINE427=null;
        Token NUMBER428=null;
        Token IS429=null;
        DataDivision.pos_return pos430 = null;


        CommonTree LINE427_tree=null;
        CommonTree NUMBER428_tree=null;
        CommonTree IS429_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:509:2: ( LINE ( NUMBER )? ( IS )? pos )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:509:4: LINE ( NUMBER )? ( IS )? pos
            {
            root_0 = (CommonTree)adaptor.nil();

            LINE427=(Token)match(input,LINE,FOLLOW_LINE_in_line_number4225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LINE427_tree = (CommonTree)adaptor.create(LINE427);
            adaptor.addChild(root_0, LINE427_tree);
            }
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:509:9: ( NUMBER )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==NUMBER) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: NUMBER
                    {
                    NUMBER428=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_line_number4227); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER428_tree = (CommonTree)adaptor.create(NUMBER428);
                    adaptor.addChild(root_0, NUMBER428_tree);
                    }

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:509:17: ( IS )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==IS) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS429=(Token)match(input,IS,FOLLOW_IS_in_line_number4230); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IS429_tree = (CommonTree)adaptor.create(IS429);
                    adaptor.addChild(root_0, IS429_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_pos_in_line_number4233);
            pos430=pos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pos430.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "line_number"

    public static class col_number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "col_number"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:510:1: col_number : COL ( NUMBER )? ( IS )? pos ;
    public final DataDivision.col_number_return col_number() throws RecognitionException {
        DataDivision.col_number_return retval = new DataDivision.col_number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COL431=null;
        Token NUMBER432=null;
        Token IS433=null;
        DataDivision.pos_return pos434 = null;


        CommonTree COL431_tree=null;
        CommonTree NUMBER432_tree=null;
        CommonTree IS433_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:511:2: ( COL ( NUMBER )? ( IS )? pos )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:511:4: COL ( NUMBER )? ( IS )? pos
            {
            root_0 = (CommonTree)adaptor.nil();

            COL431=(Token)match(input,COL,FOLLOW_COL_in_col_number4241); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            COL431_tree = (CommonTree)adaptor.create(COL431);
            adaptor.addChild(root_0, COL431_tree);
            }
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:511:8: ( NUMBER )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==NUMBER) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: NUMBER
                    {
                    NUMBER432=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_col_number4243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER432_tree = (CommonTree)adaptor.create(NUMBER432);
                    adaptor.addChild(root_0, NUMBER432_tree);
                    }

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:511:16: ( IS )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==IS) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS433=(Token)match(input,IS,FOLLOW_IS_in_col_number4246); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IS433_tree = (CommonTree)adaptor.create(IS433);
                    adaptor.addChild(root_0, IS433_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_pos_in_col_number4249);
            pos434=pos();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pos434.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "col_number"

    public static class pos_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pos"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:512:1: pos : ( PLUS WORD | OP_PLUS WORD | data_name );
    public final DataDivision.pos_return pos() throws RecognitionException {
        DataDivision.pos_return retval = new DataDivision.pos_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS435=null;
        Token WORD436=null;
        Token OP_PLUS437=null;
        Token WORD438=null;
        DataDivision.data_name_return data_name439 = null;


        CommonTree PLUS435_tree=null;
        CommonTree WORD436_tree=null;
        CommonTree OP_PLUS437_tree=null;
        CommonTree WORD438_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:512:5: ( PLUS WORD | OP_PLUS WORD | data_name )
            int alt159=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt159=1;
                }
                break;
            case OP_PLUS:
                {
                alt159=2;
                }
                break;
            case WORD:
                {
                alt159=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:512:7: PLUS WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PLUS435=(Token)match(input,PLUS,FOLLOW_PLUS_in_pos4257); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS435_tree = (CommonTree)adaptor.create(PLUS435);
                    adaptor.addChild(root_0, PLUS435_tree);
                    }
                    WORD436=(Token)match(input,WORD,FOLLOW_WORD_in_pos4259); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD436_tree = (CommonTree)adaptor.create(WORD436);
                    adaptor.addChild(root_0, WORD436_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:513:4: OP_PLUS WORD
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    OP_PLUS437=(Token)match(input,OP_PLUS,FOLLOW_OP_PLUS_in_pos4264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OP_PLUS437_tree = (CommonTree)adaptor.create(OP_PLUS437);
                    adaptor.addChild(root_0, OP_PLUS437_tree);
                    }
                    WORD438=(Token)match(input,WORD,FOLLOW_WORD_in_pos4266); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD438_tree = (CommonTree)adaptor.create(WORD438);
                    adaptor.addChild(root_0, WORD438_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:514:4: data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_data_name_in_pos4271);
                    data_name439=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_name439.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "pos"

    public static class screen_pic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "screen_pic"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:516:1: screen_pic : ( PIC ( IS )? WORD to_from | PIC ( IS )? WORD USING data_name );
    public final DataDivision.screen_pic_return screen_pic() throws RecognitionException {
        DataDivision.screen_pic_return retval = new DataDivision.screen_pic_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PIC440=null;
        Token IS441=null;
        Token WORD442=null;
        Token PIC444=null;
        Token IS445=null;
        Token WORD446=null;
        Token USING447=null;
        DataDivision.to_from_return to_from443 = null;

        DataDivision.data_name_return data_name448 = null;


        CommonTree PIC440_tree=null;
        CommonTree IS441_tree=null;
        CommonTree WORD442_tree=null;
        CommonTree PIC444_tree=null;
        CommonTree IS445_tree=null;
        CommonTree WORD446_tree=null;
        CommonTree USING447_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:517:2: ( PIC ( IS )? WORD to_from | PIC ( IS )? WORD USING data_name )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==PIC) ) {
                int LA162_1 = input.LA(2);

                if ( (LA162_1==IS) ) {
                    int LA162_2 = input.LA(3);

                    if ( (LA162_2==WORD) ) {
                        int LA162_3 = input.LA(4);

                        if ( (LA162_3==USING) ) {
                            alt162=2;
                        }
                        else if ( (LA162_3==TO||LA162_3==FROM) ) {
                            alt162=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 162, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 162, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA162_1==WORD) ) {
                    int LA162_3 = input.LA(3);

                    if ( (LA162_3==USING) ) {
                        alt162=2;
                    }
                    else if ( (LA162_3==TO||LA162_3==FROM) ) {
                        alt162=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 162, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 162, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:517:4: PIC ( IS )? WORD to_from
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PIC440=(Token)match(input,PIC,FOLLOW_PIC_in_screen_pic4284); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PIC440_tree = (CommonTree)adaptor.create(PIC440);
                    adaptor.addChild(root_0, PIC440_tree);
                    }
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:517:8: ( IS )?
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==IS) ) {
                        alt160=1;
                    }
                    switch (alt160) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS441=(Token)match(input,IS,FOLLOW_IS_in_screen_pic4286); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IS441_tree = (CommonTree)adaptor.create(IS441);
                            adaptor.addChild(root_0, IS441_tree);
                            }

                            }
                            break;

                    }

                    WORD442=(Token)match(input,WORD,FOLLOW_WORD_in_screen_pic4289); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD442_tree = (CommonTree)adaptor.create(WORD442);
                    adaptor.addChild(root_0, WORD442_tree);
                    }
                    pushFollow(FOLLOW_to_from_in_screen_pic4291);
                    to_from443=to_from();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, to_from443.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:518:4: PIC ( IS )? WORD USING data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PIC444=(Token)match(input,PIC,FOLLOW_PIC_in_screen_pic4296); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PIC444_tree = (CommonTree)adaptor.create(PIC444);
                    adaptor.addChild(root_0, PIC444_tree);
                    }
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:518:8: ( IS )?
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==IS) ) {
                        alt161=1;
                    }
                    switch (alt161) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS445=(Token)match(input,IS,FOLLOW_IS_in_screen_pic4298); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IS445_tree = (CommonTree)adaptor.create(IS445);
                            adaptor.addChild(root_0, IS445_tree);
                            }

                            }
                            break;

                    }

                    WORD446=(Token)match(input,WORD,FOLLOW_WORD_in_screen_pic4301); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WORD446_tree = (CommonTree)adaptor.create(WORD446);
                    adaptor.addChild(root_0, WORD446_tree);
                    }
                    USING447=(Token)match(input,USING,FOLLOW_USING_in_screen_pic4303); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING447_tree = (CommonTree)adaptor.create(USING447);
                    adaptor.addChild(root_0, USING447_tree);
                    }
                    pushFollow(FOLLOW_data_name_in_screen_pic4305);
                    data_name448=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_name448.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "screen_pic"

    public static class to_from_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "to_from"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:520:1: to_from : ( FROM data_or_literal | TO data_name );
    public final DataDivision.to_from_return to_from() throws RecognitionException {
        DataDivision.to_from_return retval = new DataDivision.to_from_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FROM449=null;
        Token TO451=null;
        DataDivision.data_or_literal_return data_or_literal450 = null;

        DataDivision.data_name_return data_name452 = null;


        CommonTree FROM449_tree=null;
        CommonTree TO451_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:520:9: ( FROM data_or_literal | TO data_name )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==FROM) ) {
                alt163=1;
            }
            else if ( (LA163_0==TO) ) {
                alt163=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:520:11: FROM data_or_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FROM449=(Token)match(input,FROM,FOLLOW_FROM_in_to_from4315); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FROM449_tree = (CommonTree)adaptor.create(FROM449);
                    adaptor.addChild(root_0, FROM449_tree);
                    }
                    pushFollow(FOLLOW_data_or_literal_in_to_from4317);
                    data_or_literal450=data_or_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_or_literal450.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:521:4: TO data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TO451=(Token)match(input,TO,FOLLOW_TO_in_to_from4323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TO451_tree = (CommonTree)adaptor.create(TO451);
                    adaptor.addChild(root_0, TO451_tree);
                    }
                    pushFollow(FOLLOW_data_name_in_to_from4325);
                    data_name452=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_name452.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "to_from"

    public static class report_section_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report_section"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:522:1: report_section : REPORT SECTION PERIOD ( report_group )* -> ^( P_REPORT_SECTION ( report_group )* ) ;
    public final DataDivision.report_section_return report_section() throws RecognitionException {
        DataDivision.report_section_return retval = new DataDivision.report_section_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REPORT453=null;
        Token SECTION454=null;
        Token PERIOD455=null;
        DataDivision.report_group_return report_group456 = null;


        CommonTree REPORT453_tree=null;
        CommonTree SECTION454_tree=null;
        CommonTree PERIOD455_tree=null;
        RewriteRuleTokenStream stream_REPORT=new RewriteRuleTokenStream(adaptor,"token REPORT");
        RewriteRuleTokenStream stream_SECTION=new RewriteRuleTokenStream(adaptor,"token SECTION");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_report_group=new RewriteRuleSubtreeStream(adaptor,"rule report_group");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:526:2: ( REPORT SECTION PERIOD ( report_group )* -> ^( P_REPORT_SECTION ( report_group )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:526:4: REPORT SECTION PERIOD ( report_group )*
            {
            REPORT453=(Token)match(input,REPORT,FOLLOW_REPORT_in_report_section4336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REPORT.add(REPORT453);

            SECTION454=(Token)match(input,SECTION,FOLLOW_SECTION_in_report_section4338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SECTION.add(SECTION454);

            PERIOD455=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_report_section4340); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD455);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:526:26: ( report_group )*
            loop164:
            do {
                int alt164=2;
                int LA164_0 = input.LA(1);

                if ( (LA164_0==RD) ) {
                    alt164=1;
                }


                switch (alt164) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: report_group
            	    {
            	    pushFollow(FOLLOW_report_group_in_report_section4342);
            	    report_group456=report_group();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_report_group.add(report_group456.getTree());

            	    }
            	    break;

            	default :
            	    break loop164;
                }
            } while (true);



            // AST REWRITE
            // elements: report_group
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 526:43: -> ^( P_REPORT_SECTION ( report_group )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:526:46: ^( P_REPORT_SECTION ( report_group )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_REPORT_SECTION, "P_REPORT_SECTION"), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:526:65: ( report_group )*
                while ( stream_report_group.hasNext() ) {
                    adaptor.addChild(root_1, stream_report_group.nextTree());

                }
                stream_report_group.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report_section"

    public static class report_group_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report_group"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:527:1: report_group : RD WORD ( report_clause )* PERIOD ( report_group_desc )* -> ^( RD WORD ( report_clause )* ( report_group_desc )* ) ;
    public final DataDivision.report_group_return report_group() throws RecognitionException {
        DataDivision.report_group_return retval = new DataDivision.report_group_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RD457=null;
        Token WORD458=null;
        Token PERIOD460=null;
        DataDivision.report_clause_return report_clause459 = null;

        DataDivision.report_group_desc_return report_group_desc461 = null;


        CommonTree RD457_tree=null;
        CommonTree WORD458_tree=null;
        CommonTree PERIOD460_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_RD=new RewriteRuleTokenStream(adaptor,"token RD");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_report_group_desc=new RewriteRuleSubtreeStream(adaptor,"rule report_group_desc");
        RewriteRuleSubtreeStream stream_report_clause=new RewriteRuleSubtreeStream(adaptor,"rule report_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:2: ( RD WORD ( report_clause )* PERIOD ( report_group_desc )* -> ^( RD WORD ( report_clause )* ( report_group_desc )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:4: RD WORD ( report_clause )* PERIOD ( report_group_desc )*
            {
            RD457=(Token)match(input,RD,FOLLOW_RD_in_report_group4363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RD.add(RD457);

            WORD458=(Token)match(input,WORD,FOLLOW_WORD_in_report_group4365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD458);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:12: ( report_clause )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( ((LA165_0>=CODE && LA165_0<=CONTROL)||LA165_0==PAGE) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: report_clause
            	    {
            	    pushFollow(FOLLOW_report_clause_in_report_group4367);
            	    report_clause459=report_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_report_clause.add(report_clause459.getTree());

            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);

            PERIOD460=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_report_group4370); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD460);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:34: ( report_group_desc )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==WORD) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: report_group_desc
            	    {
            	    pushFollow(FOLLOW_report_group_desc_in_report_group4372);
            	    report_group_desc461=report_group_desc();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_report_group_desc.add(report_group_desc461.getTree());

            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);



            // AST REWRITE
            // elements: RD, WORD, report_group_desc, report_clause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 528:53: -> ^( RD WORD ( report_clause )* ( report_group_desc )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:56: ^( RD WORD ( report_clause )* ( report_group_desc )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RD.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:66: ( report_clause )*
                while ( stream_report_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_report_clause.nextTree());

                }
                stream_report_clause.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:528:81: ( report_group_desc )*
                while ( stream_report_group_desc.hasNext() ) {
                    adaptor.addChild(root_1, stream_report_group_desc.nextTree());

                }
                stream_report_group_desc.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report_group"

    public static class report_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:529:1: report_clause : ( code_clause | control_clause | page_limit_clause );
    public final DataDivision.report_clause_return report_clause() throws RecognitionException {
        DataDivision.report_clause_return retval = new DataDivision.report_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.code_clause_return code_clause462 = null;

        DataDivision.control_clause_return control_clause463 = null;

        DataDivision.page_limit_clause_return page_limit_clause464 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:530:2: ( code_clause | control_clause | page_limit_clause )
            int alt167=3;
            switch ( input.LA(1) ) {
            case CODE:
                {
                alt167=1;
                }
                break;
            case CONTROL:
                {
                alt167=2;
                }
                break;
            case PAGE:
                {
                alt167=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }

            switch (alt167) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:530:4: code_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_code_clause_in_report_clause4395);
                    code_clause462=code_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, code_clause462.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:530:18: control_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_control_clause_in_report_clause4399);
                    control_clause463=control_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control_clause463.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:530:35: page_limit_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_page_limit_clause_in_report_clause4403);
                    page_limit_clause464=page_limit_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, page_limit_clause464.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report_clause"

    public static class code_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "code_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:531:1: code_clause : CODE literal -> ^( CODE literal ) ;
    public final DataDivision.code_clause_return code_clause() throws RecognitionException {
        DataDivision.code_clause_return retval = new DataDivision.code_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CODE465=null;
        DataDivision.literal_return literal466 = null;


        CommonTree CODE465_tree=null;
        RewriteRuleTokenStream stream_CODE=new RewriteRuleTokenStream(adaptor,"token CODE");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:532:2: ( CODE literal -> ^( CODE literal ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:532:4: CODE literal
            {
            CODE465=(Token)match(input,CODE,FOLLOW_CODE_in_code_clause4411); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CODE.add(CODE465);

            pushFollow(FOLLOW_literal_in_code_clause4413);
            literal466=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_literal.add(literal466.getTree());


            // AST REWRITE
            // elements: CODE, literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 532:19: -> ^( CODE literal )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:532:22: ^( CODE literal )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_CODE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "code_clause"

    public static class control_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "control_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:533:1: control_clause : ( CONTROL ( IS )? ( data_name )+ -> ^( CONTROL ( data_name )+ ) | CONTROL ( IS )? FINAL ( data_name )* -> ^( CONTROL FINAL ( data_name )* ) );
    public final DataDivision.control_clause_return control_clause() throws RecognitionException {
        DataDivision.control_clause_return retval = new DataDivision.control_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONTROL467=null;
        Token IS468=null;
        Token CONTROL470=null;
        Token IS471=null;
        Token FINAL472=null;
        DataDivision.data_name_return data_name469 = null;

        DataDivision.data_name_return data_name473 = null;


        CommonTree CONTROL467_tree=null;
        CommonTree IS468_tree=null;
        CommonTree CONTROL470_tree=null;
        CommonTree IS471_tree=null;
        CommonTree FINAL472_tree=null;
        RewriteRuleTokenStream stream_FINAL=new RewriteRuleTokenStream(adaptor,"token FINAL");
        RewriteRuleTokenStream stream_CONTROL=new RewriteRuleTokenStream(adaptor,"token CONTROL");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:534:2: ( CONTROL ( IS )? ( data_name )+ -> ^( CONTROL ( data_name )+ ) | CONTROL ( IS )? FINAL ( data_name )* -> ^( CONTROL FINAL ( data_name )* ) )
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==CONTROL) ) {
                switch ( input.LA(2) ) {
                case IS:
                    {
                    int LA172_2 = input.LA(3);

                    if ( (LA172_2==FINAL) ) {
                        alt172=2;
                    }
                    else if ( (LA172_2==WORD) ) {
                        alt172=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 172, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case WORD:
                    {
                    alt172=1;
                    }
                    break;
                case FINAL:
                    {
                    alt172=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 172, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 172, 0, input);

                throw nvae;
            }
            switch (alt172) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:534:4: CONTROL ( IS )? ( data_name )+
                    {
                    CONTROL467=(Token)match(input,CONTROL,FOLLOW_CONTROL_in_control_clause4432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTROL.add(CONTROL467);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:534:12: ( IS )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==IS) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS468=(Token)match(input,IS,FOLLOW_IS_in_control_clause4434); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS468);


                            }
                            break;

                    }

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:534:16: ( data_name )+
                    int cnt169=0;
                    loop169:
                    do {
                        int alt169=2;
                        int LA169_0 = input.LA(1);

                        if ( (LA169_0==WORD) ) {
                            alt169=1;
                        }


                        switch (alt169) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
                    	    {
                    	    pushFollow(FOLLOW_data_name_in_control_clause4437);
                    	    data_name469=data_name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_name.add(data_name469.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt169 >= 1 ) break loop169;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(169, input);
                                throw eee;
                        }
                        cnt169++;
                    } while (true);



                    // AST REWRITE
                    // elements: data_name, CONTROL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 534:28: -> ^( CONTROL ( data_name )+ )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:534:31: ^( CONTROL ( data_name )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_CONTROL.nextNode(), root_1);

                        if ( !(stream_data_name.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_data_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_name.nextTree());

                        }
                        stream_data_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:535:4: CONTROL ( IS )? FINAL ( data_name )*
                    {
                    CONTROL470=(Token)match(input,CONTROL,FOLLOW_CONTROL_in_control_clause4453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTROL.add(CONTROL470);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:535:12: ( IS )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==IS) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                            {
                            IS471=(Token)match(input,IS,FOLLOW_IS_in_control_clause4455); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IS.add(IS471);


                            }
                            break;

                    }

                    FINAL472=(Token)match(input,FINAL,FOLLOW_FINAL_in_control_clause4458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FINAL.add(FINAL472);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:535:22: ( data_name )*
                    loop171:
                    do {
                        int alt171=2;
                        int LA171_0 = input.LA(1);

                        if ( (LA171_0==WORD) ) {
                            alt171=1;
                        }


                        switch (alt171) {
                    	case 1 :
                    	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
                    	    {
                    	    pushFollow(FOLLOW_data_name_in_control_clause4460);
                    	    data_name473=data_name();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_name.add(data_name473.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop171;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: CONTROL, data_name, FINAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 535:34: -> ^( CONTROL FINAL ( data_name )* )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:535:37: ^( CONTROL FINAL ( data_name )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_CONTROL.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_FINAL.nextNode());
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:535:53: ( data_name )*
                        while ( stream_data_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_name.nextTree());

                        }
                        stream_data_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "control_clause"

    public static class page_limit_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "page_limit_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:537:1: page_limit_clause : PAGE ( page_options )* -> ^( PAGE ( page_options )* ) ;
    public final DataDivision.page_limit_clause_return page_limit_clause() throws RecognitionException {
        DataDivision.page_limit_clause_return retval = new DataDivision.page_limit_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PAGE474=null;
        DataDivision.page_options_return page_options475 = null;


        CommonTree PAGE474_tree=null;
        RewriteRuleTokenStream stream_PAGE=new RewriteRuleTokenStream(adaptor,"token PAGE");
        RewriteRuleSubtreeStream stream_page_options=new RewriteRuleSubtreeStream(adaptor,"rule page_options");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:538:2: ( PAGE ( page_options )* -> ^( PAGE ( page_options )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:538:4: PAGE ( page_options )*
            {
            PAGE474=(Token)match(input,PAGE,FOLLOW_PAGE_in_page_limit_clause4483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PAGE.add(PAGE474);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:538:9: ( page_options )*
            loop173:
            do {
                int alt173=2;
                int LA173_0 = input.LA(1);

                if ( (LA173_0==WORD||LA173_0==IS||LA173_0==FOOTING||(LA173_0>=LIMIT && LA173_0<=FIRST)||LA173_0==LAST) ) {
                    alt173=1;
                }


                switch (alt173) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: page_options
            	    {
            	    pushFollow(FOLLOW_page_options_in_page_limit_clause4485);
            	    page_options475=page_options();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_page_options.add(page_options475.getTree());

            	    }
            	    break;

            	default :
            	    break loop173;
                }
            } while (true);



            // AST REWRITE
            // elements: page_options, PAGE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 538:24: -> ^( PAGE ( page_options )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:538:27: ^( PAGE ( page_options )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PAGE.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:538:34: ( page_options )*
                while ( stream_page_options.hasNext() ) {
                    adaptor.addChild(root_1, stream_page_options.nextTree());

                }
                stream_page_options.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "page_limit_clause"

    public static class page_options_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "page_options"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:539:1: page_options : ( lines_option | heading_option | first_option | last_option | footing_option );
    public final DataDivision.page_options_return page_options() throws RecognitionException {
        DataDivision.page_options_return retval = new DataDivision.page_options_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.lines_option_return lines_option476 = null;

        DataDivision.heading_option_return heading_option477 = null;

        DataDivision.first_option_return first_option478 = null;

        DataDivision.last_option_return last_option479 = null;

        DataDivision.footing_option_return footing_option480 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:540:2: ( lines_option | heading_option | first_option | last_option | footing_option )
            int alt174=5;
            switch ( input.LA(1) ) {
            case WORD:
            case IS:
            case LIMIT:
                {
                alt174=1;
                }
                break;
            case HEADING:
                {
                alt174=2;
                }
                break;
            case FIRST:
                {
                alt174=3;
                }
                break;
            case LAST:
                {
                alt174=4;
                }
                break;
            case FOOTING:
                {
                alt174=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 174, 0, input);

                throw nvae;
            }

            switch (alt174) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:540:4: lines_option
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lines_option_in_page_options4504);
                    lines_option476=lines_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lines_option476.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:540:19: heading_option
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_heading_option_in_page_options4508);
                    heading_option477=heading_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, heading_option477.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:540:36: first_option
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_first_option_in_page_options4512);
                    first_option478=first_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, first_option478.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:540:51: last_option
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_last_option_in_page_options4516);
                    last_option479=last_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, last_option479.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:540:65: footing_option
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_footing_option_in_page_options4520);
                    footing_option480=footing_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, footing_option480.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "page_options"

    public static class lines_option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lines_option"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:542:1: lines_option : ( LIMIT )? ( IS )? WORD ( LINE )? -> ^( P_LIMIT WORD ) ;
    public final DataDivision.lines_option_return lines_option() throws RecognitionException {
        DataDivision.lines_option_return retval = new DataDivision.lines_option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LIMIT481=null;
        Token IS482=null;
        Token WORD483=null;
        Token LINE484=null;

        CommonTree LIMIT481_tree=null;
        CommonTree IS482_tree=null;
        CommonTree WORD483_tree=null;
        CommonTree LINE484_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_LIMIT=new RewriteRuleTokenStream(adaptor,"token LIMIT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:543:2: ( ( LIMIT )? ( IS )? WORD ( LINE )? -> ^( P_LIMIT WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:543:4: ( LIMIT )? ( IS )? WORD ( LINE )?
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:543:4: ( LIMIT )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==LIMIT) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: LIMIT
                    {
                    LIMIT481=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_lines_option4530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIMIT.add(LIMIT481);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:543:11: ( IS )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==IS) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS482=(Token)match(input,IS,FOLLOW_IS_in_lines_option4533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS482);


                    }
                    break;

            }

            WORD483=(Token)match(input,WORD,FOLLOW_WORD_in_lines_option4536); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD483);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:543:20: ( LINE )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( (LA177_0==LINE) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: LINE
                    {
                    LINE484=(Token)match(input,LINE,FOLLOW_LINE_in_lines_option4538); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LINE.add(LINE484);


                    }
                    break;

            }



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 543:27: -> ^( P_LIMIT WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:543:30: ^( P_LIMIT WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_LIMIT, "P_LIMIT"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "lines_option"

    public static class heading_option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "heading_option"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:544:1: heading_option : HEADING WORD -> ^( P_HEADING WORD ) ;
    public final DataDivision.heading_option_return heading_option() throws RecognitionException {
        DataDivision.heading_option_return retval = new DataDivision.heading_option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HEADING485=null;
        Token WORD486=null;

        CommonTree HEADING485_tree=null;
        CommonTree WORD486_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_HEADING=new RewriteRuleTokenStream(adaptor,"token HEADING");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:545:2: ( HEADING WORD -> ^( P_HEADING WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:545:4: HEADING WORD
            {
            HEADING485=(Token)match(input,HEADING,FOLLOW_HEADING_in_heading_option4556); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_HEADING.add(HEADING485);

            WORD486=(Token)match(input,WORD,FOLLOW_WORD_in_heading_option4558); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD486);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 545:19: -> ^( P_HEADING WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:545:22: ^( P_HEADING WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_HEADING, "P_HEADING"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "heading_option"

    public static class first_option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "first_option"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:546:1: first_option : FIRST DETAIL WORD -> ^( P_FIRST_DETAIL WORD ) ;
    public final DataDivision.first_option_return first_option() throws RecognitionException {
        DataDivision.first_option_return retval = new DataDivision.first_option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FIRST487=null;
        Token DETAIL488=null;
        Token WORD489=null;

        CommonTree FIRST487_tree=null;
        CommonTree DETAIL488_tree=null;
        CommonTree WORD489_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_DETAIL=new RewriteRuleTokenStream(adaptor,"token DETAIL");
        RewriteRuleTokenStream stream_FIRST=new RewriteRuleTokenStream(adaptor,"token FIRST");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:547:2: ( FIRST DETAIL WORD -> ^( P_FIRST_DETAIL WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:547:4: FIRST DETAIL WORD
            {
            FIRST487=(Token)match(input,FIRST,FOLLOW_FIRST_in_first_option4576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FIRST.add(FIRST487);

            DETAIL488=(Token)match(input,DETAIL,FOLLOW_DETAIL_in_first_option4578); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DETAIL.add(DETAIL488);

            WORD489=(Token)match(input,WORD,FOLLOW_WORD_in_first_option4580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD489);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 547:23: -> ^( P_FIRST_DETAIL WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:547:26: ^( P_FIRST_DETAIL WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_FIRST_DETAIL, "P_FIRST_DETAIL"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "first_option"

    public static class last_option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "last_option"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:548:1: last_option : LAST DETAIL WORD -> ^( P_LAST_DETAIL WORD ) ;
    public final DataDivision.last_option_return last_option() throws RecognitionException {
        DataDivision.last_option_return retval = new DataDivision.last_option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAST490=null;
        Token DETAIL491=null;
        Token WORD492=null;

        CommonTree LAST490_tree=null;
        CommonTree DETAIL491_tree=null;
        CommonTree WORD492_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_LAST=new RewriteRuleTokenStream(adaptor,"token LAST");
        RewriteRuleTokenStream stream_DETAIL=new RewriteRuleTokenStream(adaptor,"token DETAIL");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:549:2: ( LAST DETAIL WORD -> ^( P_LAST_DETAIL WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:549:4: LAST DETAIL WORD
            {
            LAST490=(Token)match(input,LAST,FOLLOW_LAST_in_last_option4597); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LAST.add(LAST490);

            DETAIL491=(Token)match(input,DETAIL,FOLLOW_DETAIL_in_last_option4599); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DETAIL.add(DETAIL491);

            WORD492=(Token)match(input,WORD,FOLLOW_WORD_in_last_option4601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD492);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 549:22: -> ^( P_LAST_DETAIL WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:549:25: ^( P_LAST_DETAIL WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_LAST_DETAIL, "P_LAST_DETAIL"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "last_option"

    public static class footing_option_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "footing_option"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:550:1: footing_option : FOOTING WORD -> ^( P_FOOTING WORD ) ;
    public final DataDivision.footing_option_return footing_option() throws RecognitionException {
        DataDivision.footing_option_return retval = new DataDivision.footing_option_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOOTING493=null;
        Token WORD494=null;

        CommonTree FOOTING493_tree=null;
        CommonTree WORD494_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_FOOTING=new RewriteRuleTokenStream(adaptor,"token FOOTING");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:551:2: ( FOOTING WORD -> ^( P_FOOTING WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:551:4: FOOTING WORD
            {
            FOOTING493=(Token)match(input,FOOTING,FOLLOW_FOOTING_in_footing_option4618); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOOTING.add(FOOTING493);

            WORD494=(Token)match(input,WORD,FOLLOW_WORD_in_footing_option4620); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD494);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 551:19: -> ^( P_FOOTING WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:551:22: ^( P_FOOTING WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_FOOTING, "P_FOOTING"), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "footing_option"

    public static class report_group_desc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report_group_desc"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:552:1: report_group_desc : level= WORD (name= WORD )? ( report_group_clause )* PERIOD -> ^( P_REPORT_GROUP $level ( $name)? ( report_group_clause )* ) ;
    public final DataDivision.report_group_desc_return report_group_desc() throws RecognitionException {
        DataDivision.report_group_desc_return retval = new DataDivision.report_group_desc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token level=null;
        Token name=null;
        Token PERIOD496=null;
        DataDivision.report_group_clause_return report_group_clause495 = null;


        CommonTree level_tree=null;
        CommonTree name_tree=null;
        CommonTree PERIOD496_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
        RewriteRuleSubtreeStream stream_report_group_clause=new RewriteRuleSubtreeStream(adaptor,"rule report_group_clause");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:2: (level= WORD (name= WORD )? ( report_group_clause )* PERIOD -> ^( P_REPORT_GROUP $level ( $name)? ( report_group_clause )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:4: level= WORD (name= WORD )? ( report_group_clause )* PERIOD
            {
            level=(Token)match(input,WORD,FOLLOW_WORD_in_report_group_desc4640); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(level);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:19: (name= WORD )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==WORD) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: name= WORD
                    {
                    name=(Token)match(input,WORD,FOLLOW_WORD_in_report_group_desc4644); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(name);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:26: ( report_group_clause )*
            loop179:
            do {
                int alt179=2;
                int LA179_0 = input.LA(1);

                if ( (LA179_0==GROUP||(LA179_0>=TYPE && LA179_0<=SUM)||LA179_0==LINE||LA179_0==VALUE||LA179_0==BLANK||LA179_0==JUST||LA179_0==PIC||(LA179_0>=SIGN && LA179_0<=TRAILING)||(LA179_0>=USAGE && LA179_0<=COMP_6)||(LA179_0>=DISPLAY && LA179_0<=POINTER)||LA179_0==SOURCE||LA179_0==NEXT||LA179_0==COL) ) {
                    alt179=1;
                }


                switch (alt179) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: report_group_clause
            	    {
            	    pushFollow(FOLLOW_report_group_clause_in_report_group_desc4647);
            	    report_group_clause495=report_group_clause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_report_group_clause.add(report_group_clause495.getTree());

            	    }
            	    break;

            	default :
            	    break loop179;
                }
            } while (true);

            PERIOD496=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_report_group_desc4650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD496);



            // AST REWRITE
            // elements: name, report_group_clause, level
            // token labels: level, name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_level=new RewriteRuleTokenStream(adaptor,"token level",level);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 553:54: -> ^( P_REPORT_GROUP $level ( $name)? ( report_group_clause )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:57: ^( P_REPORT_GROUP $level ( $name)? ( report_group_clause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_REPORT_GROUP, "P_REPORT_GROUP"), root_1);

                adaptor.addChild(root_1, stream_level.nextNode());
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:81: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:553:88: ( report_group_clause )*
                while ( stream_report_group_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_report_group_clause.nextTree());

                }
                stream_report_group_clause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report_group_desc"

    public static class report_group_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report_group_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:554:1: report_group_clause : ( type_clause | line_clause | next_clause | column_clause | group_clause | picture | blank | justified | sign | usage | source_clause | sum_clause | value );
    public final DataDivision.report_group_clause_return report_group_clause() throws RecognitionException {
        DataDivision.report_group_clause_return retval = new DataDivision.report_group_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.type_clause_return type_clause497 = null;

        DataDivision.line_clause_return line_clause498 = null;

        DataDivision.next_clause_return next_clause499 = null;

        DataDivision.column_clause_return column_clause500 = null;

        DataDivision.group_clause_return group_clause501 = null;

        DataDivision.picture_return picture502 = null;

        DataDivision.blank_return blank503 = null;

        DataDivision.justified_return justified504 = null;

        DataDivision.sign_return sign505 = null;

        DataDivision.usage_return usage506 = null;

        DataDivision.source_clause_return source_clause507 = null;

        DataDivision.sum_clause_return sum_clause508 = null;

        DataDivision.value_return value509 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:2: ( type_clause | line_clause | next_clause | column_clause | group_clause | picture | blank | justified | sign | usage | source_clause | sum_clause | value )
            int alt180=13;
            switch ( input.LA(1) ) {
            case TYPE:
                {
                alt180=1;
                }
                break;
            case LINE:
                {
                alt180=2;
                }
                break;
            case NEXT:
                {
                alt180=3;
                }
                break;
            case COL:
                {
                alt180=4;
                }
                break;
            case GROUP:
                {
                alt180=5;
                }
                break;
            case PIC:
                {
                alt180=6;
                }
                break;
            case BLANK:
                {
                alt180=7;
                }
                break;
            case JUST:
                {
                alt180=8;
                }
                break;
            case SIGN:
            case LEADING:
            case TRAILING:
                {
                alt180=9;
                }
                break;
            case USAGE:
            case BINARY:
            case COMP:
            case COMP_1:
            case COMP_2:
            case COMP_3:
            case COMP_4:
            case COMP_5:
            case COMP_6:
            case DISPLAY:
            case PACKED_DECIMAL:
            case INDEX:
            case POINTER:
                {
                alt180=10;
                }
                break;
            case SOURCE:
                {
                alt180=11;
                }
                break;
            case SUM:
                {
                alt180=12;
                }
                break;
            case VALUE:
                {
                alt180=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;
            }

            switch (alt180) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:4: type_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_clause_in_report_group_clause4674);
                    type_clause497=type_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_clause497.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:18: line_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_line_clause_in_report_group_clause4678);
                    line_clause498=line_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, line_clause498.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:32: next_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_next_clause_in_report_group_clause4682);
                    next_clause499=next_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, next_clause499.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:46: column_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_column_clause_in_report_group_clause4686);
                    column_clause500=column_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, column_clause500.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:62: group_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_group_clause_in_report_group_clause4690);
                    group_clause501=group_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, group_clause501.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:77: picture
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_picture_in_report_group_clause4694);
                    picture502=picture();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, picture502.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:87: blank
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_blank_in_report_group_clause4698);
                    blank503=blank();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blank503.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:95: justified
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_justified_in_report_group_clause4702);
                    justified504=justified();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, justified504.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:107: sign
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sign_in_report_group_clause4706);
                    sign505=sign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sign505.getTree());

                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:555:114: usage
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_usage_in_report_group_clause4710);
                    usage506=usage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, usage506.getTree());

                    }
                    break;
                case 11 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:556:3: source_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_source_clause_in_report_group_clause4716);
                    source_clause507=source_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, source_clause507.getTree());

                    }
                    break;
                case 12 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:556:19: sum_clause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sum_clause_in_report_group_clause4720);
                    sum_clause508=sum_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sum_clause508.getTree());

                    }
                    break;
                case 13 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:556:32: value
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_value_in_report_group_clause4724);
                    value509=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value509.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report_group_clause"

    public static class column_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "column_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:557:1: column_clause : COL WORD -> ^( COL WORD ) ;
    public final DataDivision.column_clause_return column_clause() throws RecognitionException {
        DataDivision.column_clause_return retval = new DataDivision.column_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COL510=null;
        Token WORD511=null;

        CommonTree COL510_tree=null;
        CommonTree WORD511_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_COL=new RewriteRuleTokenStream(adaptor,"token COL");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:558:2: ( COL WORD -> ^( COL WORD ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:558:4: COL WORD
            {
            COL510=(Token)match(input,COL,FOLLOW_COL_in_column_clause4732); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COL.add(COL510);

            WORD511=(Token)match(input,WORD,FOLLOW_WORD_in_column_clause4734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD511);



            // AST REWRITE
            // elements: COL, WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 558:15: -> ^( COL WORD )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:558:18: ^( COL WORD )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_COL.nextNode(), root_1);

                adaptor.addChild(root_1, stream_WORD.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "column_clause"

    public static class group_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "group_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:559:1: group_clause : GROUP ( INDICATE )? -> GROUP ;
    public final DataDivision.group_clause_return group_clause() throws RecognitionException {
        DataDivision.group_clause_return retval = new DataDivision.group_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GROUP512=null;
        Token INDICATE513=null;

        CommonTree GROUP512_tree=null;
        CommonTree INDICATE513_tree=null;
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_INDICATE=new RewriteRuleTokenStream(adaptor,"token INDICATE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:560:2: ( GROUP ( INDICATE )? -> GROUP )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:560:4: GROUP ( INDICATE )?
            {
            GROUP512=(Token)match(input,GROUP,FOLLOW_GROUP_in_group_clause4752); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GROUP.add(GROUP512);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:560:10: ( INDICATE )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==INDICATE) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: INDICATE
                    {
                    INDICATE513=(Token)match(input,INDICATE,FOLLOW_INDICATE_in_group_clause4754); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INDICATE.add(INDICATE513);


                    }
                    break;

            }



            // AST REWRITE
            // elements: GROUP
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 560:22: -> GROUP
            {
                adaptor.addChild(root_0, stream_GROUP.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "group_clause"

    public static class line_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "line_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:561:1: line_clause : LINE ( NUMBER )? ( IS )? advance -> ^( LINE advance ) ;
    public final DataDivision.line_clause_return line_clause() throws RecognitionException {
        DataDivision.line_clause_return retval = new DataDivision.line_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LINE514=null;
        Token NUMBER515=null;
        Token IS516=null;
        DataDivision.advance_return advance517 = null;


        CommonTree LINE514_tree=null;
        CommonTree NUMBER515_tree=null;
        CommonTree IS516_tree=null;
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_LINE=new RewriteRuleTokenStream(adaptor,"token LINE");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
        RewriteRuleSubtreeStream stream_advance=new RewriteRuleSubtreeStream(adaptor,"rule advance");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:562:2: ( LINE ( NUMBER )? ( IS )? advance -> ^( LINE advance ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:562:4: LINE ( NUMBER )? ( IS )? advance
            {
            LINE514=(Token)match(input,LINE,FOLLOW_LINE_in_line_clause4769); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LINE.add(LINE514);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:562:9: ( NUMBER )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==NUMBER) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: NUMBER
                    {
                    NUMBER515=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_line_clause4771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER515);


                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:562:17: ( IS )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==IS) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS516=(Token)match(input,IS,FOLLOW_IS_in_line_clause4774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS516);


                    }
                    break;

            }

            pushFollow(FOLLOW_advance_in_line_clause4777);
            advance517=advance();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_advance.add(advance517.getTree());


            // AST REWRITE
            // elements: advance, LINE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 562:29: -> ^( LINE advance )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:562:32: ^( LINE advance )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_LINE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_advance.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "line_clause"

    public static class next_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "next_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:563:1: next_clause : NEXT GROUP ( IS )? advance -> ^( GROUP advance ) ;
    public final DataDivision.next_clause_return next_clause() throws RecognitionException {
        DataDivision.next_clause_return retval = new DataDivision.next_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEXT518=null;
        Token GROUP519=null;
        Token IS520=null;
        DataDivision.advance_return advance521 = null;


        CommonTree NEXT518_tree=null;
        CommonTree GROUP519_tree=null;
        CommonTree IS520_tree=null;
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_advance=new RewriteRuleSubtreeStream(adaptor,"rule advance");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:564:2: ( NEXT GROUP ( IS )? advance -> ^( GROUP advance ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:564:4: NEXT GROUP ( IS )? advance
            {
            NEXT518=(Token)match(input,NEXT,FOLLOW_NEXT_in_next_clause4793); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEXT.add(NEXT518);

            GROUP519=(Token)match(input,GROUP,FOLLOW_GROUP_in_next_clause4795); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GROUP.add(GROUP519);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:564:15: ( IS )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==IS) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS520=(Token)match(input,IS,FOLLOW_IS_in_next_clause4797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS520);


                    }
                    break;

            }

            pushFollow(FOLLOW_advance_in_next_clause4800);
            advance521=advance();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_advance.add(advance521.getTree());


            // AST REWRITE
            // elements: advance, GROUP
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 564:28: -> ^( GROUP advance )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:564:31: ^( GROUP advance )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_GROUP.nextNode(), root_1);

                adaptor.addChild(root_1, stream_advance.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "next_clause"

    public static class source_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "source_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:565:1: source_clause : SOURCE ( IS )? data_name -> ^( SOURCE data_name ) ;
    public final DataDivision.source_clause_return source_clause() throws RecognitionException {
        DataDivision.source_clause_return retval = new DataDivision.source_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SOURCE522=null;
        Token IS523=null;
        DataDivision.data_name_return data_name524 = null;


        CommonTree SOURCE522_tree=null;
        CommonTree IS523_tree=null;
        RewriteRuleTokenStream stream_SOURCE=new RewriteRuleTokenStream(adaptor,"token SOURCE");
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:566:2: ( SOURCE ( IS )? data_name -> ^( SOURCE data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:566:4: SOURCE ( IS )? data_name
            {
            SOURCE522=(Token)match(input,SOURCE,FOLLOW_SOURCE_in_source_clause4818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SOURCE.add(SOURCE522);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:566:11: ( IS )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==IS) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS523=(Token)match(input,IS,FOLLOW_IS_in_source_clause4820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS523);


                    }
                    break;

            }

            pushFollow(FOLLOW_data_name_in_source_clause4823);
            data_name524=data_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_name.add(data_name524.getTree());


            // AST REWRITE
            // elements: SOURCE, data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 566:26: -> ^( SOURCE data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:566:29: ^( SOURCE data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SOURCE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "source_clause"

    public static class type_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:567:1: type_clause : TYPE ( IS )? report_type -> ^( TYPE report_type ) ;
    public final DataDivision.type_clause_return type_clause() throws RecognitionException {
        DataDivision.type_clause_return retval = new DataDivision.type_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE525=null;
        Token IS526=null;
        DataDivision.report_type_return report_type527 = null;


        CommonTree TYPE525_tree=null;
        CommonTree IS526_tree=null;
        RewriteRuleTokenStream stream_IS=new RewriteRuleTokenStream(adaptor,"token IS");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_report_type=new RewriteRuleSubtreeStream(adaptor,"rule report_type");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:568:2: ( TYPE ( IS )? report_type -> ^( TYPE report_type ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:568:4: TYPE ( IS )? report_type
            {
            TYPE525=(Token)match(input,TYPE,FOLLOW_TYPE_in_type_clause4842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE525);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:568:9: ( IS )?
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==IS) ) {
                alt186=1;
            }
            switch (alt186) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: IS
                    {
                    IS526=(Token)match(input,IS,FOLLOW_IS_in_type_clause4844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IS.add(IS526);


                    }
                    break;

            }

            pushFollow(FOLLOW_report_type_in_type_clause4847);
            report_type527=report_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_report_type.add(report_type527.getTree());


            // AST REWRITE
            // elements: report_type, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 568:26: -> ^( TYPE report_type )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:568:29: ^( TYPE report_type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_report_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "type_clause"

    public static class sum_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sum_clause"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:569:1: sum_clause : SUM ( data_name )+ ( upon )? ( reset_on )? -> ^( SUM ( data_name )+ ( upon )? ( reset_on )? ) ;
    public final DataDivision.sum_clause_return sum_clause() throws RecognitionException {
        DataDivision.sum_clause_return retval = new DataDivision.sum_clause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SUM528=null;
        DataDivision.data_name_return data_name529 = null;

        DataDivision.upon_return upon530 = null;

        DataDivision.reset_on_return reset_on531 = null;


        CommonTree SUM528_tree=null;
        RewriteRuleTokenStream stream_SUM=new RewriteRuleTokenStream(adaptor,"token SUM");
        RewriteRuleSubtreeStream stream_reset_on=new RewriteRuleSubtreeStream(adaptor,"rule reset_on");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        RewriteRuleSubtreeStream stream_upon=new RewriteRuleSubtreeStream(adaptor,"rule upon");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:2: ( SUM ( data_name )+ ( upon )? ( reset_on )? -> ^( SUM ( data_name )+ ( upon )? ( reset_on )? ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:4: SUM ( data_name )+ ( upon )? ( reset_on )?
            {
            SUM528=(Token)match(input,SUM,FOLLOW_SUM_in_sum_clause4864); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SUM.add(SUM528);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:8: ( data_name )+
            int cnt187=0;
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==WORD) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: data_name
            	    {
            	    pushFollow(FOLLOW_data_name_in_sum_clause4866);
            	    data_name529=data_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_data_name.add(data_name529.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt187 >= 1 ) break loop187;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(187, input);
                        throw eee;
                }
                cnt187++;
            } while (true);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:19: ( upon )?
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==UPON) ) {
                alt188=1;
            }
            switch (alt188) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: upon
                    {
                    pushFollow(FOLLOW_upon_in_sum_clause4869);
                    upon530=upon();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_upon.add(upon530.getTree());

                    }
                    break;

            }

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:25: ( reset_on )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==RESET) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: reset_on
                    {
                    pushFollow(FOLLOW_reset_on_in_sum_clause4872);
                    reset_on531=reset_on();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_reset_on.add(reset_on531.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: data_name, upon, SUM, reset_on
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 570:35: -> ^( SUM ( data_name )+ ( upon )? ( reset_on )? )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:38: ^( SUM ( data_name )+ ( upon )? ( reset_on )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SUM.nextNode(), root_1);

                if ( !(stream_data_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_data_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_name.nextTree());

                }
                stream_data_name.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:55: ( upon )?
                if ( stream_upon.hasNext() ) {
                    adaptor.addChild(root_1, stream_upon.nextTree());

                }
                stream_upon.reset();
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:570:61: ( reset_on )?
                if ( stream_reset_on.hasNext() ) {
                    adaptor.addChild(root_1, stream_reset_on.nextTree());

                }
                stream_reset_on.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "sum_clause"

    public static class upon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "upon"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:571:1: upon : UPON data_name -> ^( UPON data_name ) ;
    public final DataDivision.upon_return upon() throws RecognitionException {
        DataDivision.upon_return retval = new DataDivision.upon_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UPON532=null;
        DataDivision.data_name_return data_name533 = null;


        CommonTree UPON532_tree=null;
        RewriteRuleTokenStream stream_UPON=new RewriteRuleTokenStream(adaptor,"token UPON");
        RewriteRuleSubtreeStream stream_data_name=new RewriteRuleSubtreeStream(adaptor,"rule data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:571:6: ( UPON data_name -> ^( UPON data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:571:8: UPON data_name
            {
            UPON532=(Token)match(input,UPON,FOLLOW_UPON_in_upon4895); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UPON.add(UPON532);

            pushFollow(FOLLOW_data_name_in_upon4897);
            data_name533=data_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_data_name.add(data_name533.getTree());


            // AST REWRITE
            // elements: data_name, UPON
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 571:25: -> ^( UPON data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:571:28: ^( UPON data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_UPON.nextNode(), root_1);

                adaptor.addChild(root_1, stream_data_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "upon"

    public static class reset_on_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reset_on"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:572:1: reset_on : RESET ( ON )? final_or_data_name -> ^( RESET final_or_data_name ) ;
    public final DataDivision.reset_on_return reset_on() throws RecognitionException {
        DataDivision.reset_on_return retval = new DataDivision.reset_on_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RESET534=null;
        Token ON535=null;
        DataDivision.final_or_data_name_return final_or_data_name536 = null;


        CommonTree RESET534_tree=null;
        CommonTree ON535_tree=null;
        RewriteRuleTokenStream stream_ON=new RewriteRuleTokenStream(adaptor,"token ON");
        RewriteRuleTokenStream stream_RESET=new RewriteRuleTokenStream(adaptor,"token RESET");
        RewriteRuleSubtreeStream stream_final_or_data_name=new RewriteRuleSubtreeStream(adaptor,"rule final_or_data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:572:9: ( RESET ( ON )? final_or_data_name -> ^( RESET final_or_data_name ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:572:11: RESET ( ON )? final_or_data_name
            {
            RESET534=(Token)match(input,RESET,FOLLOW_RESET_in_reset_on4914); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RESET.add(RESET534);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:572:17: ( ON )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==ON) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: ON
                    {
                    ON535=(Token)match(input,ON,FOLLOW_ON_in_reset_on4916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ON.add(ON535);


                    }
                    break;

            }

            pushFollow(FOLLOW_final_or_data_name_in_reset_on4919);
            final_or_data_name536=final_or_data_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_final_or_data_name.add(final_or_data_name536.getTree());


            // AST REWRITE
            // elements: RESET, final_or_data_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 572:40: -> ^( RESET final_or_data_name )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:572:43: ^( RESET final_or_data_name )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RESET.nextNode(), root_1);

                adaptor.addChild(root_1, stream_final_or_data_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "reset_on"

    public static class final_or_data_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "final_or_data_name"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:573:1: final_or_data_name : ( FINAL | data_name );
    public final DataDivision.final_or_data_name_return final_or_data_name() throws RecognitionException {
        DataDivision.final_or_data_name_return retval = new DataDivision.final_or_data_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FINAL537=null;
        DataDivision.data_name_return data_name538 = null;


        CommonTree FINAL537_tree=null;

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:574:2: ( FINAL | data_name )
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==FINAL) ) {
                alt191=1;
            }
            else if ( (LA191_0==WORD) ) {
                alt191=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 191, 0, input);

                throw nvae;
            }
            switch (alt191) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:574:4: FINAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FINAL537=(Token)match(input,FINAL,FOLLOW_FINAL_in_final_or_data_name4936); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FINAL537_tree = (CommonTree)adaptor.create(FINAL537);
                    adaptor.addChild(root_0, FINAL537_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:574:12: data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_data_name_in_final_or_data_name4940);
                    data_name538=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_name538.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "final_or_data_name"

    public static class report_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "report_type"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:576:1: report_type : ( REPORT HEADING -> P_REPORT_HEADING | RH -> P_REPORT_HEADING | PAGE HEADING -> P_PAGE_HEADING | PH -> P_PAGE_HEADING | CONTROL HEADING ( final_or_data_name )? -> ^( P_CONTROL_HEADING final_or_data_name ) | CH final_or_data_name -> ^( P_CONTROL_HEADING final_or_data_name ) | DETAIL -> P_DETAIL | DE -> P_DETAIL | CONTROL FOOTING ( final_or_data_name )? -> ^( P_CONTROL_FOOTING ( final_or_data_name )? ) | CF ( final_or_data_name )? -> ^( P_CONTROL_FOOTING ( final_or_data_name )? ) | PAGE FOOTING -> P_PAGE_FOOTING | PF -> P_PAGE_FOOTING | REPORT FOOTING -> P_REPORT_FOOTING | RF -> P_REPORT_FOOTING );
    public final DataDivision.report_type_return report_type() throws RecognitionException {
        DataDivision.report_type_return retval = new DataDivision.report_type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REPORT539=null;
        Token HEADING540=null;
        Token RH541=null;
        Token PAGE542=null;
        Token HEADING543=null;
        Token PH544=null;
        Token CONTROL545=null;
        Token HEADING546=null;
        Token CH548=null;
        Token DETAIL550=null;
        Token DE551=null;
        Token CONTROL552=null;
        Token FOOTING553=null;
        Token CF555=null;
        Token PAGE557=null;
        Token FOOTING558=null;
        Token PF559=null;
        Token REPORT560=null;
        Token FOOTING561=null;
        Token RF562=null;
        DataDivision.final_or_data_name_return final_or_data_name547 = null;

        DataDivision.final_or_data_name_return final_or_data_name549 = null;

        DataDivision.final_or_data_name_return final_or_data_name554 = null;

        DataDivision.final_or_data_name_return final_or_data_name556 = null;


        CommonTree REPORT539_tree=null;
        CommonTree HEADING540_tree=null;
        CommonTree RH541_tree=null;
        CommonTree PAGE542_tree=null;
        CommonTree HEADING543_tree=null;
        CommonTree PH544_tree=null;
        CommonTree CONTROL545_tree=null;
        CommonTree HEADING546_tree=null;
        CommonTree CH548_tree=null;
        CommonTree DETAIL550_tree=null;
        CommonTree DE551_tree=null;
        CommonTree CONTROL552_tree=null;
        CommonTree FOOTING553_tree=null;
        CommonTree CF555_tree=null;
        CommonTree PAGE557_tree=null;
        CommonTree FOOTING558_tree=null;
        CommonTree PF559_tree=null;
        CommonTree REPORT560_tree=null;
        CommonTree FOOTING561_tree=null;
        CommonTree RF562_tree=null;
        RewriteRuleTokenStream stream_RH=new RewriteRuleTokenStream(adaptor,"token RH");
        RewriteRuleTokenStream stream_RF=new RewriteRuleTokenStream(adaptor,"token RF");
        RewriteRuleTokenStream stream_PAGE=new RewriteRuleTokenStream(adaptor,"token PAGE");
        RewriteRuleTokenStream stream_REPORT=new RewriteRuleTokenStream(adaptor,"token REPORT");
        RewriteRuleTokenStream stream_CONTROL=new RewriteRuleTokenStream(adaptor,"token CONTROL");
        RewriteRuleTokenStream stream_CH=new RewriteRuleTokenStream(adaptor,"token CH");
        RewriteRuleTokenStream stream_PH=new RewriteRuleTokenStream(adaptor,"token PH");
        RewriteRuleTokenStream stream_CF=new RewriteRuleTokenStream(adaptor,"token CF");
        RewriteRuleTokenStream stream_HEADING=new RewriteRuleTokenStream(adaptor,"token HEADING");
        RewriteRuleTokenStream stream_DETAIL=new RewriteRuleTokenStream(adaptor,"token DETAIL");
        RewriteRuleTokenStream stream_DE=new RewriteRuleTokenStream(adaptor,"token DE");
        RewriteRuleTokenStream stream_FOOTING=new RewriteRuleTokenStream(adaptor,"token FOOTING");
        RewriteRuleTokenStream stream_PF=new RewriteRuleTokenStream(adaptor,"token PF");
        RewriteRuleSubtreeStream stream_final_or_data_name=new RewriteRuleSubtreeStream(adaptor,"rule final_or_data_name");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:577:2: ( REPORT HEADING -> P_REPORT_HEADING | RH -> P_REPORT_HEADING | PAGE HEADING -> P_PAGE_HEADING | PH -> P_PAGE_HEADING | CONTROL HEADING ( final_or_data_name )? -> ^( P_CONTROL_HEADING final_or_data_name ) | CH final_or_data_name -> ^( P_CONTROL_HEADING final_or_data_name ) | DETAIL -> P_DETAIL | DE -> P_DETAIL | CONTROL FOOTING ( final_or_data_name )? -> ^( P_CONTROL_FOOTING ( final_or_data_name )? ) | CF ( final_or_data_name )? -> ^( P_CONTROL_FOOTING ( final_or_data_name )? ) | PAGE FOOTING -> P_PAGE_FOOTING | PF -> P_PAGE_FOOTING | REPORT FOOTING -> P_REPORT_FOOTING | RF -> P_REPORT_FOOTING )
            int alt195=14;
            alt195 = dfa195.predict(input);
            switch (alt195) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:577:4: REPORT HEADING
                    {
                    REPORT539=(Token)match(input,REPORT,FOLLOW_REPORT_in_report_type4951); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REPORT.add(REPORT539);

                    HEADING540=(Token)match(input,HEADING,FOLLOW_HEADING_in_report_type4953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HEADING.add(HEADING540);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 577:22: -> P_REPORT_HEADING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_REPORT_HEADING, "P_REPORT_HEADING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:578:4: RH
                    {
                    RH541=(Token)match(input,RH,FOLLOW_RH_in_report_type4965); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RH.add(RH541);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 578:11: -> P_REPORT_HEADING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_REPORT_HEADING, "P_REPORT_HEADING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:579:4: PAGE HEADING
                    {
                    PAGE542=(Token)match(input,PAGE,FOLLOW_PAGE_in_report_type4978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAGE.add(PAGE542);

                    HEADING543=(Token)match(input,HEADING,FOLLOW_HEADING_in_report_type4980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HEADING.add(HEADING543);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 579:20: -> P_PAGE_HEADING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_PAGE_HEADING, "P_PAGE_HEADING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:580:4: PH
                    {
                    PH544=(Token)match(input,PH,FOLLOW_PH_in_report_type4992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PH.add(PH544);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 580:11: -> P_PAGE_HEADING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_PAGE_HEADING, "P_PAGE_HEADING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:581:4: CONTROL HEADING ( final_or_data_name )?
                    {
                    CONTROL545=(Token)match(input,CONTROL,FOLLOW_CONTROL_in_report_type5006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTROL.add(CONTROL545);

                    HEADING546=(Token)match(input,HEADING,FOLLOW_HEADING_in_report_type5008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_HEADING.add(HEADING546);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:581:20: ( final_or_data_name )?
                    int alt192=2;
                    int LA192_0 = input.LA(1);

                    if ( (LA192_0==WORD||LA192_0==FINAL) ) {
                        alt192=1;
                    }
                    switch (alt192) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: final_or_data_name
                            {
                            pushFollow(FOLLOW_final_or_data_name_in_report_type5010);
                            final_or_data_name547=final_or_data_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_final_or_data_name.add(final_or_data_name547.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: final_or_data_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 581:41: -> ^( P_CONTROL_HEADING final_or_data_name )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:581:44: ^( P_CONTROL_HEADING final_or_data_name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_CONTROL_HEADING, "P_CONTROL_HEADING"), root_1);

                        adaptor.addChild(root_1, stream_final_or_data_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:582:4: CH final_or_data_name
                    {
                    CH548=(Token)match(input,CH,FOLLOW_CH_in_report_type5025); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CH.add(CH548);

                    pushFollow(FOLLOW_final_or_data_name_in_report_type5027);
                    final_or_data_name549=final_or_data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_final_or_data_name.add(final_or_data_name549.getTree());


                    // AST REWRITE
                    // elements: final_or_data_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 582:28: -> ^( P_CONTROL_HEADING final_or_data_name )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:582:31: ^( P_CONTROL_HEADING final_or_data_name )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_CONTROL_HEADING, "P_CONTROL_HEADING"), root_1);

                        adaptor.addChild(root_1, stream_final_or_data_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:583:4: DETAIL
                    {
                    DETAIL550=(Token)match(input,DETAIL,FOLLOW_DETAIL_in_report_type5042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DETAIL.add(DETAIL550);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 583:15: -> P_DETAIL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_DETAIL, "P_DETAIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:584:4: DE
                    {
                    DE551=(Token)match(input,DE,FOLLOW_DE_in_report_type5055); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DE.add(DE551);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 584:11: -> P_DETAIL
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_DETAIL, "P_DETAIL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:585:4: CONTROL FOOTING ( final_or_data_name )?
                    {
                    CONTROL552=(Token)match(input,CONTROL,FOLLOW_CONTROL_in_report_type5068); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTROL.add(CONTROL552);

                    FOOTING553=(Token)match(input,FOOTING,FOLLOW_FOOTING_in_report_type5070); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOOTING.add(FOOTING553);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:585:20: ( final_or_data_name )?
                    int alt193=2;
                    int LA193_0 = input.LA(1);

                    if ( (LA193_0==WORD||LA193_0==FINAL) ) {
                        alt193=1;
                    }
                    switch (alt193) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: final_or_data_name
                            {
                            pushFollow(FOLLOW_final_or_data_name_in_report_type5072);
                            final_or_data_name554=final_or_data_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_final_or_data_name.add(final_or_data_name554.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: final_or_data_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 585:40: -> ^( P_CONTROL_FOOTING ( final_or_data_name )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:585:43: ^( P_CONTROL_FOOTING ( final_or_data_name )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_CONTROL_FOOTING, "P_CONTROL_FOOTING"), root_1);

                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:585:63: ( final_or_data_name )?
                        if ( stream_final_or_data_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_final_or_data_name.nextTree());

                        }
                        stream_final_or_data_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:586:4: CF ( final_or_data_name )?
                    {
                    CF555=(Token)match(input,CF,FOLLOW_CF_in_report_type5087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CF.add(CF555);

                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:586:7: ( final_or_data_name )?
                    int alt194=2;
                    int LA194_0 = input.LA(1);

                    if ( (LA194_0==WORD||LA194_0==FINAL) ) {
                        alt194=1;
                    }
                    switch (alt194) {
                        case 1 :
                            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: final_or_data_name
                            {
                            pushFollow(FOLLOW_final_or_data_name_in_report_type5089);
                            final_or_data_name556=final_or_data_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_final_or_data_name.add(final_or_data_name556.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: final_or_data_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 586:29: -> ^( P_CONTROL_FOOTING ( final_or_data_name )? )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:586:32: ^( P_CONTROL_FOOTING ( final_or_data_name )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(P_CONTROL_FOOTING, "P_CONTROL_FOOTING"), root_1);

                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:586:52: ( final_or_data_name )?
                        if ( stream_final_or_data_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_final_or_data_name.nextTree());

                        }
                        stream_final_or_data_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:587:4: PAGE FOOTING
                    {
                    PAGE557=(Token)match(input,PAGE,FOLLOW_PAGE_in_report_type5106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAGE.add(PAGE557);

                    FOOTING558=(Token)match(input,FOOTING,FOLLOW_FOOTING_in_report_type5108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOOTING.add(FOOTING558);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 587:20: -> P_PAGE_FOOTING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_PAGE_FOOTING, "P_PAGE_FOOTING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:588:4: PF
                    {
                    PF559=(Token)match(input,PF,FOLLOW_PF_in_report_type5120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PF.add(PF559);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 588:11: -> P_PAGE_FOOTING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_PAGE_FOOTING, "P_PAGE_FOOTING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:589:4: REPORT FOOTING
                    {
                    REPORT560=(Token)match(input,REPORT,FOLLOW_REPORT_in_report_type5133); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REPORT.add(REPORT560);

                    FOOTING561=(Token)match(input,FOOTING,FOLLOW_FOOTING_in_report_type5135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOOTING.add(FOOTING561);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 589:22: -> P_REPORT_FOOTING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_REPORT_FOOTING, "P_REPORT_FOOTING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:590:4: RF
                    {
                    RF562=(Token)match(input,RF,FOLLOW_RF_in_report_type5147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RF.add(RF562);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 590:11: -> P_REPORT_FOOTING
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(P_REPORT_FOOTING, "P_REPORT_FOOTING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "report_type"

    public static class advance_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "advance"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:592:2: advance : ( NEXT PAGE -> PAGE | PLUS WORD -> ^( PLUS WORD ) | WORD -> WORD );
    public final DataDivision.advance_return advance() throws RecognitionException {
        DataDivision.advance_return retval = new DataDivision.advance_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEXT563=null;
        Token PAGE564=null;
        Token PLUS565=null;
        Token WORD566=null;
        Token WORD567=null;

        CommonTree NEXT563_tree=null;
        CommonTree PAGE564_tree=null;
        CommonTree PLUS565_tree=null;
        CommonTree WORD566_tree=null;
        CommonTree WORD567_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
        RewriteRuleTokenStream stream_PAGE=new RewriteRuleTokenStream(adaptor,"token PAGE");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:592:9: ( NEXT PAGE -> PAGE | PLUS WORD -> ^( PLUS WORD ) | WORD -> WORD )
            int alt196=3;
            switch ( input.LA(1) ) {
            case NEXT:
                {
                alt196=1;
                }
                break;
            case PLUS:
                {
                alt196=2;
                }
                break;
            case WORD:
                {
                alt196=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 196, 0, input);

                throw nvae;
            }

            switch (alt196) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:592:11: NEXT PAGE
                    {
                    NEXT563=(Token)match(input,NEXT,FOLLOW_NEXT_in_advance5164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEXT.add(NEXT563);

                    PAGE564=(Token)match(input,PAGE,FOLLOW_PAGE_in_advance5166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PAGE.add(PAGE564);



                    // AST REWRITE
                    // elements: PAGE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 592:23: -> PAGE
                    {
                        adaptor.addChild(root_0, stream_PAGE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:593:4: PLUS WORD
                    {
                    PLUS565=(Token)match(input,PLUS,FOLLOW_PLUS_in_advance5177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS565);

                    WORD566=(Token)match(input,WORD,FOLLOW_WORD_in_advance5179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD566);



                    // AST REWRITE
                    // elements: WORD, PLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 593:16: -> ^( PLUS WORD )
                    {
                        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:593:19: ^( PLUS WORD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_PLUS.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_WORD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:594:4: WORD
                    {
                    WORD567=(Token)match(input,WORD,FOLLOW_WORD_in_advance5194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WORD.add(WORD567);



                    // AST REWRITE
                    // elements: WORD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 594:12: -> WORD
                    {
                        adaptor.addChild(root_0, stream_WORD.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "advance"

    public static class data_or_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_or_literal"
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:597:1: data_or_literal : ( data_name | literal );
    public final DataDivision.data_or_literal_return data_or_literal() throws RecognitionException {
        DataDivision.data_or_literal_return retval = new DataDivision.data_or_literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        DataDivision.data_name_return data_name568 = null;

        DataDivision.literal_return literal569 = null;



        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:601:2: ( data_name | literal )
            int alt197=2;
            int LA197_0 = input.LA(1);

            if ( (LA197_0==WORD) ) {
                int LA197_1 = input.LA(2);

                if ( (synpred332_DataDivision()) ) {
                    alt197=1;
                }
                else if ( (true) ) {
                    alt197=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 197, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA197_0==STRING||LA197_0==ZERO||LA197_0==SPACE||LA197_0==QUOTE||LA197_0==HIGH_VALUE||LA197_0==LOW_VALUE||LA197_0==NULL||LA197_0==ALL) ) {
                alt197=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 197, 0, input);

                throw nvae;
            }
            switch (alt197) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:601:4: data_name
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_data_name_in_data_or_literal5216);
                    data_name568=data_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data_name568.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:601:16: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_data_or_literal5220);
                    literal569=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal569.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:602:1: data_name : WORD ( in_of )* -> ^( WORD ( in_of )* ) ;
    public final DataDivision.data_name_return data_name() throws RecognitionException {
        DataDivision.data_name_return retval = new DataDivision.data_name_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WORD570=null;
        DataDivision.in_of_return in_of571 = null;


        CommonTree WORD570_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleSubtreeStream stream_in_of=new RewriteRuleSubtreeStream(adaptor,"rule in_of");
        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:603:2: ( WORD ( in_of )* -> ^( WORD ( in_of )* ) )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:603:4: WORD ( in_of )*
            {
            WORD570=(Token)match(input,WORD,FOLLOW_WORD_in_data_name5228); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD570);

            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:603:9: ( in_of )*
            loop198:
            do {
                int alt198=2;
                int LA198_0 = input.LA(1);

                if ( (LA198_0==IN||LA198_0==OF) ) {
                    alt198=1;
                }


                switch (alt198) {
            	case 1 :
            	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: in_of
            	    {
            	    pushFollow(FOLLOW_in_of_in_data_name5230);
            	    in_of571=in_of();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_in_of.add(in_of571.getTree());

            	    }
            	    break;

            	default :
            	    break loop198;
                }
            } while (true);



            // AST REWRITE
            // elements: WORD, in_of
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 603:18: -> ^( WORD ( in_of )* )
            {
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:603:21: ^( WORD ( in_of )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WORD.nextNode(), root_1);

                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:603:28: ( in_of )*
                while ( stream_in_of.hasNext() ) {
                    adaptor.addChild(root_1, stream_in_of.nextTree());

                }
                stream_in_of.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:604:1: in_of : ( IN | OF ) WORD -> WORD ;
    public final DataDivision.in_of_return in_of() throws RecognitionException {
        DataDivision.in_of_return retval = new DataDivision.in_of_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN572=null;
        Token OF573=null;
        Token WORD574=null;

        CommonTree IN572_tree=null;
        CommonTree OF573_tree=null;
        CommonTree WORD574_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");

        try {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:604:7: ( ( IN | OF ) WORD -> WORD )
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:604:9: ( IN | OF ) WORD
            {
            // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:604:9: ( IN | OF )
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==IN) ) {
                alt199=1;
            }
            else if ( (LA199_0==OF) ) {
                alt199=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 199, 0, input);

                throw nvae;
            }
            switch (alt199) {
                case 1 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:604:10: IN
                    {
                    IN572=(Token)match(input,IN,FOLLOW_IN_in_in_of5250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN572);


                    }
                    break;
                case 2 :
                    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:604:15: OF
                    {
                    OF573=(Token)match(input,OF,FOLLOW_OF_in_in_of5254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF.add(OF573);


                    }
                    break;

            }

            WORD574=(Token)match(input,WORD,FOLLOW_WORD_in_in_of5257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WORD.add(WORD574);



            // AST REWRITE
            // elements: WORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 604:26: -> WORD
            {
                adaptor.addChild(root_0, stream_WORD.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    // $ANTLR start synpred45_DataDivision
    public final void synpred45_DataDivision_fragment() throws RecognitionException {   
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:26: ( LINE )
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:329:26: LINE
        {
        match(input,LINE,FOLLOW_LINE_in_synpred45_DataDivision1794); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_DataDivision

    // $ANTLR start synpred119_DataDivision
    public final void synpred119_DataDivision_fragment() throws RecognitionException {   
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:9: ( VALUE ( logical_value )+ ( when )? )
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:9: VALUE ( logical_value )+ ( when )?
        {
        match(input,VALUE,FOLLOW_VALUE_in_synpred119_DataDivision2564); if (state.failed) return ;
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:15: ( logical_value )+
        int cnt214=0;
        loop214:
        do {
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==STRING||LA214_0==WORD||LA214_0==IS||LA214_0==ZERO||LA214_0==SPACE||LA214_0==QUOTE||LA214_0==HIGH_VALUE||LA214_0==LOW_VALUE||LA214_0==NULL||LA214_0==ALL||(LA214_0>=NOT && LA214_0<=EQUAL)||(LA214_0>=GREATER && LA214_0<=LIKE)) ) {
                alt214=1;
            }


            switch (alt214) {
        	case 1 :
        	    // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: logical_value
        	    {
        	    pushFollow(FOLLOW_logical_value_in_synpred119_DataDivision2566);
        	    logical_value();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt214 >= 1 ) break loop214;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(214, input);
                    throw eee;
            }
            cnt214++;
        } while (true);

        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:372:30: ( when )?
        int alt215=2;
        int LA215_0 = input.LA(1);

        if ( (LA215_0==TO||LA215_0==WHEN||(LA215_0>=SET && LA215_0<=FALSE)) ) {
            alt215=1;
        }
        switch (alt215) {
            case 1 :
                // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:0:0: when
                {
                pushFollow(FOLLOW_when_in_synpred119_DataDivision2569);
                when();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred119_DataDivision

    // $ANTLR start synpred179_DataDivision
    public final void synpred179_DataDivision_fragment() throws RecognitionException {   
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:436:4: ( expression operator constant_expression )
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:436:4: expression operator constant_expression
        {
        pushFollow(FOLLOW_expression_in_synpred179_DataDivision3272);
        expression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_operator_in_synpred179_DataDivision3274);
        operator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_constant_expression_in_synpred179_DataDivision3276);
        constant_expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred179_DataDivision

    // $ANTLR start synpred235_DataDivision
    public final void synpred235_DataDivision_fragment() throws RecognitionException {   
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:45: ( AUTO )
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:488:45: AUTO
        {
        match(input,AUTO,FOLLOW_AUTO_in_synpred235_DataDivision3972); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred235_DataDivision

    // $ANTLR start synpred332_DataDivision
    public final void synpred332_DataDivision_fragment() throws RecognitionException {   
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:601:4: ( data_name )
        // /home/andres/NetBeansProjects/jCobolParser/src/jcobol/parser/divisions/DataDivision.g:601:4: data_name
        {
        pushFollow(FOLLOW_data_name_in_synpred332_DataDivision5216);
        data_name();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred332_DataDivision

    // Delegated rules

    public final boolean synpred119_DataDivision() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_DataDivision_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_DataDivision() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_DataDivision_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred235_DataDivision() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred235_DataDivision_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred179_DataDivision() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred179_DataDivision_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred332_DataDivision() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred332_DataDivision_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA111 dfa111 = new DFA111(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA149 dfa149 = new DFA149(this);
    protected DFA195 dfa195 = new DFA195(this);
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\140\1\146\12\uffff";
    static final String DFA8_maxS =
        "\1\u0102\1\147\12\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\10\5\uffff\1\2\1\3\1\1\1\4\7\uffff\1\5\5\uffff\1\6\1\7\13"+
            "\uffff\1\11\127\uffff\1\12\45\uffff\1\13",
            "\1\2\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "308:1: file_clause : ( external | global | block | record | label | value_of | data | linage | code_set | report );";
        }
    }
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\3\uffff\1\5\2\uffff\1\10\1\5\2\uffff";
    static final String DFA14_minS =
        "\1\151\2\25\1\24\1\25\1\uffff\2\24\1\uffff\1\146";
    static final String DFA14_maxS =
        "\1\151\1\152\1\25\1\u0102\1\25\1\uffff\2\u0102\1\uffff\1\162";
    static final String DFA14_acceptS =
        "\5\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\3\124\uffff\1\2",
            "\1\3",
            "\1\5\113\uffff\1\5\5\uffff\4\5\1\uffff\1\4\1\5\4\uffff\1\6"+
            "\5\uffff\2\5\13\uffff\1\5\127\uffff\1\5\45\uffff\1\5",
            "\1\7",
            "",
            "\1\10\1\5\112\uffff\1\10\5\uffff\2\10\1\11\1\10\1\5\6\uffff"+
            "\1\10\1\5\4\uffff\2\10\13\uffff\1\10\127\uffff\1\10\45\uffff"+
            "\1\10",
            "\1\5\113\uffff\1\5\5\uffff\4\5\2\uffff\1\5\4\uffff\1\6\5\uffff"+
            "\2\5\13\uffff\1\5\127\uffff\1\5\45\uffff\1\5",
            "",
            "\2\10\12\uffff\1\5"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "312:1: block : ( BLOCK ( CONTAINS )? range RECORD -> ^( BLOCK range RECORD ) | BLOCK ( CONTAINS )? range ( CHARACTERS )? -> ^( BLOCK range ) );";
        }
    }
    static final String DFA52_eotS =
        "\16\uffff";
    static final String DFA52_eofS =
        "\16\uffff";
    static final String DFA52_minS =
        "\1\146\3\uffff\1\146\11\uffff";
    static final String DFA52_maxS =
        "\1\u00b6\3\uffff\1\147\11\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
        "\1\14";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\5\1\6\1\4\17\uffff\1\15\14\uffff\1\3\5\uffff\1\7\1\uffff"+
            "\1\10\7\uffff\1\11\1\2\1\1\2\uffff\3\12\1\uffff\1\13\2\uffff"+
            "\11\14\11\uffff\4\14",
            "",
            "",
            "",
            "\1\5\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "345:1: record_clause : ( renames | redefines | blank_zero | external | global | justified | occurs | picture | sign | sync | usage | value );";
        }
    }
    static final String DFA89_eotS =
        "\25\uffff";
    static final String DFA89_eofS =
        "\3\uffff\3\13\7\uffff\1\13\1\uffff\3\13\2\uffff\1\13";
    static final String DFA89_minS =
        "\6\12\2\uffff\2\25\1\12\2\uffff\5\12\2\25\1\12";
    static final String DFA89_maxS =
        "\2\u00f2\1\u00bf\3\u0101\2\uffff\2\25\1\u00c1\2\uffff\1\u0101\1"+
        "\u00bf\3\u0101\2\25\1\u0101";
    static final String DFA89_acceptS =
        "\6\uffff\1\2\1\3\3\uffff\1\4\1\1\10\uffff";
    static final String DFA89_specialS =
        "\25\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\4\12\uffff\1\3\122\uffff\1\1\36\uffff\1\5\57\uffff\1\5\1"+
            "\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\2\46"+
            "\uffff\1\6\3\7\1\uffff\6\7",
            "\1\4\12\uffff\1\3\161\uffff\1\5\57\uffff\1\5\1\uffff\1\5\1"+
            "\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\2\46\uffff\1\6"+
            "\3\7\1\uffff\6\7",
            "\1\4\12\uffff\1\3\161\uffff\1\5\57\uffff\1\5\1\uffff\1\5\1"+
            "\uffff\1\5\1\uffff\1\5\1\uffff\1\5",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\10\uffff\1\10"+
            "\3\uffff\1\13\1\11\13\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7"+
            "\uffff\3\13\1\14\1\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11"+
            "\uffff\5\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1"+
            "\13\1\uffff\1\13\23\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12"+
            "\uffff\4\13\1\uffff\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3"+
            "\13",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\14\uffff\1\13"+
            "\14\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7\uffff\3\13\1\14\1"+
            "\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11\uffff\5\13\1\uffff"+
            "\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\23"+
            "\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12\uffff\4\13\1\uffff"+
            "\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3\13",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\14\uffff\1\13"+
            "\14\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7\uffff\3\13\1\14\1"+
            "\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11\uffff\5\13\1\uffff"+
            "\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\23"+
            "\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12\uffff\4\13\1\uffff"+
            "\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3\13",
            "",
            "",
            "\1\15",
            "\1\15",
            "\1\20\12\uffff\1\17\161\uffff\1\21\57\uffff\1\21\1\uffff\1"+
            "\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\16",
            "",
            "",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\10\uffff\1\10"+
            "\3\uffff\1\13\1\11\13\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7"+
            "\uffff\3\13\1\14\1\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11"+
            "\uffff\5\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1"+
            "\13\1\uffff\1\13\23\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12"+
            "\uffff\4\13\1\uffff\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3"+
            "\13",
            "\1\20\12\uffff\1\17\161\uffff\1\21\57\uffff\1\21\1\uffff\1"+
            "\21\1\uffff\1\21\1\uffff\1\21\1\uffff\1\21",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\10\uffff\1\22"+
            "\3\uffff\1\13\1\23\13\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7"+
            "\uffff\3\13\1\14\1\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11"+
            "\uffff\5\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1"+
            "\13\1\uffff\1\13\23\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12"+
            "\uffff\4\13\1\uffff\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3"+
            "\13",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\14\uffff\1\13"+
            "\14\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7\uffff\3\13\1\14\1"+
            "\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11\uffff\5\13\1\uffff"+
            "\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\23"+
            "\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12\uffff\4\13\1\uffff"+
            "\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3\13",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\14\uffff\1\13"+
            "\14\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7\uffff\3\13\1\14\1"+
            "\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11\uffff\5\13\1\uffff"+
            "\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\23"+
            "\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12\uffff\4\13\1\uffff"+
            "\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3\13",
            "\1\24",
            "\1\24",
            "\1\13\11\uffff\2\13\1\12\64\uffff\1\13\1\uffff\2\13\3\uffff"+
            "\12\13\1\uffff\1\13\10\uffff\3\13\2\uffff\1\13\10\uffff\1\22"+
            "\3\uffff\1\13\1\23\13\uffff\3\13\3\uffff\1\13\1\uffff\1\13\7"+
            "\uffff\3\13\1\14\1\uffff\3\13\1\uffff\1\13\2\uffff\11\13\11"+
            "\uffff\5\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1\13\1\uffff\1"+
            "\13\1\uffff\1\13\23\uffff\1\13\4\uffff\2\13\1\uffff\1\13\12"+
            "\uffff\4\13\1\uffff\6\13\4\uffff\1\13\1\uffff\4\13\2\uffff\3"+
            "\13"
    };

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "376:1: logical_value : ( ( IS )? a= literal THRU b= literal -> ^( P_PAIR $a $b) | ( IS )? NOT relational_operator literal -> ^( NOT relational_operator literal ) | ( IS )? relational_operator literal -> ^( relational_operator literal ) | ( IS )? literal -> literal );";
        }
    }
    static final String DFA94_eotS =
        "\26\uffff";
    static final String DFA94_eofS =
        "\26\uffff";
    static final String DFA94_minS =
        "\1\u00e9\2\12\1\uffff\1\u00f3\5\uffff\1\12\2\uffff\1\12\2\uffff"+
        "\1\12\5\uffff";
    static final String DFA94_maxS =
        "\1\u00f2\2\u00ec\1\uffff\1\u00f5\5\uffff\1\u00e7\2\uffff\1\u00e7"+
        "\2\uffff\1\u00c1\5\uffff";
    static final String DFA94_acceptS =
        "\3\uffff\1\5\1\uffff\1\13\1\14\1\15\1\16\1\17\1\uffff\1\2\1\1\1"+
        "\uffff\1\3\1\4\1\uffff\1\11\1\12\1\6\1\7\1\10";
    static final String DFA94_specialS =
        "\26\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\5\1\1\1\3\1\uffff\1\2\1\6\1\7\1\10\1\11\1\4",
            "\1\14\12\uffff\1\14\161\uffff\1\14\57\uffff\1\14\1\uffff\1"+
            "\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\45\uffff"+
            "\1\13\4\uffff\1\12",
            "\1\16\12\uffff\1\16\161\uffff\1\16\57\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\45\uffff"+
            "\1\17\4\uffff\1\15",
            "",
            "\1\20\1\21\1\22",
            "",
            "",
            "",
            "",
            "",
            "\1\14\12\uffff\1\14\161\uffff\1\14\57\uffff\1\14\1\uffff\1"+
            "\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\1\uffff\1\14\45\uffff"+
            "\1\13",
            "",
            "",
            "\1\16\12\uffff\1\16\161\uffff\1\16\57\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\1\uffff\1\16\45\uffff"+
            "\1\17",
            "",
            "",
            "\1\25\12\uffff\1\25\161\uffff\1\25\4\uffff\1\23\23\uffff\1"+
            "\24\26\uffff\1\25\1\uffff\1\25\1\uffff\1\25\1\uffff\1\25\1\uffff"+
            "\1\25\1\uffff\1\25",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "382:1: relational_operator : ( LESS ( THAN )? -> P_OP_LESS | LESS ( THAN )? OR EQUAL -> P_OP_LESS_EQUAL | GREATER ( THAN )? -> P_OP_GREATER | GREATER ( THAN )? OR EQUAL -> P_OP_GREATER_EQUAL | EQUAL -> P_OP_EQUAL | LIKE TRIMMED RIGHT -> P_OP_TRIMMED_RIGHT | LIKE TRIMMED LEFT -> P_OP_TRIMMED_LEFT | LIKE TRIMMED -> P_OP_TRIMMED_BOTH | LIKE CASE_INSENSITIVE -> P_OP_CASE_INSENSITIVE | LIKE CASE_SENSITIVE -> P_OP_CASE_SENSITIVE | OP_LESS -> P_OP_LESS | OP_LESS_EQUAL -> P_OP_LESS_EQUAL | OP_GREATER -> P_OP_GREATER | OP_GREATER_EQUAL -> P_OP_GREATER_EQUAL | OP_EQUAL -> P_OP_EQUAL );";
        }
    }
    static final String DFA96_eotS =
        "\12\uffff";
    static final String DFA96_eofS =
        "\2\uffff\3\10\4\uffff\1\10";
    static final String DFA96_minS =
        "\5\12\2\25\2\uffff\1\12";
    static final String DFA96_maxS =
        "\1\u00c1\1\u00bf\3\u0106\2\25\2\uffff\1\u0106";
    static final String DFA96_acceptS =
        "\7\uffff\1\1\1\2\1\uffff";
    static final String DFA96_specialS =
        "\12\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\3\12\uffff\1\2\161\uffff\1\4\57\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\1",
            "\1\3\12\uffff\1\2\161\uffff\1\4\57\uffff\1\4\1\uffff\1\4\1"+
            "\uffff\1\4\1\uffff\1\4\1\uffff\1\4",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\2\uffff\1\5\2\uffff\2\10\1\6\5\uffff\3\10"+
            "\2\uffff\4\10\3\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff"+
            "\3\10\1\uffff\1\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10"+
            "\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff"+
            "\1\10\4\uffff\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1"+
            "\uffff\4\10\2\uffff\6\10\1\uffff\1\10",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\5\uffff\2\10\6\uffff\3\10\2\uffff\4\10\3"+
            "\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff\3\10\1\uffff\1"+
            "\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff\1\10\4\uffff"+
            "\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1\uffff\4\10\2"+
            "\uffff\6\10\1\uffff\1\10",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\5\uffff\2\10\6\uffff\3\10\2\uffff\4\10\3"+
            "\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff\3\10\1\uffff\1"+
            "\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff\1\10\4\uffff"+
            "\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1\uffff\4\10\2"+
            "\uffff\6\10\1\uffff\1\10",
            "\1\11",
            "\1\11",
            "",
            "",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\2\uffff\1\5\2\uffff\2\10\1\6\5\uffff\3\10"+
            "\2\uffff\4\10\3\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff"+
            "\3\10\1\uffff\1\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10"+
            "\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff"+
            "\1\10\4\uffff\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1"+
            "\uffff\4\10\2\uffff\6\10\1\uffff\1\10"
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "400:1: literal : ( ( value_item AMPERSAND )+ value_item -> ^( AMPERSAND ( value_item )+ ) | value_item );";
        }
    }
    static final String DFA95_eotS =
        "\12\uffff";
    static final String DFA95_eofS =
        "\2\uffff\3\10\4\uffff\1\10";
    static final String DFA95_minS =
        "\5\12\2\25\2\uffff\1\12";
    static final String DFA95_maxS =
        "\1\u00c1\1\u00bf\3\u0106\2\25\2\uffff\1\u0106";
    static final String DFA95_acceptS =
        "\7\uffff\1\1\1\2\1\uffff";
    static final String DFA95_specialS =
        "\12\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\3\12\uffff\1\2\161\uffff\1\4\57\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\1",
            "\1\3\12\uffff\1\2\161\uffff\1\4\57\uffff\1\4\1\uffff\1\4\1"+
            "\uffff\1\4\1\uffff\1\4\1\uffff\1\4",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\2\uffff\1\5\2\uffff\2\10\1\6\5\uffff\3\10"+
            "\2\uffff\4\10\3\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff"+
            "\3\10\1\uffff\1\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10"+
            "\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff"+
            "\1\10\4\uffff\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1"+
            "\uffff\4\10\2\uffff\6\10\1\uffff\1\10",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\5\uffff\2\10\6\uffff\3\10\2\uffff\4\10\3"+
            "\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff\3\10\1\uffff\1"+
            "\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff\1\10\4\uffff"+
            "\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1\uffff\4\10\2"+
            "\uffff\6\10\1\uffff\1\10",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\5\uffff\2\10\6\uffff\3\10\2\uffff\4\10\3"+
            "\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff\3\10\1\uffff\1"+
            "\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10\1\uffff\1\10\1"+
            "\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff\1\10\4\uffff"+
            "\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1\uffff\4\10\2"+
            "\uffff\6\10\1\uffff\1\10",
            "\1\11",
            "\1\11",
            "",
            "",
            "\1\10\7\uffff\1\10\1\uffff\2\10\1\7\64\uffff\1\10\1\uffff\2"+
            "\10\3\uffff\12\10\1\uffff\1\10\2\uffff\1\10\5\uffff\4\10\1\uffff"+
            "\1\10\5\uffff\1\10\2\uffff\1\5\2\uffff\2\10\1\6\5\uffff\3\10"+
            "\2\uffff\4\10\3\uffff\1\10\1\uffff\1\10\7\uffff\4\10\1\uffff"+
            "\3\10\1\uffff\1\10\2\uffff\11\10\11\uffff\5\10\1\uffff\1\10"+
            "\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\1\uffff\1\10\23\uffff"+
            "\1\10\4\uffff\4\10\2\uffff\14\10\1\uffff\6\10\4\uffff\1\10\1"+
            "\uffff\4\10\2\uffff\6\10\1\uffff\1\10"
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "()+ loopback of 401:4: ( value_item AMPERSAND )+";
        }
    }
    static final String DFA111_eotS =
        "\13\uffff";
    static final String DFA111_eofS =
        "\13\uffff";
    static final String DFA111_minS =
        "\1\21\10\0\2\uffff";
    static final String DFA111_maxS =
        "\1\u00e8\10\0\2\uffff";
    static final String DFA111_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA111_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA111_transitionS = {
            "\1\10\3\uffff\1\6\135\uffff\1\3\140\uffff\1\2\10\uffff\1\1\1"+
            "\4\1\5\10\uffff\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA111_eot = DFA.unpackEncodedString(DFA111_eotS);
    static final short[] DFA111_eof = DFA.unpackEncodedString(DFA111_eofS);
    static final char[] DFA111_min = DFA.unpackEncodedStringToUnsignedChars(DFA111_minS);
    static final char[] DFA111_max = DFA.unpackEncodedStringToUnsignedChars(DFA111_maxS);
    static final short[] DFA111_accept = DFA.unpackEncodedString(DFA111_acceptS);
    static final short[] DFA111_special = DFA.unpackEncodedString(DFA111_specialS);
    static final short[][] DFA111_transition;

    static {
        int numStates = DFA111_transitionS.length;
        DFA111_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA111_transition[i] = DFA.unpackEncodedString(DFA111_transitionS[i]);
        }
    }

    class DFA111 extends DFA {

        public DFA111(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 111;
            this.eot = DFA111_eot;
            this.eof = DFA111_eof;
            this.min = DFA111_min;
            this.max = DFA111_max;
            this.accept = DFA111_accept;
            this.special = DFA111_special;
            this.transition = DFA111_transition;
        }
        public String getDescription() {
            return "435:1: constant_expression : ( expression operator constant_expression -> ^( operator expression constant_expression ) | expression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA111_1 = input.LA(1);

                         
                        int index111_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA111_2 = input.LA(1);

                         
                        int index111_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA111_3 = input.LA(1);

                         
                        int index111_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA111_4 = input.LA(1);

                         
                        int index111_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA111_5 = input.LA(1);

                         
                        int index111_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA111_6 = input.LA(1);

                         
                        int index111_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA111_7 = input.LA(1);

                         
                        int index111_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA111_8 = input.LA(1);

                         
                        int index111_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred179_DataDivision()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index111_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 111, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA122_eotS =
        "\21\uffff";
    static final String DFA122_eofS =
        "\21\uffff";
    static final String DFA122_minS =
        "\1\23\1\u00c4\1\uffff\1\u00c9\6\uffff\1\25\6\uffff";
    static final String DFA122_maxS =
        "\2\u00d9\1\uffff\1\u00d3\6\uffff\1\u00d7\6\uffff";
    static final String DFA122_acceptS =
        "\2\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\15\1\14"+
        "\1\2\1\3\1\12\1\13";
    static final String DFA122_specialS =
        "\21\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\5\u00af\uffff\1\1\4\2\1\3\10\uffff\1\7\1\6\1\11\1\uffff\1"+
            "\4\1\12\1\uffff\1\10\1\13",
            "\4\2\15\uffff\1\4\1\14\2\uffff\1\13",
            "",
            "\1\15\1\16\10\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\122\uffff\1\14\152\uffff\1\17\3\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "449:1: cd_clause : ( queue | message_date | message_time | source | text_length | end_key | status_key | error_key | message_count | destination_count | destination_table | symbolic_destination | symbolic_terminal );";
        }
    }
    static final String DFA149_eotS =
        "\32\uffff";
    static final String DFA149_eofS =
        "\32\uffff";
    static final String DFA149_minS =
        "\1\122\4\uffff\1\0\24\uffff";
    static final String DFA149_maxS =
        "\1\u0101\4\uffff\1\0\24\uffff";
    static final String DFA149_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\5\1\30";
    static final String DFA149_specialS =
        "\5\uffff\1\0\24\uffff}>";
    static final String[] DFA149_transitionS = {
            "\1\1\1\2\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\15\1\uffff\1\24\32"+
            "\uffff\1\26\14\uffff\1\14\17\uffff\1\27\4\uffff\3\4\4\uffff"+
            "\11\3\11\uffff\4\3\100\uffff\1\25\1\uffff\1\16\1\17\1\20\1\23"+
            "\2\uffff\1\21\2\22",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
    static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
    static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
    static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
    static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
    static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
    static final short[][] DFA149_transition;

    static {
        int numStates = DFA149_transitionS.length;
        DFA149_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
        }
    }

    class DFA149 extends DFA {

        public DFA149(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 149;
            this.eot = DFA149_eot;
            this.eof = DFA149_eof;
            this.min = DFA149_min;
            this.max = DFA149_max;
            this.accept = DFA149_accept;
            this.special = DFA149_special;
            this.transition = DFA149_transition;
        }
        public String getDescription() {
            return "487:1: screen_group_clause : ( background | foreground | usage | sign | AUTO | SECURE | REQUIRED | FULL | BELL | BEEP | BLINK | BLANK | erase | REVERSE | REVERSED | REVERSE_VIDEO | LOWLIGHT | highlight | UNDERLINE | line_number | col_number | value | screen_pic | AUTO );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA149_5 = input.LA(1);

                         
                        int index149_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred235_DataDivision()) ) {s = 24;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index149_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 149, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA195_eotS =
        "\22\uffff";
    static final String DFA195_eofS =
        "\22\uffff";
    static final String DFA195_minS =
        "\1\104\1\176\1\uffff\1\176\1\uffff\1\176\14\uffff";
    static final String DFA195_maxS =
        "\1\u010a\1\u0108\1\uffff\1\u0108\1\uffff\1\u0108\14\uffff";
    static final String DFA195_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\10\1\12\1\14\1\16\1\1"+
        "\1\15\1\3\1\13\1\5\1\11";
    static final String DFA195_specialS =
        "\22\uffff}>";
    static final String[] DFA195_transitionS = {
            "\1\2\1\4\1\6\1\10\1\11\1\12\1\13\u00b7\uffff\1\1\1\uffff\1\5"+
            "\1\uffff\1\3\3\uffff\1\7",
            "\1\15\u0089\uffff\1\14",
            "",
            "\1\17\u0089\uffff\1\16",
            "",
            "\1\21\u0089\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA195_eot = DFA.unpackEncodedString(DFA195_eotS);
    static final short[] DFA195_eof = DFA.unpackEncodedString(DFA195_eofS);
    static final char[] DFA195_min = DFA.unpackEncodedStringToUnsignedChars(DFA195_minS);
    static final char[] DFA195_max = DFA.unpackEncodedStringToUnsignedChars(DFA195_maxS);
    static final short[] DFA195_accept = DFA.unpackEncodedString(DFA195_acceptS);
    static final short[] DFA195_special = DFA.unpackEncodedString(DFA195_specialS);
    static final short[][] DFA195_transition;

    static {
        int numStates = DFA195_transitionS.length;
        DFA195_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA195_transition[i] = DFA.unpackEncodedString(DFA195_transitionS[i]);
        }
    }

    class DFA195 extends DFA {

        public DFA195(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 195;
            this.eot = DFA195_eot;
            this.eof = DFA195_eof;
            this.min = DFA195_min;
            this.max = DFA195_max;
            this.accept = DFA195_accept;
            this.special = DFA195_special;
            this.transition = DFA195_transition;
        }
        public String getDescription() {
            return "576:1: report_type : ( REPORT HEADING -> P_REPORT_HEADING | RH -> P_REPORT_HEADING | PAGE HEADING -> P_PAGE_HEADING | PH -> P_PAGE_HEADING | CONTROL HEADING ( final_or_data_name )? -> ^( P_CONTROL_HEADING final_or_data_name ) | CH final_or_data_name -> ^( P_CONTROL_HEADING final_or_data_name ) | DETAIL -> P_DETAIL | DE -> P_DETAIL | CONTROL FOOTING ( final_or_data_name )? -> ^( P_CONTROL_FOOTING ( final_or_data_name )? ) | CF ( final_or_data_name )? -> ^( P_CONTROL_FOOTING ( final_or_data_name )? ) | PAGE FOOTING -> P_PAGE_FOOTING | PF -> P_PAGE_FOOTING | REPORT FOOTING -> P_REPORT_FOOTING | RF -> P_REPORT_FOOTING );";
        }
    }
 

    public static final BitSet FOLLOW_DATA_in_data_div1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_DIVISION_in_data_div1175 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_data_div1177 = new BitSet(new long[]{0x0000000000000002L,0x0001800400020000L,0x0000000000000000L,0x0000000000000004L,0x0000000000000004L});
    public static final BitSet FOLLOW_data_div_section_in_data_div1179 = new BitSet(new long[]{0x0000000000000002L,0x0001800400020000L,0x0000000000000000L,0x0000000000000004L,0x0000000000000004L});
    public static final BitSet FOLLOW_file_section_in_data_div_section1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_working_storage_section_in_data_div_section1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linkage_section_in_data_div_section1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_section_in_data_div_section1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_screen_section_in_data_div_section1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_report_section_in_data_div_section1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORKING_STORAGE_in_working_storage_section1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SECTION_in_working_storage_section1227 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_working_storage_section1229 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_record_description_entry_in_working_storage_section1231 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LINKAGE_in_linkage_section1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SECTION_in_linkage_section1252 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_linkage_section1254 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_record_description_entry_in_linkage_section1256 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_FILE_in_file_section1281 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SECTION_in_file_section1283 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_file_section1285 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_file_record_in_file_section1287 = new BitSet(new long[]{0x0000000000000002L,0x0000003000000000L});
    public static final BitSet FOLLOW_file_description_entry_in_file_record1308 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_record_description_entry_in_file_record1310 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_file_type_in_file_description_entry1329 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_file_description_entry1331 = new BitSet(new long[]{0x0000000000100000L,0x018203C100000000L,0x0000000000000010L,0x0000000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_file_clause_in_file_description_entry1333 = new BitSet(new long[]{0x0000000000100000L,0x018203C100000000L,0x0000000000000010L,0x0000000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_PERIOD_in_file_description_entry1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_file_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_in_file_clause1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_in_file_clause1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_file_clause1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_record_in_file_clause1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_file_clause1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_of_in_file_clause1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_file_clause1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linage_in_file_clause1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_code_set_in_file_clause1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_report_in_file_clause1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_external1412 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_EXTERNAL_in_external1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_global1431 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_GLOBAL_in_global1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block1450 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_CONTAINS_in_block1452 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_range_in_block1455 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RECORD_in_block1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block1473 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_CONTAINS_in_block1475 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_range_in_block1478 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_CHARACTERS_in_block1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record1496 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_CONTAINS_in_record1498 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_range_in_record1501 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
    public static final BitSet FOLLOW_CHARACTERS_in_record1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_record1517 = new BitSet(new long[]{0x0000000000000000L,0x0004010000000000L});
    public static final BitSet FOLLOW_varying_in_record1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_range1541 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_TO_in_range1543 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_range1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_range1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_label1595 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RECORD_in_label1597 = new BitSet(new long[]{0x0000000000000000L,0x0800010000000000L});
    public static final BitSet FOLLOW_IS_in_label1599 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_STANDARD_in_label1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_label1616 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RECORD_in_label1618 = new BitSet(new long[]{0x0000000000000000L,0x1000010000000000L});
    public static final BitSet FOLLOW_IS_in_label1620 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_OMITTED_in_label1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LABEL_in_label1637 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RECORD_in_label1639 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_label1641 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_label1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CODE_SET_in_code_set1662 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_code_set1664 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_code_set1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPORT_in_report1685 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_report1687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_report1690 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_VALUE_in_value_of1708 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_OF_in_value_of1710 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_value_is_in_value_of1712 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_WORD_in_value_is1735 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_value_is1737 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_data_or_literal_in_value_is1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data1762 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_RECORD_in_data1764 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_data1766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_data1769 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LINAGE_in_linage1787 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_linage1789 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_linage1792 = new BitSet(new long[]{0x0000000000000002L,0xC000000020000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_LINE_in_linage1794 = new BitSet(new long[]{0x0000000000000002L,0xC000000020000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_footing_in_linage1797 = new BitSet(new long[]{0x0000000000000002L,0x8000000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_top_in_linage1800 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_bottom_in_linage1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_varying1828 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_VARYING_in_varying1831 = new BitSet(new long[]{0x0000000000200002L,0x0078180000000000L});
    public static final BitSet FOLLOW_IN_in_varying1833 = new BitSet(new long[]{0x0000000000200002L,0x0068180000000000L});
    public static final BitSet FOLLOW_SIZE_in_varying1836 = new BitSet(new long[]{0x0000000000200002L,0x0060180000000000L});
    public static final BitSet FOLLOW_from_in_varying1839 = new BitSet(new long[]{0x0000000000000002L,0x0040180000000000L});
    public static final BitSet FOLLOW_to_in_varying1842 = new BitSet(new long[]{0x0000000000000002L,0x0040100000000000L});
    public static final BitSet FOLLOW_CHARACTERS_in_varying1845 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_depending_in_varying1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_from1871 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_from1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_to1893 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_to1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEPENDING_in_depending1916 = new BitSet(new long[]{0x0000000000200000L,0x2000000000000000L});
    public static final BitSet FOLLOW_ON_in_depending1918 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_depending1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_footing1940 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FOOTING_in_footing1943 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000082L,0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_footing1945 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_data_or_literal_in_footing1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_top1964 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_top1967 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_TOP_in_top1970 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_data_or_literal_in_top1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_bottom1989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_AT_in_bottom1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_BOTTOM_in_bottom1995 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_data_or_literal_in_bottom1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_record_description_entry2020 = new BitSet(new long[]{0x0000000000300000L,0x010001C000000000L,0x007803FE5CE02820L});
    public static final BitSet FOLLOW_WORD_in_record_description_entry2024 = new BitSet(new long[]{0x0000000000100000L,0x010001C000000000L,0x007803FE5CE02820L});
    public static final BitSet FOLLOW_record_clause_in_record_description_entry2027 = new BitSet(new long[]{0x0000000000100000L,0x010001C000000000L,0x007803FE5CE02820L});
    public static final BitSet FOLLOW_PERIOD_in_record_description_entry2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_renames_in_record_clause2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_redefines_in_record_clause2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blank_zero_in_record_clause2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_external_in_record_clause2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_global_in_record_clause2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_justified_in_record_clause2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_occurs_in_record_clause2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_picture_in_record_clause2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_record_clause2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sync_in_record_clause2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usage_in_record_clause2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_record_clause2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_in_blank_zero2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_WHEN_in_blank_zero2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ZERO_in_blank_zero2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JUST_in_justified2131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_in_justified2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_occurs2152 = new BitSet(new long[]{0x0000000000200000L,0x0000040000000000L});
    public static final BitSet FOLLOW_range_in_occurs2154 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x000000000005C000L});
    public static final BitSet FOLLOW_TIMES_in_occurs2156 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_depending_in_occurs2159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_order_in_occurs2162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000058000L});
    public static final BitSet FOLLOW_indexed_in_occurs2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASCENDING_in_order2191 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_order2194 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_order2197 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_order2200 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DESCENDING_in_order2217 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_order2219 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_order2222 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_order2225 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_INDEXED_in_indexed2246 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_BY_in_indexed2248 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_indexed2251 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_PIC_in_picture2272 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_picture2274 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_picture2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REDEFINES_in_redefines2297 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_redefines2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RENAMES_in_renames2317 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_renames2321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_THRU_in_renames2324 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_renames2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGN_in_sign2352 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IS_in_sign2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_LEADING_in_sign2359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_separate_in_sign2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGN_in_sign2381 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_IS_in_sign2383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_TRAILING_in_sign2388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_separate_in_sign2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEPARATE_in_separate2412 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
    public static final BitSet FOLLOW_CHARACTER_in_separate2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNC_in_sync2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNC_in_sync2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LEFT_in_sync2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNC_in_sync2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_in_sync2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USAGE_in_usage2486 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x007803FE00000000L});
    public static final BitSet FOLLOW_IS_in_usage2488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x007803FE00000000L});
    public static final BitSet FOLLOW_use_in_usage2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_use0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_value2564 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0007EF0000000002L});
    public static final BitSet FOLLOW_logical_value_in_value2566 = new BitSet(new long[]{0x0000000000200402L,0x0000090000000000L,0xAA800000000000C0L,0x0007EF000C000002L});
    public static final BitSet FOLLOW_when_in_value2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_value2589 = new BitSet(new long[]{0x0000000000220000L,0x0008010000000000L,0x0000000000000000L,0x00000100E0100000L});
    public static final BitSet FOLLOW_IS_in_value2591 = new BitSet(new long[]{0x0000000000220000L,0x0008010000000000L,0x0000000000000000L,0x00000100E0100000L});
    public static final BitSet FOLLOW_constant_expression_in_value2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_logical_value2615 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_logical_value2620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_THRU_in_logical_value2622 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_logical_value2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_logical_value2645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_NOT_in_logical_value2648 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0007EE0000000000L});
    public static final BitSet FOLLOW_relational_operator_in_logical_value2650 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_logical_value2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_logical_value2668 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0007EE0000000000L});
    public static final BitSet FOLLOW_relational_operator_in_logical_value2671 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_logical_value2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_logical_value2688 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_logical_value2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relational_operator2709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_THAN_in_relational_operator2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_relational_operator2725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000108000000000L});
    public static final BitSet FOLLOW_THAN_in_relational_operator2727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_OR_in_relational_operator2730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_EQUAL_in_relational_operator2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relational_operator2744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_THAN_in_relational_operator2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_relational_operator2760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000108000000000L});
    public static final BitSet FOLLOW_THAN_in_relational_operator2762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_OR_in_relational_operator2765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_EQUAL_in_relational_operator2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_relational_operator2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIKE_in_relational_operator2793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TRIMMED_in_relational_operator2795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHT_in_relational_operator2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIKE_in_relational_operator2809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TRIMMED_in_relational_operator2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LEFT_in_relational_operator2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIKE_in_relational_operator2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_TRIMMED_in_relational_operator2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIKE_in_relational_operator2841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_CASE_INSENSITIVE_in_relational_operator2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIKE_in_relational_operator2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_CASE_SENSITIVE_in_relational_operator2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LESS_in_relational_operator2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_LESS_EQUAL_in_relational_operator2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GREATER_in_relational_operator2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_GREATER_EQUAL_in_relational_operator2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_EQUAL_in_relational_operator2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_item_in_literal2944 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_AMPERSAND_in_literal2946 = new BitSet(new long[]{0x0000000000200400L,0x0000000000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_value_item_in_literal2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_item_in_literal2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_value_item2976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_value_item2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_value_item2984 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_STRING_in_value_item2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_value_item2992 = new BitSet(new long[]{0x0000000000200400L,0x0000000000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_figurative_constant_in_value_item2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_figurative_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHEN_in_when3033 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000000L,0x000000000C000000L});
    public static final BitSet FOLLOW_SET_in_when3036 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_TO_in_when3039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_FALSE_in_when3042 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_IS_in_when3044 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_when3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PLUS_in_operator3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MINUS_in_operator3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_MUL_in_operator3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_DIV_in_operator3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_EXP_in_operator3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_operator3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLUSIVE_in_operator3098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_OR_in_operator3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_operator3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_basic_exp3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LENGTH_in_basic_exp3134 = new BitSet(new long[]{0x0000000000200400L,0x0200010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_OF_in_basic_exp3136 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_basic_exp3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIZE_in_basic_exp3153 = new BitSet(new long[]{0x0000000000200400L,0x0200010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_OF_in_basic_exp3155 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_basic_exp3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_in_basic_exp3171 = new BitSet(new long[]{0x0000000000200000L,0x0200000000000000L});
    public static final BitSet FOLLOW_OF_in_basic_exp3173 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_basic_exp3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_COMPILED_in_basic_exp3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_basic_exp3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_exp_in_expression3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_expression3230 = new BitSet(new long[]{0x0000000000220000L,0x0008000000000000L,0x0000000000000000L,0x00000100E0100000L});
    public static final BitSet FOLLOW_expression_in_expression3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PAREN_in_expression3250 = new BitSet(new long[]{0x0000000000220000L,0x0008000000000000L,0x0000000000000000L,0x00000100E0100000L});
    public static final BitSet FOLLOW_expression_in_expression3252 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RIGHT_PAREN_in_expression3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constant_expression3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000FF00000000L});
    public static final BitSet FOLLOW_operator_in_constant_expression3274 = new BitSet(new long[]{0x0000000000220000L,0x0008010000000000L,0x0000000000000000L,0x00000100E0100000L});
    public static final BitSet FOLLOW_constant_expression_in_constant_expression3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_constant_expression3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMUNICATION_in_communication_section3304 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SECTION_in_communication_section3306 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_communication_section3308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_cd_entry_in_communication_section3310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_cd_input_in_cd_entry3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_output_in_cd_entry3334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cd_io_in_cd_entry3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CD_in_cd_input3345 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_cd_input3347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_FOR_in_cd_input3349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_INITIAL_in_cd_input3352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_INPUT_in_cd_input3355 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x00000000036E01F8L});
    public static final BitSet FOLLOW_cd_clause_in_cd_input3357 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x00000000036E01F8L});
    public static final BitSet FOLLOW_CD_in_cd_output3383 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_cd_output3385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000009000L});
    public static final BitSet FOLLOW_FOR_in_cd_output3387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_OUTPUT_in_cd_output3390 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x00000000036E01F8L});
    public static final BitSet FOLLOW_cd_clause_in_cd_output3392 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x00000000036E01F8L});
    public static final BitSet FOLLOW_CD_in_cd_io3417 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_cd_io3419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000013000L});
    public static final BitSet FOLLOW_FOR_in_cd_io3421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_INITIAL_in_cd_io3424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_I_O_in_cd_io3427 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x00000000036E01F8L});
    public static final BitSet FOLLOW_cd_clause_in_cd_io3429 = new BitSet(new long[]{0x0000000000080002L,0x0000000000000000L,0x0000000000000000L,0x00000000036E01F8L});
    public static final BitSet FOLLOW_queue_in_cd_clause3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_date_in_cd_clause3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_time_in_cd_clause3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_in_cd_clause3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_length_in_cd_clause3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_key_in_cd_clause3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_status_key_in_cd_clause3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_error_key_in_cd_clause3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_count_in_cd_clause3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destination_count_in_cd_clause3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_destination_table_in_cd_clause3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbolic_destination_in_cd_clause3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_symbolic_terminal_in_cd_clause3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_queue3518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QUEUE_in_queue3521 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_queue3523 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_queue3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_queue3540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SUB_QUEUE_1_in_queue3543 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_queue3545 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_queue3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_queue3561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SUB_QUEUE_2_in_queue3564 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_queue3566 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_queue3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_queue3582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SUB_QUEUE_3_in_queue3585 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_queue3587 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_queue3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_date3608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DATE_in_message_date3610 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_message_date3612 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_message_date3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_time3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TIME_in_message_time3634 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_message_time3636 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_message_time3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_source3655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SOURCE_in_source3658 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_source3660 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_source3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_text_length3679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LENGTH_in_text_length3681 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_text_length3683 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_text_length3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATUS_in_status_key3703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_status_key3705 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_status_key3707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_status_key3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_end_key3726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_end_key3728 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_end_key3730 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_end_key3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MESSAGE_in_message_count3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COUNT_in_message_count3754 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_message_count3756 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_message_count3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTINATION_in_destination_count3776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COUNT_in_destination_count3778 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_destination_count3780 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_destination_count3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DESTINATION_in_destination_table3799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_TABLE_in_destination_table3801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_occurs_in_destination_table3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERROR_in_error_key3819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_error_key3821 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_error_key3823 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_error_key3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_symbolic_destination3845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DESTINATION_in_symbolic_destination3848 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_symbolic_destination3850 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_symbolic_destination3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOLIC_in_symbolic_terminal3870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_TERMINAL_in_symbolic_terminal3873 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_symbolic_terminal3875 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_symbolic_terminal3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCREEN_in_screen_section3900 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SECTION_in_screen_section3902 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_screen_section3904 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_screen_group_in_screen_section3906 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_WORD_in_screen_group3931 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_screen_group3935 = new BitSet(new long[]{0x0000000000100000L,0x010001C02FFC0000L,0x007803FE5CE02820L,0x9E80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_screen_group_clause_in_screen_group3937 = new BitSet(new long[]{0x0000000000100000L,0x010001C02FFC0000L,0x007803FE5CE02820L,0x9E80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_PERIOD_in_screen_group3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_background_in_screen_group_clause3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_foreground_in_screen_group_clause3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usage_in_screen_group_clause3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_screen_group_clause3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_in_screen_group_clause3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SECURE_in_screen_group_clause3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRED_in_screen_group_clause3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_in_screen_group_clause3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BELL_in_screen_group_clause3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEEP_in_screen_group_clause3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLINK_in_screen_group_clause3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_in_screen_group_clause4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_erase_in_screen_group_clause4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVERSE_in_screen_group_clause4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVERSED_in_screen_group_clause4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REVERSE_VIDEO_in_screen_group_clause4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWLIGHT_in_screen_group_clause4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_highlight_in_screen_group_clause4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNDERLINE_in_screen_group_clause4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_number_in_screen_group_clause4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_number_in_screen_group_clause4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_screen_group_clause4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_screen_pic_in_screen_group_clause4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_in_screen_group_clause4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKGROUND_in_background4060 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_background4062 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_background4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREGROUND_in_foreground4081 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_foreground4083 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_foreground4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_in_blank4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SCREEN_in_blank4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_in_blank4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LINE_in_blank4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLANK_in_blank4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_REMAINDER_in_blank4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERASE_in_erase4154 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_EOS_in_erase4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERASE_in_erase4170 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_EOL_in_erase4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ERASE_in_erase4187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_SCREEN_in_erase4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HIGHLIGHT_in_highlight4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_highlight4213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_HIGHLIGHT_in_highlight4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_line_number4225 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000100000000L});
    public static final BitSet FOLLOW_NUMBER_in_line_number4227 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000100000000L});
    public static final BitSet FOLLOW_IS_in_line_number4230 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000100000000L});
    public static final BitSet FOLLOW_pos_in_line_number4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COL_in_col_number4241 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000100000000L});
    public static final BitSet FOLLOW_NUMBER_in_col_number4243 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000100000000L});
    public static final BitSet FOLLOW_IS_in_col_number4246 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000100000000L});
    public static final BitSet FOLLOW_pos_in_col_number4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_pos4257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_pos4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_PLUS_in_pos4264 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_pos4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_name_in_pos4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIC_in_screen_pic4284 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_screen_pic4286 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_screen_pic4289 = new BitSet(new long[]{0x0000000000000000L,0x0020080000000000L});
    public static final BitSet FOLLOW_to_from_in_screen_pic4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIC_in_screen_pic4296 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_screen_pic4298 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_screen_pic4301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_USING_in_screen_pic4303 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_screen_pic4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_to_from4315 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_data_or_literal_in_to_from4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TO_in_to_from4323 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_to_from4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPORT_in_report_section4336 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SECTION_in_report_section4338 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_PERIOD_in_report_section4340 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_report_group_in_report_section4342 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RD_in_report_group4363 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_report_group4365 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000058L});
    public static final BitSet FOLLOW_report_clause_in_report_group4367 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000058L});
    public static final BitSet FOLLOW_PERIOD_in_report_group4370 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_report_group_desc_in_report_group4372 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_code_clause_in_report_clause4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_clause_in_report_clause4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_page_limit_clause_in_report_clause4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CODE_in_code_clause4411 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_code_clause4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTROL_in_control_clause4432 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_control_clause4434 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_control_clause4437 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_CONTROL_in_control_clause4453 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IS_in_control_clause4455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_FINAL_in_control_clause4458 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_data_name_in_control_clause4460 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_PAGE_in_page_limit_clause4483 = new BitSet(new long[]{0x0000000000200002L,0x4000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000B80L});
    public static final BitSet FOLLOW_page_options_in_page_limit_clause4485 = new BitSet(new long[]{0x0000000000200002L,0x4000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000B80L});
    public static final BitSet FOLLOW_lines_option_in_page_options4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_heading_option_in_page_options4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_first_option_in_page_options4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_last_option_in_page_options4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_footing_option_in_page_options4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIMIT_in_lines_option4530 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_lines_option4533 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_lines_option4536 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_LINE_in_lines_option4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEADING_in_heading_option4556 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_heading_option4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_first_option4576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DETAIL_in_first_option4578 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_first_option4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAST_in_last_option4597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DETAIL_in_last_option4599 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_last_option4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOOTING_in_footing_option4618 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_footing_option4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_report_group_desc4640 = new BitSet(new long[]{0x0000000000300000L,0x010001C020006800L,0x007803FE5CE02820L,0x0080000020200000L});
    public static final BitSet FOLLOW_WORD_in_report_group_desc4644 = new BitSet(new long[]{0x0000000000100000L,0x010001C020006800L,0x007803FE5CE02820L,0x0080000020200000L});
    public static final BitSet FOLLOW_report_group_clause_in_report_group_desc4647 = new BitSet(new long[]{0x0000000000100000L,0x010001C020006800L,0x007803FE5CE02820L,0x0080000020200000L});
    public static final BitSet FOLLOW_PERIOD_in_report_group_desc4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_clause_in_report_group_clause4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_clause_in_report_group_clause4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_next_clause_in_report_group_clause4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_clause_in_report_group_clause4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_clause_in_report_group_clause4690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_picture_in_report_group_clause4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blank_in_report_group_clause4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_justified_in_report_group_clause4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_report_group_clause4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usage_in_report_group_clause4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_clause_in_report_group_clause4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sum_clause_in_report_group_clause4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_report_group_clause4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COL_in_column_clause4732 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_column_clause4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group_clause4752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_INDICATE_in_group_clause4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_line_clause4769 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000020000000L});
    public static final BitSet FOLLOW_NUMBER_in_line_clause4771 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000020000000L});
    public static final BitSet FOLLOW_IS_in_line_clause4774 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000020000000L});
    public static final BitSet FOLLOW_advance_in_line_clause4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_next_clause4793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_GROUP_in_next_clause4795 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000020000000L});
    public static final BitSet FOLLOW_IS_in_next_clause4797 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L,0x0000000000000000L,0x2100000020000000L});
    public static final BitSet FOLLOW_advance_in_next_clause4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_in_source_clause4818 = new BitSet(new long[]{0x0000000000200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_IS_in_source_clause4820 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_source_clause4823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type_clause4842 = new BitSet(new long[]{0x0000000000000000L,0x00000100000007F0L,0x0000000000000000L,0x0000000000000000L,0x0000000000000454L});
    public static final BitSet FOLLOW_IS_in_type_clause4844 = new BitSet(new long[]{0x0000000000000000L,0x00000100000007F0L,0x0000000000000000L,0x0000000000000000L,0x0000000000000454L});
    public static final BitSet FOLLOW_report_type_in_type_clause4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_sum_clause4864 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_sum_clause4866 = new BitSet(new long[]{0x0000000000200002L,0x0000000000018000L});
    public static final BitSet FOLLOW_upon_in_sum_clause4869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_reset_on_in_sum_clause4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPON_in_upon4895 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_data_name_in_upon4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESET_in_reset_on4914 = new BitSet(new long[]{0x0000000000200000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ON_in_reset_on4916 = new BitSet(new long[]{0x0000000000200000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_final_or_data_name_in_reset_on4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINAL_in_final_or_data_name4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_name_in_final_or_data_name4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPORT_in_report_type4951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_HEADING_in_report_type4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RH_in_report_type4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAGE_in_report_type4978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_HEADING_in_report_type4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PH_in_report_type4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTROL_in_report_type5006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_HEADING_in_report_type5008 = new BitSet(new long[]{0x0000000000200002L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_final_or_data_name_in_report_type5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CH_in_report_type5025 = new BitSet(new long[]{0x0000000000200000L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_final_or_data_name_in_report_type5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETAIL_in_report_type5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DE_in_report_type5055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTROL_in_report_type5068 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FOOTING_in_report_type5070 = new BitSet(new long[]{0x0000000000200002L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_final_or_data_name_in_report_type5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CF_in_report_type5087 = new BitSet(new long[]{0x0000000000200002L,0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_final_or_data_name_in_report_type5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAGE_in_report_type5106 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FOOTING_in_report_type5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PF_in_report_type5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPORT_in_report_type5133 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_FOOTING_in_report_type5135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RF_in_report_type5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEXT_in_advance5164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PAGE_in_advance5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_advance5177 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_advance5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_advance5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_name_in_data_or_literal5216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_data_or_literal5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_data_name5228 = new BitSet(new long[]{0x0000000000000002L,0x0210000000000000L});
    public static final BitSet FOLLOW_in_of_in_data_name5230 = new BitSet(new long[]{0x0000000000000002L,0x0210000000000000L});
    public static final BitSet FOLLOW_IN_in_in_of5250 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OF_in_in_of5254 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_in_of5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_in_synpred45_DataDivision1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALUE_in_synpred119_DataDivision2564 = new BitSet(new long[]{0x0000000000200400L,0x0000010000000000L,0xAA80000000000080L,0x0007EF0000000002L});
    public static final BitSet FOLLOW_logical_value_in_synpred119_DataDivision2566 = new BitSet(new long[]{0x0000000000200402L,0x0000090000000000L,0xAA800000000000C0L,0x0007EF000C000002L});
    public static final BitSet FOLLOW_when_in_synpred119_DataDivision2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred179_DataDivision3272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x000000FF00000000L});
    public static final BitSet FOLLOW_operator_in_synpred179_DataDivision3274 = new BitSet(new long[]{0x0000000000220000L,0x0008010000000000L,0x0000000000000000L,0x00000100E0100000L});
    public static final BitSet FOLLOW_constant_expression_in_synpred179_DataDivision3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_in_synpred235_DataDivision3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_name_in_synpred332_DataDivision5216 = new BitSet(new long[]{0x0000000000000002L});

}
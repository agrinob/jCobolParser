parser grammar ProcedureDivision;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
	backtrack=true;
	}
		
tokens {
	CONTINUATION;
	NEW_PAGE;
	COMMENT;
	SPECIAL_LINE;
	START_DEBUG;
	END_DEBUG;
	STRING;
	START_PSEUDO_TEXT;
	PSEUDO_TEXT;
	END_PSEUDO_TEXT;
	COLON;
	COMMA;
	SEMI_COLON;
	LEFT_PAREN;
	RIGHT_PAREN;
	TEXT;
	PERIOD;
	WORD;
	AMPERSAND;
	
	//	Tokens starting with P_ are replacements for optional same suffix tokens.
	P_ON;		// Replace ON ...
	P_NOT_ON;	// Replace NOT ON ...
	P_NO_BELL;	// Replace NO BELL/NO BEEP
	P_ON_SIZE;	// Replace ON SIZE ERROR
	P_NOT_SIZE;	// Replace NOT ON SIZE ERROR
	P_LIST;		// Mark a list of things.
	P_INDEX;	// Mark a expression used as array index.
	P_WITH;		// Mark a list of options (WITH) in ACCEPT.
	
	//	Statements
	P_ACCEPT_1;	//	ACCEPT XXX FROM TIME.
	P_ACCEPT_2;	//	ACCEPT XXX WITH ECHO (IO oriented).
	P_ACCEPT_3;	//	ACCEPT XXX MESSAGE COUNT.
	P_ADD_1;	//	ADD A TO B.
	P_ADD_2;	//	ADD A TO B GIVING C.
	P_ADD_3;	//	ADD CORRESPONDING A TO B.
	
	IN;
	OF;
	ALL;
	SPACE;
	ZERO;
	HIGH_VALUE;
	LOW_VALUE;
	QUOTE;
	NULL;
	FROM;
	TO;
	
	ACCEPT;
	END_ACCEPT;
	CENTURY_DATE;
	CENTURY_DAY;
	DATE;
	YYYYMMDD;
	DATE_AND_TIME;
	DATE_COMPILED;
	DAY;
	YYYYDDD;
	DAY_OF_WEEK;
	ESCAPE;
	KEY;
	EXCEPTION;
	STATUS;
	TIME;
    	UPDATE;
   	BEFORE;
    	TAB;
    	SIZE;
    	REVERSE;
    	PROMPT;
    	CHARACTER;
    	MODE;
    	IS;
    	BLOCK;
    	AT;
    	POSITION;
    	COL;
    	LINE;
    	OFF;
    	SECURE;
    	LOW;
    	HIGH;
    	ERASE;
    	EOL;
    	ECHO;
    	CURSOR;
    	CONVERT;
    	CONTROL;
   	BLINK;
    	NO;
    	BELL;
    	AUTO;
    	UNIT;
	WITH;
	NEXT;
	SENTENCE;
	EXCEPTION;
	ESCAPE;
	ON;
	NOT;
	MESSAGE;
	COUNT;
	NUMBER;
	ROUNDED;
	ADD;
	END_ADD;
	SIZE;
	ERROR;
	GIVING;
	CORR;
	}
	
@parser::header {
	package jcobol.parser.divisions;
	}
		
//	WARNING: for tokens with singular/plural forms, rules always use the singular.
//	See TokenFactory for replacing plurals with singu		
/**********************************************
 * STATEMENTS.
 **********************************************/
block	:	stmt+
	;
stmt	:	stmt_accept
	|	stmt_next
	;
stmt_next
	:	NEXT SENTENCE!;
	
/*
 * ACCEPT STATEMENT
 */	
stmt_accept
	:	ACCEPT WORD from stmt_accept_end?			-> ^(P_ACCEPT_1 WORD from)
	|	ACCEPT from_io+ exception_error? stmt_accept_end?	-> ^(P_ACCEPT_2 from_io+ exception_error?)
	|	ACCEPT WORD MESSAGE? COUNT stmt_accept_end?		-> ^(P_ACCEPT_3 WORD)
	;
stmt_accept_end
	:	PERIOD | END_ACCEPT;	
from_io	:	WORD unit_with?			-> ^(WORD unit_with?);
from	:	FROM from_alt			-> ^(FROM from_alt);
from_alt:	CENTURY_DATE
	|	CENTURY_DAY
	|	DATE YYYYMMDD?
	|	DATE_AND_TIME
	|	DATE_COMPILED
	|	DAY YYYYDDD?
	|	DAY_OF_WEEK
	|	ESCAPE KEY!?
	|	EXCEPTION STATUS!?
	|	TIME
	|	WORD
	;	
unit_with
	:	unit with | with | unit
	;
unit	:	UNIT data_or_literal		-> ^(UNIT data_or_literal);
with	:	WITH? with_option+		-> ^(P_WITH with_option+);
with_option
	:	AUTO
	|	NO BELL				-> P_NO_BELL
	|	BLINK
	|	CONTROL data_or_literal		-> ^(CONTROL data_or_literal)
	|	CONVERT
	|	CURSOR data_or_literal		-> ^(CURSOR data_or_literal)
	|	ECHO
	|	ERASE! EOL			
	|	HIGH
	|	LOW
	|	SECURE
	|	OFF
	|	REVERSE
	|	TAB
	|	AT? LINE NUMBER? data_or_literal	-> ^(LINE data_or_literal)
	|	AT? COL NUMBER? data_or_literal		-> ^(COL data_or_literal)
	|	AT? POSITION data_or_literal		-> ^(POSITION data_or_literal)
	|	MODE! IS!? BLOCK
	|	PROMPT CHARACTER? IS? data_or_literal 	-> ^(PROMPT data_or_literal)
	|	SIZE data_or_literal			-> ^(SIZE data_or_literal)
	|	BEFORE? TIME data_or_literal		-> ^(TIME data_or_literal)
	|	UPDATE
	;
/*
 * ADD STATEMENT
 */	
stmt_add:	ADD stmt_add_op size_error? stmt_add_end?			-> ^(P_ADD_1 stmt_add_op    size_error?)
	|	ADD stmt_add_op GIVING c=op_list size_error? stmt_add_end?	-> ^(P_ADD_2 stmt_add_op $c size_error?)
	|	ADD CORR stmt_add_op size_error? stmt_add_end?			-> ^(P_ADD_3 stmt_add_op    size_error?)
	;
stmt_add_op
	:	a=op_list TO! b=op_list;
stmt_add_end
	:	PERIOD | END_ADD;		
/**********************************************
 * ARITMETIC COMMON.
 **********************************************/
op_list	:	result+			-> ^(P_LIST result+);
result	:	WORD ROUNDED?		-> ^(WORD ROUNDED?);	
/**********************************************
 * EXCEPTIONS
 **********************************************/
exception_error
	:	on_exception? not_on_exception?;
on_exception
	:	ON? (EXCEPTION | ESCAPE) WORD? stmt+	-> ^(P_ON WORD? stmt+);
not_on_exception
	:	NOT ON? (EXCEPTION | ESCAPE) stmt+	-> ^(P_NOT_ON stmt+);
	
size_error
	:	on_size? not_on_size?;
	
on_size	:	ON? SIZE ERROR stmt+			-> ^(P_ON_SIZE stmt+);
not_on_size
	:	NOT ON? SIZE ERROR stmt+		-> ^(P_NOT_SIZE stmt+);
/**********************************************
 * COMMON.
 **********************************************/ 
literal
	:	(value_item AMPERSAND)+ value_item 		-> ^(AMPERSAND value_item+)
	|	value_item
	;
value_item
	:	ALL? data_name
	|	ALL? STRING
	|	ALL? figurative_constant
	;	
figurative_constant
	:	SPACE | ZERO | HIGH_VALUE | LOW_VALUE | QUOTE | NULL;
	
data_or_literal
	:	data_name | literal;
data_name
	:	var_ref in_of*				-> ^(var_ref in_of*);
in_of	:	(IN | OF) var_ref			-> var_ref;	
var_ref	:	WORD index				-> ^(WORD index)
	|	WORD;	
index	:	LEFT_PAREN expression+ RIGHT_PAREN	-> ^(P_INDEX expression+);
expression
	:	data_name		
	;	
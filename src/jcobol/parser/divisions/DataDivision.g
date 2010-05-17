parser grammar DataDivision;

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
	P_PAIR;
	P_FROM;
	P_SIGN;
	P_USAGE;
	P_RECORD;
	P_DATA_RECORD;
	P_ERROR_KEY;
	P_DESTINATION_TABLE;
	P_DESTINATION_COUNT;
	P_MESSAGE_COUNT;
	P_END_KEY;
	P_STATUS_KEY;
	P_TEXT_LENGTH;
	P_SYMBOLIC_SOURCE;
	P_MESSAGE_DATE;
	P_MESSAGE_TIME;
	P_SYMBOLIC_SOURCE;
	P_SYMBOLIC_DESTINATION;
	P_SYMBOLIC_TERMINAL;
	P_PAREN_EXP;
	P_OP_LESS;
	P_OP_GREATER;
	P_OP_EQUAL;
	P_OP_LESS_EQUAL;
	P_OP_GREATER_EQUAL;
	P_OP_TRIMMED_RIGHT;
	P_OP_TRIMMED_LEFT;
	P_OP_TRIMMED_BOTH;
	P_OP_CASE_INSENSITIVE;
	P_OP_CASE_SENSITIVE;
	P_EXCLUSIVE_OR;
 	P_SCREEN_GROUP;
	P_LIMIT;
	P_HEADING;
	P_FIRST_DETAIL;	
	P_LAST_DETAIL;
	P_FOOTING;
	P_REPORT_SECTION;
	P_REPORT_GROUP;
	P_REPORT_HEADING;
	P_PAGE_HEADING;
	P_CONTROL_HEADING;
	P_CONTROL_FOOTING;
	P_PAGE_FOOTING;
	P_REPORT_FOOTING;
	P_DETAIL;
	
	RH;
	PH;
	CH;
	DE;
	CF;
	PF;
	RF;
	GROUP;
	INDICATE;	
	TYPE;
	SUM;
	UPON;
	RESET; 	
 	SCREEN;
 	BACKGROUND;
 	FOREGROUND;
 	AUTO;
 	SECURE;
 	REQUIRED;
 	FULL;
 	REQUIRED;
 	FULL;
 	BELL;
 	BEEP;
 	BLINK;
 	ERASE;
 	EOS;
 	SCREEN;
	LINE;
	REMAINDER;
	EOL;	
	DATA;
	DIVISION;
	FILE;
	SECTION;
	FD;
	SD;
	EXTERNAL;
	GLOBAL;
	IS;
	BLOCK;
	CONTAINS;
	TO;
	CHARACTERS;
	CHARACTER;
	RECORDS;
	WORKING_STORAGE;
	LINKAGE;
	RECORD;
	VARYING;
	SIZE;
	IN;
	FROM;
	DEPENDING;
	LABEL;
	VALUE;
	OF;
	ARE;
	STANDARD;
	OMITTED;
	ON;
	FOOTING;
	TOP;
	BOTTOM;
	AT;
	WITH;
	LINES;
	LINAGE;
	BLANK;
	WHEN;
	ZERO;
	ZEROS;
	ZEROES;
	JUSTIFIED;
	JUST;
	RIGHT;
	OCCURS;
	TIMES;
	ASCENDING;
	DESCENDING;
	KEY;
	INDEXED;
	BY;
	PICTURE;
	PIC;
	REDEFINES;
	RENAMES;
	THRU;
	THROUGH;
	SIGN;
	LEADING;
	TRAILING;
	SEPARATE;
	SYNC;
	SYNCHRONIZED;
	LEFT;
	USAGE;
	BINARY;
	COMP;
	COMP_1;
	COMP_2;
	COMP_3;
	COMP_4;
	COMP_5;
	COMP_6;
	COMPUTATIONAL;
	COMPUTATIONAL_1;
	COMPUTATIONAL_2;
	COMPUTATIONAL_3;
	COMPUTATIONAL_4;
	COMPUTATIONAL_5;
	COMPUTATIONAL_6;
	COMPUTATIONAL_7;
	COMPUTATIONAL_8;
	DISPLAY;
	PACKED_DECIMAL;
	INDEX;
	POINTER;
	SPACE;
	SPACES;
	QUOTE;
	QUOTES;
	HIGH_VALUE;
	HIGH_VALUES;
	LOW_VALUE;
	LOW_VALUES;	
	NULL;
	NULLS;
	ALL;
	COMMUNICATION;
	SYMBOLIC;
	QUEUE;
	SUB_QUEUE_1;
	SUB_QUEUE_2;
	SUB_QUEUE_3;
	MESSAGE;
	DATE;
	TIME;
	CD;
	FOR;
	INITIAL;
	INPUT;
	OUTPUT;
	I_O;
	STATUS;
	END;
	COUNT;
	LENGTH;
	SOURCE;
	DESTINATION;
	TABLE;
	ERROR;
	TERMINAL;
	SET;
	FALSE;
	CODE_SET;
	NEXT;
	START;
	DATE_COMPILED;
	OP_PLUS;
	OP_MINUS;
	OP_MUL;
	OP_DIV;
	OP_EXP;
	AND;
	EXCLUSIVE;
	OR;
	NOT;
	OP_LESS;
	LESS;
	EQUAL;
	THAN;
	GREATER;
	OP_LESS_EQUAL;
	OP_GREATER;
	OP_GREATER_EQUAL;
	OP_EQUAL;
	LIKE;
	TRIMMED;
	CASE_INSENSITIVE;
	CASE_SENSITIVE;
	COLUMN;
	COL;
	PLUS;
	REVERSE;
	REVERSED;
	REVERSE_VIDEO;
	UNDERLINE;
	NUMBER;
	USING;
	LOWLIGHT;
	HIGHLIGHT;
	NO;
	REPORT;
	CODE;
	CONTROL;
	FINAL;
	PAGE;
	LIMIT;
	HEADING;
	FIRST;
	DETAIL;
	LAST;
	RD;
	}
	
@parser::header {
	package jcobol.parser.divisions;
	}
		
//	WARNING: for tokens with singular/plural forms, rules always use the singular.
//	See TokenFactory for replacing plurals with singu		
data_div:	DATA DIVISION PERIOD data_div_section* -> ^(DATA data_div_section*);
data_div_section
	:	file_section | working_storage_section | linkage_section | communication_section | screen_section | report_section;
working_storage_section
	:	WORKING_STORAGE SECTION PERIOD record_description_entry* 	-> ^(WORKING_STORAGE record_description_entry*);
linkage_section
	:	LINKAGE SECTION PERIOD record_description_entry* 		-> ^(LINKAGE record_description_entry*);	
/**********************************
 * FILE SECTION.
 *********************************/		
file_section
	:	FILE SECTION PERIOD file_record*				-> ^(FILE file_record*);
file_record
	:	file_description_entry record_description_entry*		-> ^(file_description_entry record_description_entry*);
file_description_entry
	:	file_type WORD file_clause* PERIOD	-> ^(file_type WORD file_clause*);
file_type:	FD | SD;				
file_clause
	:	external | global | block | record | label | value_of | data | linage | code_set | report;	
external:	IS? EXTERNAL				-> ^(EXTERNAL);
global	:	IS? GLOBAL				-> ^(GLOBAL);
block	:	BLOCK CONTAINS? range RECORD		-> ^(BLOCK range RECORD)
	|	BLOCK CONTAINS? range CHARACTERS?	-> ^(BLOCK range);
record	:	RECORD CONTAINS? range CHARACTERS?	-> ^(RECORD range)
	|	RECORD varying				-> ^(RECORD varying)
	;
range	:	a=WORD TO b=WORD 			-> ^(P_PAIR $a $b)
	|	a=WORD	   				-> ^(P_PAIR $a)
	;	
label	:	LABEL RECORD IS? STANDARD		-> ^(LABEL STANDARD)
	|	LABEL RECORD IS? OMITTED		-> ^(LABEL OMITTED)
	|	LABEL RECORD IS? WORD			-> ^(LABEL WORD)
	;
code_set:	CODE_SET IS? WORD			-> ^(CODE_SET WORD);	
report	:	REPORT IS? WORD+			-> ^(REPORT WORD+);
value_of:	VALUE OF value_is+			-> ^(VALUE value_is+);			
value_is:	a=WORD IS? b=data_or_literal		-> ^(P_PAIR $a $b);
data	:	DATA RECORD IS? data_name+		-> ^(P_DATA_RECORD data_name+);
linage	:	LINAGE IS? WORD LINE? footing? top? bottom?	-> ^(LINAGE WORD footing? top? bottom?);
varying	:	IS? VARYING IN? SIZE? from? to? CHARACTERS? depending?	-> ^(VARYING from? to? depending?);
from	:	FROM? WORD					-> ^(P_FROM WORD);
to	:	TO WORD						-> ^(TO WORD);
depending
	:	DEPENDING ON? data_name				-> ^(DEPENDING data_name);	
footing	:	WITH? FOOTING AT? data_or_literal		-> ^(FOOTING data_or_literal);
top	:	LINE? AT? TOP data_or_literal			-> ^(TOP data_or_literal);
bottom	:	LINE? AT? BOTTOM data_or_literal		-> ^(BOTTOM data_or_literal);
//	Main rule to parse record description in DATA DIVISION.
//	It parse only a single item descrition. Nested items are parsed as a 
//	serie of record description.
//	This rule applies to level 01-49, 66, 77 and 88.
record_description_entry
	:	level=WORD name=WORD? record_clause* PERIOD	-> ^(P_RECORD $level $name? record_clause*);
//	Clauses for record description.	
record_clause
	:	renames | redefines | blank_zero | external | global | justified | occurs | picture | sign | sync | usage | value;
blank_zero
	:	BLANK WHEN? ZERO				-> ^(BLANK ZERO);
justified
	:	JUST RIGHT?					-> ^(JUST);	
occurs	:	OCCURS range TIMES? depending? order* indexed? 	-> ^(OCCURS range depending? order* indexed?);
order	:	ASCENDING  KEY? IS? data_name+			-> ^(ASCENDING data_name+)
	|	DESCENDING KEY? IS? data_name+			-> ^(DESCENDING data_name+)
	;
indexed	:	INDEXED BY? data_name+				-> ^(INDEXED data_name+);	
picture	:	PIC IS? WORD					-> ^(PIC WORD);
redefines
	:	REDEFINES data_name				-> ^(REDEFINES data_name);
renames	:	RENAMES a=data_name (THRU b=data_name)?		-> ^(RENAMES $a $b?);
sign	:	(SIGN IS?)? LEADING separate?			-> ^(P_SIGN LEADING separate?)
	|	(SIGN IS?)? TRAILING separate?			-> ^(P_SIGN TRAILING separate?)
	;
separate:	SEPARATE CHARACTER?				-> SEPARATE;
sync	:	SYNC						-> SYNC
	|	SYNC LEFT					-> ^(SYNC LEFT)
	|	SYNC RIGHT					-> ^(SYNC RIGHT)
	;
usage	:	(USAGE IS?)? use				-> ^(P_USAGE use);
use	:	BINARY | PACKED_DECIMAL | DISPLAY | INDEX | POINTER
	|	COMP | COMP_1 | COMP_2 | COMP_3 | COMP_4 | COMP_5 | COMP_6;
//	VALUE sintax for data items, condition names and constant name values
value	:	VALUE logical_value+ when?			-> ^(VALUE logical_value+ when?)
	|	VALUE IS? constant_expression			-> ^(VALUE constant_expression)
	;
//	value format for condition names
logical_value
	:	IS? a=literal THRU b=literal			-> ^(P_PAIR $a $b)
	|	IS? NOT relational_operator literal		-> ^(NOT relational_operator literal)
	|	IS? relational_operator literal			-> ^(relational_operator literal)
	|	IS? literal					-> literal
	;
relational_operator
	:	LESS THAN?					-> P_OP_LESS
	|	LESS THAN? OR EQUAL				-> P_OP_LESS_EQUAL
	|	GREATER THAN?					-> P_OP_GREATER
	|	GREATER THAN? OR EQUAL				-> P_OP_GREATER_EQUAL
	|	EQUAL						-> P_OP_EQUAL
	|	LIKE TRIMMED RIGHT				-> P_OP_TRIMMED_RIGHT
	|	LIKE TRIMMED LEFT				-> P_OP_TRIMMED_LEFT
	|	LIKE TRIMMED 					-> P_OP_TRIMMED_BOTH
	|	LIKE CASE_INSENSITIVE				-> P_OP_CASE_INSENSITIVE
	|	LIKE CASE_SENSITIVE				-> P_OP_CASE_SENSITIVE
	
	|	OP_LESS						-> P_OP_LESS
	|	OP_LESS_EQUAL					-> P_OP_LESS_EQUAL
	|	OP_GREATER					-> P_OP_GREATER
	|	OP_GREATER_EQUAL				-> P_OP_GREATER_EQUAL
	|	OP_EQUAL					-> P_OP_EQUAL
	;		
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
when	:	WHEN? SET? TO? FALSE IS? literal		-> ^(FALSE literal);	
//	Constant expression
operator:	OP_PLUS 			
	|	OP_MINUS
	|	OP_MUL
	|	OP_DIV
	|	OP_EXP
	|	AND
	|	EXCLUSIVE OR		-> P_EXCLUSIVE_OR
	|	OR	
	;
basic_exp
	:	NEXT			-> ^(NEXT)
	|	LENGTH OF? literal	-> ^(LENGTH literal)	
	|	SIZE OF? literal	-> ^(SIZE literal)
	|	START OF? WORD		-> ^(START WORD)
	|	DATE_COMPILED		-> ^(DATE_COMPILED)
	|	WORD			-> ^(WORD)
	;
expression
	:	basic_exp					
	|	NOT expression				-> ^(NOT expression)		
	|	LEFT_PAREN expression RIGHT_PAREN	-> ^(P_PAREN_EXP expression)
	;
constant_expression
	:	expression operator constant_expression	-> ^(operator expression constant_expression)
	|	expression
	;	
/********************************	
 *	COMMUNICATION SECTION.	
 ********************************/
communication_section
	:	COMMUNICATION SECTION PERIOD cd_entry*				-> ^(COMMUNICATION cd_entry*);	
cd_entry:	cd_input | cd_output |  cd_io;
cd_input:	CD WORD FOR? INITIAL? INPUT cd_clause*	-> ^(CD INPUT   WORD INITIAL? 	cd_clause*);
cd_output:	CD WORD FOR? OUTPUT cd_clause*		-> ^(CD OUTPUT  WORD 		cd_clause*);
cd_io	:	CD WORD FOR? INITIAL? I_O cd_clause*	-> ^(CD I_O     WORD INITIAL? 	cd_clause*);

cd_clause
	:	queue | message_date | message_time | source | text_length | end_key | status_key | error_key | 
		message_count | destination_count | destination_table | symbolic_destination | symbolic_terminal;
queue	:	SYMBOLIC? QUEUE IS? WORD 	-> ^(QUEUE WORD)
	|	SYMBOLIC? SUB_QUEUE_1 IS? WORD	-> ^(SUB_QUEUE_1 WORD)
	|	SYMBOLIC? SUB_QUEUE_2 IS? WORD	-> ^(SUB_QUEUE_2 WORD)
	|	SYMBOLIC? SUB_QUEUE_3 IS? WORD	-> ^(SUB_QUEUE_3 WORD)
	;
message_date
	:	MESSAGE DATE IS? WORD		-> ^(P_MESSAGE_DATE WORD);
message_time
	:	MESSAGE TIME IS? WORD		-> ^(P_MESSAGE_TIME WORD);
source	:	SYMBOLIC? SOURCE IS? WORD	-> ^(P_SYMBOLIC_SOURCE WORD);
text_length
	:	TEXT LENGTH IS? WORD		-> ^(P_TEXT_LENGTH WORD);
status_key
	:	STATUS KEY IS? WORD		-> ^(P_STATUS_KEY WORD);
end_key	:	END KEY IS? WORD		-> ^(P_END_KEY WORD);	
message_count
	:	MESSAGE? COUNT IS? WORD		-> ^(P_MESSAGE_COUNT WORD);
destination_count
	:	DESTINATION COUNT IS? WORD	-> ^(P_DESTINATION_COUNT WORD);
destination_table
	:	DESTINATION TABLE occurs	-> ^(P_DESTINATION_TABLE occurs);
error_key
	:	ERROR KEY IS? WORD		-> ^(P_ERROR_KEY WORD);		
symbolic_destination
	:	SYMBOLIC? DESTINATION IS? WORD	-> ^(P_SYMBOLIC_DESTINATION WORD);	
symbolic_terminal
	:	SYMBOLIC? TERMINAL IS? WORD	-> ^(P_SYMBOLIC_TERMINAL WORD);	

/**********************************************
 * SCREEN SECTION.
 **********************************************/ 	
screen_section
	:	SCREEN SECTION PERIOD screen_group* 		-> ^(SCREEN screen_group*); 
screen_group 
 	:	level=WORD name=WORD screen_group_clause* PERIOD-> ^(P_SCREEN_GROUP screen_group_clause*);
screen_group_clause
	:	background | foreground | usage | sign | AUTO | SECURE | REQUIRED | FULL | BELL | BEEP | BLINK | BLANK
	|	erase | REVERSE | REVERSED | REVERSE_VIDEO | LOWLIGHT | highlight | UNDERLINE | line_number | col_number | value
	|	screen_pic | AUTO
	;
background
	:	BACKGROUND IS? WORD	-> ^(BACKGROUND WORD);
foreground
	:	FOREGROUND IS? WORD	-> ^(FOREGROUND WORD);
blank	:	BLANK SCREEN		-> ^(BLANK SCREEN)
	|	BLANK LINE		-> ^(BLANK LINE)
	|	BLANK REMAINDER		-> ^(BLANK REMAINDER)
	;	
erase	:	ERASE EOS		-> ^(ERASE EOS)
	|	ERASE EOL		-> ^(ERASE EOL)	
	|	ERASE SCREEN		-> ^(ERASE SCREEN)
	;
highlight
	:	HIGHLIGHT
	|	NO HIGHLIGHT
	;
line_number
	:	LINE NUMBER? IS? pos;
col_number
	:	COL NUMBER? IS? pos;	
pos	:	PLUS WORD
	|	OP_PLUS WORD
	|	data_name
	;	 	
screen_pic
	:	PIC IS? WORD to_from
	|	PIC IS? WORD USING data_name
	;	
to_from	:	FROM data_or_literal 
	|	TO data_name;	
/**********************************************
 * REPORT SECTION.
 **********************************************/
report_section
	:	REPORT SECTION PERIOD report_group* 			-> ^(P_REPORT_SECTION report_group*);
report_group
	:	RD WORD report_clause* PERIOD report_group_desc*	-> ^(RD WORD report_clause* report_group_desc*);
report_clause
	:	code_clause | control_clause | page_limit_clause;
code_clause
	:	CODE literal			-> ^(CODE literal);	
control_clause
	:	CONTROL IS? data_name+		-> ^(CONTROL data_name+)
	|	CONTROL IS? FINAL data_name* 	-> ^(CONTROL FINAL data_name*)
	;
page_limit_clause
	:	PAGE page_options*		-> ^(PAGE page_options*);
page_options
	:	lines_option | heading_option | first_option | last_option | footing_option
	;
lines_option
	:	LIMIT? IS? WORD LINE?		-> ^(P_LIMIT WORD);
heading_option
	:	HEADING WORD			-> ^(P_HEADING WORD);
first_option
	:	FIRST DETAIL WORD		-> ^(P_FIRST_DETAIL WORD);
last_option
	:	LAST DETAIL WORD		-> ^(P_LAST_DETAIL WORD);
footing_option
	:	FOOTING WORD			-> ^(P_FOOTING WORD);
report_group_desc
	:	level=WORD name=WORD? report_group_clause* PERIOD -> ^(P_REPORT_GROUP $level $name? report_group_clause*);
report_group_clause
	:	type_clause | line_clause | next_clause | column_clause | group_clause | picture | blank | justified | sign | usage |
		source_clause | sum_clause | value;
column_clause
	:	COL WORD			-> ^(COL WORD);
group_clause
	:	GROUP INDICATE?			-> GROUP;
line_clause
	:	LINE NUMBER? IS? advance	-> ^(LINE advance);
next_clause
	:	NEXT GROUP IS? advance		-> ^(GROUP advance);	
source_clause
	:	SOURCE IS? data_name		-> ^(SOURCE data_name); 	
type_clause
	:	TYPE IS? report_type		-> ^(TYPE report_type);
sum_clause
	:	SUM data_name+ upon? reset_on?	-> ^(SUM data_name+ upon? reset_on?);
upon	:	UPON data_name			-> ^(UPON data_name);	
reset_on:	RESET ON? final_or_data_name	-> ^(RESET final_or_data_name);	
final_or_data_name
	:	FINAL | data_name;		

report_type
	:	REPORT HEADING				-> P_REPORT_HEADING
	|	RH					-> P_REPORT_HEADING
	|	PAGE HEADING				-> P_PAGE_HEADING
	|	PH					-> P_PAGE_HEADING	
	|	CONTROL HEADING final_or_data_name? 	-> ^(P_CONTROL_HEADING final_or_data_name)
	|	CH final_or_data_name			-> ^(P_CONTROL_HEADING final_or_data_name)
	|	DETAIL					-> P_DETAIL
	|	DE					-> P_DETAIL
	|	CONTROL FOOTING final_or_data_name?	-> ^(P_CONTROL_FOOTING final_or_data_name?)
	|	CF final_or_data_name?			-> ^(P_CONTROL_FOOTING final_or_data_name?)
	|	PAGE FOOTING				-> P_PAGE_FOOTING
	|	PF					-> P_PAGE_FOOTING
	|	REPORT FOOTING				-> P_REPORT_FOOTING
	|	RF					-> P_REPORT_FOOTING
	;
 advance:	NEXT PAGE			-> PAGE
	|	PLUS WORD			-> ^(PLUS WORD)
	|	WORD				-> WORD
	;	

/**********************************************
 * COMMON.
 **********************************************/ 
data_or_literal
	:	data_name | literal;
data_name
	:	WORD in_of*			-> ^(WORD in_of*);
in_of	:	(IN | OF) WORD			-> WORD;		
parser grammar EnvironmentDivision;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
	}
		
tokens {
	CONTINUATION;
	NEW_PAGE;
	COMMENT;
	SPECIAL_LINE;
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
	
	P_POSITION;	
	P_LIST;
	P_ORGANIZATION;
	
	ENVIRONMENT;
	DIVISION;
	CONFIGURATION;
	SECTION;
	SOURCE_COMPUTER;
	WITH;
	DEBUGGING;
	MODE;
	OBJECT_COMPUTER;
	MEMORY;
	SIZE;
	WORDS;
	CHARACTERS;
	MODULES;
	PROGRAM;
	COLLATING;
	SEQUENCE;
	IS;
	SEGMENT_LIMIT;
	SPECIAL_NAMES;
	ENVIRONMENT_NAME;
	ON;
	STATUS;
	OFF;
	ALPHABET;
	STANDARD_1;
	STANDARD_2;
	NATIVE;
	EBCDIC;
	ALSO;
	THRU;
	THROUGH;
	SYMBOLIC;
	ARE;
	IN;
	CLASS;
	INPUT_OUTPUT;
	FILE_CONTROL;
	I_O_CONTROL;
	FILE;
	ACCESS;
	SEQUENTIAL;
	RANDOM;
	DYNAMIC;
	ORGANIZATION;
	INDEXED;
	RELATIVE;
	RESERVE;
	PADDING;
	RECORD;
	DELIMITER;
	AREA;
	AREAS;
	ASSIGN;			
	TO;
	SELECT;
	OPTIONAL;
	CHARACTER;
	KEY;
	ALTERNATE;
	DUPLICATES;
	RERUN;
	EVERY;	
	RECORDS;
	END;
	REEL;
	UNIT;
	OF;
	POSITION;
	MULTIPLE;
	SAME;
	FOR;
	TAPE;
	CONTAINS;	
	SORT;
	SORT_MERGE;
	CONSOLE;
	CRT;
	CURRENCY;
	SIGN;
	CURSOR;
	DECIMAL_POINT;
	NUMERIC;
	LEADING;
	TRAILING;
	SEPARATE;
	BINARY;
	LINE;
	}
	
@parser::header {
	package jcobol.parser.divisions;
	}
	
env_division 
	:	ENVIRONMENT DIVISION PERIOD  env_division_clause* -> ^(ENVIRONMENT env_division_clause*);
env_division_clause
	:	configuration_section | input_output_section;
configuration_section
	:	CONFIGURATION SECTION PERIOD configuration_section_clause* PERIOD? -> ^(CONFIGURATION configuration_section_clause*);
configuration_section_clause
	:	source_computer | object_computer | special_names;
source_computer
	:	SOURCE_COMPUTER PERIOD source_computer_name? -> ^(SOURCE_COMPUTER source_computer_name?);
source_computer_name
	:	WORD (WITH!? DEBUGGING MODE!)? PERIOD!;	
	
object_computer
	:	OBJECT_COMPUTER PERIOD object_computer_name? -> ^(OBJECT_COMPUTER object_computer_name?);
object_computer_name
	:	WORD memory_size? program_collating? segment_limit? PERIOD!
	;
memory_size
	:	MEMORY SIZE? WORD memory_size_alts	-> ^(MEMORY WORD memory_size_alts);
memory_size_alts
	:	CHARACTERS | WORDS | MODULES;	
program_collating
	:	PROGRAM? COLLATING? SEQUENCE IS? WORD	-> ^(SEQUENCE WORD);
segment_limit
	:	SEGMENT_LIMIT IS? WORD			-> ^(SEGMENT_LIMIT WORD);		
special_names
	:	SPECIAL_NAMES PERIOD special_names_clause* -> ^(SPECIAL_NAMES special_names_clause*);	
special_names_clause
	:	environment_names | alphabet | symbolic | class_is | console | crt_status | currency | cursor | decimal | numeric;
console	:	CONSOLE IS? CRT			-> CONSOLE;
crt_status:	CRT STATUS IS? data_name	-> ^(CRT data_name);
currency:	CURRENCY SIGN? IS? literal	-> ^(CURRENCY literal);
cursor	:	CURSOR IS? data_name		-> ^(CURSOR data_name);
decimal	:	DECIMAL_POINT IS? COMMA		-> DECIMAL_POINT;
numeric	:	NUMERIC SIGN IS? leading separate?	-> ^(SIGN leading separate?);
leading	:	LEADING | TRAILING;
separate:	SEPARATE CHARACTERS?		-> SEPARATE;
environment_names
	:	a=WORD IS? b=WORD status?	-> ^(ENVIRONMENT_NAME $a $b status?)	
	|	WORD status			-> ^(ENVIRONMENT_NAME WORD status)
	;
status	:	on_status off_status?
	|	off_status on_status?
	;	
on_status
	:	ON STATUS? IS? WORD		-> ^(ON WORD)
	;
off_status
	:	OFF STATUS? IS? WORD		-> ^(OFF WORD)
	;	
	
alphabet:	ALPHABET WORD IS? alphabet_alts	-> ^(ALPHABET WORD alphabet_alts);
alphabet_alts
	:	STANDARD_1 | STANDARD_2 | NATIVE | EBCDIC | alpha_name+;	
alpha_name:	a=literal THRU c=literal	-> ^(THRU $a $c)
	|	ALSO literal			-> ^(ALSO literal)
	|	literal
	;	
literal	:	WORD
	|	STRING
	;	
symbolic:	SYMBOLIC CHARACTERS? symbolic_pair in_alphabet?	-> ^(SYMBOLIC  symbolic_pair in_alphabet?);	
symbolic_pair
	:	a=word_list IS b=word_list 	-> ^(IS $a $b)
	|	word_list			-> word_list
	;
word_list
	:	WORD+				-> ^(P_LIST WORD+);	
in_alphabet
	:	IN WORD				-> ^(IN WORD);	
class_is:	CLASS WORD IS? simple_pair*	-> ^(CLASS WORD simple_pair*);
simple_pair
	:	a=WORD THRU b=WORD		-> ^(THRU $a $b)
	|	WORD
	;	
input_output_section
	:	INPUT_OUTPUT SECTION PERIOD input_output_clause* -> ^(INPUT_OUTPUT input_output_clause*)
	;	
input_output_clause
	:	file_control | i_o_control;	
file_control
	:	FILE_CONTROL PERIOD file_control_para*	-> ^(FILE_CONTROL file_control_para*)
	;
file_control_para
	:	SELECT OPTIONAL? WORD file_clause* PERIOD -> ^(SELECT WORD OPTIONAL? file_clause*);			
file_clause
	:	assign_clause | reserve_clause | organization_clause | padding_clause 
		| record_delimiter_clause | access_clause | record_key_clause | alternate_clause | file_status_clause 	
	;	
assign_clause
	:	ASSIGN TO? data_or_literal+	-> ^(ASSIGN data_or_literal+);
reserve_clause
	:	RESERVE WORD AREA? 		-> ^(RESERVE WORD);
organization_clause
	:	(ORGANIZATION IS?)? bin_line? SEQUENTIAL	-> ^(P_ORGANIZATION SEQUENTIAL bin_line?)
	|	(ORGANIZATION IS?)? INDEXED			-> ^(P_ORGANIZATION INDEXED)
	|	(ORGANIZATION IS?)? RELATIVE			-> ^(P_ORGANIZATION RELATIVE)
	;
bin_line:	BINARY | LINE;	
padding_clause
	:	PADDING CHARACTER? IS? data_or_literal -> ^(PADDING data_or_literal);
record_delimiter_clause
	:	RECORD DELIMITER IS? STANDARD_1	-> ^(DELIMITER STANDARD_1)
	|	RECORD DELIMITER IS? WORD	-> ^(DELIMITER WORD)
	;
access_clause
	:	ACCESS MODE? IS? access_clause_alt relative_clause?	-> ^(ACCESS access_clause_alt relative_clause?);
access_clause_alt
	:	SEQUENTIAL | RANDOM | DYNAMIC;	
relative_clause
	:	RELATIVE KEY? IS? data_name	-> ^(RELATIVE data_name);		
file_status_clause
	:	FILE? STATUS IS? data_name	-> ^(STATUS data_name);
record_key_clause
	:	RECORD KEY? IS? data_name	-> ^(RECORD data_name);	
alternate_clause
	:	ALTERNATE RECORD KEY? IS? data_name (WITH? DUPLICATES)?	-> ^(ALTERNATE data_name DUPLICATES?);	
i_o_control
	:	I_O_CONTROL PERIOD i_o_control_para* PERIOD?	-> ^(I_O_CONTROL i_o_control_para*)
	;
i_o_control_para
	:	rerun_clause | same_clause | multiple_clause
	;
rerun_clause	
	:	RERUN ON WORD every				-> ^(RERUN WORD every)
	;
every	:	EVERY? count=WORD RECORD OF? filename=WORD 	-> ^(RECORD $filename $count) 
	|	EVERY? END OF? REEL OF? filename=WORD		-> ^(REEL $filename)
	|	EVERY? END OF? UNIT OF? filename=WORD		-> ^(UNIT $filename)
	;
same_clause	
	:	SAME RECORD? AREA? FOR? WORD			-> ^(SAME WORD)
	|	SAME SORT AREA? FOR? WORD			-> ^(SORT WORD)
	|	SAME SORT_MERGE AREA? FOR? WORD			-> ^(SORT_MERGE WORD)
	;	
multiple_clause
	:	MULTIPLE FILE TAPE? CONTAINS? position+		-> ^(MULTIPLE position+)
	;
position:	filename=WORD					-> ^(P_POSITION $filename)
	|	filename=WORD POSITION count=WORD		-> ^(P_POSITION $filename $count)
	;
	
/**********************************************
 * COMMON.
 **********************************************/ 
data_or_literal
	:	data_name | literal;
data_name
	:	WORD in_of*			-> ^(WORD in_of*);
in_of	:	(IN | OF) WORD			-> WORD;		
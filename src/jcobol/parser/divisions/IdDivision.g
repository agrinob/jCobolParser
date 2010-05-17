parser grammar IdDivision;

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
	COMMA_SEP;
	SEMICOLON_SEP;
	LEFT_PAREN;
	RIGHT_PAREN;
	TEXT;
	IDENTIFICATION;
	ID;
	DIVISION;
	PROGRAM_ID;
	PERIOD;
	WORD;
	IS;
	COMMON;
	INITIAL;
	PROGRAM;
	AUTHOR;
	INSTALLATION;
	DATE_WRITTEN;
	DATE_COMPILED;
	SECURITY;
	}
	
@parser::header {
	package jcobol.parser.divisions;
	}
		

id_division 	: ID DIVISION PERIOD program_id clause* -> ^(ID program_id clause*);
clause		: author | installation | date_written | date_compiled | security ;

program_id	: PROGRAM_ID PERIOD WORD commonInitial? PERIOD -> ^(PROGRAM_ID WORD commonInitial?)
		;
			
commonInitial	: IS? COMMON INITIAL? PROGRAM	-> COMMON INITIAL?
		| IS? INITIAL COMMON? PROGRAM	-> INITIAL COMMON?
		;
		 			
author		: AUTHOR	PERIOD TEXT* 	-> ^(AUTHOR TEXT*)
		;
		
installation	: INSTALLATION 	PERIOD TEXT*	-> ^(INSTALLATION TEXT*)
		;
		
date_written	: DATE_WRITTEN 	PERIOD TEXT*	-> ^(DATE_WRITTEN TEXT*)
		;
		
date_compiled	: DATE_COMPILED PERIOD TEXT*	-> ^(DATE_COMPILED TEXT*)
		;
		
security	: SECURITY 	PERIOD TEXT*	-> ^(SECURITY TEXT*)
		;

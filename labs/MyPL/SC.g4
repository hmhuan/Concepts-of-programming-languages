// Define a grammar called SimpleCode
grammar SC;

@lexer::header {
from LexerError import *
}

scan: INTLITERAL* | CHARLITERAL* | BOOLEANLITERAL* | STRINGLITERAL* | IDENTIFIER* ;
// parse: CLASS PROGRAM LCB field_decl* method_decl* RCB ;

// field_decl: TYPE IDENTIFIER+ |(IDENTIFIER LSB DEC_DIGITS RSB)+ ;

// method_decl: ;

var_decl: TYPE IDENTIFIER (COMMA IDENTIFIER)* SEMICOLON;

WS : [ \t\r\n]+ -> skip ;


// Assign Op
ASSIGN_OPR: '='|'+='|'-=';
// Operator
BIN_OPR: ARITH_OPR | REL_OPR | EQ_OPR | COND_OPR ;
fragment ARITH_OPR: '+' |'-' | '*' | '/' | '%' ;
fragment REL_OPR: '<' | '>' | '<=' | '>=' ;
fragment EQ_OPR: '==' | '!=' ;
fragment COND_OPR: '&&' | '||' ;

// Keywords
fragment PROGRAM: 'Program';
fragment IF: 'if' ;
fragment BOOLEAN: 'boolean' ;
fragment BREAK: 'break' ;
fragment CALL_OUT: 'callout' ;
fragment CLASS: 'class' ;
fragment CONTINUE: 'continue' ;
fragment ELSE: 'else' ;
fragment FOR: 'for' ;
fragment INT: 'int' ;
fragment RETURN: 'return' ;
fragment VOID: 'void' ;
KEYWORD: PROGRAM|IF|BOOLEAN|BREAK|CALL_OUT|CLASS|CONTINUE|ELSE|FOR|INT|RETURN|VOID ;
TYPE: INT | BOOLEAN ;


// comment
LINE_COMMENT: '//' ~ [\r\n]* -> skip ;
BLK_COMMENT: ('/*' .*? '*/') -> skip ;

LP: '(';
RP: ')';
LCB: '{';
RCB: '}';
LSB: '[';
RSB: ']';

SEMICOLON: ';';
COMMA: ',';
COLON: ':';
DOT: '.';

// Boolean value
fragment TRUE: 'true' ;
fragment FALSE: 'false';

fragment DIGIT: [0-9] ;
fragment DEC_DIGITS: DIGIT|[1-9]DIGIT* ;
fragment HEX_DIGITS: '0x'(DIGIT|[a-fA-F])*;
fragment CHAR: [\u0020-\u0021\u0023-\u0026\u0028-\u005B\u005D-\u007E]|'\\n'|'\\t'|'\\\\' |'\\"' |'\\\'';
fragment SIGN: [+-] ; 

CHARLITERAL: '\''CHAR'\'' ;
INTLITERAL: (DEC_DIGITS | HEX_DIGITS) {
	y = str(self.text)
	if y == '0x':
		self.text = 'unexpected token: ' + self.text
		self.type = 1
};
BOOLEANLITERAL: (TRUE | FALSE);
STRINGLITERAL: '"' STR_CHAR* '"' ;
IDENTIFIER: ALPHA ALPHA_NUM* ;
fragment STR_CHAR: ~[\b\t\n\f\r"'\\] | ESC_SEQ ;
fragment ESC_SEQ: '\\' [btnfr"'\\] ;
fragment ALPHA: [_a-zA-Z] ;
fragment ALPHA_NUM: ALPHA | DIGIT ;
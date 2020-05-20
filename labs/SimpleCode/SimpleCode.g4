// Define a grammar called SimpleCode
grammar SimpleCode;
scan: LITERAL+ | IDENTIFIER+ ;
WS : [ \t\r\n]+ -> skip ;


// Operator
BIN_OPR: ARITH_OPR | REL_OPR | EQ_OPR | COND_OPR ;
ARITH_OPR: '+' |'-' | '*' | '/' | '%' ;
REL_OPR: '<' | '>' | '<=' | '>=' ;
EQ_OPR: '==' | '!=' ;
COND_OPR: '&&' | '||' ;

// Keywords
PROGRAM: 'Program';
IF: 'if' ;
BOOLEAN: 'boolean' ;
BREAK: 'break' ;
CALL_OUT: 'callout' ;
CLASS: 'class' ;
CONTINUE: 'continue' ;
ELSE: 'else' ;
FOR: 'for' ;
INT: 'int' ;
RETURN: 'return' ;
VOID: 'void' ;

TYPE: INT | BOOLEAN ;



// comment
LINE_COMMENT: '//' ~ [\r\n]* -> skip ;
BLK_COMMENT: ('/*' .*? '*/') -> skip ;

fragment LP: '(';
fragment RP: ')';
fragment LCB: '{';
fragment RCB: '}';
fragment LSB: '[';
fragment RSB: ']';

fragment SEMICOLON: ';';
fragment COMMA: ',';
fragment COLON: ':';
fragment DOT: '.';

// Boolean value
fragment TRUE: 'true' ;
fragment FALSE: 'false';

fragment DIGIT: [0-9] ;
DEC_DIGITS: DIGIT|[1-9] DIGIT* ;
HEX_DIGITS: '0x' (DIGIT | [a-fA-F])+ ;
fragment SIGN: [+-] ;

fragment CHARLITERAL: '\'' [\u0040-\u0176] '\'' ;
fragment ALPHA: [_a-zA-Z] ;
INTLITERAL: DEC_DIGITS+ | HEX_DIGITS+ ;
BOOLEANLITERAL: TRUE | FALSE ;
STRINGLITERAL: '"' STR_CHAR* '"' 
                {
		            y = str(self.text)
		            self.text = y[1:-1]
                };
STR_CHAR: ~[\b\t\n\f\r"'\\] | ESC_SEQ ;
fragment ESC_SEQ: '\\' [btnfr"'\\] ;
LITERAL: INTLITERAL | CHARLITERAL | BOOLEANLITERAL | STRINGLITERAL ;
IDENTIFIER: ALPHA ALPHA_NUM* ;
ALPHA_NUM: ALPHA | DIGIT ;
// Define a grammar called SimpleCode
grammar SC;
scan: INTLITERAL+ | CHARLITERAL+ | BOOLEANLITERAL+ | STRINGLITERAL+ | IDENTIFIER+;
WS : [ \t\r\n]+ -> skip ;


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
KEYWORD: PROGRAM 
        | IF+ 
        | BOOLEAN+ 
        | BREAK+ 
        | CALL_OUT+ 
        | CLASS+ 
        | CONTINUE+ 
        | ELSE+ 
        | FOR+ 
        | INT+ 
        | RETURN+ 
        | VOID+ ;
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
fragment DEC_DIGITS: DIGIT|[1-9]DIGIT* ;
fragment HEX_DIGITS: '0x'(DIGIT|[a-fA-F])+ ;
fragment CHAR: [\u0020-\u0021\u0023-\u0026\u0028-\u005B\u005D-\u007E]
                | '\\n' 
                | '\\t'
                | '\\\\' 
                | '\\"' 
                | '\\\'';
fragment SIGN: [+-] ; 

// LITERAL: INTLITERAL | CHARLITERAL | BOOLEANLITERAL | STRINGLITERAL ;
CHARLITERAL: '\''CHAR'\'' ;
INTLITERAL: DEC_DIGITS | HEX_DIGITS ;
BOOLEANLITERAL: TRUE | FALSE ;
STRINGLITERAL: '"' STR_CHAR* '"' ;
fragment STR_CHAR: ~[\b\t\n\f\r"'\\] | ESC_SEQ ;
fragment ESC_SEQ: '\\' [btnfr"'\\] ;
IDENTIFIER: ALPHA ALPHA_NUM* ;
fragment ALPHA: [_a-zA-Z] ;
fragment ALPHA_NUM: ALPHA | DIGIT ;
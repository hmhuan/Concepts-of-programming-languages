grammar SimpleCode;
options {
    language=Python;
}
a : ID INT;
ID : 'a'..'z'+;
INT : '0'..'9'+;
WS : (' '|'\n'|'\r') {$channel=HIDDEN;} ;
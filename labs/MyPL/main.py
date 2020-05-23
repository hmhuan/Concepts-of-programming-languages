import sys
import os
import antlr4 
from SCLexer import SCLexer
from SCParser import SCParser
from SCListener import SCListener
from LexerError import LexerErrorListener

def scan(file):
    fname = os.path.basename(file).split('.')[0]
    fo = open('output/scanner/' + fname + '.out', 'w') 
    stream = antlr4.FileStream(file)
    lexer = SCLexer(stream)
    lexer.addErrorListener(LexerErrorListener(fo))
    
    for token in lexer.getAllTokens():
        line, symbol, text = token.line, '', token.text  
        if token.type >= lexer.CHARLITERAL:
            symbol =  lexer.symbolicNames[token.type]
            # print(line, symbol, text)
            fo.write('%d %s %s\n' %(line, symbol, text))
        else:
            # print(line, text)
            fo.write('%d %s\n' %(line, text))
    fo.close()

if __name__ == "__main__":
    option, file = int(sys.argv[1]), sys.argv[2]
    if option == 0:
        scan(sys.argv[2])

    pass
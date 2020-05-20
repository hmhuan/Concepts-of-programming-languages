import sys
import antlr4 
from SCLexer import SCLexer
from SCParser import SCParser
from SCListener import SCListener

if __name__ == "__main__":
    input = 'abcd 9778'
    char_stream = antlr4.
    lexer = SCLexer(char_stream)
    tokens = antlr4.CommonTokenStream(lexer)
    for token in tokens.getTokens():
        print(token.getLine(), token.type, token.getText())
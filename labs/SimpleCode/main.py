import sys
import os
import antlr3
from SimpleCodeLexer import SimpleCodeLexer
from SimpleCodeParser import SimpleCodeParser

def readFileInput(path):
    _in = open(path)
    _in.close()
    pass

def Parse():
    pass

def Scan():
    pass

def writeFileOuput(path):
    out = open(path, 'w')
    out.close()
    pass

if __name__ == "__main__":
    input = 'abcd 9778'
    char_stream = antlr3.ANTLRStringStream(input)
    lexer = SimpleCodeLexer(char_stream)
    tokens = antlr3.CommonTokenStream(lexer)
    parser = SimpleCodeParser(tokens)
    
    for token in tokens.getTokens():
        print token.getLine(), token.type, token.getText()
    # option = -1
    # filePath, output = '', ''
    # try:
    #     option = int(sys.argv[2])
    #     filePath = sys.argv[4]
    #     output = os.path.basename(filePath).split('.')[0] + '.out'
    # except (IndexError, ValueError):
    #     pass
    
    # if option == 0:
    #     Scan()
    #     output = './output/scanner/' + output
    # elif option == 1:
    #     Parse()
    #     output = './output/parser/' + output
    pass
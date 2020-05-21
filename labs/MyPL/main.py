import sys
import antlr4 
from SCLexer import SCLexer
from SCParser import SCParser
from SCListener import SCListener


def scan(file):
    stream = antlr4.FileStream('input/scanner/' + file)
    lexer = SCLexer(stream)

    for token in lexer.getAllTokens():
        line, symbol, text = token.line, '', token.text
        if token.type >= lexer.CHARLITERAL:
            symbol =  lexer.symbolicNames[token.type]
            print(line, symbol, text)
        else:
            print(line, text)

if __name__ == "__main__":
    file = sys.argv[1]
    scan(file)

    # text = 'int a, b , c;'
    # stream = antlr4.InputStream(text)
    # lexer = SCLexer(stream)
    # tokens = antlr4.CommonTokenStream(lexer)
    # parser = SCParser(tokens)
    # tree = parser.var_decl()
    
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
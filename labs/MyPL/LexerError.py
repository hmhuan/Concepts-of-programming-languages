from antlr4.error.ErrorListener import ErrorListener
import os
class LexerErrorListener( ErrorListener ):

    def __init__(self, file):
        super(LexerErrorListener, self).__init__()
        self.file = file
        self.fname = os.path.basename(file.name).split('.')[0]
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.file.write('%s line %d:%d %s\n' %(self.fname, line, column, msg))

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        pass

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        pass

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        pass
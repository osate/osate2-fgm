
/*
* generated by Xtext
*/
lexer grammar InternalFeatureGroupMappingLexer;


@header {
package org.osate.xtext.aadl2.featuregroupmapping.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_9 : ('M'|'m')('A'|'a')('P'|'p')('P'|'p')('I'|'i')('N'|'n')('G'|'g')('S'|'s');

KEYWORD_7 : ('E'|'e')('X'|'x')('T'|'t')('E'|'e')('N'|'n')('D'|'d')('S'|'s');

KEYWORD_8 : ('L'|'l')('I'|'i')('B'|'b')('R'|'r')('A'|'a')('R'|'r')('Y'|'y');

KEYWORD_4 : '<''=''>';

KEYWORD_5 : ('E'|'e')('N'|'n')('D'|'d');

KEYWORD_6 : ('U'|'u')('S'|'s')('E'|'e');

KEYWORD_3 : ':'':';

KEYWORD_1 : '.';

KEYWORD_2 : ';';



RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;



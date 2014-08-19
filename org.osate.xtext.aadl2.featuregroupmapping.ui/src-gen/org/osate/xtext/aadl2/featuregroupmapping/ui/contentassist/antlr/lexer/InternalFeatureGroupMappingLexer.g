
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




KEYWORD_35 : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('R'|'r');

KEYWORD_34 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

KEYWORD_32 : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('T'|'t');

KEYWORD_33 : ('M'|'m')('A'|'a')('P'|'p')('P'|'p')('I'|'i')('N'|'n')('G'|'g')('S'|'s');

KEYWORD_27 : ('A'|'a')('P'|'p')('P'|'p')('L'|'l')('I'|'i')('E'|'e')('S'|'s');

KEYWORD_28 : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_29 : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('E'|'e');

KEYWORD_30 : ('E'|'e')('X'|'x')('T'|'t')('E'|'e')('N'|'n')('D'|'d')('S'|'s');

KEYWORD_31 : ('L'|'l')('I'|'i')('B'|'b')('R'|'r')('A'|'a')('R'|'r')('Y'|'y');

KEYWORD_24 : ('D'|'d')('E'|'e')('L'|'l')('T'|'t')('A'|'a');

KEYWORD_25 : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

KEYWORD_26 : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('S'|'s');

KEYWORD_23 : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

KEYWORD_19 : '+''=''>';

KEYWORD_20 : '<''=''>';

KEYWORD_21 : ('E'|'e')('N'|'n')('D'|'d');

KEYWORD_22 : ('U'|'u')('S'|'s')('E'|'e');

KEYWORD_14 : '.''.';

KEYWORD_15 : ':'':';

KEYWORD_16 : '=''>';

KEYWORD_17 : ('I'|'i')('N'|'n');

KEYWORD_18 : ('T'|'t')('O'|'o');

KEYWORD_1 : '(';

KEYWORD_2 : ')';

KEYWORD_3 : '*';

KEYWORD_4 : '+';

KEYWORD_5 : ',';

KEYWORD_6 : '-';

KEYWORD_7 : '.';

KEYWORD_8 : ':';

KEYWORD_9 : ';';

KEYWORD_10 : '[';

KEYWORD_11 : ']';

KEYWORD_12 : '{';

KEYWORD_13 : '}';



RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DIGIT+;

fragment RULE_INT_EXPONENT : ('e'|'E') '+'? RULE_DIGIT+;

RULE_REAL_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* '.' RULE_DIGIT+ ('_' RULE_DIGIT+)* RULE_EXPONENT?;

RULE_INTEGER_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* ('#' RULE_BASED_INTEGER '#' RULE_INT_EXPONENT?|RULE_INT_EXPONENT?);

fragment RULE_DIGIT : '0'..'9';

fragment RULE_EXTENDED_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_BASED_INTEGER : RULE_EXTENDED_DIGIT ('_'? RULE_EXTENDED_DIGIT)*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');




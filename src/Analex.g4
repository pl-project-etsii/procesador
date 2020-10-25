lexer grammar Analex;
BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;
fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];
NUM: 'NUM';
VARIABLES: 'VARIABLES';
ASIGNACIONES : 'ASIGNACIONES';
ITERACIONES: 'ITERACIONES';
INSTRUCCIONES: 'INSTRUCCIONES';
LOG: 'LOG';
SEQ: 'SEQ';
NUMERO : ('-')?DIGITO+;
IDENT : LETRA(LETRA|DIGITO)*;
MAYORQ : '>' ;
MENORQ : '<' ;
PA : '(';
PC : ')';
BA: '{';
BC: '}';
PyC : ';';
COMA : ',';
DP : ':';
MAS: '+';
MENOS: '-';
POR: '*';
IGUAL : '=';
CA : '[' ;
CC : ']' ;
TRUE : 'true';
FALSE : 'false';
WHILE: 'while';
NO: 'not';
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;
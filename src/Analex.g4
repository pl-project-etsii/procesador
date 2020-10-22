lexer grammar AnalexEjemplo;
BLANCO: ' ' ->skip;
TABULADOR: '\t'->skip;
FIN_LINEA: '\r'?'\n' ->skip;
fragment DIGITO: [0-9];
fragment LETRA:[a-zA-Z];
NUM: 'NUM';
LOG: 'LOG';
SEC: 'SEC';
NUMERO : ('-')?DIGITO+;
IDENT : LETRA(LETRA|DIGITO)*;
PA : '(';
PC : ')';
PyC : ';';
COMA : ',';
DP : ':';
MAS: '+';
MENOS: '-';
POR: '*';
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA : '//' .*? FIN_LINEA -> skip ;
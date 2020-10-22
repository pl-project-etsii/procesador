parser grammar Anasint;
options{
 tokenVocab=AnalexEjemplo;
}
programa : variables;
variables: VARIABLES lista_variables PYC;
lista_variables: IDENT COMA lista_variables
    | IDENT DP tipo
    ;
tipo SEC PA tipo PC
    |NUM
    | LOG
    ;
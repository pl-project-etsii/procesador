parser grammar Anasint;
options{
 tokenVocab=Analex;
}
sentencia : variables EOF;
variables : VARIABLES (lista_variables)* PyC;
lista_variables : IDENT COMA lista_variables
    | IDENT DP tipo
    ;
tipo : SEQ PA tipo PC
    |NUM
    |LOG
    ;
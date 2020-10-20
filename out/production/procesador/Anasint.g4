// Analizador sintáctico lenguaje expr
parser grammar Anasint;
options{
 tokenVocab=Analex;
}
sentencia : variables expr EOF;
variables : decl_vars PyC ;
tipo: ENTERO
 | BOOLEANO
 ;
decl_vars : IDENT tipo COMA decl_vars
 | IDENT tipo
 ;
expr : expr1 (Y expr | O expr) #Expr_Y_O
 | NO expr #Expr_NO
 | expr1 #Rel
 ;
 expr1 : expr2 (MAYOR expr2 | MENOR expr2 | IGUAL expr2)
 #Rel_MAYOR_MENOR_IGUAL
  | expr2 #Term
  ;
 expr2 : expr3 (MAS expr2 | MENOS expr2 | POR expr2) #Term_MAS_MENOS_POR
  | expr3 (DIV expr2) #Term_DIV
  | expr3 #Term_Base
  ;
 expr3 : IDENT #Id
  | NUMERO #Num
  | CIERTO #T
  | FALSO #F
  | PA expr PC #ParExpr
  ;

parser grammar Anasint;
options{
 tokenVocab=Analex;
}
sentencia : variables EOF; //añadir secciones de subprogramas e instrucciones
variables : VARIABLES (lista_variables)+;
lista_variables : IDENT COMA lista_variables
    | IDENT DP tipo PyC
    ;
tipo : SEQ PA tipo PC //al ser recursivo se podría dar el caso de una secuencia dentro de una secuencia?
    |NUM
    |LOG
    ;

//Asignaciones? Se indica que la declaracion de variable no asigna valor a la misma
asignaciones: ASIGNACIONES (asignacion)* ;
asignacion : VAR IGUAL expresion Pyc;

//expresiones?
expresion : expresion_entera | expresion_logica | expresion_no_elemental ;
/*Expresion no elemental o secuencia? luego se distinguen 2 tipos de secuencias, una de ellas creo que es de un nivel
más alto pero aun así deberíamos de tenerla en cuenta? */

expresion_entera : NUMERO;

//En el lexico las he llamado TRUE Y FALSE si se prefiere poner cierto y falso se cambian en analex
expresion_logica : TRUE
    | FALSE
    ;

//Lo vemos esta tarde (?)
expresion_no_elemental : VAR;
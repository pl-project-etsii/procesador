parser grammar Anasint;
options{
 tokenVocab=Analex;
}
sentencia : variables asignaciones EOF; //añadir secciones de subprogramas e instrucciones
variables : VARIABLES (lista_variables)+;
lista_variables : IDENT COMA lista_variables
    | IDENT DP tipo PyC
    ;

tipo : SEQ PA tipo PC //al ser recursivo se podría dar el caso de una secuencia dentro de una secuencia?
    |NUM
    |LOG
    ;
//NO SE ADMITEN ASIGNACIONES SIN VALOR A UNA VARIABLE
//Asignaciones multiples? Interpretacion parelela o secuencial? como asigno la prioridad a la operacion POR???
asignaciones: ASIGNACIONES (asignacion)* ;

asignacion : IDENT (COMA IDENT)* IGUAL expresion PyC;

expresion : expresion_entera | expresion_logica | expresion_no_elemental ;

funcion_entera: POR
    | MAS
    | MENOS
    ;
expresion_entera : NUMERO
    | IDENT
    | funcion_entera PA expresion_entera PC
    | (COMA expresion_entera)*
    ;
expresion_logica : TRUE
    | FALSE
    | NO PA (expresion_logica) PC
    ;

//Lo vemos esta tarde (?)
expresion_no_elemental : VAR;

/*expresion_no_elemental : CA (secuencia) CC //Si pongo (secuencia)? me da error (hablar de las funciones)
    | IDENT
    ;*/

secuencia: (expresion_entera | expresion_logica) (COMA expresion_entera | expresion_logica)* ;


// Instrucciones: iteracion
stat:   variables FIN_LINEA         // printExpr
    |   IDENT IGUAL variables PyC         // assign
    |   loop FIN_LINEA                // whileLoop
  //  |   relational FIN_LINEA          // relat
    |   FIN_LINEA                     // blank
    ;


relational:     variables op=(MAYORQ|MENORQ) variables     // GreaterEqual
    ;

loop: WHILE PA expresion_logica PA FIN_LINEA? BA stat* BC ;  // while


parser grammar Anasint;
options{
 tokenVocab=Analex;
}
sentencia: variables subprogramas instrucciones? EOF;


//VARIABLES
variables : VARIABLES lista_variables*;
lista_variables : IDENT COMA lista_variables
    | IDENT DP tipo PyC
    ;

tipo : SEQ PA tipo PC //al ser recursivo se podría dar el caso de una secuencia dentro de una secuencia?
    |NUM
    |LOG
    ;

//SUBPROGRAMAS
declaracion: variables instrucciones;

subprogramas : SUBPROGRAMAS (funciones)* (procedimientos)*;

funciones: FUNCION IDENT(PA tipo IDENT(COMA tipo IDENT)* PC)? DEV (PA tipo IDENT(COMA tipo IDENT)* PC)
            declaracion
            FFUNCION;

procedimientos: PROCEDIMIENTO IDENT(PA tipo IDENT(COMA tipo IDENT)* PC)
                declaracion
                FPROCEDIMIENTO;

//INSTRUCCIONES
//Hay que añadir en instruccion los tipos de instrucciones disponibles
instrucciones: INSTRUCCIONES instruccion*;
instruccion: iteracion
           | asignacion
           | condicional
           | devolucion;

// Instrucciones: asignación
//Asignaciones multiples? Interpretacion parelela o secuencial?
asignacion : IDENT (COMA IDENT)* IGUAL expresion (COMA expresion)* PyC;

expresion : expresion_no_elemental | expresion_entera | expresion_logica ;

funcion_entera: POR
    | MAS
    | MENOS
    ;

expresion_entera : PA expresion_entera PC
    | expresion_entera (funcion_entera expresion_entera)+
    | NUMERO
    | IDENT
    ;

expresion_logica : TRUE
    | FALSE
    | IDENT
    ;

expresion_no_elemental : CA (secuencia)? CC //funcion vacia?
    | IDENT
    ;

secuencia: expresion_entera (COMA expresion_entera)*
    |expresion_logica (COMA expresion_logica)*
    ;

// Instrucciones: iteracion
iteracion:  MIENTRAS PA expresion_logica PC HACER
    | BA iteracion* BC
    | FMIENTRAS
    ;

// Instrucciones: condicional
condicional: SI PA condicion PC ENTONCES
                instruccion*
             SINO?
                instruccion*
             FINSI
           ;
condicion: NEGACION condicion
         | condicion Y condicion
         | condicion O condicion
         | expresion relacion_binaria expresion
         | CIERTO
         | FALSO
         ;

relacion_binaria: MAYORIGUAL|MENORIGUAL|MAYOR|MENOR|IGUALDAD|DISTINTO;

//Instrucciones: devolución
devolucion: DEV (IDENT)(COMA IDENT)* PyC
            | DEV (TRUE|FALSE);
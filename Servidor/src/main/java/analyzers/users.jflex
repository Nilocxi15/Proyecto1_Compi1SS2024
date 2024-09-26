/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;

import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%

//-------> Directivas
%public
%class L_Analyzer_Users
%cupsym Symbols_Users
%cup
%char
%column
%full
%ignorecase
%line

//------> Expresiones Regulares
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

init = "db.users"
user = "USUARIO"
password = "PASSWORD"
name = "NOMBRE"
institution = "INSTITUCION"
fechaCreacion = "FECHA_CREACION"

//Name and Institution values
niValue = [A-Z]+

//User and Password values
upValue = [a-zA-Z0-9_]+

//Date values
day = [0-3][0-9]
month = [0-1][0-9]
year = [1-2][0-9][0-9][0-9]
date = {day} "/" {month} "/" {year}
%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "("     {return new Symbol(Symbols_Users.OpenParenthesis, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ")"     {return new Symbol(Symbols_Users.CloseParenthesis, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "{"     {return new Symbol(Symbols_Users.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "}"     {return new Symbol(Symbols_Users.RightBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ","     {return new Symbol(Symbols_Users.Comma, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "\""    {return new Symbol(Symbols_Users.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ":"     {return new Symbol(Symbols_Users.Colon, (yycolumn + 1), (yyline + 1), yytext());}

//-------> Simbolos ER
<YYINITIAL> {init}          {return new Symbol(Symbols_Users.Init, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {user}          {return new Symbol(Symbols_Users.User, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {password}      {return new Symbol(Symbols_Users.Password, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {name}          {return new Symbol(Symbols_Users.Name, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {institution}   {return new Symbol(Symbols_Users.Institution, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {fechaCreacion} {return new Symbol(Symbols_Users.FechaCreacion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {niValue}       {return new Symbol(Symbols_Users.NIValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {upValue}       {return new Symbol(Symbols_Users.UPValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {date}          {return new Symbol(Symbols_Users.Date, (yycolumn + 1), (yyline + 1), yytext());}
{WhiteSpace} {/* Ignorar espacios en blanco */}

//------> Errores Lexicos
. { System.out.println("Error: Caracter no valido: " + yytext()); }
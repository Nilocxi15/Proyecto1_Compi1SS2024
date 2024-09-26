/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;

import java_cup.runtime.*;
import java.util.LinkedList;
import models.TError;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //Codigo de usuario en sintaxis java
    public static LinkedList<TError> TablaEL = new LinkedList<TError>();
%}

//-------> Directivas
%public
%class L_Analyzer_Requests
%cupsym Symbols_Requests
%cup
%char
%column
%full
%ignorecase
%line

//------> Expresiones Regulares
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
xson = "xson"
version = "version"
versionNumber = "1.0"

realizarSolitud = "realizar_solicitud"
realizarSolicitudes = "realizar_solicitudes"
finSolicitudRealizada = "fin_solicitud_realizada"
finSolicitudesRealizadas = "fin_solicitudes_realizadas"

usuarioNuevo = "USUARIO_NUEVO"
modificarUsuario = "MODIFICAR_USUARIO"
eliminarUsuario = "ELIMINAR_USUARIO"
datosUsuario = "DATOS_USUARIO"
usuario = "USUARIO"
password = "PASSWORD"
nombre = "NOMBRE"
institucion = "INSTITUCION"
fechaCreacion = "FECHA_CREACION"

niValue = [A-Z]+
values = [A-Za-z0-9_ÁÉÍÓÚáéíóúñÑ]+
day = [0-3][0-9]
month = [0-1][0-9]
year = [1-2][0-9][0-9][0-9]
date = {day} "/" {month} "/" {year}

//------> Estados

%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "<"     {System.out.println("Reconocio "+yytext()+" menor que"); return new Symbol(Symbols_Requests.LessThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ">"     {System.out.println("Reconocio "+yytext()+" mayor que"); return new Symbol(Symbols_Requests.GreaterThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "?"     {System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Symbols_Requests.QuestionMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "="     {System.out.println("Reconocio "+yytext()+" igual"); return new Symbol(Symbols_Requests.Equal, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "\""    {System.out.println("Reconocio "+yytext()+" comillas"); return new Symbol(Symbols_Requests.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "!"     {System.out.println("Reconocio "+yytext()+" exclamacion"); return new Symbol(Symbols_Requests.ExclamationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ":"     {System.out.println("Reconocio "+yytext()+" dos puntos"); return new Symbol(Symbols_Requests.Colon, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ","     {System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols_Requests.Comma, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> "{"     {System.out.println("Reconocio "+yytext()+" llave izquierda"); return new Symbol(Symbols_Requests.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "}"     {System.out.println("Reconocio "+yytext()+" llave derecha"); return new Symbol(Symbols_Requests.RightBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "["     {System.out.println("Reconocio "+yytext()+" corchete izquierdo"); return new Symbol(Symbols_Requests.LeftBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "]"     {System.out.println("Reconocio "+yytext()+" corchete derecho"); return new Symbol(Symbols_Requests.RightBracket, (yycolumn + 1), (yyline + 1), yytext());}

//------> Simbolos Expresiones Regulares
<YYINITIAL> {xson}                      {System.out.println("Reconocio "+yytext()+" xson"); return new Symbol(Symbols_Requests.XSONsentence, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {version}                   {System.out.println("Reconocio "+yytext()+" version"); return new Symbol(Symbols_Requests.Version, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {versionNumber}             {System.out.println("Reconocio "+yytext()+" version number"); return new Symbol(Symbols_Requests.VersionNumber, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {realizarSolitud}           {System.out.println("Reconocio "+yytext()+" realizar solicitud"); return new Symbol(Symbols_Requests.RealizarSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {realizarSolicitudes}       {System.out.println("Reconocio "+yytext()+" realizar solicitudes"); return new Symbol(Symbols_Requests.RealizarSolicitudes, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finSolicitudRealizada}     {System.out.println("Reconocio "+yytext()+" fin solicitud realizada"); return new Symbol(Symbols_Requests.FinSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finSolicitudesRealizadas}  {System.out.println("Reconocio "+yytext()+" fin solicitudes realizadas"); return new Symbol(Symbols_Requests.FinSolicitudes, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {usuarioNuevo} {            System.out.println("Reconocio "+yytext()+" usuario nuevo"); return new Symbol(Symbols_Requests.UsuarioNuevo, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {modificarUsuario}          {System.out.println("Reconocio "+yytext()+" modificar usuario"); return new Symbol(Symbols_Requests.ModificarUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {eliminarUsuario}           {System.out.println("Reconocio "+yytext()+" eliminar usuario"); return new Symbol(Symbols_Requests.EliminarUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {datosUsuario}              {System.out.println("Reconocio "+yytext()+" datos usuario"); return new Symbol(Symbols_Requests.DatosUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuario}                   {System.out.println("Reconocio "+yytext()+" usuario"); return new Symbol(Symbols_Requests.Usuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {password}                  {System.out.println("Reconocio "+yytext()+" password"); return new Symbol(Symbols_Requests.Password, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nombre}                    {System.out.println("Reconocio "+yytext()+" nombre"); return new Symbol(Symbols_Requests.Nombre, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {institucion}               {System.out.println("Reconocio "+yytext()+" institucion"); return new Symbol(Symbols_Requests.Institucion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {fechaCreacion}             {System.out.println("Reconocio "+yytext()+" fecha de creacion"); return new Symbol(Symbols_Requests.FechaCreacion, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {niValue}                   {System.out.println("Reconocio "+yytext()+" valor de NI"); return new Symbol(Symbols_Requests.NIValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {values}                    {System.out.println("Reconocio "+yytext()+" valor"); return new Symbol(Symbols_Requests.UPValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {date}                      {System.out.println("Reconocio "+yytext()+" fecha"); return new Symbol(Symbols_Requests.Date, (yycolumn + 1), (yyline + 1), yytext());}

{WhiteSpace} {/* ignore whitespace */}

//------> Errores Lexicos
.                       {System.out.println("Error Lexico "+yytext()+" Linea: "+(yyline+1)+" Columna: "+(yycolumn+1));
                        TError datos = new TError(yytext(),yyline + 1,yycolumn + 1,"Error Lexico","Simbolo no existe en el lenguaje");
                        TablaEL.add(datos);}
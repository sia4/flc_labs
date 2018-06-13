import java_cup.runtime.*;

%%

%unicode
%cup
%line
%column

%{
	private Symbol symbol(int type) { 
		return new Symbol(type, yyline, yycolumn); 
	}

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}
%}

nl			=  \n|\r|\r\n
ws 			= [ \t]
comment		= "/*"~"*/"

integer 	=  ([1-9][0-9]*|0)
double 		= (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?
var			= [A-Za-z_][A-Za-z0-9_]* 

%%

"{" 	{return symbol(sym.GOPEN);}
"}"		{return symbol(sym.GCLOSE);}
"("		{return symbol(sym.ROPEN);}
")"		{return symbol(sym.RCLOSE);}
"["		{return symbol(sym.SOPEN);}
"]"		{return symbol(sym.SCLOSE);}
"+"		{return symbol(sym.PLUS);}
"-"		{return symbol(sym.MINUS);}
"*"		{return symbol(sym.STAR);}
"/"		{return symbol(sym.SLASH);}
"="		{return symbol(sym.EQUAL);}
";"		{return symbol(sym.S);}
"."		{return symbol(sym.P);}
","		{return symbol(sym.COMMA);}
"<"		{return symbol(sym.LT);}
">"		{return symbol(sym.GT);}
"&"		{return symbol(sym.AND);}
"|"		{return symbol(sym.OR);}
"!"		{return symbol(sym.NOT);}

"<="	{return symbol(sym.LET);}
">="	{return symbol(sym.GET);}
"=<"	{return symbol(sym.ELT);}
"=>"	{return symbol(sym.EGT);}

int		{return symbol(sym.INT_TYPE);}
double	{return symbol(sym.DOUBLE_TYPE);}
if		{return symbol(sym.IF);}
while	{return symbol(sym.WHILE);}
else 	{return symbol(sym.ELSE);}
print	{return symbol(sym.PRINT);}

{integer}	{return symbol(sym.INT, new Integer(yytext()));}
{double}	{return symbol(sym.DOUBLE, new Double(yytext()));}
{var}		{return symbol(sym.VAR, yytext());}

{comment}|{nl}|" "	{;}

. 		{System.err.println("SCANNER ERROR: "+yytext());}

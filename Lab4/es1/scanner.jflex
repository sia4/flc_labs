import java_cup.runtime.*;

%%

%unicode
%line
%column

%cup

%{

	private Symbol symbol(int type) { 
		return new Symbol(type, yyline, yycolumn);
	}

%}

nl			= \n|\r|\r\n
ws			= [\ \t]
comment		= "/*"~"*/"

integer 		= ("-"?[1-9][0-9]*|0)
double 			= "-"?(([0-9]+\.[0-9]*)|([0-9]*\.[0-9]+))(e|E('+'|'-')?[0-9]+)?
atom			= ([a-z][a-zA-Z0-9_]*)|{double}|{integer}
var				= [A-Z_][a-zA-Z0-9_]*

%%

"." 		{return symbol(sym.POINT);}
":-"		{return symbol(sym.RULE_START);}
","			{return symbol(sym.COMMA);}
"?-"		{return symbol(sym.INT_START);}
"("			{return symbol(sym.OPEN_B);}
")"			{return symbol(sym.CLOSE_B);}
{atom}		{return symbol(sym.ATOM);}
{var}		{return symbol(sym.VAR);}

{comment}	{;}
{nl}|{ws}	{;}

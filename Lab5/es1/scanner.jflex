import java_cup.runtime.*;

%%

%unicode
%cup

%{

	private Symbol symbol(int type) { 
		return new Symbol(type, yyline, yycolumn); 
	}

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}

%}

nl              =  \n|\r|\r\n
ws 				=  [\ \t]

integer 		=  ([1-9][0-9]*|0)
double 			= (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?

%%

{integer}|{double}	{return new Symbol(sym.SCALAR, yyline, yycolumn, new Double(yytext()));}

"["     			{return symbol(sym.SOPEN);}
"]"     			{return symbol(sym.SCLOSE);}

[a-z]				{return new Symbol(sym.SVAR, yyline, yycolumn, new String(yytext()));}
[A-Z]		     	{return new Symbol(sym.VVAR, yyline, yycolumn, new String(yytext()));}
"+"     			{return symbol(sym.PLUS);}
"-"     			{return symbol(sym.MINUS);}
"*"     			{return symbol(sym.STAR);}
"/"     			{return symbol(sym.DIV);}
"^"     			{return symbol(sym.EXPON);}
"."     			{return symbol(sym.POINT);}
"="     			{return symbol(sym.EQUAL);}

";"     			{return symbol(sym.SEMIC);}
"?"     			{return symbol(sym.QM);}	
","					{return symbol(sym.COMMA);}

{nl} | {ws}			{;}

.					{System.out.println("Error in scanner.");}

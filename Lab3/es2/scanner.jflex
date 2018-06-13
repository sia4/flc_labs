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

	private Symbol symbol(int type, Object value) {
		return new Symbol(type, yyline, yycolumn, value);
	}

%}

nl              = \n|\r|\r\n
ws 				= [\ \t]

digit           = [0-9]			
letter          = [A-Za-z]
exad			= [0-9A-F]
isbn			= {digit}{digit}"-"{digit}{digit}"-"{exad}{5}"-"({letter}|{digit})
string          = \" ~ \" 
number			= ([1-9][0-9]*)|0

date			= (([0-2][0-9])|(3[01]))"/"((0[0-9])|(1[0-2]))"/"[12][0-9]{3}

%%

"->"			{return symbol(sym.SEP_WRITER);}
{isbn}			{return symbol(sym.ISBN);}
":"				{return symbol(sym.DPOINTS);}
{string}		{return symbol(sym.STRING);}
{number}		{return symbol(sym.NUMBER);}
{letter}		{return symbol(sym.LETTER);}

","				{return symbol(sym.COMMA);}
";"				{return symbol(sym.SEMICOLON);}

LI				{return symbol(sym.LI);}
LS				{return symbol(sym.LS);}
AV				{return symbol(sym.AV);}
BO				{return symbol(sym.BO);}
SO				{return symbol(sym.SO);}

"%%"			{return symbol(sym.SEPARATOR);}

{date}			{return symbol(sym.DATE);}

{nl} | {ws} 	{;}

.				{System.out.println("Scanner error");}


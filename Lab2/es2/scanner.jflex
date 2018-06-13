
%%

%class Html
%unicode
%standalone
%caseless

%xstate COMMENT
%xstate TAG

%{
public int tags_n = 0;
public int table_n = 0;
public int h1_n = 0;
public int h2_n = 0;
public int h3_n = 0;
public int h4_n = 0;
%}

%eof{
	System.out.println("Total number of tags: " + tags_n);
	System.out.println("Total number of table tags: " + table_n);
	System.out.println("Total number of h1 tags: " + h1_n);
	System.out.println("Total number of h2 tags: " + h2_n);
	System.out.println("Total number of h3 tags: " + h3_n);
	System.out.println("Total number of h4 tags: " + h4_n);
%eof}

%%

"<"|"<\\" {
	yybegin(TAG);
	System.out.print(yytext());
	++tags_n;
}
"<!--" {
	yybegin(COMMENT);
}
. {
	System.out.print(yytext());
}		

<COMMENT> {
	"-->" {
		yybegin(YYINITIAL);
	}
	. {;}
}

<TAG> {
    ">"|"\>" {
    	yybegin(YYINITIAL);
		System.out.print(yytext());
    }
	table {
		System.out.print(yytext());
		++table_n;
	}
	h1 {
		System.out.print(yytext());
		++h1_n;
	}
	h2 {
		System.out.print(yytext());
		++h2_n;
	}
	h3 {
		System.out.print(yytext());
		++h3_n;
	}
	h4 {
		System.out.print(yytext());
		++h4_n;
	}
	. {
		System.out.print(yytext());
	}
}

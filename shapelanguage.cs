SYNTAXDEF shapelanguage
FOR <http://shapelanguage.com>
START RootBlock

TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"RootBlock" COLOR #430055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"outArrow" COLOR #7F0055, BOLD;
	"inArrow" COLOR #7F0055, BOLD;
	"modelElements" COLOR #7F0055, BOLD;
	"Block" COLOR #7F0055, BOLD;
	"Arrow" COLOR #7F0055, BOLD;
	"target" COLOR #7F0055, BOLD;
	"source" COLOR #7F0055, BOLD;
	"Circle" COLOR #7F0055, BOLD;
	"Triangle" COLOR #7F0055, BOLD;
	"Sqaure" COLOR #7F0055, BOLD;
}


RULES {
	RootBlock ::= "RootBlock" "{" ("name" ":" name['"','"'] | "outArrow" ":" outArrow[] | "inArrow" ":" inArrow[] | "modelElements" ":" modelElements)* "}";
	Block ::= "Block" "{" ("name" ":" name['"','"'] | "outArrow" ":" outArrow[] | "inArrow" ":" inArrow[] | "modelElements" ":" modelElements)* "}";
	Arrow ::= "Arrow" "{" ("name" ":" name['"','"'] | "target" ":" target[] | "source" ":" source[])* "}";
	Circle ::= "Circle" "{" ("name" ":" name['"','"'] | "outArrow" ":" outArrow[] | "inArrow" ":" inArrow[])* "}";
	Triangle ::= "Triangle" "{" ("name" ":" name['"','"'] | "outArrow" ":" outArrow[] | "inArrow" ":" inArrow[])* "}";
	Sqaure ::= "Sqaure" "{" ("name" ":" name['"','"'] | "outArrow" ":" outArrow[] | "inArrow" ":" inArrow[])* "}";
}
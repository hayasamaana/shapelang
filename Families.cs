SYNTAXDEF families
FOR <http://families.com>
START Family

OPTIONS{
reloadGeneratorModel="true";
generateCodeFromGeneratorModel="true";
disableLaunchSupport="false";
usePredefinedTokens="true";
}


TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"Family" COLOR #7F0055, BOLD;
	"lastName" COLOR #7F0055, BOLD;
	"father" COLOR #7F0055, BOLD;
	"mother" COLOR #7F0055, BOLD;
	"sons" COLOR #7F0055, BOLD;
	"daughters" COLOR #7F0055, BOLD;
	"Member" COLOR #7F0055, BOLD;
	"firstName" COLOR #7F0055, BOLD;
	"familyFather" COLOR #7F0055, BOLD;
	"familyMother" COLOR #7F0055, BOLD;
	"familySon" COLOR #7F0055, BOLD;
	"familyDaughter" COLOR #7F0055, BOLD;
}


RULES {
	Family ::= "Family" "{" ("lastName" ":" lastName['"','"'] | "father" ":" father | "mother" ":" mother | "sons" ":" sons | "daughters" ":" daughters)* "}";
	Member ::= "Member" "{" ("firstName" ":" firstName['"','"'] | "familyFather" ":" familyFather[] | "familyMother" ":" familyMother[] | "familySon" ":" familySon[] | "familyDaughter" ":" familyDaughter[])* "}";
}
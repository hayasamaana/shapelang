SYNTAXDEF persons
FOR <http://persons.com>
START Male,Female

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
	"Male" COLOR #7F0055, BOLD;
	"fullName" COLOR #7F0055, BOLD;
	"Female" COLOR #7F0055, BOLD;
}


RULES {
	Male ::= "Male" "{" ("fullName" ":" fullName['"','"'])* "}";
	Female ::= "Female" "{" ("fullName" ":" fullName['"','"'])* "}";
}
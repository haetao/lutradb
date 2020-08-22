lexer grammar BasicTypes;

fragment DIGIT: [0-9];
fragment ALPHABET: [A-Za-z_\u2E80-\u9FFF];

COMMA:              ',';
S_QUOTE:           '\'';
R_QUOTE:            '`';
F_STOP:             '.';
L_BRACKET:          '(';
R_BRACKET:          ')';
START:              '*';

NUMBER: DIGIT+('.'DIGIT+)? ;

ID: ALPHABET+(DIGIT(ALPHABET)*)*;

WS: [\r\t\n ]+ -> skip; // Skip all the white spaces.
package io.gluon.collider.datascript;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static io.gluon.collider.datascript.psi.DatascriptTypes.*;

%%

%{
  public _DatascriptLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _DatascriptLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

DATE=d"/"[0-9]+"/"
COMMENT="//".*
INT=[0-9]+
NUMBER=[0-9]+(\.[0-9]*)?
ID=[:letter:][a-zA-Z_0-9]*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "{"                { return LBRACE; }
  "}"                { return RBRACE; }
  "["                { return LBRACKET; }
  "]"                { return RBRACKET; }
  "("                { return LPAREN; }
  ")"                { return RPAREN; }
  ","                { return COMMA; }
  "namespace"        { return NAMESPACE; }
  "connect"          { return CONNECT; }
  "repository"       { return REPOSITORY; }
  "as"               { return AS; }
  "prepared"         { return PREPARED; }
  "query"            { return QUERY; }
  "prefetch"         { return PREFETCH; }
  "rows"             { return ROWS; }
  "fetch"            { return FETCH; }
  "one"              { return ONE; }
  "list"             { return LIST; }
  "stream"           { return STREAM; }
  "select"           { return SELECT; }
  "from"             { return FROM; }
  "join"             { return JOIN; }
  "on"               { return ON; }
  "where"            { return WHERE; }
  "group"            { return GROUP; }
  "having"           { return HAVING; }
  "order"            { return ORDER; }
  "by"               { return BY; }
  "asc"              { return ASC; }
  "desc"             { return DESC; }
  "int"              { return INT_TYPE; }
  "int?"             { return NULLABLE_INT_TYPE; }
  "long"             { return LONG_TYPE; }
  "long?"            { return NULLABLE_LONG_TYPE; }
  "double"           { return DOUBLE_TYPE; }
  "decimal"          { return DECIMAL_TYPE; }
  "string"           { return STRING_TYPE; }
  "boolean"          { return BOOLEAN_TYPE; }
  "date"             { return DATE_TYPE; }
  "timestamp"        { return TIMESTAMP_TYPE; }
  ";"                { return SEMICOLON; }
  ":"                { return COLON; }
  "-"                { return MINUS; }
  "+"                { return PLUS; }
  "/"                { return DIV; }
  "*"                { return MUL; }
  "||"               { return CONCATENATE; }
  "="                { return EQ; }
  "<>"               { return NEQ; }
  "."                { return DOT; }
  ">"                { return GT; }
  ">="               { return GT_EQ; }
  "<"                { return LT; }
  "<="               { return LT_EQ; }
  "or"               { return OR; }
  "and"              { return AND; }
  "not"              { return NOT; }
  "is"               { return IS; }
  "like"             { return LIKE; }
  "null"             { return NULL; }
  "sysdate"          { return SYSDATE; }
  "count"            { return COUNT; }
  "between"          { return BETWEEN; }
  "all"              { return ALL; }
  "distinct"         { return DISTINCT; }

  {DATE}             { return DATE; }
  {COMMENT}          { return COMMENT; }
  {INT}              { return INT; }
  {NUMBER}           { return NUMBER; }
  {ID}               { return ID; }
  {STRING}           { return STRING; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
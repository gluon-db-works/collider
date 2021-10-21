// This is a generated file. Not intended for manual editing.
package io.gluon.collider.datascript.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.gluon.collider.datascript.psi.DatascriptTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DatascriptParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return file(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(QUERY_GENERATOR, REPO_ELEMENT),
    create_token_set_(SQL_AND_EXPRESSION, SQL_BETWEEN_EXPRESSION, SQL_COLUMN_REF_EXPRESSION, SQL_COMPARISON_EXPRESSION,
      SQL_COUNT_FUNCTION_EXPRESSION, SQL_DATE_LITERAL_EXPRESSION, SQL_EXPRESSION, SQL_FUNCTION_EXPRESSION,
      SQL_INT_LITERAL_EXPRESSION, SQL_IN_EXPRESSION, SQL_MUL_OR_DIV_EXPRESSION, SQL_NOT_EXPRESSION,
      SQL_NULL_LITERAL_EXPRESSION, SQL_OR_EXPRESSION, SQL_PARAMETER_EXPRESSION, SQL_PARANTHESIS_EXPRESSION,
      SQL_PLUS_OR_MINUS_EXPRESSION, SQL_STRING_LITERAL_EXPRESSION, SQL_SYS_DATE_LITERAL_EXPRESSION),
  };

  /* ********************************************************** */
  // AS ID
  public static boolean aliasClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasClause")) return false;
    if (!nextTokenIs(b, AS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS, ID);
    exit_section_(b, m, ALIAS_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // ALL | DISTINCT
  public static boolean allDistinct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "allDistinct")) return false;
    if (!nextTokenIs(b, "<all distinct>", ALL, DISTINCT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALL_DISTINCT, "<all distinct>");
    r = consumeToken(b, ALL);
    if (!r) r = consumeToken(b, DISTINCT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<param>> ( ',' <<param>> ) *
  static boolean comma_separated_list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && comma_separated_list_1(b, l + 1, _param);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' <<param>> ) *
  private static boolean comma_separated_list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comma_separated_list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "comma_separated_list_1", c)) break;
    }
    return true;
  }

  // ',' <<param>>
  private static boolean comma_separated_list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "comma_separated_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONNECT ID STRING
  public static boolean connection(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "connection")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, CONNECTION, "<connection>");
    r = consumeTokens(b, 1, CONNECT, ID, STRING);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, DatascriptParser::namespaceRecover);
    return r || p;
  }

  /* ********************************************************** */
  // sqlType | ID
  public static boolean dataType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dataType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA_TYPE, "<data type>");
    r = sqlType(b, l + 1);
    if (!r) r = consumeToken(b, ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (qualifiedName|subSelect) aliasClause?
  public static boolean entitySelector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entitySelector")) return false;
    if (!nextTokenIs(b, "<entity selector>", ID, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENTITY_SELECTOR, "<entity selector>");
    r = entitySelector_0(b, l + 1);
    r = r && entitySelector_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifiedName|subSelect
  private static boolean entitySelector_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entitySelector_0")) return false;
    boolean r;
    r = qualifiedName(b, l + 1);
    if (!r) r = subSelect(b, l + 1);
    return r;
  }

  // aliasClause?
  private static boolean entitySelector_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entitySelector_1")) return false;
    aliasClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FETCH LIST prefetchStatement?
  public static boolean fetchList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchList")) return false;
    if (!nextTokenIs(b, FETCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FETCH, LIST);
    r = r && fetchList_2(b, l + 1);
    exit_section_(b, m, FETCH_LIST, r);
    return r;
  }

  // prefetchStatement?
  private static boolean fetchList_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchList_2")) return false;
    prefetchStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FETCH ONE
  public static boolean fetchOne(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchOne")) return false;
    if (!nextTokenIs(b, FETCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FETCH, ONE);
    exit_section_(b, m, FETCH_ONE, r);
    return r;
  }

  /* ********************************************************** */
  // FETCH STREAM prefetchStatement?
  public static boolean fetchStream(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchStream")) return false;
    if (!nextTokenIs(b, FETCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FETCH, STREAM);
    r = r && fetchStream_2(b, l + 1);
    exit_section_(b, m, FETCH_STREAM, r);
    return r;
  }

  // prefetchStatement?
  private static boolean fetchStream_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fetchStream_2")) return false;
    prefetchStatement(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NAMESPACE qualifiedName connection? namespaceElement*
  static boolean file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file")) return false;
    if (!nextTokenIs(b, NAMESPACE)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_);
    r = consumeToken(b, NAMESPACE);
    p = r; // pin = 1
    r = r && report_error_(b, qualifiedName(b, l + 1));
    r = p && report_error_(b, file_2(b, l + 1)) && r;
    r = p && file_3(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // connection?
  private static boolean file_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_2")) return false;
    connection(b, l + 1);
    return true;
  }

  // namespaceElement*
  private static boolean file_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!namespaceElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FROM <<comma_separated_list ( entitySelector )>>
  public static boolean fromClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromClause")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FROM);
    r = r && comma_separated_list(b, l + 1, DatascriptParser::fromClause_1_0);
    exit_section_(b, m, FROM_CLAUSE, r);
    return r;
  }

  // ( entitySelector )
  private static boolean fromClause_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fromClause_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = entitySelector(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fromClause joinClause* whereClause? groupClause? orderClause? selectClause
  public static boolean fullSelect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fullSelect")) return false;
    if (!nextTokenIs(b, FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fromClause(b, l + 1);
    r = r && fullSelect_1(b, l + 1);
    r = r && fullSelect_2(b, l + 1);
    r = r && fullSelect_3(b, l + 1);
    r = r && fullSelect_4(b, l + 1);
    r = r && selectClause(b, l + 1);
    exit_section_(b, m, FULL_SELECT, r);
    return r;
  }

  // joinClause*
  private static boolean fullSelect_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fullSelect_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!joinClause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fullSelect_1", c)) break;
    }
    return true;
  }

  // whereClause?
  private static boolean fullSelect_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fullSelect_2")) return false;
    whereClause(b, l + 1);
    return true;
  }

  // groupClause?
  private static boolean fullSelect_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fullSelect_3")) return false;
    groupClause(b, l + 1);
    return true;
  }

  // orderClause?
  private static boolean fullSelect_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fullSelect_4")) return false;
    orderClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // GROUP BY <<comma_separated_list ( sqlExpression )>> havingClause?
  public static boolean groupClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupClause")) return false;
    if (!nextTokenIs(b, GROUP)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GROUP, BY);
    r = r && comma_separated_list(b, l + 1, DatascriptParser::groupClause_2_0);
    r = r && groupClause_3(b, l + 1);
    exit_section_(b, m, GROUP_CLAUSE, r);
    return r;
  }

  // ( sqlExpression )
  private static boolean groupClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // havingClause?
  private static boolean groupClause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "groupClause_3")) return false;
    havingClause(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // HAVING sqlExpression
  public static boolean havingClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "havingClause")) return false;
    if (!nextTokenIs(b, HAVING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, HAVING);
    r = r && sqlExpression(b, l + 1);
    exit_section_(b, m, HAVING_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // JOIN (qualifiedName|subSelect) aliasClause ON sqlExpression
  public static boolean joinClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinClause")) return false;
    if (!nextTokenIs(b, JOIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, JOIN);
    r = r && joinClause_1(b, l + 1);
    r = r && aliasClause(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && sqlExpression(b, l + 1);
    exit_section_(b, m, JOIN_CLAUSE, r);
    return r;
  }

  // qualifiedName|subSelect
  private static boolean joinClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "joinClause_1")) return false;
    boolean r;
    r = qualifiedName(b, l + 1);
    if (!r) r = subSelect(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // repositoryDefinition
  static boolean namespaceElement(PsiBuilder b, int l) {
    return repositoryDefinition(b, l + 1);
  }

  /* ********************************************************** */
  // !REPOSITORY
  static boolean namespaceRecover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespaceRecover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, REPOSITORY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ORDER BY <<comma_separated_list ( sortSpecification )>>
  public static boolean orderClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderClause")) return false;
    if (!nextTokenIs(b, ORDER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ORDER, BY);
    r = r && comma_separated_list(b, l + 1, DatascriptParser::orderClause_2_0);
    exit_section_(b, m, ORDER_CLAUSE, r);
    return r;
  }

  // ( sortSpecification )
  private static boolean orderClause_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderClause_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sortSpecification(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PREFETCH INT ROWS
  public static boolean prefetchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefetchStatement")) return false;
    if (!nextTokenIs(b, PREFETCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PREFETCH, INT, ROWS);
    exit_section_(b, m, PREFETCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ID ('.' ID)*
  public static boolean qualifiedName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && qualifiedName_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_NAME, r);
    return r;
  }

  // ('.' ID)*
  private static boolean qualifiedName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!qualifiedName_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualifiedName_1", c)) break;
    }
    return true;
  }

  // '.' ID
  private static boolean qualifiedName_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifiedName_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // fetchOne | fetchList | fetchStream
  static boolean queryFetch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryFetch")) return false;
    if (!nextTokenIs(b, FETCH)) return false;
    boolean r;
    r = fetchOne(b, l + 1);
    if (!r) r = fetchList(b, l + 1);
    if (!r) r = fetchStream(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // PREPARED? QUERY ID queryParametersList? '{' fullSelect '}' queryFetch?
  public static boolean queryGenerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryGenerator")) return false;
    if (!nextTokenIs(b, "<query generator>", PREPARED, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUERY_GENERATOR, "<query generator>");
    r = queryGenerator_0(b, l + 1);
    r = r && consumeTokens(b, 0, QUERY, ID);
    r = r && queryGenerator_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && fullSelect(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && queryGenerator_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PREPARED?
  private static boolean queryGenerator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryGenerator_0")) return false;
    consumeToken(b, PREPARED);
    return true;
  }

  // queryParametersList?
  private static boolean queryGenerator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryGenerator_3")) return false;
    queryParametersList(b, l + 1);
    return true;
  }

  // queryFetch?
  private static boolean queryGenerator_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryGenerator_7")) return false;
    queryFetch(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID dataType
  public static boolean queryParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryParameter")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && dataType(b, l + 1);
    exit_section_(b, m, QUERY_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // '(' <<comma_separated_list ( queryParameter )>> ')'
  public static boolean queryParametersList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryParametersList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && comma_separated_list(b, l + 1, DatascriptParser::queryParametersList_1_0);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, QUERY_PARAMETERS_LIST, r);
    return r;
  }

  // ( queryParameter )
  private static boolean queryParametersList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "queryParametersList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = queryParameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // queryGenerator
  public static boolean repoElement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repoElement")) return false;
    if (!nextTokenIs(b, "<repo element>", PREPARED, QUERY)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, REPO_ELEMENT, "<repo element>");
    r = queryGenerator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // REPOSITORY ID '{' repoElement* '}'
  public static boolean repositoryDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repositoryDefinition")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, REPOSITORY_DEFINITION, "<repository definition>");
    r = consumeTokens(b, 1, REPOSITORY, ID, LBRACE);
    p = r; // pin = 1
    r = r && report_error_(b, repositoryDefinition_3(b, l + 1));
    r = p && consumeToken(b, RBRACE) && r;
    exit_section_(b, l, m, r, p, DatascriptParser::namespaceRecover);
    return r || p;
  }

  // repoElement*
  private static boolean repositoryDefinition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "repositoryDefinition_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!repoElement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "repositoryDefinition_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SELECT allDistinct? selectListClause
  public static boolean selectClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause")) return false;
    if (!nextTokenIs(b, SELECT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SELECT);
    r = r && selectClause_1(b, l + 1);
    r = r && selectListClause(b, l + 1);
    exit_section_(b, m, SELECT_CLAUSE, r);
    return r;
  }

  // allDistinct?
  private static boolean selectClause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectClause_1")) return false;
    allDistinct(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ID ('.' ID)?
  static boolean selectIdentifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectIdentifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && selectIdentifier_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('.' ID)?
  private static boolean selectIdentifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectIdentifier_1")) return false;
    selectIdentifier_1_0(b, l + 1);
    return true;
  }

  // '.' ID
  private static boolean selectIdentifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectIdentifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<comma_separated_list ( selectIdentifier )>>
  public static boolean selectListClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectListClause")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comma_separated_list(b, l + 1, DatascriptParser::selectListClause_0_0);
    exit_section_(b, m, SELECT_LIST_CLAUSE, r);
    return r;
  }

  // ( selectIdentifier )
  private static boolean selectListClause_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selectListClause_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = selectIdentifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASC|DESC
  public static boolean sortOrder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortOrder")) return false;
    if (!nextTokenIs(b, "<sort order>", ASC, DESC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SORT_ORDER, "<sort order>");
    r = consumeToken(b, ASC);
    if (!r) r = consumeToken(b, DESC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sqlExpression sortOrder?
  public static boolean sortSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SORT_SPECIFICATION, "<sort specification>");
    r = sqlExpression(b, l + 1);
    r = r && sortSpecification_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // sortOrder?
  private static boolean sortSpecification_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sortSpecification_1")) return false;
    sortOrder(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // sqlComparison sqlAndExpression*
  static boolean sqlAnd(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlAnd")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlComparison(b, l + 1);
    r = r && sqlAnd_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sqlAndExpression*
  private static boolean sqlAnd_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlAnd_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sqlAndExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sqlAnd_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AND sqlComparison
  public static boolean sqlAndExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlAndExpression")) return false;
    if (!nextTokenIs(b, AND)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, SQL_AND_EXPRESSION, null);
    r = consumeToken(b, AND);
    r = r && sqlComparison(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sqlLiteral | sqlParameterExpression | sqlColumnRefExpression
  static boolean sqlAtomicExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlAtomicExpression")) return false;
    boolean r;
    r = sqlLiteral(b, l + 1);
    if (!r) r = sqlParameterExpression(b, l + 1);
    if (!r) r = sqlColumnRefExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // '(' <<comma_separated_list ( sqlAtomicExpression )>>  ')'
  public static boolean sqlAtomicList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlAtomicList")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && comma_separated_list(b, l + 1, DatascriptParser::sqlAtomicList_1_0);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SQL_ATOMIC_LIST, r);
    return r;
  }

  // ( sqlAtomicExpression )
  private static boolean sqlAtomicList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlAtomicList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlAtomicExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sqlIn sqlBetweenExpression?
  static boolean sqlBetween(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlBetween")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlIn(b, l + 1);
    r = r && sqlBetween_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sqlBetweenExpression?
  private static boolean sqlBetween_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlBetween_1")) return false;
    sqlBetweenExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BETWEEN sqlAtomicExpression AND sqlAtomicExpression
  public static boolean sqlBetweenExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlBetweenExpression")) return false;
    if (!nextTokenIs(b, BETWEEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, SQL_BETWEEN_EXPRESSION, null);
    r = consumeToken(b, BETWEEN);
    r = r && sqlAtomicExpression(b, l + 1);
    r = r && consumeToken(b, AND);
    r = r && sqlAtomicExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ID ('.' ID)*
  public static boolean sqlColumnRefExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlColumnRefExpression")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && sqlColumnRefExpression_1(b, l + 1);
    exit_section_(b, m, SQL_COLUMN_REF_EXPRESSION, r);
    return r;
  }

  // ('.' ID)*
  private static boolean sqlColumnRefExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlColumnRefExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sqlColumnRefExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sqlColumnRefExpression_1", c)) break;
    }
    return true;
  }

  // '.' ID
  private static boolean sqlColumnRefExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlColumnRefExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sqlPlusOrMinus sqlComparisonExpression*
  static boolean sqlComparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlComparison")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlPlusOrMinus(b, l + 1);
    r = r && sqlComparison_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sqlComparisonExpression*
  private static boolean sqlComparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlComparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sqlComparisonExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sqlComparison_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // sqlComparisonOp sqlPlusOrMinus
  public static boolean sqlComparisonExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlComparisonExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, SQL_COMPARISON_EXPRESSION, "<sql comparison expression>");
    r = sqlComparisonOp(b, l + 1);
    r = r && sqlPlusOrMinus(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "=" | "<>" | ">=" | "<=" | ">" | "<" | IS | LIKE
  public static boolean sqlComparisonOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlComparisonOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_COMPARISON_OP, "<sql comparison op>");
    r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, NEQ);
    if (!r) r = consumeToken(b, GT_EQ);
    if (!r) r = consumeToken(b, LT_EQ);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, IS);
    if (!r) r = consumeToken(b, LIKE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COUNT '(' ('*'| DISTINCT? sqlExpression) ')'
  public static boolean sqlCountFunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlCountFunctionExpression")) return false;
    if (!nextTokenIs(b, COUNT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COUNT, LPAREN);
    r = r && sqlCountFunctionExpression_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SQL_COUNT_FUNCTION_EXPRESSION, r);
    return r;
  }

  // '*'| DISTINCT? sqlExpression
  private static boolean sqlCountFunctionExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlCountFunctionExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MUL);
    if (!r) r = sqlCountFunctionExpression_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DISTINCT? sqlExpression
  private static boolean sqlCountFunctionExpression_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlCountFunctionExpression_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlCountFunctionExpression_2_1_0(b, l + 1);
    r = r && sqlExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DISTINCT?
  private static boolean sqlCountFunctionExpression_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlCountFunctionExpression_2_1_0")) return false;
    consumeToken(b, DISTINCT);
    return true;
  }

  /* ********************************************************** */
  // DATE
  public static boolean sqlDateLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlDateLiteralExpression")) return false;
    if (!nextTokenIs(b, DATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DATE);
    exit_section_(b, m, SQL_DATE_LITERAL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // sqlAnd sqlOrExpression*
  public static boolean sqlExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, SQL_EXPRESSION, "<sql expression>");
    r = sqlAnd(b, l + 1);
    r = r && sqlExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // sqlOrExpression*
  private static boolean sqlExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sqlOrExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sqlExpression_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName '(' <<comma_separated_list ( sqlExpression )>> ')'
  public static boolean sqlFunctionExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlFunctionExpression")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifiedName(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && comma_separated_list(b, l + 1, DatascriptParser::sqlFunctionExpression_2_0);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SQL_FUNCTION_EXPRESSION, r);
    return r;
  }

  // ( sqlExpression )
  private static boolean sqlFunctionExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlFunctionExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // sqlAtomicExpression sqlInExpression?
  static boolean sqlIn(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlIn")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlAtomicExpression(b, l + 1);
    r = r && sqlIn_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sqlInExpression?
  private static boolean sqlIn_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlIn_1")) return false;
    sqlInExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IN ( subSelect | sqlAtomicList )
  public static boolean sqlInExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlInExpression")) return false;
    if (!nextTokenIs(b, IN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IN);
    r = r && sqlInExpression_1(b, l + 1);
    exit_section_(b, m, SQL_IN_EXPRESSION, r);
    return r;
  }

  // subSelect | sqlAtomicList
  private static boolean sqlInExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlInExpression_1")) return false;
    boolean r;
    r = subSelect(b, l + 1);
    if (!r) r = sqlAtomicList(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // INT
  public static boolean sqlIntLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlIntLiteralExpression")) return false;
    if (!nextTokenIs(b, INT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INT);
    exit_section_(b, m, SQL_INT_LITERAL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // sqlIntLiteralExpression | sqlStringLiteralExpression | sqlDateLiteralExpression | sqlSysDateLiteralExpression | sqlNullLiteralExpression
  static boolean sqlLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlLiteral")) return false;
    boolean r;
    r = sqlIntLiteralExpression(b, l + 1);
    if (!r) r = sqlStringLiteralExpression(b, l + 1);
    if (!r) r = sqlDateLiteralExpression(b, l + 1);
    if (!r) r = sqlSysDateLiteralExpression(b, l + 1);
    if (!r) r = sqlNullLiteralExpression(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // sqlPrimaryExpression sqlMulOrDivExpression*
  static boolean sqlMulOrDiv(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlMulOrDiv")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlPrimaryExpression(b, l + 1);
    r = r && sqlMulOrDiv_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sqlMulOrDivExpression*
  private static boolean sqlMulOrDiv_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlMulOrDiv_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sqlMulOrDivExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sqlMulOrDiv_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // sqlMulOrDivOp sqlPrimaryExpression
  public static boolean sqlMulOrDivExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlMulOrDivExpression")) return false;
    if (!nextTokenIs(b, "<sql mul or div expression>", DIV, MUL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, SQL_MUL_OR_DIV_EXPRESSION, "<sql mul or div expression>");
    r = sqlMulOrDivOp(b, l + 1);
    r = r && sqlPrimaryExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "*" | "/"
  public static boolean sqlMulOrDivOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlMulOrDivOp")) return false;
    if (!nextTokenIs(b, "<sql mul or div op>", DIV, MUL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_MUL_OR_DIV_OP, "<sql mul or div op>");
    r = consumeToken(b, MUL);
    if (!r) r = consumeToken(b, DIV);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NOT sqlExpression
  public static boolean sqlNotExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlNotExpression")) return false;
    if (!nextTokenIs(b, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && sqlExpression(b, l + 1);
    exit_section_(b, m, SQL_NOT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // NULL
  public static boolean sqlNullLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlNullLiteralExpression")) return false;
    if (!nextTokenIs(b, NULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NULL);
    exit_section_(b, m, SQL_NULL_LITERAL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // OR sqlAnd
  public static boolean sqlOrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlOrExpression")) return false;
    if (!nextTokenIs(b, OR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, SQL_OR_EXPRESSION, null);
    r = consumeToken(b, OR);
    r = r && sqlAnd(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':' ID
  public static boolean sqlParameterExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlParameterExpression")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, ID);
    exit_section_(b, m, SQL_PARAMETER_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '(' sqlExpression ')'
  public static boolean sqlParanthesisExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlParanthesisExpression")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && sqlExpression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SQL_PARANTHESIS_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // sqlMulOrDiv sqlPlusOrMinusExpression*
  static boolean sqlPlusOrMinus(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlPlusOrMinus")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sqlMulOrDiv(b, l + 1);
    r = r && sqlPlusOrMinus_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // sqlPlusOrMinusExpression*
  private static boolean sqlPlusOrMinus_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlPlusOrMinus_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sqlPlusOrMinusExpression(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sqlPlusOrMinus_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // sqlPlusOrMinusOp sqlMulOrDiv
  public static boolean sqlPlusOrMinusExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlPlusOrMinusExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_, SQL_PLUS_OR_MINUS_EXPRESSION, "<sql plus or minus expression>");
    r = sqlPlusOrMinusOp(b, l + 1);
    r = r && sqlMulOrDiv(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "+" | "-" | CONCATENATE
  public static boolean sqlPlusOrMinusOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlPlusOrMinusOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_PLUS_OR_MINUS_OP, "<sql plus or minus op>");
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, CONCATENATE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // sqlParanthesisExpression | sqlNotExpression | sqlCountFunctionExpression | sqlFunctionExpression | sqlBetween
  static boolean sqlPrimaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlPrimaryExpression")) return false;
    boolean r;
    r = sqlParanthesisExpression(b, l + 1);
    if (!r) r = sqlNotExpression(b, l + 1);
    if (!r) r = sqlCountFunctionExpression(b, l + 1);
    if (!r) r = sqlFunctionExpression(b, l + 1);
    if (!r) r = sqlBetween(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // STRING
  public static boolean sqlStringLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlStringLiteralExpression")) return false;
    if (!nextTokenIs(b, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    exit_section_(b, m, SQL_STRING_LITERAL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // SYSDATE
  public static boolean sqlSysDateLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlSysDateLiteralExpression")) return false;
    if (!nextTokenIs(b, SYSDATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYSDATE);
    exit_section_(b, m, SQL_SYS_DATE_LITERAL_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // INT_TYPE|NULLABLE_INT_TYPE|LONG_TYPE|NULLABLE_LONG_TYPE|DOUBLE_TYPE|DECIMAL_TYPE|STRING_TYPE|BOOLEAN_TYPE|DATE_TYPE|TIMESTAMP_TYPE
  public static boolean sqlType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sqlType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SQL_TYPE, "<sql type>");
    r = consumeToken(b, INT_TYPE);
    if (!r) r = consumeToken(b, NULLABLE_INT_TYPE);
    if (!r) r = consumeToken(b, LONG_TYPE);
    if (!r) r = consumeToken(b, NULLABLE_LONG_TYPE);
    if (!r) r = consumeToken(b, DOUBLE_TYPE);
    if (!r) r = consumeToken(b, DECIMAL_TYPE);
    if (!r) r = consumeToken(b, STRING_TYPE);
    if (!r) r = consumeToken(b, BOOLEAN_TYPE);
    if (!r) r = consumeToken(b, DATE_TYPE);
    if (!r) r = consumeToken(b, TIMESTAMP_TYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' fullSelect ')'
  public static boolean subSelect(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "subSelect")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && fullSelect(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, SUB_SELECT, r);
    return r;
  }

  /* ********************************************************** */
  // WHERE sqlExpression
  public static boolean whereClause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whereClause")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && sqlExpression(b, l + 1);
    exit_section_(b, m, WHERE_CLAUSE, r);
    return r;
  }

}

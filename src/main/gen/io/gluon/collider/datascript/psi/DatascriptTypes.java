// This is a generated file. Not intended for manual editing.
package io.gluon.collider.datascript.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.gluon.collider.datascript.psi.impl.*;

public interface DatascriptTypes {

  IElementType ALIAS_CLAUSE = new DatascriptElementType("ALIAS_CLAUSE");
  IElementType ALL_DISTINCT = new DatascriptElementType("ALL_DISTINCT");
  IElementType CONNECTION = new DatascriptElementType("CONNECTION");
  IElementType DATASCRIPT_FILE = new DatascriptElementType("DATASCRIPT_FILE");
  IElementType DATA_TYPE = new DatascriptElementType("DATA_TYPE");
  IElementType ENTITY_SELECTOR = new DatascriptElementType("ENTITY_SELECTOR");
  IElementType FETCH_LIST = new DatascriptElementType("FETCH_LIST");
  IElementType FETCH_ONE = new DatascriptElementType("FETCH_ONE");
  IElementType FETCH_STREAM = new DatascriptElementType("FETCH_STREAM");
  IElementType FROM_CLAUSE = new DatascriptElementType("FROM_CLAUSE");
  IElementType FULL_SELECT = new DatascriptElementType("FULL_SELECT");
  IElementType GROUP_CLAUSE = new DatascriptElementType("GROUP_CLAUSE");
  IElementType HAVING_CLAUSE = new DatascriptElementType("HAVING_CLAUSE");
  IElementType JOIN_CLAUSE = new DatascriptElementType("JOIN_CLAUSE");
  IElementType ORDER_CLAUSE = new DatascriptElementType("ORDER_CLAUSE");
  IElementType PREFETCH_STATEMENT = new DatascriptElementType("PREFETCH_STATEMENT");
  IElementType QUERY_GENERATOR = new DatascriptElementType("QUERY_GENERATOR");
  IElementType QUERY_PARAMETER = new DatascriptElementType("QUERY_PARAMETER");
  IElementType QUERY_PARAMETERS_LIST = new DatascriptElementType("QUERY_PARAMETERS_LIST");
  IElementType REPOSITORY_DEFINITION = new DatascriptElementType("REPOSITORY_DEFINITION");
  IElementType REPO_ELEMENT = new DatascriptElementType("REPO_ELEMENT");
  IElementType SELECT_CLAUSE = new DatascriptElementType("SELECT_CLAUSE");
  IElementType SELECT_LIST_CLAUSE = new DatascriptElementType("SELECT_LIST_CLAUSE");
  IElementType SORT_ORDER = new DatascriptElementType("SORT_ORDER");
  IElementType SORT_SPECIFICATION = new DatascriptElementType("SORT_SPECIFICATION");
  IElementType SQL_AND_EXPRESSION = new DatascriptElementType("SQL_AND_EXPRESSION");
  IElementType SQL_ATOMIC_LIST = new DatascriptElementType("SQL_ATOMIC_LIST");
  IElementType SQL_BETWEEN_EXPRESSION = new DatascriptElementType("SQL_BETWEEN_EXPRESSION");
  IElementType SQL_COLUMN_REF_EXPRESSION = new DatascriptElementType("SQL_COLUMN_REF_EXPRESSION");
  IElementType SQL_COMPARISON_EXPRESSION = new DatascriptElementType("SQL_COMPARISON_EXPRESSION");
  IElementType SQL_COMPARISON_OP = new DatascriptElementType("SQL_COMPARISON_OP");
  IElementType SQL_COUNT_FUNCTION_EXPRESSION = new DatascriptElementType("SQL_COUNT_FUNCTION_EXPRESSION");
  IElementType SQL_DATE_LITERAL_EXPRESSION = new DatascriptElementType("SQL_DATE_LITERAL_EXPRESSION");
  IElementType SQL_EXPRESSION = new DatascriptElementType("SQL_EXPRESSION");
  IElementType SQL_FUNCTION_EXPRESSION = new DatascriptElementType("SQL_FUNCTION_EXPRESSION");
  IElementType SQL_INT_LITERAL_EXPRESSION = new DatascriptElementType("SQL_INT_LITERAL_EXPRESSION");
  IElementType SQL_IN_EXPRESSION = new DatascriptElementType("SQL_IN_EXPRESSION");
  IElementType SQL_MUL_OR_DIV_EXPRESSION = new DatascriptElementType("SQL_MUL_OR_DIV_EXPRESSION");
  IElementType SQL_MUL_OR_DIV_OP = new DatascriptElementType("SQL_MUL_OR_DIV_OP");
  IElementType SQL_NOT_EXPRESSION = new DatascriptElementType("SQL_NOT_EXPRESSION");
  IElementType SQL_NULL_LITERAL_EXPRESSION = new DatascriptElementType("SQL_NULL_LITERAL_EXPRESSION");
  IElementType SQL_OR_EXPRESSION = new DatascriptElementType("SQL_OR_EXPRESSION");
  IElementType SQL_PARAMETER_EXPRESSION = new DatascriptElementType("SQL_PARAMETER_EXPRESSION");
  IElementType SQL_PARANTHESIS_EXPRESSION = new DatascriptElementType("SQL_PARANTHESIS_EXPRESSION");
  IElementType SQL_PLUS_OR_MINUS_EXPRESSION = new DatascriptElementType("SQL_PLUS_OR_MINUS_EXPRESSION");
  IElementType SQL_PLUS_OR_MINUS_OP = new DatascriptElementType("SQL_PLUS_OR_MINUS_OP");
  IElementType SQL_STRING_LITERAL_EXPRESSION = new DatascriptElementType("SQL_STRING_LITERAL_EXPRESSION");
  IElementType SQL_SYS_DATE_LITERAL_EXPRESSION = new DatascriptElementType("SQL_SYS_DATE_LITERAL_EXPRESSION");
  IElementType SQL_TYPE = new DatascriptElementType("SQL_TYPE");
  IElementType SUB_SELECT = new DatascriptElementType("SUB_SELECT");
  IElementType WHERE_CLAUSE = new DatascriptElementType("WHERE_CLAUSE");

  IElementType ALL = new DatascriptTokenType("all");
  IElementType AND = new DatascriptTokenType("and");
  IElementType AS = new DatascriptTokenType("as");
  IElementType ASC = new DatascriptTokenType("asc");
  IElementType BETWEEN = new DatascriptTokenType("between");
  IElementType BOOLEAN_TYPE = new DatascriptTokenType("boolean");
  IElementType BY = new DatascriptTokenType("by");
  IElementType COLON = new DatascriptTokenType(":");
  IElementType COMMA = new DatascriptTokenType(",");
  IElementType COMMENT = new DatascriptTokenType("COMMENT");
  IElementType CONCATENATE = new DatascriptTokenType("||");
  IElementType CONNECT = new DatascriptTokenType("connect");
  IElementType COUNT = new DatascriptTokenType("count");
  IElementType DATE = new DatascriptTokenType("DATE");
  IElementType DATE_TYPE = new DatascriptTokenType("date");
  IElementType DECIMAL_TYPE = new DatascriptTokenType("decimal");
  IElementType DESC = new DatascriptTokenType("desc");
  IElementType DISTINCT = new DatascriptTokenType("distinct");
  IElementType DIV = new DatascriptTokenType("/");
  IElementType DOT = new DatascriptTokenType(".");
  IElementType DOUBLE_TYPE = new DatascriptTokenType("double");
  IElementType EQ = new DatascriptTokenType("=");
  IElementType FETCH = new DatascriptTokenType("fetch");
  IElementType FROM = new DatascriptTokenType("from");
  IElementType GROUP = new DatascriptTokenType("group");
  IElementType GT = new DatascriptTokenType(">");
  IElementType GT_EQ = new DatascriptTokenType(">=");
  IElementType HAVING = new DatascriptTokenType("having");
  IElementType ID = new DatascriptTokenType("ID");
  IElementType IN = new DatascriptTokenType("IN");
  IElementType INT = new DatascriptTokenType("INT");
  IElementType INT_TYPE = new DatascriptTokenType("int");
  IElementType IS = new DatascriptTokenType("is");
  IElementType JOIN = new DatascriptTokenType("join");
  IElementType LBRACE = new DatascriptTokenType("{");
  IElementType LBRACKET = new DatascriptTokenType("[");
  IElementType LIKE = new DatascriptTokenType("like");
  IElementType LIST = new DatascriptTokenType("list");
  IElementType LONG_TYPE = new DatascriptTokenType("long");
  IElementType LPAREN = new DatascriptTokenType("(");
  IElementType LT = new DatascriptTokenType("<");
  IElementType LT_EQ = new DatascriptTokenType("<=");
  IElementType MINUS = new DatascriptTokenType("-");
  IElementType MUL = new DatascriptTokenType("*");
  IElementType NAMESPACE = new DatascriptTokenType("namespace");
  IElementType NEQ = new DatascriptTokenType("<>");
  IElementType NOT = new DatascriptTokenType("not");
  IElementType NULL = new DatascriptTokenType("null");
  IElementType NULLABLE_INT_TYPE = new DatascriptTokenType("int?");
  IElementType NULLABLE_LONG_TYPE = new DatascriptTokenType("long?");
  IElementType NUMBER = new DatascriptTokenType("NUMBER");
  IElementType ON = new DatascriptTokenType("on");
  IElementType ONE = new DatascriptTokenType("one");
  IElementType OR = new DatascriptTokenType("or");
  IElementType ORDER = new DatascriptTokenType("order");
  IElementType PLUS = new DatascriptTokenType("+");
  IElementType PREFETCH = new DatascriptTokenType("PREFETCH");
  IElementType PREPARED = new DatascriptTokenType("prepared");
  IElementType QUERY = new DatascriptTokenType("query");
  IElementType RBRACE = new DatascriptTokenType("}");
  IElementType RBRACKET = new DatascriptTokenType("]");
  IElementType REPOSITORY = new DatascriptTokenType("repository");
  IElementType ROWS = new DatascriptTokenType("rows");
  IElementType RPAREN = new DatascriptTokenType(")");
  IElementType SELECT = new DatascriptTokenType("select");
  IElementType SEMICOLON = new DatascriptTokenType(";");
  IElementType STREAM = new DatascriptTokenType("stream");
  IElementType STRING = new DatascriptTokenType("STRING");
  IElementType STRING_TYPE = new DatascriptTokenType("string");
  IElementType SYSDATE = new DatascriptTokenType("sysdate");
  IElementType TIMESTAMP_TYPE = new DatascriptTokenType("timestamp");
  IElementType WHERE = new DatascriptTokenType("where");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIAS_CLAUSE) {
        return new DsAliasClauseImpl(node);
      }
      else if (type == ALL_DISTINCT) {
        return new DsAllDistinctImpl(node);
      }
      else if (type == CONNECTION) {
        return new DsConnectionImpl(node);
      }
      else if (type == DATASCRIPT_FILE) {
        return new DsDatascriptFileImpl(node);
      }
      else if (type == DATA_TYPE) {
        return new DsDataTypeImpl(node);
      }
      else if (type == ENTITY_SELECTOR) {
        return new DsEntitySelectorImpl(node);
      }
      else if (type == FETCH_LIST) {
        return new DsFetchListImpl(node);
      }
      else if (type == FETCH_ONE) {
        return new DsFetchOneImpl(node);
      }
      else if (type == FETCH_STREAM) {
        return new DsFetchStreamImpl(node);
      }
      else if (type == FROM_CLAUSE) {
        return new DsFromClauseImpl(node);
      }
      else if (type == FULL_SELECT) {
        return new DsFullSelectImpl(node);
      }
      else if (type == GROUP_CLAUSE) {
        return new DsGroupClauseImpl(node);
      }
      else if (type == HAVING_CLAUSE) {
        return new DsHavingClauseImpl(node);
      }
      else if (type == JOIN_CLAUSE) {
        return new DsJoinClauseImpl(node);
      }
      else if (type == ORDER_CLAUSE) {
        return new DsOrderClauseImpl(node);
      }
      else if (type == PREFETCH_STATEMENT) {
        return new DsPrefetchStatementImpl(node);
      }
      else if (type == QUERY_GENERATOR) {
        return new DsQueryGeneratorImpl(node);
      }
      else if (type == QUERY_PARAMETER) {
        return new DsQueryParameterImpl(node);
      }
      else if (type == QUERY_PARAMETERS_LIST) {
        return new DsQueryParametersListImpl(node);
      }
      else if (type == REPOSITORY_DEFINITION) {
        return new DsRepositoryDefinitionImpl(node);
      }
      else if (type == SELECT_CLAUSE) {
        return new DsSelectClauseImpl(node);
      }
      else if (type == SELECT_LIST_CLAUSE) {
        return new DsSelectListClauseImpl(node);
      }
      else if (type == SORT_ORDER) {
        return new DsSortOrderImpl(node);
      }
      else if (type == SORT_SPECIFICATION) {
        return new DsSortSpecificationImpl(node);
      }
      else if (type == SQL_AND_EXPRESSION) {
        return new DsSqlAndExpressionImpl(node);
      }
      else if (type == SQL_ATOMIC_LIST) {
        return new DsSqlAtomicListImpl(node);
      }
      else if (type == SQL_BETWEEN_EXPRESSION) {
        return new DsSqlBetweenExpressionImpl(node);
      }
      else if (type == SQL_COLUMN_REF_EXPRESSION) {
        return new DsSqlColumnRefExpressionImpl(node);
      }
      else if (type == SQL_COMPARISON_EXPRESSION) {
        return new DsSqlComparisonExpressionImpl(node);
      }
      else if (type == SQL_COMPARISON_OP) {
        return new DsSqlComparisonOpImpl(node);
      }
      else if (type == SQL_COUNT_FUNCTION_EXPRESSION) {
        return new DsSqlCountFunctionExpressionImpl(node);
      }
      else if (type == SQL_DATE_LITERAL_EXPRESSION) {
        return new DsSqlDateLiteralExpressionImpl(node);
      }
      else if (type == SQL_EXPRESSION) {
        return new DsSqlExpressionImpl(node);
      }
      else if (type == SQL_FUNCTION_EXPRESSION) {
        return new DsSqlFunctionExpressionImpl(node);
      }
      else if (type == SQL_INT_LITERAL_EXPRESSION) {
        return new DsSqlIntLiteralExpressionImpl(node);
      }
      else if (type == SQL_IN_EXPRESSION) {
        return new DsSqlInExpressionImpl(node);
      }
      else if (type == SQL_MUL_OR_DIV_EXPRESSION) {
        return new DsSqlMulOrDivExpressionImpl(node);
      }
      else if (type == SQL_MUL_OR_DIV_OP) {
        return new DsSqlMulOrDivOpImpl(node);
      }
      else if (type == SQL_NOT_EXPRESSION) {
        return new DsSqlNotExpressionImpl(node);
      }
      else if (type == SQL_NULL_LITERAL_EXPRESSION) {
        return new DsSqlNullLiteralExpressionImpl(node);
      }
      else if (type == SQL_OR_EXPRESSION) {
        return new DsSqlOrExpressionImpl(node);
      }
      else if (type == SQL_PARAMETER_EXPRESSION) {
        return new DsSqlParameterExpressionImpl(node);
      }
      else if (type == SQL_PARANTHESIS_EXPRESSION) {
        return new DsSqlParanthesisExpressionImpl(node);
      }
      else if (type == SQL_PLUS_OR_MINUS_EXPRESSION) {
        return new DsSqlPlusOrMinusExpressionImpl(node);
      }
      else if (type == SQL_PLUS_OR_MINUS_OP) {
        return new DsSqlPlusOrMinusOpImpl(node);
      }
      else if (type == SQL_STRING_LITERAL_EXPRESSION) {
        return new DsSqlStringLiteralExpressionImpl(node);
      }
      else if (type == SQL_SYS_DATE_LITERAL_EXPRESSION) {
        return new DsSqlSysDateLiteralExpressionImpl(node);
      }
      else if (type == SQL_TYPE) {
        return new DsSqlTypeImpl(node);
      }
      else if (type == SUB_SELECT) {
        return new DsSubSelectImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new DsWhereClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

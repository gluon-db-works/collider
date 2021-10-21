package io.gluon.collider.datascript.names

import io.gluon.collider.datascript.psi.*
import com.intellij.psi.tree.TokenSet

val DsRepositoryDefinition.name: String?
    get() = this.id?.text

val DsQueryGenerator.name: String?
    get() = this.id.text

val DsQueryParameter.name: String
    get() = this.id.text

val DsEntitySelector.name: String?
    get() {
        val aliasClause = this.aliasClause
        return if (aliasClause != null) aliasClause.id.text else this.qualifiedName?.text
    }

val DsQualifiedName.segments: List<String>
    get() = this.node.getChildren(TokenSet.create(DatascriptTypes.ID)).map { it.text }


/*
    TODO: aflter extensions.kt

val FnSelectDerivedColumn.name: String?
    get() {
        val aliasClause = this.aliasClause
        return if (aliasClause != null) aliasClause.id.text.toUpperCase() else this.sqlExpression.name
    }

val FnSqlExpression.name: String?
    get() = when (this) {
        is FnSqlCountAllFunction -> "COUNT_ALL"
        is FnSqlNotExpression -> this.sqlExpression.name
        is FnSqlColumnRefExpression -> {
            val colOrEnum = findColumnOrEnumLiteral(this)
            if (colOrEnum != null)
                when (colOrEnum) {
                    is FnColumn -> colOrEnum.name
                    is FnEnumElement -> colOrEnum.name
                    else -> null
                }
            else null

        }
        is FnSqlParameterExpression -> getSqlParameter(this)?.name
        is FnSqlFunctionExpression -> {
            val n = this.name
            if (aggregateFunctionNames.containsRaw(n)) {
                val subn = this.sqlExpressionList.firstOrNull()?.name
                if (subn == null) n?.toUpperCase() else n?.toUpperCase() + "_" + subn
            } else n?.toUpperCase()
        }
        else -> null
    }

val FnCallGenerator.methodName: String?
    get() {
        val n = "call" + this.qualifiedName.segments.last().prepare()
        //val n = this.qualifiedName.segments.mapIndexed { i, s -> if (i == 0) s.toLowerCase() else s.capitalize() }.joinToString("")
        val i = this.cardinality
        return if (i == null) n else n + "_$i"
    }

*/


// TODO: for java names

fun String.prepare(): String =
    this.split("_").map { it.toLowerCase().capitalize() }.joinToString("")

fun String.prepareSkipFirst(): String? {
    val l = this.split("_")
    return if (l.size > 1) l.drop(1).map{ it.toLowerCase().capitalize() }.joinToString("") else null
}

fun String.toFirstLower(): String {
    return this.get(0).toLowerCase() + this.substring(1)
}
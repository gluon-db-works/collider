package io.gluon.collider.datascript.ui

import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import java.util.stream.Collectors
import java.util.stream.Stream
import io.gluon.collider.datascript.DatascriptLexerAdapter
import io.gluon.collider.datascript.psi.DatascriptTypes

class DatascriptSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return DatascriptLexerAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType): Array<out TextAttributesKey?> {
        return if (keywords.contains(tokenType)) {
            KEY_KEYS
        } else if (minorKeywords.contains(tokenType)) {
            MINTOR_KEYS
        } else if (types.contains(tokenType)) {
            TYPE_KEYS
        } else if (sqlKeywords.contains(tokenType)) {
            SQL_KEYS
        } else if (tokenType == DatascriptTypes.STRING) {
            VALUE_KEYS
        } else if (tokenType == DatascriptTypes.DATE) {
            VALUE_KEYS
        } else if (tokenType == DatascriptTypes.INT) {
            NUMBER_KEYS
        } else if (tokenType == DatascriptTypes.COMMENT) {
            COMMENT_KEYS
        } else if (tokenType == TokenType.BAD_CHARACTER) {
            BAD_CHAR_KEYS
        } else {
            EMPTY_KEYS
        }
    }

    companion object {
        //public static final TextAttributesKey SEPARATOR = createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
        val KEY = TextAttributesKey.createTextAttributesKey("DATASCRIPT_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val TYPE =
            TextAttributesKey.createTextAttributesKey("DATASCRIPT_TYPE", DefaultLanguageHighlighterColors.STATIC_FIELD)
        val SQL = TextAttributesKey.createTextAttributesKey(
            "DATASCRIPT_SQL",
            DefaultLanguageHighlighterColors.MARKUP_ATTRIBUTE
        )
        val MINOR_KEY =
            TextAttributesKey.createTextAttributesKey("MINOR_KEY", DefaultLanguageHighlighterColors.MARKUP_ATTRIBUTE)
        val VALUE =
            TextAttributesKey.createTextAttributesKey("DATASCRIPT_VALUE", DefaultLanguageHighlighterColors.STRING)
        val NUMBER =
            TextAttributesKey.createTextAttributesKey("DATASCRIPT_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val COMMENT_KEY = TextAttributesKey.createTextAttributesKey(
            "DATASCRIPT_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val BAD_CHARACTER_KEY =
            TextAttributesKey.createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER_KEY)

        // private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
        private val KEY_KEYS = arrayOf(KEY)
        private val MINTOR_KEYS = arrayOf(MINOR_KEY)
        private val TYPE_KEYS = arrayOf(TYPE)
        private val SQL_KEYS = arrayOf(SQL)
        private val VALUE_KEYS = arrayOf(VALUE)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val COMMENT_KEYS = arrayOf(COMMENT_KEY)
        private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)
        private val keywords = Stream.of(
            DatascriptTypes.CONNECT,
            DatascriptTypes.NAMESPACE,
            DatascriptTypes.QUERY,
            DatascriptTypes.REPOSITORY,
            DatascriptTypes.COLON
        ).collect(Collectors.toSet())
        private val sqlKeywords = Stream.of(
            DatascriptTypes.SELECT,
            DatascriptTypes.FROM,
            DatascriptTypes.WHERE,
            DatascriptTypes.GROUP,
            DatascriptTypes.BY,
            DatascriptTypes.ORDER,
            DatascriptTypes.BY,
            DatascriptTypes.CONNECT,
            DatascriptTypes.HAVING,
            DatascriptTypes.JOIN,
            DatascriptTypes.AND,
            DatascriptTypes.OR,
            DatascriptTypes.NOT,
            DatascriptTypes.IS,
            DatascriptTypes.NULL,
            DatascriptTypes.SYSDATE,
            DatascriptTypes.ONE,
            DatascriptTypes.LIST,
            DatascriptTypes.STREAM,
            DatascriptTypes.BETWEEN,
            DatascriptTypes.IN,
            DatascriptTypes.ALL,
            DatascriptTypes.DISTINCT
        ).collect(Collectors.toSet())
        private val minorKeywords = Stream.of(
            DatascriptTypes.AS,
            DatascriptTypes.PREFETCH,
            DatascriptTypes.FETCH,
            DatascriptTypes.ROWS,
            DatascriptTypes.PREPARED,
            DatascriptTypes.COUNT
        ).collect(Collectors.toSet())
        private val types = Stream.of(
            DatascriptTypes.INT_TYPE,
            DatascriptTypes.NULLABLE_INT_TYPE,
            DatascriptTypes.LONG_TYPE,
            DatascriptTypes.NULLABLE_LONG_TYPE,
            DatascriptTypes.DOUBLE_TYPE,
            DatascriptTypes.DECIMAL_TYPE,
            DatascriptTypes.BOOLEAN_TYPE,
            DatascriptTypes.STRING_TYPE,
            DatascriptTypes.DATE_TYPE,
            DatascriptTypes.TIMESTAMP_TYPE
        ).collect(Collectors.toSet())
    }
}
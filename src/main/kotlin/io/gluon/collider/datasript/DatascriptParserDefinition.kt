package io.gluon.collider.datascript

import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import io.gluon.collider.datascript.parser.DatascriptParser
import io.gluon.collider.datascript.psi.DatascriptFile
import io.gluon.collider.datascript.psi.DatascriptTypes

class DatascriptParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(DatascriptTypes.COMMENT)
        val STRINGS = TokenSet.create(DatascriptTypes.STRING)

        val FILE = IFileElementType(
            Language.findInstance(
                DatascriptLanguage::class.java
            )
        )
    }

    override fun createLexer(project: Project?): Lexer = DatascriptLexerAdapter()

    override fun createParser(project: Project?): PsiParser = DatascriptParser();

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS

    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES

    override fun getStringLiteralElements(): TokenSet = STRINGS

    override fun createElement(node: ASTNode?): PsiElement = DatascriptTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = DatascriptFile(viewProvider)
}
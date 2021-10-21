package io.gluon.collider.datascript.ui

import io.gluon.collider.datascript.names.name
import io.gluon.collider.datascript.psi.*
import com.intellij.lang.ASTNode
import com.intellij.lang.folding.FoldingBuilderEx
import com.intellij.lang.folding.FoldingDescriptor
import com.intellij.openapi.editor.Document
import com.intellij.openapi.editor.FoldingGroup
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.util.PsiTreeUtil

class DatascriptFoldingBuilder : FoldingBuilderEx(), DumbAware {
    override fun isCollapsedByDefault(node: ASTNode): Boolean = true

    override fun buildFoldRegions(root: PsiElement, document: Document, quick: Boolean): Array<out FoldingDescriptor> {
        val descriptors = ArrayList<FoldingDescriptor>()

        PsiTreeUtil.findChildrenOfType(root, DsRepositoryDefinition::class.java).forEach {
            val grp = FoldingGroup.newGroup("dsRepos")
            val range = it.textRange
            descriptors.add(
                object : FoldingDescriptor(it.node, TextRange(range.startOffset, range.endOffset), grp) {
                    override fun getPlaceholderText(): String? = if (it.name != null) {
                        "repo ${it.name}"
                    } else {
                        super.getPlaceholderText()
                    }
                }
            )
        }

        PsiTreeUtil.findChildrenOfType(root, DsQueryGenerator::class.java).forEach {
            val grp = FoldingGroup.newGroup("dsQueries")
            val range = it.textRange
            descriptors.add(
                object : FoldingDescriptor(it.node, TextRange(range.startOffset, range.endOffset), grp) {
                    override fun getPlaceholderText(): String? = if (it.name != null) {
                        "query ${it.name}"
                    } else {
                        super.getPlaceholderText()
                    }
                }
            )
        }

        return descriptors.toTypedArray()
    }

    override fun getPlaceholderText(node: ASTNode): String = "..."
}
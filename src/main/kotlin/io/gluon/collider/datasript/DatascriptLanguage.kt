package io.gluon.collider.datascript

import com.intellij.lang.Language

object DatascriptLanguage : Language("Datascript", "text/datascript"){
    override fun isCaseSensitive() = true
    override fun getDisplayName() = "Datascript"
}
package io.gluon.collider.datascript.psi

import com.intellij.psi.tree.IElementType
import io.gluon.collider.datascript.DatascriptLanguage

open class DatascriptTokenType (debugName: String) : IElementType(debugName, DatascriptLanguage)
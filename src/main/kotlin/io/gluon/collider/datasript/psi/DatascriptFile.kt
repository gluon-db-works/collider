package io.gluon.collider.datascript.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import io.gluon.collider.datascript.DatascriptFileType
import io.gluon.collider.datascript.DatascriptLanguage

class DatascriptFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DatascriptLanguage) {
    override fun getFileType(): FileType = DatascriptFileType
}
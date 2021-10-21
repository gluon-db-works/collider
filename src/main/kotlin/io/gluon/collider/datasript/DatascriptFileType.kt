package io.gluon.collider.datascript

import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import io.gluon.collider.datasript.ui.DatascriptIcons
import javax.swing.Icon

object DatascriptFileType  : LanguageFileType(DatascriptLanguage) {
    override fun getName(): String = "Datascript"

    override fun getIcon(): Icon = DatascriptIcons.DATASCRIPT_FILE

    override fun getDefaultExtension(): String = "ds"

    override fun getCharset(file: VirtualFile, content: ByteArray): String = "UTF-8"

    override fun getDescription(): String = "Datascript files"
}
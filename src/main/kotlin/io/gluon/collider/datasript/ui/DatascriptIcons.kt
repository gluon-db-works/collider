package io.gluon.collider.datasript.ui

import com.intellij.openapi.util.IconLoader
import com.intellij.ui.ColorUtil
import com.intellij.ui.LayeredIcon
import com.intellij.util.IconUtil

import java.awt.Color
import java.awt.image.RGBImageFilter
import javax.swing.Icon

object DatascriptIcons {
    // Logos

    // val FOUNDATION = load("/icons/datascript.svg")

    // File types
    // TODO: make file icon
    val DATASCRIPT_FILE = load("/icons/datascript-file.svg")

    private fun load(path: String): Icon = IconLoader.getIcon(path, DatascriptIcons::class.java)
}

fun Icon.multiple(): Icon {
    val compoundIcon = LayeredIcon(2)
    compoundIcon.setIcon(this, 0, 2 * iconWidth / 5, 0)
    compoundIcon.setIcon(this, 1, 0, 0)
    return compoundIcon
}

fun Icon.grayed(): Icon =
    IconUtil.filterIcon(this, {
        object : RGBImageFilter() {
            override fun filterRGB(x: Int, y: Int, rgb: Int): Int {
                val color = Color(rgb, true)
                return ColorUtil.toAlpha(color, (color.alpha / 2.2).toInt()).rgb
            }
        }
    }, null)
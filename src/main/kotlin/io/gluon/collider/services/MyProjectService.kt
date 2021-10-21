package io.gluon.collider.services

import com.intellij.openapi.project.Project
import io.gluon.collider.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.demiusacademius.collider.services

import com.intellij.openapi.project.Project
import com.github.demiusacademius.collider.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

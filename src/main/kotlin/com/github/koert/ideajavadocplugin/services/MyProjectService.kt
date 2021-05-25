package com.github.koert.ideajavadocplugin.services

import com.github.koert.ideajavadocplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

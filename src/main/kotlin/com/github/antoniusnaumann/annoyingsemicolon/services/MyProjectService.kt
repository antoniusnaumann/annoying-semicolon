package com.github.antoniusnaumann.annoyingsemicolon.services

import com.intellij.openapi.project.Project
import com.github.antoniusnaumann.annoyingsemicolon.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

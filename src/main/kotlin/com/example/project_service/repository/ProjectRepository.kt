package com.example.project_service.repository

import CreateProjectRequest
import Project
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class ProjectRepository(private var projects: List<Project>) {
    fun createProject( project:Project) {
        projects = projects+project
    }
    fun getProjects():List<Project> {
        return projects
    }
}
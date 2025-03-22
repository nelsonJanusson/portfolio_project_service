package com.example.project_service.service

import CreateProjectRequest
import Project
import org.springframework.stereotype.Service

@Service
class ProjectService {
    fun getProjects(): List<Project>{
        return listOf()
    }

    fun createProject(createProjectRequest: CreateProjectRequest){
    }
}
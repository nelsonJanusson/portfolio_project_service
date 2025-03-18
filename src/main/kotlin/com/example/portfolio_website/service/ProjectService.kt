package com.example.portfolio_website.service

import CreateProjectRequest
import ReturnProjectDto
import org.springframework.stereotype.Service

@Service
class ProjectService {
    fun getProjects(): List<ReturnProjectDto>{
        return listOf()
    }

    fun createProject(createProjectRequest: CreateProjectRequest){
    }
}
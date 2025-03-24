package com.example.project_service.service

import CreateProjectRequest
import Project
import com.example.project_service.repository.ProjectRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectService (val projectRepository: ProjectRepository) {
    fun getProjects(): List<Project>{
       return projectRepository.getProjects();
    }

    fun createProject(createProjectRequest: CreateProjectRequest){
       projectRepository.createProject(
           Project(UUID.randomUUID(),
               createProjectRequest.title,
               createProjectRequest.link,
               createProjectRequest.description,
               createProjectRequest.tags))
    }
}
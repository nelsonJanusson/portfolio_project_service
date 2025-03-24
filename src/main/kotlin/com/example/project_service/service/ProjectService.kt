package com.example.project_service.service

import CreateProjectRequest
import Project
import com.example.project_service.models.Link
import com.example.project_service.repository.ProjectRepository
import jakarta.persistence.ElementCollection
import jakarta.persistence.Embedded
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectService (val projectRepository: ProjectRepository) {
    fun getProjects(): List<Project>{
        return projectRepository.findAll()
    }

    fun createProject(createProjectRequest: CreateProjectRequest){
        projectRepository.save(Project(UUID.randomUUID(), createProjectRequest.title,
             createProjectRequest.link,createProjectRequest.description,
             createProjectRequest.tags))
    }
}
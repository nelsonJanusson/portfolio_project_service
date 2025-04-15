package com.example.project_service.service

import CreateProjectRequest
import Project
import com.example.project_service.repository.IProjectRepository
import com.example.project_service.repository.ProjectRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProjectService (val projectRepository: ProjectRepository, val iProjectRepository: IProjectRepository) {
    fun getProjects(): List<Project>{
       return iProjectRepository.findAll().toList();
    }

    fun createProject(createProjectRequest: CreateProjectRequest){
        iProjectRepository.save(
           Project(UUID.randomUUID(),
               createProjectRequest.title,
               createProjectRequest.link,
               createProjectRequest.description,
               createProjectRequest.tags))
    }
}
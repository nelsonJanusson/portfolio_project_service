package com.example.project_service.controller

import CreateProjectRequest
import Project
import com.example.project_service.service.ProjectService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping(value = ["/api/projects"])
class ProjectController(val projectService: ProjectService) {

    @GetMapping
    fun getProjects( ): List<Project>{
        return projectService.getProjects()
    }

    @PostMapping
    fun createProject(@RequestBody createProjectRequest: CreateProjectRequest){
         projectService.createProject(createProjectRequest)
    }



}
package com.example.project_service.controller

import CreateProjectRequest
import ReturnProjectDto
import com.example.project_service.service.ProjectService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/projects"])

class ProjectController(val projectService: ProjectService) {

@GetMapping
fun getProjects( ): List<ReturnProjectDto>{
    return projectService.getProjects()
}
    @PostMapping
    fun createProject(@RequestBody createProjectRequest: CreateProjectRequest){
         projectService.createProject(createProjectRequest)
    }

}
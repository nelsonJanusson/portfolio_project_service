package com.example.portfolio_website.controller

import CreateProjectRequest
import ReturnProjectDto
import com.example.portfolio_website.service.ProjectService
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
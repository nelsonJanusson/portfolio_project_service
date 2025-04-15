package com.example.project_service.repository
import Project
import org.springframework.data.repository.CrudRepository
import java.util.*

interface IProjectRepository  : CrudRepository<Project, UUID> {
}
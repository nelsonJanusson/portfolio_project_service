package com.example.project_service.repository

import Project
import org.springframework.data.repository.ListCrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ProjectRepository : ListCrudRepository<Project, UUID> {
}

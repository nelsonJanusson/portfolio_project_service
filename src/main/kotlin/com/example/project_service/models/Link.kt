package com.example.project_service.models

import jakarta.persistence.Embeddable

@Embeddable
data class Link(val name: String, val url: String)
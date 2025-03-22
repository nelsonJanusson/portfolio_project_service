import com.example.project_service.models.Link

data class CreateProjectRequest(
    val title: String,
    val link: Link,
    val description: String,
    val tags: List<String>)
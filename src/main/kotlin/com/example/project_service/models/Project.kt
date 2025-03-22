import com.example.project_service.models.Link
import java.util.UUID

data class Project(
    val id: UUID,
    val title: String,
    val link: Link,
    val description: String,
    val tags: List<String>)
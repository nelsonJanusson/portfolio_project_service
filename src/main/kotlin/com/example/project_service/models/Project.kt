import com.example.project_service.models.Link
import java.util.UUID

class Project(

    val id: UUID = UUID.randomUUID(),
    val title: String,
    val link: Link,
    val description: String,
    val tags: List<String>)

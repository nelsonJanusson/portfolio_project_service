import com.example.project_service.models.Link
import jakarta.persistence.*
import java.util.UUID
@Entity
@Table(name = "projects")
class Project(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID = UUID.randomUUID(),
    val title: String,
    @Embedded
    val link: Link,
    val description: String,
    @ElementCollection
    val tags: List<String>){
    // No-argument constructor for JPA
    constructor() : this(UUID.randomUUID(), "", Link(), "", emptyList())
}


import com.example.project_service.models.Link
import jakarta.persistence.ElementCollection
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.NoArgsConstructor
import java.util.UUID
@Entity
@Table(name = "users")
class Project(
    @Id
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val link: Link,
    val description: String,
    @ElementCollection
    val tags: List<String>) {

}

import java.util.UUID

data class Project(
    val id: UUID,
    val title: String,
    val link: String,
    val description: String,
    val tags: List<String>)
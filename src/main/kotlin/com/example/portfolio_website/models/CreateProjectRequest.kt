data class CreateProjectRequest(
    val title: String,
    val link: String,
    val description: String,
    val tags: List<String>)
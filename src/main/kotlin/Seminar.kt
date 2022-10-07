import java.time.LocalDateTime

data class Seminar(
    val id: Int,
    val title: String,
    val deadline: LocalDateTime,
    val assignments: List<Assignment>,
    var status: String,
    val relatedCourse: String
) {
    fun implementItem(itemName: String): String {
        return "implementItem method"
    }

    fun addComment(comment: String) {
        status = comment
    }
}
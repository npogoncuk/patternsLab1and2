import java.time.LocalDateTime

class CourseProgress(
    val receivedMarks: Map<Assignment, Double> = mutableMapOf(),
    val visitedLectures: Int = 0,
    val completedAssignment: Map<LocalDateTime, Assignment> = mutableMapOf(),
    val notes: MutableList<String> = mutableListOf()
) {

    fun progressToDate(date: LocalDateTime): String {
        var str = ""
        for (key in completedAssignment.keys) {
            if (key < date) str += completedAssignment[key]
        }
        return str
    }

    val finalMark
    get() = completedAssignment.values.map { it.mark }.average()

    fun addNote(description: String) {
        notes.add(description)
    }
    fun removeNotes() {
        notes.clear()
    }
}
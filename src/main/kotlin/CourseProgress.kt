import java.time.LocalDateTime

class CourseProgress(
    val receivedMarks: Map<Assignment, Double>,
    val visitedLectures: Int,
    val completedAssignment: Map<LocalDateTime, Assignment>,
    val notes: MutableList<Note> = mutableListOf()
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
        notes.add(Note(LocalDateTime.now(), description))
    }
    fun removeNote(date: LocalDateTime) {
        notes.removeIf { it.date == date }
    }
}
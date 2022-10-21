import java.time.LocalDateTime

class ProgrammingCourse(
    title: String,
    startDate: LocalDateTime,
    endDate: LocalDateTime,
    description: String,
    lectures: List<String>,
    limit: Int,
    seminars: List<Seminar>
) : Course(title, startDate, endDate, description, lectures, limit, seminars) {
    fun doProgramming() {
        println("unique attributes of programming course")
    }
}
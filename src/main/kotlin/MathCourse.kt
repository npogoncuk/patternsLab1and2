import java.time.LocalDateTime

class MathCourse(
    title: String,
    startDate: LocalDateTime,
    endDate: LocalDateTime,
    description: String,
    lectures: List<String>,
    limit: Int,
    seminars: List<Seminar>
): Course(title, startDate, endDate, description, lectures, limit, seminars) {

    fun doMath() {
        println("unique attributes of math")
    }

}

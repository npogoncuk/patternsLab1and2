import java.time.LocalDateTime

class AlgorithmsCourse(
    title: String,
    startDate: LocalDateTime,
    endDate: LocalDateTime,
    description: String,
    lectures: List<String>,
    limit: Int,
    seminars: List<Seminar>
) : Course(title, startDate, endDate, description, lectures, limit, seminars) {
    fun doAlgorithms() {
        println("unique attributes of Algorithms course")
    }
}
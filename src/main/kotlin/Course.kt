import java.time.LocalDateTime

class Course(
    val title: String,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val description: String,
    val lectures: List<String>,
    val limit: Int,
    val seminars: List<Seminar>
) {
    fun addStudent(enrollment: Enrollment) = enrollment.enroll()
    fun removeStudent(enrollment: Enrollment) = enrollment.unenroll()

}
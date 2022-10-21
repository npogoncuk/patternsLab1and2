import java.time.LocalDateTime

abstract class Course(
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
    override fun toString(): String {
        return "Course(title='$title', startDate=$startDate, endDate=$endDate, description='$description', lectures=$lectures, limit=$limit, seminars=$seminars)"
    }


}
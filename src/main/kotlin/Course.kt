import java.time.LocalDateTime

class Course(
    val title: String,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
    val description: String,
    val lectures: List<String>,
    val assignments: List<Assignment>,
    private var limit: Int
) {
    private val students: MutableList<Student> = mutableListOf()

    fun addStudent(student: Student) = if (students.size < limit && LocalDateTime.now() < endDate) students.add(student) else false

    fun removeStudent(student: Student) = students.remove(student)

}
data class Student(
    val fullName: String,
    val address: String,
    val phoneNumber: String,
    val email: String,
    val studentNumber: Int,
    var averageMark: Double
) {
    private val coursesProgressToCourse = mutableMapOf<Course, CourseProgress>()
    fun takenCourses(): List<Course> = coursesProgressToCourse.map { it.key }
    val coursesProgresses: List<CourseProgress> get() = coursesProgressToCourse.values.toList()


    fun enroll(course: Course): Boolean {
        val success = course.addStudent(this)
        val mapAssignmentToMark = mutableMapOf<Assignment, Double>()
        course.assignments.map { mapAssignmentToMark[it.copy()] = .0 }
        if (success) coursesProgressToCourse[course] = CourseProgress(receivedMarks = mapAssignmentToMark)
        return success
    }

    fun unenroll(course: Course): Boolean {
        val success = course.removeStudent(this)
        if (success) coursesProgressToCourse.remove(course)
        return success
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (fullName != other.fullName) return false

        return true
    }

    override fun hashCode(): Int {
        return fullName.hashCode()
    }
}
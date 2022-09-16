data class Student(
    val fullName: String,
    val address: String,
    val phoneNumber: String,
    val email: String,
    val studentNumber: Int,
    var averageMark: Double
) {
    private val courses: MutableList<Course> = mutableListOf()

    fun takenCourses(): List<Course> = courses

    fun enroll(course: Course): Boolean {
        val success = course.addStudent(this)
        if (success) courses.add(course)
        return success
    }

    fun unenroll(course: Course): Boolean {
        val success = courses.remove(course)
        if (success) courses.remove(course)
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
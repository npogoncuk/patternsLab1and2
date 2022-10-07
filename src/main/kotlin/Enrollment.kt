class Enrollment(var course: Course, var student: Student) {
    companion object{
        val courseToStudents = mutableMapOf<Course, MutableList<Student>>()
    }


    fun enroll(): Boolean {
        println("enrolling $student")
        val studentsOfCourse = courseToStudents[course]
        if (studentsOfCourse == null) {
            courseToStudents[course] = mutableListOf(student)
            student.assignments += course.seminars.flatMap { it.assignments }
            return true
        } else {
            if (studentsOfCourse.size == course.limit) return false
            return studentsOfCourse.add(student)
        }
    }

    fun unenroll(): Boolean {
        println("unenrolling $student")
        val studentsOfCourse = courseToStudents[course] ?: return false
        student.assignments -= course.seminars.flatMap { it.assignments }.toSet()
        return studentsOfCourse.remove(student)
    }

}
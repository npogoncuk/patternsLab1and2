class Department(val title: String) {
    val students = mutableListOf<Student>()
    val professors = mutableListOf<Professor>()
    val courses = mutableListOf<Course>()
    val requests = mutableListOf<Any>()

    fun proceedRequests(request: Any): Any {
        println("Requests are processed")
        return requests.toString()
    }

    fun addStudent(student: Student) = students.add(student)
    fun addProfessor(professor: Professor) = professors.add(professor)
    fun addCourse(course: Course) = courses.add(course)
    fun addRequest(request: Any) = requests.add(request)
}

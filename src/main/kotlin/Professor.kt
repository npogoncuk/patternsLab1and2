import kotlin.random.Random

abstract class Professor(
    personalInfo: PersonalInfo
    ) : Staff(personalInfo) {
     abstract fun createCourse(): Course
    override fun askSickLeave(department: Department): Boolean {
        return department.addRequest("Professor $this asks for sick leave")
    }

    override fun sendRequest(department: Department): Boolean {
        return department.addRequest("Professor $this asks for special request")
    }

    fun addPostGraduateStudent(postgraduateStudent: PostgraduateStudent) {

    }

    fun requestSupport() {

    }

    fun doSomethingWithCreatedCourse() {
        println("I'm doing something with course")
    }

}

fun Professor.checkAssignment(vararg assignments: Assignment) {
    for (assignment in assignments) {
        assignment.mark  = ((Random.nextDouble() * 100) * 10).toInt() / 10.0
        println("$this checked $assignment and put the mark")
    }
}

fun Professor.checkAssignment(student: Student) {
    for (assignment in student.assignments) {
        assignment.mark  = ((Random.nextDouble() * 100) * 10).toInt() / 10.0
        println("$this checked $assignment and put the mark")
    }
}
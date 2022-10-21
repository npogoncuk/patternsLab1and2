class Student(
    val personalInfo: PersonalInfo
) : Staff(personalInfo){

    override fun askSickLeave(department: Department): Boolean {
        return department.addRequest("Student $this asks for sick leave")
    }

    override fun sendRequest(department: Department): Boolean {
        return department.addRequest("Student $this asks for special request")
    }

    override fun toString(): String {
        return "Student(personalInfo=$personalInfo)"
    }

    val assignments = mutableListOf<Assignment>()
    val avarageMark
    get() = assignments.map { it.mark }.average()


}
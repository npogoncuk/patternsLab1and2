class PostgraduateStudent(val personalInfo: PersonalInfo,val  phdStatus: String): Staff(personalInfo) {

    override fun askSickLeave(department: Department): Boolean {
        return department.addRequest("Student $this asks for sick leave")
    }

    override fun sendRequest(department: Department): Boolean {
        return department.addRequest("Student $this asks for special request")
    }

    override fun toString(): String {
        return "PostgraduateStudent(personalInfo=$personalInfo, phdStatus='$phdStatus')"
    }
}
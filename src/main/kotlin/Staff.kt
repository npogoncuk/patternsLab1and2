abstract class Staff(personalInfo: PersonalInfo) {
    abstract fun askSickLeave(department: Department): Boolean
    abstract fun sendRequest(department: Department): Boolean
}
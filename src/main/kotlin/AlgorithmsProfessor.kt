import java.time.LocalDateTime
import java.time.Month

class AlgorithmsProfessor (
    personalInfo: PersonalInfo
) : Professor(personalInfo) {
    override fun createCourse(): Course {
        return ProgrammingCourse("Algorithms", LocalDateTime.now(), LocalDateTime.of(2023, Month.JANUARY, 12, 0, 0), "Algorithms course", listOf("l1", "l2"), 10, listOf())
    }

}
import java.time.LocalDateTime
import java.time.Month

class ProgrammingProfessor(
    personalInfo: PersonalInfo
) : Professor(personalInfo) {
    override fun createCourse(): Course {
        return ProgrammingCourse("Programming", LocalDateTime.now(), LocalDateTime.of(2023, Month.JANUARY, 12, 0, 0), "Programming course", listOf("l1", "l2"), 10, listOf())
    }

}
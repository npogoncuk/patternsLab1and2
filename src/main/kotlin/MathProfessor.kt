import java.time.LocalDateTime
import java.time.Month

class MathProfessor(
    personalInfo: PersonalInfo
) : Professor(personalInfo) {
    override fun createCourse(): Course {
        return MathCourse("Math", LocalDateTime.now(), LocalDateTime.of(2023, Month.JANUARY, 12, 0, 0), "math course", listOf("l1", "l2"), 10, listOf())
    }

}
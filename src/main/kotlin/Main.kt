import java.time.LocalDateTime
import java.time.Month

fun main() {
//    val nazar1 = Student("Nazar1", "Pohonchuk", "123", "123@at.com", 1, 90.9)
//    val nazar2 = Student("Nazar2", "Pohonchuk", "123", "123@at.com", 2, 90.9)
//    val nazar3 = Student("Nazar3", "Pohonchuk", "123", "123@at.com", 3, 90.9)
//    val assignments1 = listOf(
//        Assignment("asgn1", description = "do task1"),
//        Assignment("asgn2", description = "do task2"),
//        Assignment("asgn3", description = "do task3")
//    )
//    val assignments2 = listOf(
//        Assignment("asgn4", description = "do task4"),
//        Assignment("asgn5", description = "do task5"),
//        Assignment("asgn6", description = "do task6")
//    )
//    val assignments3 = listOf(
//        Assignment("asgn7", description = "do task7"),
//        Assignment("asgn8", description = "do task8"),
//        Assignment("asgn9", description = "do task9")
//    )
//    val mathCourse1 = Course(
//        "Calculus", LocalDateTime.now(), LocalDateTime.of(2022, 12, 15, 0, 0),
//        "We will learn integrals", listOf("lecture1", "lecture2", "lecture3"), assignments1, 5
//    )
//    val mathCourse2 = Course(
//        "Calculus", LocalDateTime.now(), LocalDateTime.of(2022, 12, 15, 0, 0),
//        "We will learn integrals", listOf("lecture1", "lecture2", "lecture3"), assignments2, 5
//    )
//    val professor = Professor("Oleh", "address", "0997998989", "oleh@email.com", 99_999.9)
//    mathCourse1.professor = professor
//    mathCourse2.professor = professor
//
//    with(mathCourse1) {
//        addStudent(nazar1)
//        addStudent(nazar2)
//        addStudent(nazar3)
//    }
//    with(mathCourse2) {
//        addStudent(nazar1)
//        addStudent(nazar2)
//        addStudent(nazar3)
//    }
//    with(professor) {
//        val assignments = nazar1.coursesProgresses.map { it.completedAssignment.values.toList() }.flatten()
//        checkAssignment(*assignments.toTypedArray())
//    }

    val nazar = Student(PersonalInfo(1, "nazar", "pohonchuk", "nAdress", "+38000", "n@e.com", 1, "student", .0))
    val sasha = Student(PersonalInfo(2, "sasha", "pohonchuk", "sAdress", "+38001", "S@e.com", 1, "student", .0))

    val assignments1 = listOf(
        Assignment("asgn1", description = "do task1"),
        Assignment("asgn2", description = "do task2"),
        Assignment("asgn3", description = "do task3")
    )
    val assignments2 = listOf(
        Assignment("asgn4", description = "do task4"),
        Assignment("asgn5", description = "do task5"),
        Assignment("asgn6", description = "do task6")
    )
    val seminars = listOf(
        Seminar(1, "seminar1", LocalDateTime.of(2022, Month.DECEMBER, 1, 0, 0), assignments1,"status", "test"),
        Seminar(2, "seminar2", LocalDateTime.of(2022, Month.DECEMBER, 1, 0, 0), assignments2,"status", "test")
    )
    val professor = Professor(PersonalInfo(3, "Oleh", "Sinkevych", "OlehAdress", "+38999", "ohel@e.com",2,"lecturere", 999_999.99))
    val course = Course("Physics", LocalDateTime.of(2022, Month.SEPTEMBER, 1, 0, 0),
    LocalDateTime.of(2022, Month.DECEMBER, 25, 0, 0), "desc", listOf(), 3,
    seminars)

    val enrollment = Enrollment(course, nazar)
    enrollment.enroll()
    enrollment.student = sasha
    enrollment.enroll()
    professor.checkAssignment(nazar)
    professor.checkAssignment(sasha)
}
import java.time.LocalDateTime

fun main() {
    val nazar1 = Student("Nazar1", "Pohonchuk", "123", "123@at.com", 1, 90.9)
    val nazar2 = Student("Nazar2", "Pohonchuk", "123", "123@at.com", 2, 90.9)
    val nazar3 = Student("Nazar3", "Pohonchuk", "123", "123@at.com", 3, 90.9)
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
    val assignments3 = listOf(
        Assignment("asgn7", description = "do task7"),
        Assignment("asgn8", description = "do task8"),
        Assignment("asgn9", description = "do task9")
    )
    val mathCourse1 = Course(
        "Calculus", LocalDateTime.now(), LocalDateTime.of(2022, 12, 15, 0, 0),
        "We will learn integrals", listOf("lecture1", "lecture2", "lecture3"), assignments1, 5
    )
    val mathCourse2 = Course(
        "Calculus", LocalDateTime.now(), LocalDateTime.of(2022, 12, 15, 0, 0),
        "We will learn integrals", listOf("lecture1", "lecture2", "lecture3"), assignments2, 5
    )
    val professor = Professor("Oleh", "address", "0997998989", "oleh@email.com", 99_999.9)
    mathCourse1.professor = professor
    mathCourse2.professor = professor

    with(mathCourse1) {
        addStudent(nazar1)
        addStudent(nazar2)
        addStudent(nazar3)
    }
    with(mathCourse2) {
        addStudent(nazar1)
        addStudent(nazar2)
        addStudent(nazar3)
    }
    with(professor) {
        val assignments = nazar1.coursesProgresses.map { it.completedAssignment.values.toList() }.flatten()
        checkAssignment(*assignments.toTypedArray())
    }
}
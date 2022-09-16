import java.time.LocalDateTime

fun main() {
    val nazar = Student("Nazar", "Pohonchuk", "123", "123@at.com", 123, 90.9)
    val assignments = listOf(Assignment("asgn1", description = "do task1"),
        Assignment("asgn2", description = "do task2"),
        Assignment("asgn3", description = "do task3"))
    val mathCourse = Course("Calculus", LocalDateTime.now(), LocalDateTime.of(2022, 12, 15, 0, 0),
        "We will learn integrals", listOf("lecture1", "lecture2", "lecture3"), assignments, 5)

}
import java.time.LocalDateTime
import kotlin.random.Random

data class Professor(
    val name: String,
    val address: String,
    val phoneNumber: String,
    val email: String,
    val salary: Double
    )

fun Professor.checkAssignment(completedAssignment: Map<LocalDateTime, Assignment>) {
    for (assignment in completedAssignment.values) {
        assignment.mark = Random.nextDouble() * 100
    }
}
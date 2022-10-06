import java.time.LocalDateTime
import kotlin.random.Random

data class Professor(
    val name: String,
    val address: String,
    val phoneNumber: String,
    val email: String,
    val salary: Double
    )

fun Professor.checkAssignment(vararg assignments: Assignment) {
    for (assignment in assignments) assignment.mark  = Random.nextDouble() * 100
}
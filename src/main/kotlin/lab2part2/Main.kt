package lab2part2

fun main() {
    val box = Container(0, 0, 100, 100)
    val ball = Ball(50.0, -50.0, 5, 10, 30)
    println(box)
    box.putInBoxAndMove(ball, 1)
}
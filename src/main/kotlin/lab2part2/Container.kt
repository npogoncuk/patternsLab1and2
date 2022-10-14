package lab2part2

import java.lang.Thread.sleep
import kotlin.concurrent.thread

class Container(
    private val x1: Int,
    private val y1: Int,
    private val width: Int,
    private val height: Int
) {
    init {
        if (width <= 0 || height <= 0) throw IllegalArgumentException("Width and height must be larger than zero")
    }
    private val x2 get() = x1 + width
    private val y2 get() = y1 - height

    @Volatile
    var isBallMoving = true

    fun putInBoxAndMove(ball: Ball, time: Long) {
        if (!isInContainer(ball)) throw IllegalArgumentException("Ball $ball is not in the container")

        stopBall(time)
        while (isBallMoving) {
            ball.move()
            println(ball)
            if (!isInContainerHorizontally(ball)) ball.reflectVertically()
            if (!isInContainerVertically(ball)) ball.reflectHorizontally()
        }
    }

    fun stopBall(time: Long) {
        thread(start = true) {
            sleep(time)
            isBallMoving = false
        }
    }

    private fun isInContainer(ball: Ball) = isInContainerHorizontally(ball) && isInContainerVertically(ball)

    private fun isInContainerHorizontally(ball: Ball) = !(ball.centerX - x1 < ball.radius || x2 - ball.centerX < ball.radius)
    private fun isInContainerVertically(ball: Ball) = !(y1 - ball.centerY < ball.radius || ball.centerY - y2 < ball.radius)

    override fun toString(): String {
        return "Container(x1=$x1, y1=$y1, x2=$x2, y2=$y2)"
    }
}
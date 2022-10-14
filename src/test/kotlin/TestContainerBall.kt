import lab2part2.Ball
import lab2part2.Container
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test{

    @Test
    fun testCreatingBall() {
        Ball(999.9, 999.9, 10, 16, 60)
        try {
            Ball(999.9, 999.9, -10, 16, 60)
        } catch (e: IllegalArgumentException) {
            assertEquals("Radius must be bigger than 0", e.message)
        }

        try {
            Ball(999.9, 999.9, 10, 16, 270)
        } catch (e: IllegalArgumentException) {
            assertEquals("Direction must be in range[-180, 180]", e.message)
        }
    }

    @Test
    fun testBallToString() {
        val ball = Ball(50.0, -50.0, 5, 10, 30)
        assertEquals("Ball(x=50.0, y=-50.0, radius=5)", ball.toString())
    }

    @Test
    fun testMovingBall() {
        val ball = Ball(50.0, -50.0, 5, 10, 30)
        ball.move()
        //Ball(x=58.66025403784439, y=-45.0, radius=5)
        assertEquals(58.66, (ball.centerX * 100).toInt() / 100.0)
        assertEquals(-45.0,ball.centerY )
    }

    @Test
    fun testCreatingContainer() {
        assertThrows(IllegalArgumentException::class.java) {
            Container(0, 0, 50, -50)
        }
        assertThrows(IllegalArgumentException::class.java) {
            Container(0, 0, -50, 50)
        }
        Container(-50, -50, 10, 10)
    }

    @Test
    fun testContainerToString() {
        assertEquals("Container(x1=0, y1=0, x2=100, y2=-100)", Container(0, 0, 100, 100).toString())
    }


}

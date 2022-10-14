package lab2part2

import kotlin.math.cos
import kotlin.math.sin
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Ball(
    private var x: Double,
    private var y: Double,
    val radius: Int,
    velocity: Int,
    direction: Int
) {
    private var direction: Int by IntervalDelegate(0, -180, 180)
    val centerX get() = x
    val centerY get() = y

    init {
        if (radius <= 0) throw IllegalArgumentException("Radius must be bigger than 0")
        if (direction < -180 || direction > 180) throw IllegalArgumentException("Direction must be in range[-180, 180]")
        this.direction = direction
    }

    private var deltaX = velocity * cos(direction.toRadians())
    private var deltaY = velocity * sin(direction.toRadians())

    fun move() {
        x += deltaX
        y += deltaY
    }

    fun reflectHorizontally() {
        deltaY *= -1
    }

    fun reflectVertically() {
        deltaX *= -1
    }

    override fun toString(): String {
        return "Ball(x=$x, y=$y, radius=$radius)"
    }

}

class IntervalDelegate(
    var value: Int,
    val minValue: Int,
    val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    override fun getValue(thisRef: Any?, property: KProperty<*>) = value

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        this.value = value.coerceIn(minValue, maxValue)
    }
}

fun Int.toRadians(): Double = this * Math.PI / 180
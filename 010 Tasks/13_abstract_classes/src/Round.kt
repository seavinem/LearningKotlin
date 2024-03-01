import kotlin.math.PI

class Round(
    private var radius: Int = 0
) : Figure() {

    fun SetRadius(radius: Int) { this.radius = radius }
    fun GetRadius(): Int { return radius }

    override fun perimeter(): Double { return 2* PI *radius }
    override fun square(): Double { return PI *radius*radius }

    fun print() { println("Radius: $radius") }
}
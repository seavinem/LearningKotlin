import kotlin.math.PI

class Round(

    private var radius: Int = 0

) {

    fun SetRadius(radius: Int) { this.radius = radius }
    fun GetRadius(): Int { return radius }

    fun perimeter(): Double { return 2* PI *radius }
    fun square(): Double { return PI *radius*radius }

    fun print() { println("Radius: $radius") }
}
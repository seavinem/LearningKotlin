import kotlin.math.sqrt

class Triangle(
    private var a: Double = 0.0,
    private var b: Double = 0.0,
    private var c: Double = 0.0
) : Figure() {

    fun setSides(a: Double, b: Double, c: Double) {
        this.a = a
        this.b = b
        this.c = c
    }

    override fun perimeter(): Double { return a + b + c }

    override fun square(): Double {
        val p = (a + b + c) / 2
        return sqrt(p * (p - a) * (p - b) * (p - c))
    }

}
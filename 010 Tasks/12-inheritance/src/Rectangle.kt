class Rectangle(
    private var width: Double = 0.0,
    private var height: Double = 0.0
) : Figure() {

    fun setWidth(width: Double) { this.width = width }
    fun setHeight(height: Double) { this.height = height }

    fun getWidth(): Double { return width }
    fun getHeight(): Double { return height }

    override fun perimeter(): Double { return (2 * (width + height)) }
    override fun square(): Double { return width * height }

    fun isSquare(): Boolean { return width == height }

    fun print() { println("Width: $width\tHeight: $height") }
}
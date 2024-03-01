class Rectangle(
    private var width: Int = 0,
    private var height: Int = 0
) {

    fun setWidth(width: Int) { this.width = width }
    fun setHeight(height: Int) { this.height = height }

    fun getWidth(): Int { return width }
    fun getHeight(): Int { return height }

    fun perimeter(): Int { return (2 * (width + height)) }
    fun square(): Int { return width * height }

    fun isSquare(): Boolean { return width == height }

    fun print() { println("Width: $width\tHeight: $height") }
}
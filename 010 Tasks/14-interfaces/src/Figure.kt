class Figure (
    private var color: String = "",
    private var x: Int = 0,
    private var y: Int = 0
) : Movable {

    fun setX(x: Int) { this.x = x }
    fun setY(y: Int) { this.y = y }
    fun setColor(color: String) { this.color = color }

    fun getX(): Int { return x }
    fun getY(): Int { return y }
    fun getColor(): String { return color }

    override fun moveDown(step: Int) { y -= step }
    override fun moveUp(step: Int) { y += step }
    override fun moveLeft(step: Int) { x -= step }

    override fun moveRight(step: Int) { x += step }
}
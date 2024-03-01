class Animal (
    private var x: Int,
    private var y: Int
) : Movable {
    override fun moveDown(step: Int) { y -= step }
    override fun moveUp(step: Int) { y += step }
    override fun moveLeft(step: Int) { x -= step }
    override fun moveRight(step: Int) { x += step }
}
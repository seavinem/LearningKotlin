package OOP_LessonSpaceShip

//abstract
open class Rocket(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {

    fun switchToWarpMode() {
        println("$name: switched to warp mode")
    }

    open fun runSystemDiagnostic() {
        println("$name: system diagnostic is running")
    }
}
package OOP_LessonSpaceShip

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int
) : Rocket(name, speed) {

    fun handleRadarData() {
        println("$name: getting data from radar")
    }

    fun runAfterburner() {
        println("$name: afterburner is started")
    }

}
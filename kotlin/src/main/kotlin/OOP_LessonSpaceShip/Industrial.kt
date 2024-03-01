package OOP_LessonSpaceShip

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int
) : Rocket(name, speed, unmanned = true) {

    fun launchScanningDrones() {
        print("$name: scanning drones are launched")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("$name: drones and miners diagnostic is running")
    }

}
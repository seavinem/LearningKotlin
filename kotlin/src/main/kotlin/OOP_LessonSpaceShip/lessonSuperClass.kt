package OOP_LessonSpaceShip

// название, скорость, беспилотник
// варп режим, диагностика системы
// разведчик, индустриальный

fun main() {

    val ship1 = Rocket("ship1", 500)
    ship1.runSystemDiagnostic()
    ship1.switchToWarpMode()
    println()

    val scout1 = Scout("scout1", 750, 100, 1000)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.handleRadarData()
    scout1.runAfterburner()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial("industrial1", 340, 100)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
}
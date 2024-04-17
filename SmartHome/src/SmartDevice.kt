open class SmartDevice(
    val name: String,
    val category: String
) {

    var deviceStatus = "off"
        private set

    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

    fun printDeviseInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}
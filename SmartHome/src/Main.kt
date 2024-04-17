fun main() {
    var smartDevice: SmartDevice = SmartTVDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()

    val smartHome = SmartHome(
        SmartTVDevice("Android TV", "Entertainment"),
        SmartLightDevice("Google Light", "Utility")
    )

    smartHome.turnOnAllDevices()
    smartHome.increaseTvVolume()
    smartHome.decreaseLightBrightness()
    smartHome.turnOffAllDevices()
}
class SmartHome(
    private val smartTvDevice: SmartTVDevice,
    private val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        if(smartTvDevice.deviceStatus == "off") {
            deviceTurnOnCount++
            smartTvDevice.turnOn()
        }
    }

    fun turnOffTv() {
        if(smartTvDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartTvDevice.turnOff()
        }
    }

    fun increaseTvVolume() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.increaseVolume()
        }
    }
    fun decreaseTvVolume() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.decreaseVolume()
        }
    }

    fun changeTvChannelToNext() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.nextChannel()
        }
    }
    fun changeTvChannelToPrevious() {
        if(smartTvDevice.deviceStatus == "on") {
            smartTvDevice.previousChannel()
        }
    }

    fun turnOnLight() {
        if(smartLightDevice.deviceStatus == "off") {
            deviceTurnOnCount++
            smartLightDevice.turnOn()
        }
    }

    fun turnOffLight() {
        if(smartLightDevice.deviceStatus == "on") {
            deviceTurnOnCount--
            smartLightDevice.turnOff()
        }
    }

    fun increaseLightBrightness() {
        if(smartLightDevice.deviceStatus == "on") {
            smartLightDevice.increaseBrightness()
        }
    }
    fun decreaseLightBrightness() {
        if(smartLightDevice.deviceStatus == "on") {
            smartLightDevice.decreaseBrightness()
        }
    }

    fun turnOnAllDevices() {
        turnOnTv()
        turnOnLight()
    }
    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

    fun printSmartTvInfo() {
        smartTvDevice.printDeviseInfo()
    }
    fun printSmartLightInfo() {
        smartLightDevice.printDeviseInfo()
    }
}
package Algorythmes

import kotlin.math.atan2
import kotlin.math.PI
import kotlin.math.sqrt
import kotlin.math.abs

fun main() {
    val (xa, ya, xb, yb) = readln().split(' ').map { it.toLong() }
    val ra:Long = xa * xa + ya * ya
    val rb:Long = xb * xb + yb * yb

    if (ra == 0L || rb == 0L) {
        println(sqrt(ra.toDouble()) + sqrt(rb.toDouble()))
    }
    else {
        var angleA = atan2(ya.toDouble(), xa.toDouble())
        var angleB = atan2(yb.toDouble(), xb.toDouble())

        if (angleA < 0) {
            angleA += 2 * PI
        }
        if (angleB < 0) {
            angleB += 2 * PI
        }

        var angleDiff = abs(angleA - angleB)
        if (angleDiff > PI) {
            angleDiff = 2 * PI - angleDiff
        }

        val arcDistance = angleDiff * minOf(sqrt(rb.toDouble()), sqrt(ra.toDouble()))
        val radiusDistance = abs(sqrt(ra.toDouble()) - sqrt(rb.toDouble()))
        val totalDistance = arcDistance + radiusDistance

        if (ra == rb) {
            println(minOf(sqrt(ra.toDouble()) + sqrt(rb.toDouble()), arcDistance))
        } else {
            println(minOf(sqrt(ra.toDouble()) + sqrt(rb.toDouble()), totalDistance))
        }
    }
}
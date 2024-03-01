// Packages/EquilateralTriangle.kt
package pythagorean
import kotlin.math.*
class EquilateralTriangle(
    val side: Double
) {
    fun area(): Double = sqrt(3.0) / 4 * side * side
}
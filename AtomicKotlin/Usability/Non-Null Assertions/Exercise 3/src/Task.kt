// NonNullAssertions/Task3.kt
package nonNullAssertionsExercise3
import atomictest.eq
import kotlin.math.abs
import kotlin.math.absoluteValue

fun absMinIsMax(list: List<Int>): Boolean {
  return when {
    list.isEmpty() -> false
    else -> list.maxOrNull()!!.absoluteValue ==
            list.minOrNull()!!.absoluteValue
  }
}

fun main() {
  absMinIsMax(listOf(-10, 1, 10)) eq true
  absMinIsMax(listOf(10, 10)) eq true
  absMinIsMax(listOf(-10, 1)) eq false
}
// NonNullAssertions/Task2.kt
package nonNullAssertionsExercise2
import atomictest.*

fun List<Int>.headPlusTail() =
    when {
        isEmpty() -> Triple(null, null, null)
        size == 1 -> Triple(first(), null, first())
        else -> Triple(first(), last(), first() + last())
    }

fun main() {
  val ints = mutableListOf<Int>()
    trace(ints.headPlusTail())
    for(n in -2..10) {
        ints.add(n)
        trace(ints.headPlusTail())
    }
}
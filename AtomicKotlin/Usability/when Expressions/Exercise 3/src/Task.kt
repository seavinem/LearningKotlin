// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var count = 0
  for (c in input) {
    when(c) {
      '(' -> count++
      ')' -> count--
      ' ' -> {}
      else -> throw IllegalArgumentException()
    }

    if (count < 0) return false
  }

  return count == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}
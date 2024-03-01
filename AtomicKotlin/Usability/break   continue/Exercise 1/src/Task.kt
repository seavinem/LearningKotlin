// BreakAndContinue/Task1.kt
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var sum = 0
  val notNumbers = mutableListOf<String>()
  for(element in n) {
    val value = element.toIntOrNull()

    if  (element == "0") break

    if (value == null) notNumbers += element
    else sum += value
  }

  if (notNumbers.isNotEmpty())
    trace("Not a number: ${notNumbers.joinToString()}")

  trace("Sum: $sum")
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19")
  trace eq """
    Not a number: a
    Sum: 14
  """
}
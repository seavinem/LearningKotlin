// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
/*
  var result = 0
  var worker = number
  var i = 0

  while (worker > 0) {
    result *= 10
    result += worker % 10
    worker /= 10
  }

  return result
*/

  return number.toString().reversed().toInt()
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}
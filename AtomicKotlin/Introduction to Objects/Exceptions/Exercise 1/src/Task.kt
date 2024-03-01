// Exceptions/Task1.kt
package exceptionsExercise1

import atomictest.capture

fun main() {
  println("Can't be converted to double: 1,2")

  capture {
    "12".toDouble()
    "1.2".toDouble()
    "1.2e0".toDouble()
    "1.2e1".toDouble()
    "1.2e2".toDouble()
    "1.2e3".toDouble()
    "1.2e10".toDouble()
    "12.3e10".toDouble()
    "1.2e-1".toDouble()
    "1.2e-10".toDouble()
  } eq "NumberFormatException"
}
// ScopeFunctions/Task3.kt
package scopeFunctionsExercise3
import atomictest.eq
import scopeFunctionsExercise1.NumPair

class Math {
  fun np(x: Int, y: Int) = NumPair(x, y)
  fun add() = 1000
  fun subtract() = -1000
  fun NumPair.calc() = multiply()
}

fun main() {
  Math().run {
    val z = np(11, 7)
      .apply { add() + subtract() }
      .calc()
    z eq 77
    z + add()
  } eq 1077
}
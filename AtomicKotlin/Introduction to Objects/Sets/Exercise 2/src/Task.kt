// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  var count = 0
  val numbers = mutableSetOf<Int>()
  while (numbers.size < 25) {
    numbers += Random.nextInt(25) + 1
    count++
  }
  return count
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}
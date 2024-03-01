// Interfaces/Task1.kt
package interfacesExercise1
import atomictest.eq

interface Computer {
  fun calculateAnswer(): Int
}

class Cloud(
  n: Int
) : Computer {
  val list: List<Node> = List(n) { Node(it) }
  override fun calculateAnswer(): Int {
    return list.sumOf { it.calculateAnswer() }
  }
}

class Node(
  private val result: Int
) : Computer {
  override fun calculateAnswer(): Int = result
}

fun main() {
   Cloud(10).calculateAnswer() eq 45
}
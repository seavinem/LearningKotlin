// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int) = a + b

fun g(s: String, w: String) = s + w

fun h() = println("h()")

fun main() {
  val x: Int = f(1, 2)
  val y: String = g("1", "2")
  val z: Unit = h()
  println("Int")
  println("String")
  println(z)
}
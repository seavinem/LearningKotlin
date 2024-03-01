// CreatingClasses/Task5.kt
package creatingClassesExercise5

//fun cap(s: String) = s.replace(s[0], s[0].uppercaseChar())
fun cap(s: String) = s.capitalize()

fun main() {
  println(cap("hi!"))
  println(cap("Hi!"))
}
/* Output:
Hi!
Hi!
 */
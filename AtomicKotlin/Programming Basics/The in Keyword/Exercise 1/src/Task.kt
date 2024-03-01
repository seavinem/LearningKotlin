// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var alphabet = ""
  for (c in 'a'..'z') { alphabet += c }
  return alphabet
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
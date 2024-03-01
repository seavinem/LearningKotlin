// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result = ""
  for (c in s.indices step 2) { result += s[c] }
  return result

}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/
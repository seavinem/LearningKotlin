// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

import exceptionsExercise3.repeatChar

fun showHalfTriangle(n: Int) {
  for (i in 1..n) {
    repeat(i) { print("#")}
    println()
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/
// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  val x = 2*n-1
  for (i in 1..x step 2) {
    repeat((x - i)/2) { print(' ')}
    repeat(i) { print('#') }
    println()
  }

  for (i in 1..n) {
    repeat(n - i) { print(' ') }
    repeat(2 * i - 1) { print('#') }
    println()
  }

}

fun main() {
  printTriangle(2)
}
/* Output:
   #
  ###
 #####
#######
*/
// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  var value = 0
  val width = (rows*columns - 1).toString().length
  for(i in 0 until rows) {
    if(i % 2 == 1) value += columns - 1

    for (j in 0 until columns) {
      if (i % 2 == 0) {
        print(" %${width}d".format(value++))
      }
      else {
        print(" %${width}d".format(value--))
      }
    }
    if(i % 2 == 1) value += columns + 1
    println()
  }

/*val width = (rows * columns).toString().length + 1
  for (i in 0 until rows) {
    for (j in 0 until columns) {
      val value = if (i % 2 == 0) {
        i * columns + j
      } else {
        i * columns + (columns - 1 - j)
      }
      print("%${width}d".format(value))
    }
    println()
  }*/
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/
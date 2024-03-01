// Properties/Task3.kt
package propertiesExercise3


class Robot {
  private val max = 100
  var x = 0
  var y = 0


  private fun crossBoundary(x: Int): Int {
    var worker = x
    while (worker > max - 1) { worker -= max }
    while (worker < 0) { worker += max }

    return worker
  }


  fun right(steps: Int) {
    x += steps
    x = crossBoundary(x)
  }

  fun left(steps: Int) {
    x -= steps
    x = crossBoundary(x)
  }

  fun down(steps: Int) {
    y += steps
    y = crossBoundary(y)
  }

  fun up(steps: Int) {
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/
// Properties/Task4.kt
package propertiesExercise4

class Counter {
  private val getValue = 0

  var value = getValue

  private val i = 10

  fun inc() {
    value += i
  }

  fun dec() {
    value -= i
  }
}
// OperatorOverloading/OpOverloadingSoln1.kt
package operatorOverloadingExercise1
import atomictest.*

class WrapRange(
  val range: IntRange,
  private var current: Int = range.first
) {
  init {
    require(current in range) { "'current' out of range: $current" }
  }
  override fun toString() = "$current"
  operator fun inc(): WrapRange {
    if(current + 1 in range) current++
    else current = range.first
    return this
  }
  operator fun dec(): WrapRange {
    if(current - 1 in range) current--
    else current = range.last
    return this
  }
}

fun main() {
  val range = 2..5
  var wr = WrapRange(range)
  trace(wr)
  repeat(5) {
    wr++
    trace(wr)
  }
  trace("-")
  repeat(2) {
    wr--
    trace(wr)
  }
  trace eq "2 3 4 5 2 3 - 2 5"

  capture { WrapRange(range, 6) } eq
    "IllegalArgumentException: " +
    "'current' out of range: 6"
  capture { WrapRange(range, -1) } eq
    "IllegalArgumentException: " +
    "'current' out of range: -1"
}
// OperatorOverloading/OpOverloadingSoln2.kt
package operatorOverloadingExercise2
import atomictest.trace

enum class Count {
  Eeny, Meeny, Miney, Moe;
  companion object {
    val max = Moe
  }
}

operator fun Count.inc(): Count =
  /*when(Count.max) {
    Count.Eeny -> Count.Meeny
    Count.Meeny -> Count.Miney
    Count.Miney -> Count.Moe
    Count.Moe -> Count.Eeny
  }*/
  Count.values()[ (ordinal + 1) % Count.values().size ]

operator fun Count.dec(): Count =
  /*when(Count.max) {
    Count.Eeny -> Count.Moe
    Count.Meeny -> Count.Eeny
    Count.Miney -> Count.Meeny
    Count.Moe -> Count.Miney
  }*/
  if (ordinal - 1 < 0) Count.max
  else Count.values()[ordinal - 1]

fun main() {
  var c = Count.Eeny
  for (n in 1..4) {
    trace("${c++} -> $c")
  }
  trace("---------------")
  for (n in 1..4) {
    trace("${++c} -> $c")
  }
  trace("---------------")
  for (n in 1..4) {
    trace("${c--} -> $c")
  }
  trace("---------------")
  for (n in 1..4) {
    trace("${--c} -> $c")
  }
  trace eq """
    Eeny -> Meeny
    Meeny -> Miney
    Miney -> Moe
    Moe -> Eeny
    ---------------
    Meeny -> Meeny
    Miney -> Miney
    Moe -> Moe
    Eeny -> Eeny
    ---------------
    Eeny -> Moe
    Moe -> Miney
    Miney -> Meeny
    Meeny -> Eeny
    ---------------
    Moe -> Moe
    Miney -> Miney
    Meeny -> Meeny
    Eeny -> Eeny
  """
}
// Lists/Task1.kt
package listsExercise1

import atomictest.eq

fun findMax(list: IntList): Int {
    return if (list.size() != 0)
      list.maxOf { it }
    else
      0
}

fun main() {
    val list = IntList(listOf(1, 2, 3, 2))
    findMax(list) eq 3
}
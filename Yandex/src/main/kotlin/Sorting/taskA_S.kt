package Sorting

fun main() {
    val n = readln().toLong()
    val numsStr = readln()
    val x = readln().toLong()
    if (numsStr.isEmpty())
        println("0\n0")
    else {
        val numsList = numsStr.split(' ').map { it.toLong() }.toMutableList()
        var (l, e, g) = listOf(0, 0, 0)

        for (value in numsList) when {
            (value < x) -> {
                l++; e++; g++
            }

            (value == x) -> {
                e++; g++
            }

            (value > x) -> {
                g++
            }
        }

        println("${l}\n${n - l}")
    }
}

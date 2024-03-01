package Algorythmes

fun main() {
    val input = readln().split(' ').map { it.toInt() }
    val a = input[0]; val b = input[1]
    val range = readln().split(' ').toList().map { it.toInt() }
    for (i in 1..b) {
        val quests = readln().split(' ').toList().map { it.toInt() }
        val indexStart = quests[0]; val indexEnd = quests[1]
        val rangeNew = range.subList(indexStart, indexEnd + 1)
        if (rangeNew.min() != rangeNew.max()) println(rangeNew.max())
        else println("NOT FOUND")
    }
}
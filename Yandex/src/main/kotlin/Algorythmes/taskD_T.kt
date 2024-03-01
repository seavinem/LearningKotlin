package Algorythmes

fun main() {
    val a = readln().toList().sorted()
    val b = readln().toList().sorted()
    if (a == b) println("YES") else println("NO")
}
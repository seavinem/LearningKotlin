package Algorythmes

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    if (b % n != 0) {
        if (a > b / n + 1)
            print("YES")
        else
            print("NO")
    }
    else {
        if (a > b / n)
            print("YES")
        else
            print("NO")
    }
}
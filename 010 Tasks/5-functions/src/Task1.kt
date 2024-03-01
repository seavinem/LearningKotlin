/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */
fun max (num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()

    val maxValue = max(a, b)
    println(maxValue)
}
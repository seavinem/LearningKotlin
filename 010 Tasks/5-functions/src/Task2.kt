/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun maxAnswer (num1: Int, num2: Int): String {
    return when {
        num1 > num2 -> "первое число больше"
        num1 < num2 -> "второе число больше"
        else -> "числа равны"
    }
}

fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()

    val maxAnswer = maxAnswer(a, b)
    println(maxAnswer)
}
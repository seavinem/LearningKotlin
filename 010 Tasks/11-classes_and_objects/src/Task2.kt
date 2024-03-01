/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

import kotlin.math.PI

fun main() {

    print("Input radius: ")
    val radius = readln().toInt()
    val round = Round()
    round.print()

    round.SetRadius(radius)
    round.print()

    println("Get radius: ${round.GetRadius()}")

    println("Perimeter of round: ${String.format("%.2f", round.perimeter())}")
    println("Square of round: ${String.format("%.2f", round.square())}")

}
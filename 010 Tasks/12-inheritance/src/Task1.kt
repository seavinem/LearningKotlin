/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

fun main() {
    print("Input width and height for rectangle: ")
    val (width, height) = readln().split(" ").map { it.toDouble() }
    val rectangle = Rectangle()
    rectangle.print()

    rectangle.setHeight(height)
    rectangle.setWidth(width)
    rectangle.print()

    println("Get width and height: ${rectangle.getWidth()}, ${rectangle.getHeight()}")

    println("Perimeter of rectangle: ${rectangle.perimeter()}")
    println("Square of rectangle: ${rectangle.square()}")
    println("Is a rectangle a square: ${rectangle.isSquare()}")


    print("Input radius for round: ")
    val radius = readln().toInt()
    val round = Round()
    round.print()

    round.SetRadius(radius)
    round.print()

    println("Get radius: ${round.GetRadius()}")

    println("Perimeter of round: ${String.format("%.2f", round.perimeter())}")
    println("Square of round: ${String.format("%.2f", round.square())}")


}
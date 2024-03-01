/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/


fun main() {

    print("Input width and height: ")
    val (width, height) = readln().split(" ").map { it.toInt() }
    val rectangle = Rectangle()
    rectangle.print()

    rectangle.setHeight(height)
    rectangle.setWidth(width)
    rectangle.print()

    println("Get width and height: ${rectangle.getWidth()}, ${rectangle.getHeight()}")

    println("Perimeter of rectangle: ${rectangle.perimeter()}")
    println("Square of rectangle: ${rectangle.square()}")
    println("Is a rectangle a square: ${rectangle.isSquare()}")

}
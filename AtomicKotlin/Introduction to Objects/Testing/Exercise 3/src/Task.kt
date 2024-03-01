// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = (h.toDouble() / 2) * (x + y)

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  rectangleArea(1, 2) eq 2
  rectangleArea(2, 5) eq 10
  rectangleArea(5, 1) eq 5
  trapezoidArea(3, 4, 1) eq 3.5
  trapezoidArea(5, 5, 2) eq 10
  trapezoidArea(2, 2, 5) eq 10
}
/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/
import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)
    val workers = mutableListOf<Employee>()
    var count = 0
    var sum = 0


    while (true) {
        println("Введите имя:")
        val name = input.nextLine()
        if (name == "!") break

        println("Введите возраст:")
        val age = input.nextInt()
        input.nextLine()

        workers.add(Employee(name, age))
    }

    for (it in workers) {
         sum += it.age
        count++
    }

    println(String.format("%.3f", sum.toDouble()/count))
}
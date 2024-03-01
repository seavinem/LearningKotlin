/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val employees = listOf(
        SomeEmployee("Bob", 100),
        SomeEmployee("Robert", 50),
        SomeEmployee("Steve", 70),
        SomeEmployee("Joe", 110),
        SomeEmployee("Jack", 65),
    )

   try {
       findEmployeeBySalary(employees, 1000)
   }
   catch (e: Exception) {
       println(e.message)
   }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee {
    return employees.find { it.salary == age } ?: throw Exception("No such employee")
}


class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}
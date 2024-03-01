/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 20)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 24)
    val employee5 = Employee("Dima", 19)

    val workers = listOf(employee1, employee2, employee3, employee4, employee5)

    println("${findMinAgeEmployee(workers).name} - ${findMinAgeEmployee(workers).age}")
}

fun findMinAgeEmployee(workers: List<Employee>): Employee {
    var minAgeEmployee = workers[0]
    for (employee in workers) {
        if (employee.age < minAgeEmployee.age) {
            minAgeEmployee = employee
        }
    }

    return minAgeEmployee
}

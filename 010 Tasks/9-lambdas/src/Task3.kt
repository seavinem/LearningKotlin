/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int {
    var count = 0
    for (user in users) if (condition(user)) count++

    return count
}

fun main() {
    val user1 = User("Kirill", 23)
    val user2 = User("Olga", 28)
    val user3 = User("Ivan", 29)
    val user4 = User("Oleg", 35)

    val users = listOf(user1, user2, user3, user4)

    println(elementsCount(users) { it.age >= 18 })
}
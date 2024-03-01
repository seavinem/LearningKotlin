/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for (user in users)
        if (condition(user))
            return true

    return false
}


fun main() {

    val user1 = User("Kirill", 23)
    val user2 = User("Olga", 28)
    val user3 = User("Ivan", 29)
    val user4 = User("Oleg", 35)

    val users = listOf(user1, user2, user3, user4)

    val isTrue = containsElement(users) {it.age == 20}

    println(isTrue)
}
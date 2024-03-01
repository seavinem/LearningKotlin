/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Дата класс Userуже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String> {
    val converted = mutableListOf<String>()

    for (user in users) {
        converted.add(conversion(user))
    }

    return converted
}

fun main() {
    val user1 = User("Kirill", 23)
    val user2 = User("Olga", 28)
    val user3 = User("Ivan", 29)
    val user4 = User("Oleg", 35)

    val users = listOf(user1, user2, user3, user4)

    val usersToString = convertToStrings(users) {"Name: ${it.name} Age: ${it.age}"}
//    val usersToString = users.map { "Name: ${it.name} Age: ${it.age}" }

    println(usersToString)
}
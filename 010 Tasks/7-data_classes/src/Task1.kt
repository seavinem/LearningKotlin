/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

data class User(val name: String, val age: Int, val experience: Int)
data class Car(val brand: String, val price: Int)

fun isAvailable(user: User, car: Car): Boolean {
    return when {
        user.age >= 26 && user.experience >= 6 -> true
        user.age >= 21 && user.experience >= 2 && !(car.brand == "Audi" || car.brand == "BMW") -> true
        else -> false
    }
}

fun carChoice(user: User): String {
    return when {
        user.age >= 26 && user.experience >= 6 -> "roots for all cars"
        user.age >= 21 && user.experience >= 2 -> "roots for car except Audi and BMW"
        else -> "no roots"
    }
}

fun main() {
    val user = User("Shigis", 15, 2)
    val car = Car("Nissan", 3000)

    println(carChoice(user))
    println(isAvailable(user, car))
}
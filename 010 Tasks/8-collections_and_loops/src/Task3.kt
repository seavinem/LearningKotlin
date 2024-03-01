/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val car1 = Car("Audi", "A8", 5000.0)
    val car2 = Car("Mercedes", "X43", 3245.0)
    val car3 = Car("Porsche", "Cayenne", 5634.0)
    val car4 = Car("BMW", "X5", 5126.0)
    val car5 = Car("Renault", "Golf", 4231.0)
    val car6 = Car("Audi", "A6", 3240.0)

    val carsInStock = listOf(car1, car2, car3, car4, car5, car6)
    val user = User("Oleg", 28, 7)

    for(car in carsInStock) {
        if(isAvailable(user, car)) {
            println ("${car.brand} ${car.model} - ${car.cost}")
        }
    }
}

fun isAvailable(user: User, car: Car): Boolean {
    return when {
        user.age >= 26 && user.experience >= 6 -> true
        user.age >= 21 && user.experience >= 2 && !(car.brand == "Audi" || car.brand == "BMW") -> true
        else -> false
    }
}
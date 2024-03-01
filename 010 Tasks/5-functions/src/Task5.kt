import java.util.Locale.Category

/*
В программе каршеринга в зависимости от возраста и стажа водителя доступны разные авто. Озвучены следующие требования.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, которой на вход приходят возраст и стаж водителя.
Функция должна вернуть сообщение о том может ли он пользоваться каршерингом и какие авто ему доступны.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun carChoice(age: Int, categoryAge: Int): String {
    return when {
        age >= 26 && categoryAge >= 6 -> "Audi or BMW"
        age >= 21 && categoryAge >= 2 -> "roots fo car"
        else -> "no roots"
    }
}

fun main() {
    print("enter age: ")
    val age: Int = readln().toInt()

    print("enter auto time: ")
    val autoTime: Int = readln().toInt()

    println(carChoice(age, autoTime))
}
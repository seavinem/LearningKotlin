/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun carChoice(age: Int, categoryAge: Int, brand: String): String {
    return if (age >= 26 && categoryAge >= 6 && (brand == "Audi" || brand == "BMW")) "roots fo car" else "no roots"
}

fun main() {
    val age: Int = 28
    val experience: Int = 9
    val brand: String = "BMW"

    println(carChoice(age, experience, brand))
}
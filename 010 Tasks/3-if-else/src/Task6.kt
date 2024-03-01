/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    print ("enter age: ")
    val age: Int = readln().toInt()

    print ("enter auto time: ")
    val autoTime: Int = readln().toInt()

    print ("enter brand: ")
    val brand: String = readln()



    if (age >= 21 && autoTime >= 2) {
        println("you can own a car")

        if (brand == "Audi" || brand == "BMW") {
            if (age >= 26 && autoTime >= 6) {
                println("you can own this car")
            }
            else {
                println("you can't own this car")
            }
        }

    }
    else {
        print("no roots for car")
    }
}
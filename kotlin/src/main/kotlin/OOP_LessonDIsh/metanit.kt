package OOP_LessonDIsh

class Person {
    var name: String = "PopaPipiskaKakashka"
    var age: Int = 69

    fun hello() {
        println ("Hello, $name")
    }

    fun personality() = "Name: $name\tAge: $age"
}
fun main() {
    val Tom: Person = Person()
    println ("${Tom.name}\t${Tom.age}")
    val Bob: Person = Person()
    Bob.name = "Kakish"
    Bob.age = 21
    println ("${Tom.name}\t${Tom.age}")
    println ("${Bob.name}\t${Bob.age}")
    println (Tom.personality())
    println (Bob.personality())
    Tom.hello()
    Bob.hello()
}

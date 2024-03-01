// Interfaces/Task2.kt
package interfacesExercise2
import atomictest.eq

interface Pet {
  fun speak(): String
}

class Dog: Pet {
  override fun speak(): String = "Bark!"
}

class Cat: Pet {
  override fun speak(): String = "Meow!"
}

class Hamster: Pet {
  override fun speak(): String = "Squeak!"
}

fun main() {
  println(listOf(Dog(), Cat(), Hamster()).joinToString(transform = Pet::speak))
}
// ExtensionProperties/Task2.kt
package extensionPropertiesExercise2
import atomictest.eq

val <T> List<T>.reversed: List<T>
    get() {
        val reversedList = mutableListOf<T>()
        for (it in size-1 downTo 0) {
            reversedList.add(this[it])
        }
        return reversedList
    }

fun main() {

  val list = listOf<Int>()
  list.reversed eq listOf(3, 2, 1)

}
// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder (
    private val maximum: Int
) {
    private val objects = mutableListOf<Any>()

    val size: Int
        get() = objects.size

    val full: Boolean
        get() = maximum == objects.size

    fun add(obj: Any) {
        if(!full) objects += obj
        else throw IllegalStateException("The container is full")
    }
}

fun main() {

  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"

}
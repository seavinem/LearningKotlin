// LocalFunctions/Task3.kt
package localFunctionsExercise3
import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var container: Int? = null

    fun add(value: Int) {
        container = value
    }

    fun remove(): Int? {
        val x = container
        container = null
        return x
    }

    return Pair(::add, ::remove)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}
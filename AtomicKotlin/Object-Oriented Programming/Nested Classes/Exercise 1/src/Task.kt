// NestedClasses/NestedEx1.kt
package nestedClassesExercise1
import atomictest.*
import nestedClassesExercise1.Game.Mark.*
import java.lang.IllegalStateException
import kotlin.random.Random

interface Game {
    enum class Mark { Blank, X, Y, Z}
}

class FillIt(
    val side: Int = 3, randomSeed: Int = 0
): Game {
    val rand = Random(randomSeed)
    private val grid =
        MutableList(side * side) { Blank }
    private var player = X

    fun turn(): Boolean {
        val blanks = grid.withIndex()
            .filter { it.value == Blank }
        if(blanks.isNotEmpty()) {
            grid[blanks.random(rand).index] = player
            player = when(player) {
                X -> Y
                Y -> Z
                Z -> X
                Blank -> throw IllegalStateException()
            }
        }
        return blanks.isEmpty()
    }
    fun play() {
        while(turn());

    }
    override fun toString() =
        grid.chunked(side).joinToString("\n")
}

fun main() {
    val game = FillIt(8, 17)
    game.play()
}
package Algorythmes

import javax.swing.text.html.HTML.Tag.S
import kotlin.math.max
import kotlin.math.min


//fun main() {
//    val sizes = readln().split(' ').map { it.toInt() }
//    val rowNum = sizes[0]; val colNum = sizes[1]
//    var field = Array(rowNum) { LongArray(colNum) }
//
//    for ( i in 0 until rowNum ) {
//        val colField = readln().split(' ').map { it.toLong() }.toLongArray()
//        field[i] = colField
//    }
//
//    for (i in 0 until rowNum) {
//        for (j in 0 until colNum)
//            print("${field[i][j]} ")
//        println()
//    }
//
//}


fun main() {
    val sizes = readln().split(' ').map { it.toInt() }
    val rowNum = sizes[0]; val colNum = sizes[1]
    var square = Array(2) { IntArray(colNum) }
    var field = Array(rowNum) { IntArray(colNum) }
    var Max = 0

    for (i in 0..1) {
        for (j in 0 until colNum) {
            square[i][j] = 0
        }
    }

    for ( i in 0 until rowNum ) {
        val colField = readln().split(' ').map { it.toInt() }.toIntArray()
        field[i] = colField
    }

    for (i in 0 until rowNum) {
        for (j in 0 until colNum) {

            var value = field[i][j]
            if (value != 0) {
                if (j != 0) {
                    value = (1 + min(
                        square[1][j - 1].toDouble(),
                        min(
                            square[0][j - 1].toDouble(),
                            square[1][j].toDouble())))
                        .toInt()
                }
            }

            square[0][j] = square[1][j]
            square[1][j] = value

            Max = max(Max.toDouble(), value.toDouble()).toInt()
        }
    }

    println(Max)
}
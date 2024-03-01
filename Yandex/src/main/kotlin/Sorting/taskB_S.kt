package Sorting

import java.util.*
fun partition(array:MutableList<Long>, lower:Int, greater:Int): Int {
    var (l, g) = arrayOf(lower, greater)
    val x:Long = array[(l + g) / 2]
    var i = l

    while (i <= g)  {
        if (array[i] < x) {
            Collections.swap(array, i, l)
            l++; i++
        }
        else if (array[i] > x) {
            Collections.swap(array, i, g)
            g--
        }
        else {
            i++
        }
    }
    return l
}
fun quickSort(array:MutableList<Long>, l:Int, g:Int) {
    if(l < g) {
        val x = partition(array, l, g)
        quickSort(array, l, x - 1)
        quickSort(array, x + 1, g)
    }
}

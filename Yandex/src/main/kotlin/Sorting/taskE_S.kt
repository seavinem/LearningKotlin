package Sorting

fun main() {
    val n = readln().toInt()
    var nums: MutableList<String> = mutableListOf()
    for (i in 1..n)
        nums += readln()
    println ("Initial array:\n${nums.joinToString (", " )}")

    var buckets = MutableList (10) { mutableListOf<String>() }

    for (i in 1..nums[0].length) {
        for (num in nums) buckets[num[num.length - i].digitToInt()] += num
        nums = mutableListOf()
        buckets.forEach { nums += it }

        println("**********\nPhase $i")
        for (row in 0..9) {
            if (buckets[row].isEmpty())
                println("Bucket $row: empty")
            else
                println("Bucket $row: ${buckets[row].joinToString(", ")}")
        }

        buckets = MutableList (10) { mutableListOf() }
    }
    println("**********\nSorted array:\n${nums.joinToString(", ")}")
}
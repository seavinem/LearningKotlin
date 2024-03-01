package Algorythmes

fun main() {
    val n = readln().toInt()
    val people = readln().split(' ').map { it.toInt() }
    var sumLeft = 0; var sumRight = people.sumOf { it }
    val votes = mutableListOf<Int>()

    for( i in 0..< n ) {
        sumRight -= people[i]
        votes.add(people[i] * i - sumLeft + sumRight - people[i] * (n - 1 - i))
        sumLeft += people[i]
    }

    println(votes.joinToString(" "))
}
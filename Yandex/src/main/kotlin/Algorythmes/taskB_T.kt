package Algorythmes

fun gcd (x: Int, y: Int): Int {
    return if (y == 0)
        x
    else
        gcd(y, x % y)
}
fun lcm (x: Int, y: Int): Int {
    return if (x > y)
        Math.abs(x * y) / gcd(x, y)
    else
        Math.abs(x * y) / gcd(y, x)
}
fun main() {
    val nums = readln().split(' ')
    var a = nums[0].toInt(); val b = nums[1].toInt()
    var c = nums[2].toInt(); val d = nums[3].toInt()

    a *= lcm(b, d) / b
    c *= lcm(b, d) / d
    val m = c + a
    val k = gcd(m, lcm(b, d))
    val result1 = m / k
    val result2 = lcm(b, d) / k
    println("$result1 $result2")
}
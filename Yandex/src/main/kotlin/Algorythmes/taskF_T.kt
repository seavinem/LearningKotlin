import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val lift = ArrayList<Long>()
    val lift_size: Long
    val n: Long
    var temp: Long
    var res: Long = 0
    var current: Long
    lift_size = scanner.nextLong()
    n = scanner.nextLong()
    lift.add(0L)
    for (i in 0 until n) {
        temp = scanner.nextLong()
        lift.add(temp)
    }
    var i = (lift.size - 1).toLong()
    while (i > 0) {
        current = 0
        if (lift[i.toInt()] == 0L) {
            i--
            continue
        } else if (lift_size < lift[i.toInt()]) {
            res += 2 * i * (lift[i.toInt()] / lift_size)
            lift[i.toInt()] = lift[i.toInt()] % lift_size
            i++
        } else if (lift_size == lift[i.toInt()]) {
            res += 2 * i
            lift[i.toInt()] = 0L
        } else if (lift_size > lift[i.toInt()]) {
            current = lift[i.toInt()]
            lift[i.toInt()] = 0L
            res += i
            for (j in i downTo 1) {
                if (lift[j.toInt()] == 0L) {
                    res++
                    continue
                } else if (lift_size - current == lift[j.toInt()]) {
                    lift[j.toInt()] = 0L
                    res += j
                    i = j + 1
                    break
                } else if (lift_size - current < lift[j.toInt()]) {
                    lift[j.toInt()] = lift[j.toInt()] - (lift_size - current)
                    res += j
                    i = j + 1
                    break
                } else if (lift_size - current > lift[j.toInt()]) {
                    current += lift[j.toInt()]
                    lift[j.toInt()] = 0L
                    res++
                }
            }
        }
        i--
    }
    println(res)
}
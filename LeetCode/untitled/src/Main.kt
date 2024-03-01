
fun runningSum(nums: IntArray): IntArray {
    for(i in 1..<nums.size)
        nums[i] += nums[i-1]
    return nums
}

fun maximumWealth(accounts: Array<IntArray>): Int {
    val sums = mutableListOf<Int>()
    for (i in accounts) {
        sums += i.sum()
    }
    return sums.max()
}

fun main() {

}
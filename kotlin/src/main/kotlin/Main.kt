//fun expressionsMatter(a: Int, b: Int, c: Int): Int
//{ поиск наибольшей комбинации с () * +
//    var max:Int
//    var results = emptyArray<Int>()
//
//    results += a+b+c
//    results += a*b*c
//    results += a+b*c
//    results += (a+b)*c
//    results += a*b+c
//    results += a*(b+c)
//
//    max = results[0]
//
//    results.forEach { if(max < it) max = it }
//    return max
//
//    return max(listOf(a * b * c, a * (b + c), a + b * c, (a + b) * c, a + b + c))
//
//  return maxOf(a + b + c, a * (b + c), (a + b) * c, a * b * c)
//}

//fun rowSumOddNumbers(n: Int): Int { Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
//
//1 -->  1
//2 --> 3 + 5 = 8
//
//    var sum = 0
//    for (i in 1.n + (n-1) step 2)
//    {
//        sum += i + n*(n-1)
//    }
//    return sum
//}

//fun invert(arr: IntArray): IntArray
//{
//    var arr1 = IntArray(arr.size) {0}
//    arr.forEach{ arr1[it] = -arr[it] }
//    return arr1
//}

//import kotlin.math.*
//import java.util.Scanner
//
//fun solution(a:Float, b:Float,  c:Float): String
//{
//    val x1:Float; val x2:Float
//
//    return when(a)
//    {
//        0f -> when(b) {
//            0f -> "x is any"
//            else -> "x1 = x2 = ${floor((-c/b)*1000)/1000}"
//        }
//        else -> {
//            val d:Float = b*b - 4*a*c
//            when
//            {
//                d > 0 -> "x1 = ${floor(((-b + sqrt(d))/(2*a))*1000)/1000}\tx2 = ${floor(((-b - sqrt(d))/(2*a))*1000)/1000}"
//                d == 0f -> "x1 = x2 = ${floor((-b/(2*a))*1000)/1000}"
//                d < 0 -> "no solutions"
//                else -> ""
//            }
//        }
//    }
//}
//
//fun main()
//{
//    val reader = Scanner(System.`in`)
//
//    print("введите a, b, c\n a = ")
//    val a = reader.nextFloat()
//    print(" b = ")
//    val b = reader.nextFloat()
//    print(" c = ")
//    val c = reader.nextFloat()
//
//    println("\n${a.toInt()}*x^2 + ${b.toInt()}*x + ${c.toInt()} = 0")
//
//    val result = ::solution
//    println("result: ${result(a, b, c)}")
//}




//import kotlin.math.floor
//fun gps(s:Int, x:DoubleArray):Int {
//    return if (x.size < 2) 0
//    else {
//        var deltaDistance: Double
//        var hourlySpeed = emptyArray<Double>()
//        for ( index in 0..<(x.size-1)) {
//            deltaDistance = x[index + 1] - x[index]
//            hourlySpeed += (3600 * deltaDistance) / s
//        }
//        ((hourlySpeed.maxOrNull()?.let { floor(it) })?.toInt() ?: 0)
//    }
//}

//fun main() {
//    val s = 20
//    val x = doubleArrayOf(0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61)
//    println(gps(s, x))
//}

//fun isPalindrome(x: Int): Boolean = (x.toString() == x.toString().reversed())

//fun romanToInt1(s: String): Int {
//    val romanLetters = listOf('I', 'V', 'X', 'L', 'C', 'D', 'M')
//    val intLetters = listOf(1, 5, 10, 50, 100, 500, 1000)
//    var answer = 0
//    if (s.length == 1)
//        answer += intLetters[romanLetters.indexOf(s[0])]
//    else
//        for (i in 0 until s.length - 1){
//            val numNow = intLetters[romanLetters.indexOf(s[i])]
//            val numNext = intLetters[romanLetters.indexOf(s[i + 1])]
//
//            if(numNow < numNext)
//                answer -= numNow
//            else
//                answer += numNow
//
//            if(i == s.length - 2)
//                answer += numNext
//        }
//    return answer
//}

//fun romanToInt2(s: String): Int {
//    var ret = convert(s[s.length-1])
//    for(i in 0..s.length-2){
//        var num = convert(s[i])
//        val next = convert(s[i+1])
//        if(num<next){
//            num *= -1
//        }
//        ret+=num
//    }
//    return ret
//}
//fun convert(c:Char):Int{
//    return when(c){
//        'I' -> 1
//        'V' -> 5
//        'X' -> 10
//        'L' -> 50
//        'C' -> 100
//        'D' -> 500
//        'M' -> 1000
//        else -> 0
//    }
//}

//fun longestCommonPrefix(strs: Array<String>): String {
//    var prefix: String = strs[0]
//    var x:Int
//    strs.forEach {
//        word ->
//        run {
//            x = 0
//            while (x < word.length && x < prefix.length) {
//                if (prefix[x] != word[x])
//                    break
//                x++
//            }
//            prefix = prefix.removeRange(x, prefix.length)
//        }
//    }
//    return prefix
//}

//fun strStr(haystack: String, needle: String) = haystack.indexOf(needle)

//fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
//    var year = 0
//    var x:Int = pp0
//    while (x < p) {
//        x = (x + x * percent / 100 + aug).toInt()
//        year++
//    }
//    return year
//}

//fun containAllRots(strng:String, arr:ArrayList<String>):Boolean {
//    var answer = false
//    var word = strng
//
//    for (i in strng.indices) {
//        answer = word in arr
//        word = word.substring(1) + word[0]
//        if (!answer)
//            break
//    }
//    return answer
//}

//fun isTuringEquation(s: String): Boolean {
//    var a = s.substring(0, s.indexOf('+')).reversed().toLong()
//    var b = s.substring(s.indexOf('+') + 1, s.indexOf('=')).reversed().toLong()
//    var c = s.substring(s.indexOf('=') + 1, s.length).reversed().toLong()
//    return a + b == c
//}

//fun filterList(l: List<Any>): List<Int> {
////    var m = mutableListOf<Int>()
////    l.forEach { it -> if (it is Int) m.add(it)}
////    return m
//    return l.filterIsInstance<Int>()
//}

//fun geometricSequenceElements(a: Int, r: Int, n: Int): String {
//    var x = a
//    var answer = "$x"
//    for(i in 2..n) {
//        x *= r
//        answer += ", $x"
//    }
//    return answer
//}

//fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
////    if (a1.isEmpty() || a2.isEmpty())
////        return -1
////    else {
////        var a: Int = a1[0].length;
////        var b: Int = a1[0].length
////        var c: Int = a2[0].length;
////        var d: Int = a2[0].length
////        a1.forEach { it -> if (it.length > a) a = it.length else if (it.length < b) b = it.length }
////        a2.forEach { it -> if (it.length > c) c = it.length else if (it.length < d) d = it.length }
////        return maxOf(Math.abs(a - d), Math.abs(c - b))
////    }
//    if (a1.isEmpty() || a2.isEmpty())
//        return -1
//    else {
//        return maxOf(Math.abs(a1.maxBy { it.length }.length - a2.minBy { it.length }.length), Math.abs(a2.maxBy { it.length }.length - a1.minBy { it.length }.length))
//    }
//}

//import java.math.BigInteger
//import kotlin.math.pow
//fun easyLine(n:Int): BigInteger {
//    var sum = BigInteger ("0")
//
//    for (m in 0..n + 1){
//        sum += (factorial(n)/ (factorial(m) * factorial(n - m))).pow(2)
//    }
//    return sum
//}
//fun factorial(n: Int): BigInteger = if (n <= 1) BigInteger("1") else n.toBigInteger().times( factorial(n - 1))

//fun catchSignChange(arr: Array<Int>): Int {
//    var cnt:Int = 0
//    for(i in 1..<arr.size) {
//        if (arr[i] < 0 && arr[i - 1] > 0) cnt++
//        else if (arr[i] > 0 && arr[i - 1] < 0) cnt++
//    }
//    return cnt
//}


//двумерный массив
//fun multiplicationTable(size: Int): Unit {
//    var matrix = Array(size) { IntArray(size) }
//    for (i in 0 until size) {
//        for (j in 0 until size) {
//           matrix[i][j] = (i + 1) * (j + 1)
//        }
//    }
//
//    for (i in 0 until size) {
//        for (j in 0 until size) {
//            if (matrix[i][j] < 10)
//                print(" ${matrix[i][j]} ")
//            else
//                print("${matrix[i][j]} ")
//        }
//       println()
//    }
//}


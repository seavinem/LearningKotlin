// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
    var i = 0
    var x = 1

    while (i < s.length) {
        if (s[i] != ' ') {
            if (x++ % 5 == 0) {
              println(s[i])
            }
        }
        i++
    }
}

fun main() {
    everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/
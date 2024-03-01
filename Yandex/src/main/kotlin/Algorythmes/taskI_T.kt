package Algorythmes

//fun isValid(s: String): Boolean {
//    if (s == "") { return true }
//    val simplified = s.replace("()", "").replace("{}", "").replace("[]", "")
//    if (simplified == s) { return false }
//    return isValid(simplified)
//}
//
//fun main() {
//    val s = readln()
//    if (isValid(s)) println("yes") else println("no")
//}

fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()

    for (char in s)
        when (char) {
            '(', '{', '[' -> stack.add(char)
            ')' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '(')
                return false
            '}' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '{')
                return false
            ']' -> if (stack.isEmpty() || stack.removeAt(stack.size - 1) != '[')
                return false
        }
    return stack.isEmpty()
}
fun main() {
    val s = readln()
    if (isValid(s)) println("yes") else println("no")
}

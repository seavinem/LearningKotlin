fun main() {
    // NullPointerException (NPE)

    val nullString: String? = null
    val nonNullString: String = "text"

    println(nullString?.length)
    println(nonNullString.length)

    val nullLine: String? = readlnOrNull()

    val stringLength: Int = nullLine?.length ?: 0
    println(stringLength)
}
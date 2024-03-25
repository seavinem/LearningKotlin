
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

class Client(
    val name: String,
    val postalCode: Int
) {
    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
    override fun equals(other: Any?): Boolean {
        if(other == null || other!is Client) return false
        return name == other.name && postalCode == other.postalCode
    }
}

/*
fun main() {
    val processed = hashSetOf(Client("Alice", 342562))
    println(processed.contains(Client("Alice", 342562)))
}*/

data class Student (
    val fullName:String,
    val grade:Double,
    val id:Int
)

val students = listOf(
    Student(id=223, fullName="Josh", grade=140.0),
    Student(id=548, fullName="Mark", grade=120.0),
    Student(id=342, fullName="Natali", grade=150.0),
    Student(id=781, fullName="Sara", grade=130.0),
)

fun getStudentByID(id: Int): Student {
    return students.find{ it.id == id }!!
}
fun searchInStudents(name: String): Student? {
    return students.find{ it.fullName.lowercase() == name.lowercase() }
}


fun main() {

    println("Please, Enter the ID of the student")
    val id: Int = readln().toInt()

    val student1 = getStudentByID(id)
    println(student1)

    println("Please, Enter the NAME of the student")
    val name: String = readln()

    val student2 = searchInStudents(name)
    println(student2 ?: "The student is not found")
}

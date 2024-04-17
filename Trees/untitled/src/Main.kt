
fun main() {
    val container = TreeContainer()

    container.loadFromFile("src/trees.txt")

    println("---------- Information about trees in Container ----------\n\n")
    container.showTrees()

    println("\n---------- Information about types of trees in Container ----------\n\n")
    container.countTreesByType()
    container.countTreesByClassType()

    println("\n---------- Sorted information about trees in Container ----------\n\n")
    container.printSorted()
}
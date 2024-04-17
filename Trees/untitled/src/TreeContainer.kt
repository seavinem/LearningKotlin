import java.io.File

class TreeContainer {
    private val trees = mutableListOf<Tree>()

    fun showTrees() {
        println(trees.joinToString("\n"))
    }

    fun countTreesByType() {
        var deciduousCounter = 0
        var coniferousCounter = 0

        trees.forEach {
            if(it.type == TreeType.DECIDUOUS) deciduousCounter++
            else coniferousCounter++
        }

        println("Number of deciduous trees: $deciduousCounter")
        println("Number of coniferous trees: $coniferousCounter")
    }

    fun countTreesByClassType() {
        var forestCounter = 0
        var fruitCounter = 0

        trees.forEach {
            if(it::class.simpleName == "ForestTree") forestCounter++
            else fruitCounter++
        }

        println("Number of forest trees: $forestCounter")
        println("Number of fruit trees: $fruitCounter")
    }

    fun printSorted() {
        val sorted = trees.sortedWith(compareBy ({ it.name }, { -it.age }))
        println(sorted.joinToString("\n"))
    }

    fun loadFromFile(fileName: String) {

        val lines: List<String> = File(fileName).readLines()
        lines.forEach { line ->
            val parameters = line.split(" ")

            require(parameters.size in 5..6) { "Invalid input" }

            val name: String = parameters[1]
            val age: Int = parameters[2].toInt()
            val type: TreeType = if(parameters[3] == "Хвойное") TreeType.DECIDUOUS
                                else TreeType.CONIFEROUS

            if(parameters[0] == "Лесное") {
                val woodAmount: Int = parameters[4].toInt()
                trees.add(ForestTree(name, age, type, woodAmount))
            }
            else if(parameters[0] == "Плодовое") {
                val cropWeight: Int = parameters[4].toInt()
                val storageDuration: Int = parameters[5].toInt()
                trees.add(FruitTree(name, age, type, cropWeight, storageDuration))
            }
        }

    }
}

enum class TreeType {
    DECIDUOUS,
    CONIFEROUS
}
abstract class Tree(
    open val name: String,
    open val age: Int,
    open val type: TreeType
) {
    override fun toString(): String {
        return "Name: $name\n" +
                "Age: $age\n" +
                "Type: $type\n"
    }
}

class ForestTree(
    override val name: String,
    override val age: Int,
    override val type: TreeType,
    private val woodAmount: Int
) : Tree(name, age, type) {
    override fun toString(): String {
        return "Forest Tree ----\n" +
                super.toString() +
                "Amount of wood: $woodAmount\n"
    }
}

class FruitTree(
    override val name: String,
    override val age: Int,
    override val type: TreeType,
    private val cropWeight: Int,
    private val storageDuration: Int
) : Tree(name, age, type) {
    override fun toString(): String {
        return "Fruit Tree ----\n" +
                super.toString() +
                "Weight of crop: $cropWeight\n" +
                "Average duration of storage: $storageDuration\n"
    }
}
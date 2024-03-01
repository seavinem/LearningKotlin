package OOP_LessonDIsh

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "омлет",
        category = "breakfast",
        ingredients = listOf("яйцо", "специи")
    )

    val dish2: Dish = Dish(
        id = 1,
        name = "лапша",
        category = "обед",
        ingredients = listOf("макароны", "вода")
    )

    val ingredient1 = Ingredient("яйцо", 0.01F, 1)
    val ingredient2 = Ingredient("морковь", 0.5F, 1, true)

    println(ingredient1.name)
    println(ingredient2.name)

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "из яиц"
//    dish2.inFavorites = true
//    println (dish1.category)

//    println("действие для блюда омлет")
//    dish1.addToFavorites()
//    println(dish1.inFavorites)
//    dish1.startCooking()
//
//    println()
//
//    println("действие для блюда лапша")
//    dish2.addToFavorites()
//    println(dish2.inFavorites)
//    val ingredientsForSoup = dish2.downloadIngredients().joinToString()
//    println(ingredientsForSoup)
//    dish2.removeFromFavorites()
//    println(dish2.inFavorites)
}

package OOP_LessonDIsh

class Dish(
    private val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false
) {
    fun addToFavorites() {
        println("блюдо $name добавлено в избранное")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("блюдо $name удалено из избранных")
        inFavorites = true
    }

    fun startCooking() {
        println("начало приготовления блюда $name")
        inFavorites = true
    }

    fun downloadIngredients(): List<String> {
        return ingredients
    }
}
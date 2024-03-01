package OOP_LessonDIsh

class Ingredient(val name: String, val weight: Float, val count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Float,
        count: Int,
        isNeedToPrepare: Boolean
    ) : this(name, weight, count) {
        this.isNeedToPrepare = isNeedToPrepare
    }

    init {
        println("игредиент $name создан")
    }

    //1. вторичный конструктор
    //2. первичный конструктор
    //3. блоки инит
    //4. тело вторичного конструктора

}
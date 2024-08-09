
fun main() {
    println()
    val str = "Создайте scope – функцию let, которая будет вызываться у строки."

    str.let {
        println(it)
        println("длина строки: ${it.length} символа.")
    }
    println("--------------------------------------------------------------")
    val podolsk = City("Подольск").apply {
            population = 320000
        }
    podolsk.getInfo()
    println("--------------------------------------------------------------")
    val arr:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    with(arr) {
        println("Массив - ${this.contentToString()}")
        println("количество элементов массива - ${this.size}")
        println("сумму элементов массива - ${this.sum()}")
    }
}

data class City(var name: String = "", var population: Int = 0) {
    fun getInfo() {
        println("город «$name», население $population человек.")
    }
}

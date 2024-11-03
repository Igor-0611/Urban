
fun main() {
    println()
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    println(numbers)

    val even = numbers.drop(4).count() { it % 2 == 0 }
    println("Количество четных чисел списка, начиная с 5 элемента -> $even")

    val sumOfSeven = numbers.take(7).sum()
    println("Сумма первых 7 чисел списка = $sumOfSeven")

    println("---------------------------------------------------")
    val str = listOf("one", "two", "three")
    val chars = str.map { listOf(it.toCharArray().contentToString()) }
    println(chars.flatten())

    println("---------------------------------------------------")
    val stroke = listOf("Дан", "список", "строк", "Найти", "строку", "максимальной", "длины")
    println(stroke)
    println("Строка максимальной длины -> '${stroke.maxByOrNull {it.length}}'")

    println("---------------------------------------------------")
    val product = listOf(
        Product("болт", 37000),
        Product("винт", 41000),
        Product("гайка", 27000),
        Product("шайба",32000),
        Product("шуруп",29000),
    )

    val count = product.map { it.volume }
    val sum = count.fold(0) { a, b  -> a + b }
    println("Общее количество продуктов -> $sum")
}

class Product(val name: String, val volume: Int) {
}
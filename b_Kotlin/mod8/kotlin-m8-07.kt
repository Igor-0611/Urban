
fun main() {

    println("--------------------------------")
    val number = listOf(-5, 3, 12, 4, 25 ,6, -8, 8, 9, 10)
    val sum = number.sumOf { if (it in 3..9) it else 0 }
    println(number)
    println("Сумма элементов от 3 до 9 = $sum")

    println("--------------------------------")
    val numbers = listOf(1, 2, 3, 4)
    val fold = numbers.fold("") { a, b  -> "$a$b" }
    println(numbers)
    println("Элементы списка строкой -> $fold")

    println("--------------------------------")
    val player = listOf(
        Player("Иванов", 37,37000),
        Player("Антонов",41,41000),
        Player("Захаров", 27,27000),
        Player("Петров",32,32000),
        Player("Елисеев",29,29000),
    )

    val sumOfScore = player.sumOf { it.score }
    val sumOfGain = player.sumOf { it.gain }
    println("Общее количество очков: $sumOfScore")
    println("Общее количество выигранных денег: $sumOfGain")

    println("--------------------------------")
    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    println(fruits)
    val result = fruits.groupBy({it.first().lowercaseChar()}) {if (it.length % 2 == 0) it else ""}
    println(result)
}

class Player(val name: String, val score: Int, val gain: Int) {
}
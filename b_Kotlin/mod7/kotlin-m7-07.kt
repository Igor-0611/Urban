
fun main() {
    val mapOfStuff = mapOf(
        1 to "Иванов",
        2 to "Иванова",
        3 to "Петров",
        4 to "Петрова",
        5 to "Гаврилов",
        6 to "Сидоров",
        7 to "Сидорова",
        8 to "Гаврилова"
    )

    val filterMap1 = mapOfStuff.filterKeys { it < 5 }
    println(filterMap1)
    val filterMap2 = mapOfStuff.filterValues { it.last() == 'а' }
    println(filterMap2)
    val filterMap3 = mapOfStuff.filterValues { it.first() == 'Г' }
    println(filterMap3)

    val prizeMap = mapOf(
        5 to 25,
        10 to 25,
        15 to 20,
        20 to 20,
        25 to 25,
        30 to 20,
        35 to 25,
        40 to 25
    )

    val filterMap = prizeMap.filter { (key, value) -> key.toString().last() == '5' && value > 20 }
    println(filterMap)

}


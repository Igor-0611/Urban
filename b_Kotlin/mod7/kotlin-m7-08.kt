
fun main() {
    println()
    val listOfWord = listOf("Дан", "список", "слов", "в", "произвольном", "порядке", "по", "алфавиту",
                      "Необходимо", "сгруппировать", "элементы", "по", "первому", "символу")

    println(listOfWord.groupBy { it.first() })
    println()
    println(listOfWord.groupBy { it.length })
    println()

    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )

    val phoneGroup = phoneToYear.groupBy { it.second }
    for (year in phoneGroup) {
        println(year.key)
        for (name in year.value) {
            println(name.first)
        }
    }
}
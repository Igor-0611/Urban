
fun main() {
    println()
    val name = "Kotlin"
    val year = 2025

    val greetNY = fun(a: String, b: Int): String {
        val str = "Дорогой $a!\nПоздравляю с Новым $b годом!\n" +
            "Пусть новый год принесёт много радостных и счастливых дней!\n" +
            "Желаю, чтобы в новом году исполнились все ваши мечты и желания!\n"
        return str
    }

    println(greetNY(name, year))
    println("-----------------------------------------------------------------")

    val arrNum: Array<Int> = arrayOf(12, 23, 35, 42, 53, 68, 75, 82, 97, 106, 113, 124)
    println(arrNum.contentToString())

    val isEven = fun(a: Int) = a % 2

    checkArrayElement(arrNum, isEven)
    println("-----------------------------------------------------------------")

    val strOne = "Дорогой товарищ!"
    val strTwo = "Поздравляю с Новым годом!"

    val strUnit = fun(a: String, b: String): String {
        val str = "$a $b"
        return str
    }

    println(strUnit(strOne, strTwo))
}

fun checkArrayElement(arr: Array<Int>, op: (Int) -> Int) {
    print("четные числа массива: ")
    for (i in 0 until arr.size) {
        if (op(arr[i]) == 0) print("${arr[i].toString()}; ")
    }
    println()
}




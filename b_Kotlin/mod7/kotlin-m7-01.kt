import kotlin.math.sqrt

fun main() {
    println()
    val num = 125
    println("Число $num в квадрате = ${num.getSquareOfInt()}")
    println("--------------------------------------")
    val str1 = "Написать функцию расширения"
    val str2 = "конкатенации строк."
    println(str1.getConcatOfString(str2))
    println("--------------------------------------")
    println("Последний индекс строки <$str1> #${str1.getLastIndexOfString()}")
    println("--------------------------------------")
    println("Квадратный корень числа $num = ${num.getSquareRootOfInt()}")
}

fun Int.getSquareOfInt(): Int {
    return this*this
}

fun String.getConcatOfString(str: String): String {
    return this+" "+str
}

fun String.getLastIndexOfString(): Int {
    return this.length-1
}

fun Int.getSquareRootOfInt(): Double {
    return sqrt(this.toDouble())
}
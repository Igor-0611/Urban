
fun main() {
    println()
    println("Перевод числа из десятичной системы в двоичную систему счисления:")
    val dec = 525
    var num = dec
    var bin = ""

    do {
        bin = (num%2).toString() + bin
        num = num/2
    } while (num != 0)

    println("$dec --> $bin")
    println("---------------------------------------------------------------")
    println("Перевод числа из двоичной системы в десятичную систему счисления:")
    var sum = 0.0
    var pwr = bin.length.toDouble()

    for (i in 0 until bin.length) {
        pwr--
        sum += (bin[i].digitToInt() * Math.pow(2.0, pwr))
    }

    println("$bin --> ${sum.toInt()}")
    println("---------------------------------------------------------------")
    println("Проверка, является ли слово палиндромом:")
    val word = "Молебеноконебелом"
    //val word = "Молебеноканебелом"
    val reword = word.reversed().toString()

    if (word.equals(reword, ignoreCase = true)) println("<$word> - палиндром.")
    else println("<$word> - не палиндром.")
}
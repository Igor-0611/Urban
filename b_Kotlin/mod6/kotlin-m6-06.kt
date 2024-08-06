
fun main() {
    println()
    var book: String? = "Уильям Гибсон «Нейромант»"
    prtOfBook(book)
    book = null
    prtOfBook(book)
    println("--------------------------------------")
    val dible = 324
    val arrdiv = arrayOf(2, 3, 4, 5, 6, 8, 9)

    println("Число $dible может быть разделено без остатка")
    arrdiv.forEachIndexed { i, elm -> println("на $elm - " + (DivideIfWhole(dible, elm) ?: 0) + " раз") }
    println("--------------------------------------")
    val array: Array<String?> = arrayOf("Привет", "как", null, "дела")
    val arrnew = array.filter { it != null }
    println(arrnew)
}

fun prtOfBook(book: String?) {
    if (book == null) println("«У меня нет любимой книги»")
    else println(book)
}

fun DivideIfWhole(dible: Int, dider: Int): Int? {
    var tmp = dible
    var cnt = 0

    do {
        if (tmp % dider == 0) cnt++
        tmp /= dider
    } while (tmp >= dider)

    return if (cnt > 0) cnt
    else null
}
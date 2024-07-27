fun main() {
    println()
    println(action("синий", "красный", ::mix))
    println(action("красный", "синий", ::mix))
    println(action("желтый", "голубой", ::mix))
    println(action("красный", "зеленый", ::mix))
}

fun mix(col1: String, col2: String): String {
    var colMix = ""
    var c1 = 0
    var c2 = 0
    var cm = -1
    val arrCol: Array<String> = arrayOf("красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый")

    for (i in 0 until arrCol.size) {
        if (arrCol[i].equals(col1)) c1 = i
        if (arrCol[i].equals(col2)) c2 = i
    }

    if ((c1 == 0 && c2 == 2) || (c1 == 2 && c2 == 0)) cm = 1
    else if ((c1 == 1 && c2 == 3) || (c1 == 3 && c2 == 1)) cm = 2
    else if ((c1 == 2 && c2 == 4) || (c1 == 4 && c2 == 2)) cm = 3
    else if ((c1 == 3 && c2 == 5) || (c1 == 5 && c2 == 3)) cm = 4
    else if ((c1 == 4 && c2 == 6) || (c1 == 6 && c2 == 4)) cm = 5
    else if ((c1 == 5 && c2 == 0) || (c1 == 0 && c2 == 5)) cm = 6
    else if ((c1 == 6 && c2 == 1) || (c1 == 1 && c2 == 1)) cm = 0

    if (cm < 0) colMix = "Неопределённый цвет."
    else colMix = arrCol[cm].toString()

    return colMix
}

fun action(aC: String, bC: String, abc: (String, String) -> String):  String {
    return abc(aC, bC)
}


fun main() {

    var x = 12
    if (x > 0) x++
    println(x)

    val a = 4
    val b = 45
    val c = -2
    val d = 8
    var count = 0
    if (a > 0) count++
    if (b > 0) count++
    if (c > 0) count++
    if (d > 0) count++
    println(count)

    val a1 = 12
    val a2 = 12
    if (a1 == a2) println("$a1 = $a2")
    else if (a1 > a2) println(a1)
    else println(a2)

    val iDay = 7
    if (iDay > 7) println("$iDay - Недопустимый индекс")
    else if (iDay == 1) println("$iDay - понедельник")
    else if (iDay == 2) println("$iDay - вторник")
    else if (iDay == 3) println("$iDay - среда")
    else if (iDay == 4) println("$iDay - четверг")
    else if (iDay == 5) println("$iDay - пятница")
    else if (iDay == 6) println("$iDay - суббота")
    else println("$iDay - воскресенье")

    val K = 0
    if (K < 1 || K > 5 ) println("$K - Ошибка оценки")
    else if (K == 1) println("$K - плохо")
    else if (K == 2) println("$K - неудовлетворительно")
    else if (K == 3) println("$K - удовлетворительно")
    else if (K == 4) println("$K- хорошо")
    else println("$K - отлично")

    val d1 = 127.14
    val d2 = 348.76
    var result = 0.0
    for (i in 1..4) {
        if (i == 1) {
            result = d1 + d2
            println("$d1 + $d2 = $result")
        }
        else if (i == 2) {
            result = d1 - d2
            println("$d1 - $d2 = $result")
        }
        else if (i == 3) {
            result = d1 * d2
            println("$d1 * $d2 = $result")
        }
        else if (i == 4) {
            result = d1 / d2
            println("$d1 / $d2 = $result")
        }
    }
}
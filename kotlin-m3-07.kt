
fun main() {
    println()
    val n = 1324
    var sumQ = 0.00
    val div = 1.toDouble()

    for (i in 1..n) sumQ += div/i
    println("Сумма частных sumQ = $sumQ")
    //-------------------------------------------------------------
    println()
    val a = 5
    val b = 105
    var sumS = 0

    for (i in a..b) sumS += i*i
    println("Сумма квадратов sumS = $sumS")
    //-------------------------------------------------------------
    println()
    val A = 5
    val B = 10
    var rep = 1

    print(A)
    for (i in (A+1)..B) {
        rep++
        repeat (rep) {
            print(", $i")
        }
    }
    println()
    //-------------------------------------------------------------
    println()
    val num = 2999
    val mid = num/2
    var sml = true

    for (i in 2.. mid) {
        if (num % i == 0) {
            sml = false
            println("$num - это составное число.")
            break
        }
    }
    if (sml) println("$num - это простое число")
    //-------------------------------------------------------------
    println()
    val sCorrect = "Троллейбус"
    val sConfirm = "Правильно!"
    val sCapitul = "Сдаюсь"
    val sExplain = "Правильный ответ: троллейбус."
    val sThink = "Подумай еще."
    var sAnswer = ""
    var count = 3

    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    println("У вас $count попыток.")
    println("Напишите ответ или '$sCapitul', если лень думать:")

    for (i in count downTo 1) {
        sAnswer = readln()
        if (sCorrect.equals(sAnswer, true)) {
            println(sConfirm)
            break
        } else if (sCapitul.equals(sAnswer, true)) {
            println(sExplain)
            break
        } else {
            if (i > 1 ) {
                count--
                println(sThink + " Осталось $count попыток. Или $sCapitul?")
            } else {
                println(sExplain)
                println("Вы проиграли.")
            }
        }
    }

}
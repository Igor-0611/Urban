import kotlin.math.round
import java.math.BigInteger

fun main() {
    println()
    var inpute = 0

    do {
        print("Введите целое число больше 1: ")
        inpute = readln().toInt()
    } while (inpute < 2)

    var factor: BigInteger = 1.toBigInteger()
    (2..inpute).map {
        factor *= it.toBigInteger()
    }
    println("Факториал числа $inpute = $factor")
    //------------------------------------------------------------
    println()
    val price = 724.53
    var weight = 0
    var cost = 0.00

    println("Конфеты 'Мишка на севере':")
    while (weight++ < 10) {
        cost = weight * price
        println("$weight кг стоит " + (round(cost * 100)/100))
    }
    //------------------------------------------------------------
    println()
    var A = 5
    val B = 17
    var N = 1

    println("Дано A = $A, B = $B. Вывод диапазона:")
    print(A)
    while (A++ < B) {
        print(", $A")
        N++
    }
    println("\nКоличество чисел N = " + N)
    //------------------------------------------------------------
    println()
    val num = 61565 // 125
    val div = 10261 // 12
    var rem = num % div
    var last = 0

    println("Остаток от $num/$div = .$rem")
    if (rem < 10) println("всего одна цифра $rem")
    else {
        println("вывод его цифр, начиная с самой правой")
        do {
            last = rem % 10
            print("$last, ")
            rem /= 10
        } while (rem > 9)
        println(rem)
    }
    //------------------------------------------------------------
    println()
    var mpl = 0

    for (i in 1..20) {
        if (i == 19) break
        if (i % 2 == 0) {
            if (i % 4 == 0) {
                mpl = i * 2
                print("$mpl, ")
            } else print("$i, ")
        }
    }
    println()
    //-------------------------------------------------------------
    println()
    val rest = 7.00
    val term = 9
    val depo = 350.00
    var dfin = 0.00

    dfin = depo
    for (i in 1..term) dfin = dfin + (dfin * rest/100)
    println("Вклад $depo на $term месяцев под $rest%/м даст " + (round(dfin * 100)/100))
}
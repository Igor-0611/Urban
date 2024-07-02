import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    println()
    val a = 317.46
    val b = 940.15
    println("Дано $a и $b")
    println("среднее арифметическое = " + ((a+b)/2))
    //-------------------------------------------------------------
    println()
    val S = 320.35
    var D:Double
    var L:Double

    D = sqrt((4 * S)/3.14)
    L = 3.14 * D
    println("Дана площадь круга S = $S кв.см")
    println("диаметр D = " + (round(D*100)/100) + " см, длина окружности L = " + (round(L*100)/100) + " см")
    //-------------------------------------------------------------
    println()
    var num1 = 1
    print(num1)
    repeat(9) {
        num1 *= 2
        print(", $num1")
    }
    println()
    //-------------------------------------------------------------
    println()
    var num2 = 20
    print(num2)
    for (i in (num2-2) downTo 2 step 2) print(", $i")
    println()
}
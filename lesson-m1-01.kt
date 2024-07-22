import kotlin.math.pow

fun main() {

    var act : Int
    var able = false

    println("Доступныые действия:")
    println("1 - возведение произвольного числа в степень;")
    println("2 - произведение диапазона целых чисел;")
    println("3 - поиск наибольшего общего делителя двух целых чисел;")

    do {
        print("Введите номер операции - ")
        act = readln().toInt()
        if (act<1 || act>3) println("Неверный номер операции!!!")
        else able = true
    } while (!able)

     when (act) {
         1 -> degreeOfNumber()
         else -> {
             print("введите 1-ое число - ")
             var num1 = readln().toInt()
             print("введите 2-ое число - ")
             var num2 = readln().toInt()
             if (num1 > num2) {
                 var temp = num1
                 num1 = num2
                 num2 = temp
             }
             if (act == 2) multipliOfNumbers(num1, num2)
             else maxDividerOfNumbers(num1, num2)
         }
     }
}

private fun degreeOfNumber() {
    print("введите число - ")
    val num = readln().toDouble()
    print("введите степень - ")
    val deg = readln().toInt()
    val result = num.pow(deg)
    println("$num в степени $deg = $result")
}

private fun multipliOfNumbers(n1:Int, n2:Int) {
    var result = 1
    for (i in n1..n2) result *= i
    println("Произведение чисел в интервале от $n1 до $n2 = $result")
}

private fun maxDividerOfNumbers(n1:Int, n2:Int) {
    var result = 1
    for (i in n1 downTo 1) {
        if (n1%i==0 && n2%i==0) {
            result = i
            break
        }
    }
    println("Наибольший общий делитель чисел $n1 и $n2 = $result")
}


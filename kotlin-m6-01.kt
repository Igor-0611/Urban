
fun main() {
    println()
    val count = 5
    val str = "Я повторяюсь."
    val prt = { s: String -> print(s + "\n") }

    cycleOfPrt(count, str, prt)
    println("----------------------------------------------------------")
    val arrNum: Array<Double> = arrayOf(12.25, 23.17, 35.06, 42.12, 53.74, 68.12, 75.24)
    val arage = { arr: Array<Double> ->
        var sum = 0.00
        for (i in 0 until arr.size) {
            sum += arr[i]
        }
        val result = sum/arr.size
        println("среднее арифметическое массива = $result")
    }
    println(arrNum.contentToString())
    arage(arrNum)
    println("----------------------------------------------------------")
    val arrMix :Array<Double> = arrayOf(12.25, -23.17, 35.06, -42.12, 53.74, -68.12, 75.24, -85.19)
    val arrPos = arrMix.filter { it > 0 }
    println(arrMix.contentToString())
    println(arrPos)
    println("----------------------------------------------------------")
    val arrInt: Array<Int> = arrayOf(12, 23, 35, 42, 53, 68, 75, 82, 97, 106, 113, 124)
    val arrNew = { arr: Array<Int> ->
        for (i in 0 until arr.size) {
            if (arr[i]%2 == 0) arr[i] = arr[i] / 2
            else arr[i] = arr[i] * 3
        }
        arrInt
    }

    println(arrInt.contentToString())
    println(arrNew(arrInt).contentToString())
}

fun cycleOfPrt(cnt: Int, txt: String, act: (String) -> Unit) {
    for (i in 1..cnt) act(txt)
}



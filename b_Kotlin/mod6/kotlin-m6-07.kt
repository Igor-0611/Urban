
fun main() {
    println()
    val strNum = "12.3"
    var numInt: Int? = null
    var numBin: String? = null
    val numDob = strNum.toDoubleOrNull()

    if (numDob != null) numInt = numDob.toInt()
    if (numInt != null) numBin = Integer.toBinaryString(numInt)

    println("$strNum -> $numInt -> $numDob -> $numBin")
    println("------------------------------------")
    val str = "«Это строка»"
    val num = 15
    val dbl = 15.15
    val chr = 'C'

    checkOfType(str)
    checkOfType(num)
    checkOfType(dbl)
    checkOfType(chr)
    println("------------------------------------")
    val arr:Array<Int> = arrayOf(2, 3, 4, 5, 6)

    changeOfValue(num)
    changeOfValue(str)
    changeOfValue(arr)
    changeOfValue(dbl)
}

fun checkOfType(value: Any) {
    when (value) {
        is String -> println(value)
        is Int -> println("Это целое числом.")
        is Double -> println("Это числом с плавающей точкой.")
        is Char -> println("Это символ.")
    }
}

fun changeOfValue(value: Any){
    return when (value) {
        is Int -> println(value + 1)
        is String -> println(value.length + 1)
        is Array<*> -> {
            var sum = 0
            for (i in 0..<value.size) {
                if (value[i] is Int) sum += value[i] as Int
            }
            println(sum)
        }
        else -> println("С таким типом не работат.")
    }
}
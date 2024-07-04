
fun main() {
    println()
    var multiply = 1.00
    val doubleArray = arrayOf<Double>(3.12, 4.47, 5.28, 6.13, 7.21, 8.92, 9.46, 10.19, 11.73, 12.52)
    println(doubleArray.contentToString())

    for (i in 0 until doubleArray.size) multiply *= doubleArray[i]
    println("Произведение элементов массива = " + String.format("%.8f", multiply))
    //-------------------------------------------------------------
    println()
    var sum = 0.00f
    val iArr = intArrayOf(14, 28, 71, 142, 165, 213, 274, 376)
    println(iArr.contentToString())

    for (i in 0 until iArr.size) sum += iArr[i]
    println("Среднее арифметическое элементов массива = " + sum/iArr.size)
    //-------------------------------------------------------------
    println()
    val size = 77
    var count = 0
    var sInt = 0


    val sArr = Array(size) {it}

    for (i in 1 until size) {
        sInt = sArr[i].toInt()
        if (sInt % 2 == 0) {
            print("$sInt, ")
            count++
        }
    }
    println("\nКоличество чётных чисел = $count")
    //-------------------------------------------------------------
    println()
    val N = 20
    val nArr = Array(N) {0}

    for (i in 0 until N) nArr[i] = Math.pow(2.toDouble(), (i+1).toDouble()).toInt()
    println(nArr.contentToString())
}



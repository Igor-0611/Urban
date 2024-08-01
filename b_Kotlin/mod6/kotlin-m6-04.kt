import kotlin.math.round

fun main() {
    println()
    val arrNum: Array<Number> = arrayOf(13.17, 19.04, 26, 32.54, 35.14, 41, 48, 52, 59.65, 65)

    println(arrNum.contentToString())
    println("Среднее значение массива чисел = ${round(States<Number>().getAverage(arrNum) * 1000) / 1000}")
    println("----------------------------------------------------------")
    val a = 48
    val b = 37
    val arrInt: Array<Int> = arrayOf(13, 19, 26, 32, 35, 41, 48, 52, 59, 65)
    val arrDob: Array<Double> = arrayOf(13.17, 19.04, 26.00, 32.54, 35.14, 41.00, 48.00, 52.00, 59.65, 65.00)
    val arrStr: Array<String> = arrayOf("13", "19", "26", "32", "35", "41", "48", "52", "59", "65")

    println("$a член массива? - ${GenericMethod().isItIncluded(arrInt, a)}")
    println("${a.toDouble()} член массива? - ${GenericMethod().isItIncluded(arrDob, a.toDouble())}")
    println("'${a.toString()}' член массива? - ${GenericMethod().isItIncluded(arrStr, a.toString())}")
    println("$b член массива? - ${GenericMethod().isItIncluded(arrInt, b)}")
    println("${b.toDouble()} член массива? - ${GenericMethod().isItIncluded(arrDob, b.toDouble())}")
    println("'${b.toString()}' член массива? - ${GenericMethod().isItIncluded(arrStr, b.toString())}")


}

class States<T>() where T: Number {
    fun getAverage(arr: Array<T>): Double {
        var sum = 0.00
        for (i in 0 until arr.size) sum += arr[i].toDouble()
        return (sum / arr.size)
    }
}

class GenericMethod() {
    fun <T: Comparable<T>> isItIncluded(arr: Array<T>, data: T ): Boolean {
        return (data in arr)
    }
}
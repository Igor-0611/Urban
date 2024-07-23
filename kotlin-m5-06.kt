
fun main() {
    println()
    val num = 5
    println("Факториал числа $num = ${getFactorial(num)}")
    println("------------------------------------------------")
    val nun = 10
    val pow = 15
    println("$nun в степени $pow = ${getPower(nun, pow)}")
    println("------------------------------------------------")
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(arr.contentToString())
    for (i in 0 until arr.size) {
        if (i%2 == 0) arr[i] += 1
    }
    println(arr.contentToString())
}

fun getFactorial(n: Int): Int {
    return if (n <= 1) { 1 }
    else { n * getFactorial(n - 1) }
}

fun getPower(n: Int, p: Int): Long {
    return if (p < 1) { 1 }
    else { n * getPower(n, p - 1) }
}
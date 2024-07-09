
fun main() {

    val arrInt1 = intArrayOf(473, 521, 582, 617, 674, 213, 274, 376, 391, 425, 147, 284, 712, 142, 165)
    val arrInt2 = intArrayOf(473, -521, 582, -617, 674, -213, 274, -376, 391, -425, 147, -284, 712, -142, 165)
    val matrix = arrayOf(
        intArrayOf(861, 521, 582, 142, 165),
        intArrayOf(213, 712, 937, 391, 425),
        intArrayOf(473, 274, 376, 617, 674),
        intArrayOf(715, 356, 218, 514, 623)
    )

    println()
    println(arrInt1.contentToString())
    println("В массиве найдено " + minLocal(arrInt1) + " локальных минимума.")
    println()
    println("INPUT:  " + arrInt2.contentToString())
    println("OUTPUT: " + arrayChange(arrInt2).contentToString())
    //--------------------------------------------------------------
    println()
    val M = matrix.size
    val N = matrix[0].size
    var K = 0

    println("Дана матрица размера $M×$N")
    do {
        print("какую строку вывести? -> ")
        K = readln().toInt()
        if (K > M) println("Строк всего $M.")
        else println(matrix[K-1].contentToString())
    } while (K > M)
}

private fun minLocal(array: IntArray): Int {
    var cnt = 0
    for (i in 1 .. array.size-2) {
        if (array[i]<array[i-1] && array[i]<array[i+1]) cnt++
    }
    return cnt
}

private fun arrayChange(array: IntArray): IntArray {
    for (i in 0 until array.size) {
        if (array[i] < 0) array[i] += 1
    }
    return array
}



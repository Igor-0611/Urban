
fun main() {
    println()
    val matrixA = arrayOf(
        intArrayOf(17,32,14),
        intArrayOf(25,41,16),
        intArrayOf(73,94,11)
    )
    var xMin = matrixA[0][0]

    for (i in matrixA.indices) {
        for (j in matrixA.indices) {
            if (matrixA[i][j] < xMin) xMin = matrixA[i][j]
        }
    }

    println("Минимальный элемент массива xMin = $xMin")
    //-------------------------------------------------------------
    println()
    val matrixB = arrayOf(
        intArrayOf(861, 521, 582, 142, 165),
        intArrayOf(213, 712, 937, 391, 425),
        intArrayOf(473, 274, 376, 617, 674)
    )
    val arrOfMat = matrixB[0] +matrixB[1] + matrixB[2]
    arrOfMat.sort()
    println(arrOfMat.contentToString())
    val med = arrOfMat.size/2

    println("Медианой массива является элемент '" + arrOfMat[med] + "'")
    //-------------------------------------------------------------
    println()
    val matrixC: Array<Array<Int>> = Array(5) {Array(5) {0}}

    matrixC[2][2] = 1
    for (i in 1..3) matrixC[3][i] = 1
    for (i in 0..4) matrixC[4][i] = 1

    for (row in matrixC) {
        for (elt in row) print("$elt ")
        println()
    }
    //-------------------------------------------------------------
    println()
    val arrInt = intArrayOf(473, 521, 582, 617, 674, 213, 274, 376, 391, 425, 147, 284, 712, 142, 165)
    arrInt.sort()
    val idxMax2 = arrInt.size - 2
    println("Второе максимальное число набора = " + arrInt[idxMax2])
}
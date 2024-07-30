
fun main() {
    println()
    val a = 470
    val b = 25
    var atp = a
    var nod = b
    var tmp = 0

    do {
        tmp = atp % nod
        if (tmp > 0) {
            atp = nod
            nod = tmp
        }
    } while (tmp > 0)

    println("НОД($a,$b) = $nod")
    //--------------------------------------------
    println()
    val arrInt = intArrayOf(473, 521, 582, 617, 674, 213, 274, 376, 391, 425, 147, 284, 712, 142, 165)
    println(arrInt.contentToString())
    arrInt.sort()
    val idxMax2 = arrInt.size - 2
    println("Второе максимальное число набора = " + arrInt[idxMax2])
}
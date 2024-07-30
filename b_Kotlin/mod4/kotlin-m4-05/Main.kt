
fun main() {
    println()
    val newBox = Box(0.45, 0.45, 0.25)
    println(newBox.vOfBox())
    //--------------------------------------------------
    println()
    val arrA = intArrayOf(861, -521, 582, -142, 213, -712, 937, -396, 473, -274, 376, -617 ,165, -425, 728, -492)
    var min = arrA[0]
    var max = arrA[0]
    for (i in 1 until arrA.size) {
        if (arrA[i] < min) min = arrA[i]
        else if (arrA[i] > max) max = arrA[i]
    }
    println(arrA.contentToString())
    println("min = $min; max = $max.")
    //---------------------------------------------------
    println()
    val arrB = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    println(arrB.contentToString())
    //---------------------------------------------------
    println()
    var a = 34
    if (a < 0) {
        if (a%2 == 0) println("$a «отрицательное четное число»")
        else println("$a «отрицательное нечетное число»")
    } else if (a > 0) {
        if (a%2 == 0) println("$a «положительное четное число»")
        else println("$a «отрицательное четное число»")
    } else println("$a «нулевое число»")
    //----------------------------------------------------
    println()
    val car = Car("Mitsubishi", "Outlander XL", 1650, 90)
    if (car.speed > 0) car.drive(car.speed)
    else car.stop()
}
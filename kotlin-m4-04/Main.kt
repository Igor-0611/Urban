
fun main() {
    println()
    println("Форма регистрации.")
    print("EMAIL: ")
    var newUser = Registration(readln().toString())
    do {
        println("Введите пароль (не менее 6 символов):")
        var setUser = newUser.setPassword(readln().toString())
    } while (!setUser)
    println("Пароль установлен.")
    println("Ваш логин/email:")
    println(newUser.getEmail())
    //--------------------------------------------------------
    println()
    val matrix = arrayOf(
        intArrayOf(861, -521, 582, -142),
        intArrayOf(213, -712, 937, -396),
        intArrayOf(473, -274, 376, -617),
        intArrayOf(165, -425, 728, -492)
    )
    for (i in 0 until matrix.size) println(matrix[i].contentToString())

    var arrOfMatrix = matrix[0]
    for (i in 1 until matrix.size) arrOfMatrix += matrix[i]
    lookEvenNum(arrOfMatrix)
    lookPositiveNum(arrOfMatrix)
    //-------------------------------------------------------------
    println()
    var n = 1
    val matrixInt = Array(4, {IntArray(4, {i -> n++})})
    for (i in 0 until matrixInt.size) println(matrixInt[i].contentToString())
}

fun lookEvenNum(array: IntArray) {
    val arrOfNum: MutableList<Int> = ArrayList<Int>()
    for (i in 0 until array.size) if (array[i]%2 == 0) arrOfNum.add(array[i])
    println("чётные числа матрицы - ")
    println(arrOfNum)
}

fun lookPositiveNum(array: IntArray) {
    val arrOfNum: MutableList<Int> = ArrayList<Int>()
    for (i in 0 until array.size) if (array[i] > 0) arrOfNum.add(array[i])
    println("положительные числа матрицы - ")
    println(arrOfNum)
}
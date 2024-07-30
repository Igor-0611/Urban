
fun main() {
    println()
    println("Форма регистрации.")
    print("EMAIL: ")
    var newUser = Registration(readln().toString())
    do {
        print("Введите пароль (не менее 6 символов): ")
        var setUser = newUser.setPassword(readln().toString())
    } while (!setUser)
    println("Пароль установлен.")
    print("Ваш логин/email: ")
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
    println()
    lookPositiveNum(arrOfMatrix)
    println()
    //-------------------------------------------------------------
    println()
    var n = 1
    val matrixInt = Array(4, {IntArray(4, {i -> n++})})
    for (i in 0 until matrixInt.size) println(matrixInt[i].contentToString())
}

fun lookEvenNum(array: IntArray) {

    fun findNum(n: Int): Boolean {
        if (n % 2 == 0) return true
        else return false
    }

    println("чётные числа матрицы - ")
    for (i in 0 until array.size) if (findNum(array[i])) print(array[i].toString() + ", ")
}

fun lookPositiveNum(array: IntArray) {

    fun findNum(n: Int): Boolean {
        if (n > 0) return true
        else return false
    }

    println("положительные числа матрицы - ")
    for (i in 0 until array.size) if (findNum(array[i])) print(array[i].toString() + ", ")
}
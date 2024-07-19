
fun main() {
    println()
    val case = Human("Иванов Пётр", 0, 1, 1)

    println(case.name)
    println(case.Head().toString())
    println(case.Hands().toString())
    println(case.Legs().toString())
    //----------------------------------------------
    println()
    val arrStr = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    var seek: String
    var find = false

    println("Ищем фамилии.")
    print("Что из фамилии помните? - ")
    seek = readln().toString()

    for (i in 0 until arrStr.size) {
        if (arrStr[i].contains(seek, true)) {
            println(arrStr[i])
            find = true
        }
    }
    if (!find) println("Нет подходящей фамилии.")
    //----------------------------------------------
    println()
    val arrInt = arrayOf(-2, -1, 0, 1, 2, 1, -1, -2, -1, 1, 2, 1, 0, -1, -2)
    var cnt = -1
    for (i in 0 until arrInt.size) {
        if (arrInt[i] == 0 && cnt < 0) cnt = 0
        else if (arrInt[i] != 0 && cnt != -1) cnt++
        else if (arrInt[i] == 0) break
    }
    println(arrInt.contentToString())
    println("Между нулями $cnt чисел.")
}
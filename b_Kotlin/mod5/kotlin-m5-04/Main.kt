
fun main() {
    println()
    val arrStr = arrayOf(
        "Найти", "самое", "длинное", "слово", "в", "массиве",
        "и", "количество", "букв", "в", "этом", "слове"
    )
    var str = arrStr[0]
    for (i in 1 until arrStr.size) {
        if (arrStr[i].length > str.length) str = arrStr[i]
    }
    println(arrStr.contentToString())
    println("Самое длинное слово '$str', ${str.length} букв.")
    println("---------------------------------------------------------------")
    var sum = 0
    var num = 0
    val arr: Array<Array<Int>> = Array(4, { Array(4, { 0 }) })

    for (i in 0 until arr.size) {
        for (j in 0 until arr[i].size) {
            arr[i][j] = ++num
        }
    }
    println(arr.contentDeepToString())

    for (i in 0 until arr.size) {
        sum += arr[i][arr[i].size - i - 1]
    }
    println("Сумму элементов побочной диагонали = $sum")
    println("---------------------------------------------------------------")
    val prt01 = DataPrint("МФУ", "струйный", true, "HP DeskJet 2320")
    val prt02 = DataPrint("Принтер", "лазерный", true, "HP Color Laser 150nw")
    val prt03 = DataPrint("Принтер", "лазерный", false, "Pantum P2500W")
    val prt04 = DataPrint("МФУ", "лазерный", false, "Pantum M6500")
    val prt05 = DataPrint("Принтер", "лазерный", false, "HP LaserJet M111w")
    val prt06 = DataPrint("МФУ", "струйный", true, "HP Smart Tank 581")

    val arrPrt: Array<DataPrint> = arrayOf(prt01, prt02, prt03, prt04, prt05, prt06)

    println("\nПоказать МФУ:")
    for (i in 0 until arrPrt.size) {
        if (arrPrt[i].dev.equals("МФУ")) println(arrPrt[i].name)
    }
    println("\nПоказать устройства цветной печати:")
    for (i in 0 until arrPrt.size) {
        if (arrPrt[i].col) println(arrPrt[i].name)
    }
    println("\nПоказать все устройства печати:")
    for (i in 0 until arrPrt.size) {
        arrPrt[i].infoPrinter()
    }
}


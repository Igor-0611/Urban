
fun main() {
    println()
    val penguin = Skill("Королевскиий пингвин","Пингвиновые")
    penguin.fly = "нет"
    penguin.swim = "да"
    penguin.printInfo()

    val ostrich = Skill("Африканский страус","Страусовые")
    ostrich.fly = "нет"
    ostrich.swim = "нет"
    ostrich.printInfo()

    val mallard = Skill("Кряква","Утиные")
    mallard.fly = "да"
    mallard.swim = "да"
    mallard.printInfo()
    //------------------------------------------------------------------
    println()
    val arrStr = arrayOf("Найти", "самое", "длинное", "слово", "в", "массиве",
        "и","количество","букв","в", "этом", "слове")
    var str = arrStr[0]
    for (i in 1 until arrStr.size) {
        if (arrStr[i].length > str.length) str = arrStr[i]
    }
    println(arrStr.contentToString())
    println("Самое длинное слово '$str', ${str.length} букв.")
    //-------------------------------------------------------------------
    println()
    val data = "ПриВет, кАк деЛа"
    var cnt = 0
    for (i in 0 until data.length) {
        if (data[i].isUpperCase()) {
            print("'${data[i]}' ")
            cnt++
        }
    }
    println()
    println("символов в верхнем регистре - $cnt")

}
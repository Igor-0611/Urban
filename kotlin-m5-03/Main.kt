
fun main() {
    println()
    var nm = -1
    var month: Month
    var str = ""

    do {
        print("Введите номер месяца (или 0 для выхода): ")
        str = readln()
        if (str.toIntOrNull() != null) nm = str.toInt()
        if (nm == 0) break
        else if (nm !in 1..12) println("Некорректный номер.")
        else {
            for (i in Month.values()) {
                month = Month.valueOf(i.toString())
                if (nm == month.num) {
                    print(month.month)
                    println(Season().getSeason(nm))
                }
            }
        }
    } while (nm != 0)
    println("Программа закрыта.")
    //---------------------------------------------------
    println()
    val data = "Шумоизоляция"
    var char = ""
    var cnt = 0
    var stmp = data
    var srpl = ""

    println(data)
    do {
        char = stmp[0].toString()
        srpl = stmp.replace(char, "")
        cnt = stmp.length - srpl.length
        print("'$char' - $cnt; ")
        stmp = srpl
    } while (stmp.length > 0)
    println()
}
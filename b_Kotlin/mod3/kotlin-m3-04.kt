import kotlin.math.roundToInt

fun main() {
    println()
    val winter = "Зима:"
    val spring = "Весна:"
    val summer = "Лето:"
    val autumn = "Осень:"

    val month  = 12 // 13

    val season = when (month) {
        !in 1..12 -> "ОШИБКА: нет месяца #$month"
        1 -> "$winter Январь"
        2 -> "$winter Февраль"
        3 -> "$spring Март"
        4 -> "$spring Апрель"
        5 -> "$spring Май"
        6 -> "$summer Июнь"
        7 -> "$summer Июль"
        8 -> "$summer Август"
        9 -> "$autumn Сентябрь"
        10 -> "$autumn Октябрь"
        11 -> "$autumn Ноябрь"
        12 -> "$winter Декабрь"
        else -> "Всё равно ОШИБКА!!!"
    }
    println(season)
    //---------------------------------------------------------
    println()
    val fl = 123.617f
    val x: Int = fl.roundToInt()
    println("Float $fl to Int = $x")
    //----------------------------------------------------------
    println()
    val hour  = 19 // 24

    val timeOfDay = when (hour) {
        in 0..5 -> "ночь"
        in 6..11 -> "утро"
        in 12..17 -> "день"
        in 18..23 -> "вечер"
        else -> "ошибка указания часа"
    }
    println("Сейчас $hour - $timeOfDay")
    //----------------------------------------------------------
    println()
    var a = 8
    var b = 5

    println("Дано: a = $a; b = $b;")
    val temp = a
    a = b
    b = temp
    println("Теперь: a = $a; b = $b;")
}
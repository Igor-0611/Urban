
open class Smartphone {

    var type: String = ""
    var brand: String = ""

    fun mode(): Int {
        var boo = false
        var num = 0
        do {
            print("Введите режим (1 -звук, 2 -вибрация, 3 -без звука): ")
            num = readln().toInt()
            if (num<1 || num>3) println("Нет такого режима")
            else boo = true
        } while (!boo)
        return num

    }

    fun ring(mode: Int): String {
        when (mode) {
            1 -> return " (в режиме 'звук')."
            2 -> return " (в режиме 'вибрация')."
            3 -> return " (в режиме 'без звука')."
            else -> return "Нет такого режима"
        }
    }
}

fun main() {
    println()
    val users: Array<String> = Array(10, {""})
    var n = "0"

    do {
        print("Добавить пользователя? (нет/да - '0'/'любая клавиша') -> ")
        n = readln()
        if (n != "0") try {
            createList(users)
        } catch (e: Exception) {
            println(e.message)
        }
    } while (n != "0")

    var list = users.filter { it != "" }
    if (list.size == 0) println("Список пуст.")
    else println(list)
}

class MyException(message: String) : Exception(message)

fun  createList(list: Array<String>): Array<String> {
    print("Введите имя -> ")
    val name = readln()
    if(name == "") {
        throw MyException("Имя не может быть пустым.")
    }
    print("Выберете позицию из доступных / ")
    for (i in 0 until list.size) if (list[i] == "") print("$i; ")
    print("/ -> ")
    val pos = readln()
    if (pos.length > 1 || !pos[0].isDigit()) {
        throw MyException("Нет такой позиции.")
    }
    if (list[pos.toInt()] != "") {
        throw MyException("Эта позиция уже занята.")
    }
    list[pos.toInt()] = name
    return list
}

fun main() {
    println()
    var num = 0
    val name = "Адреналин"
    val time = "18:00"
    var row = 0
    var seat = 0
    val ticket = Ticket(num, name, time, row, seat)
    val hall: Array<Array<Ticket>>  = Array(3, { Array(5, {ticket}) })

    for (i in 0 until hall.size) {
        ++row
        seat = 0
        for (j in 0 until hall[i].size) {
            hall[i][j] = Ticket(num, name, time, row, ++seat)
        }
    }

    var sale = true
    do {
        println("Выбирете свободное место:")
        for (i in 0 until hall.size) {
            print("ряд ${i + 1}: ")
            for (j in 0 until hall[i].size) {
                if (hall[i][j].num == 0) {
                    print(hall[i][j].seat)
                    print(" ")
                }
            }
            println()
        }
        print("укажите ряд - ")
        row = readln().toInt()
        print("укажите место - ")
        seat = readln().toInt()
        hall[row-1][seat-1] = Ticket(++num, name, time, row, seat)
        print("Продолжить продажи нет.0/да.1 - ")
        if (readln().toInt() == 0) sale = false
    }while(sale)

    println()
    println("Список проданных билетов")
    for (i in 0 until hall.size) {
        for (j in 0 until hall[i].size) {
            if (hall[i][j].num > 0) println(hall[i][j].toString())
        }
    }

    println()
    print("Распечатать билет № ")
    var pnt = readln().toInt()
    for (i in 0 until hall.size) {
        for (j in 0 until hall[i].size) {
            if (hall[i][j].num == pnt) println(hall[i][j].toString())
        }
    }
}
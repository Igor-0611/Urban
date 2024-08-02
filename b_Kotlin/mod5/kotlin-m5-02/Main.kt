
fun main() {

    var num = 0
    val name = "Адреналин"
    val time = "18:00"
    var row = -1
    var seat = -1
    var tmp = ""
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
        println("\n $name $time")
        println("выбирете свободное место:")
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

        do {
            print("укажите ряд - ")
            tmp = readln()
            row = check(tmp, hall.size)
        } while (row < 0)

        do {
            print("укажите место - ")
            tmp = readln()
            seat = check(tmp, hall[0].size)

            if (seat >= 0 && hall[row][seat].num != 0) {
                print("место уже занято / ")
                seat = -1
            }
        } while (seat < 0)

        hall[row][seat] = Ticket(++num, name, time, row, seat)
        println()
        println(hall[row][seat].toString())
        row = 0
        seat = 0

        println()
        print("Продолжить продажи нет.0/да.1 - ")
        if (readln() == "0") sale = false
    } while(sale)

    println()
    println("Список проданных билетов")
    for (i in 0 until hall.size) {
        for (j in 0 until hall[i].size) {
            if (hall[i][j].num > 0) println(hall[i][j].toString())
        }
    }
}

fun check (opt: String, lmt: Int): Int {
    if (opt.length > 1 || !opt[0].isDigit()) {
        println("плохой выбор / ")
        return -1
    }
    else {
        val chc = opt.toInt()
        if (chc < 1 || chc > lmt) {
            print("плохой выбор / ")
            return -1
        }
        else return (chc - 1)
    }
}
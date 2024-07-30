
fun main() {
    println()
    var pin = 0
    var code = 0
    var card = CardOfBank()
    var count = 3

    do {
        count--
        println("Для получения информации по карте введите ПИН") //9090
        pin = readln().toInt()
        code = card.checkPin(pin)
        if (code > 0) {
            println(card.number)
            println(code)
            break
        } else println("ПИН не верный.")
    }while (count > 0)

    if (count == 0) {
        println("ПИН трижды неверный.")
        println("КАРТА ЗАБЛОКИРОВАНА.")
    }
    //---------------------------------------------------------
    println()
    var a = 25
    print("($a+7-4)*2/3 -> ")
    a += 7
    a -= 4
    a *= 2
    a %= 3
    println("остaток $a")
    //---------------------------------------------------------
    println()
    var num = 753
    var renum = 0

    print("$num -> ")
    while (num > 0) {
        renum = renum*10 + num%10
        num = num/10
    }
    println(renum)
}
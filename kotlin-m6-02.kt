
fun main() {
    println()
    val str = "Занятие"
    str.forEach { it -> print("'$it' ") }
    println("\n--------------------------------------")

    val tel1 = "+79773505050"
    val tel2 = "+7977350505o"
    val tel3 = "+7977350505"
    val tel4 = "-79773505050"
    val tel5 = "+49773505050"

    val checkTel = {tel: String ->
        var ok = true
        if (tel.length != 12) ok = false
        else if (tel[0] != '+' || tel[1] != '7') ok = false
        else if (tel.substring(2).toDoubleOrNull() == null) ok = false
        ok
    }

    println("Номер: $tel1 - ${checkTel(tel1)}")
    println("Номер: $tel2 - ${checkTel(tel2)}")
    println("Номер: $tel3 - ${checkTel(tel3)}")
    println("Номер: $tel4 - ${checkTel(tel4)}")
    println("Номер: $tel5 - ${checkTel(tel5)}")
    println("--------------------------------------")
    val stroke = "kotlin2023course"

    println(stroke)
    stroke.reversed().forEach { it -> print("'$it' ") }

    println()
    val cntOfNum = {s: String ->
        var cnt = 0
        for (i in 0 until s.length) if (s[i].isDigit()) cnt++
        cnt
    }
    println("Количество цифр содержащихся в «$stroke» = ${cntOfNum(stroke)}")
}
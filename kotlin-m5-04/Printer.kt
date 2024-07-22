
abstract class Printer(val dev: String, val prt: String, val col: Boolean, val name: String) {

    open fun infoPrinter() {
        var color =  "цветной"
        if (!col) color = "ч/белый"
        println("$dev $prt $color <$name>")
    }
}

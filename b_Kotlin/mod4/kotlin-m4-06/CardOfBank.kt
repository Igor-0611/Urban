
class CardOfBank {

    val number = "5076349045230009"
    private var code = 546
    private var pin = 9090

    fun checkPin(inpin: Int): Int {
        if (inpin == pin) return code
        else return 0
    }
}
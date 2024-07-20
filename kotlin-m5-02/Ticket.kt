import java.sql.Time

data class Ticket(val num: Int, val name: String, val time: String, val row: Int, val seat: Int) {

    override fun toString(): String {
        return "Билет №$num: '$name' $time ряд:$row место:$seat"
    }
}
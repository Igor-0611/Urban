
class Season{
    fun getSeason(month: Int): String {
        if (month in 3..5) return " - весна."
        else if (month in 6..8) return " - лето."
        else if (month in 9..11) return " - осень."
        else return " - зима."
    }
}
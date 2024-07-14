
open class IPhone : Smartphone() {
    var part: String = ""
    var ram: Int = 0
    var rom: Int = 0

    override fun toString(): String {
        return "$type $brand '$part' $ram/$rom Gb"
    }
}
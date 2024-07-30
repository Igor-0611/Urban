
open class Bird(
    val sort: String = "",
    val group: String = ""
) {
    open var fly: String = ""
    open var swim: String = ""
    open val info: String
        get() = "$sort ($group) $fly $swim"

    open fun printInfo() {
        println(info)
    }
}


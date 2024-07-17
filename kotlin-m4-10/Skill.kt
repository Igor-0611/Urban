
class Skill(sort: String, group: String) : Bird(sort, group) {
    override var fly: String = ""
        set(value) {
            if (value.length == 2) field = "может летать,"
            else field = "не может летать,"
        }

    override var swim: String = ""
        set(value) {
            if (value.length == 2) field = "может плавать."
            else field = "не может плавать."
        }

    override val info: String
        get() = super.info

    override fun printInfo() {
        super.printInfo()
    }
}
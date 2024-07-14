class Cat : Animal() {

    fun act() {
        println("Когда голодная - крутится под ногами и орёт.")
    }

    override fun toString(): String {
        return ("Кошка")
    }
}
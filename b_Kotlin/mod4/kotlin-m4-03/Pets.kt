class Pets {
    var type: Type = Type.COW
    var name: String = "Name"
    var weight = 0.00
/*
    fun Pet(type: Type, name: String, weight: Double) {
        this.type = type
        this.name = name
        this.weight = weight
    }
*/
    enum class Type(val str: String) {
        COW("Корова"),
        DOG("Собака"),
        CAT("Кот")
    }
}
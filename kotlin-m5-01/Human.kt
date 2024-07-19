
class Human(val name: String, val head: Int, val hands: Int, val legs: Int) {

    inner class Head {
        override fun toString(): String {
            if (head == 0) return "голова не беспокоит"
            else return "жалобы на головные боли"
        }
    }
    inner class Hands {
        override fun toString(): String {
            if (hands == 0) return "руки работают нормально"
            else return "жалобы на тремер в руках"
        }
    }
    inner class Legs {
        override fun toString(): String {
            if (legs == 0) return "ноги не болят"
            else return "жалобы на слабость в ногах"
        }
    }
}

class Registration(email: String) {
    private var email = email
    private var password = ""

    fun setPassword(pass: String): Boolean {
        var setPass = false
        password = pass
        if (password.length < 6) {
            println("Длина пароля менее 6 символов.")
            password = ""
        } else setPass = true
        return setPass
    }

    fun getEmail() = email.toUpperCase()
}
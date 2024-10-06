import kotlinx.coroutines.*

suspend fun main() = coroutineScope {

    val fin = launch(start = CoroutineStart.LAZY) {
        delay(2000L)
        println("До свидания.")
    }

    println()
    println("Программа покупки продуктов.")
    delay(1000L)
    println("Купить товар:\n1.Да\n2.Нет")

    val choice = readln()

    println()
    when (choice) {
        "1" -> buy()
        "2" -> nobuy()
        else -> println("Ошибка.")
    }

    fin.start()
    println()
}

private suspend fun buy() {
    println("Оплата продукта началась.")
    delay(2000L)
    println("Сканирование и обработка...")
    delay(2000L)
    println("Покупка оплачена.")
}

private suspend fun nobuy() {
    println("Отмена покупки...")
    delay(2000L)
    println("Покупка отменена.")
}
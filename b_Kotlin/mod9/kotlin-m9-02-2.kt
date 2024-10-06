import kotlinx.coroutines.*

fun main() = runBlocking {
    val lazy = launch(start = CoroutineStart.LAZY) {
        println("Произошел ленивый запуск")
    }
    val fin = launch(start = CoroutineStart.LAZY) {
        println("Программа завершена")
    }

    println()
    println("Начало программы")
    delay(1000L)

    for (i in 1..4) {
        println("i = $i")
        delay(1000L)
        if (i == 2) {
            lazy.start()
            delay(1000L)
        }
    }

    fin.start()
    println()
}


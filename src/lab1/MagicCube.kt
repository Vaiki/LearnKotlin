package lab1

import kotlin.random.Random

class MagicCube {
    companion object {
        private val answers = listOf<String>(
            "Да", "Нет", "Скорее всего да", "Скорее всего нет",
            "Возможно", "Имеются перспективы", "Вопрос задан неверно"
        )

        fun answer(message: String) = println(answers[(0..6).random()])

    }
}

fun main() {
    println("В чем вопрос?")
    MagicCube.answer(readLine()!!)

}
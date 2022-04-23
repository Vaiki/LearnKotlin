import java.io.BufferedReader
import java.io.FileReader
import kotlin.random.Random

class Riddles {
    private val riddlesBook = mutableListOf<Riddle>()
    private var answerId: Int=0
    fun loadRiddles() {
        val reader = BufferedReader(FileReader("Riddles.txt"))
        var line: String
        var strings = ""
        while (true) {
            line = reader.readLine() ?: break
            if (!line.contains("Ans")) {
                strings += line + "\n"
            } else {
                riddlesBook.add(Riddle(strings, line.replace("Answer: ","").uppercase()))
                strings = ""
            }
        }
    }

    fun randomRiddle() {
        answerId = Random.nextInt(0, riddlesBook.size)
        println(riddlesBook[answerId].riddle)
    }

    fun answerRiddle(str: String):Boolean{
        return str.uppercase()==riddlesBook[answerId].answer
    }

    fun riddlesList(){
        for (str in riddlesBook){
            println(str.toString())
        }
    }

}
data class Riddle(val riddle: String, val answer: String)

fun main() {
    val riddles = Riddles()
    riddles.loadRiddles()
    riddles.randomRiddle()

    while (true) {
        if(riddles.answerRiddle(readLine()!!)){
            println("Правильно!\nСледующая загадка:\n")
            riddles.randomRiddle()
        }else println("Попробуй еще раз :)")

    }


}
package lab1

class AlphabetNum(private val str: String) {

    private val alphabet = mutableMapOf<Char, Int>()
    private var i = 0

    init {
        for (str in 'а'..'я') {
            i++
            alphabet[str] = i
        }

    }

    fun convert(): Int {
        var i = 0

        val charArray = str.lowercase().toCharArray()
        for (char in charArray) {
            i += alphabet[char]!!
        }
        return i
    }


}

fun main() {
println(AlphabetNum("Маша").convert()+AlphabetNum("Саша").convert())
}





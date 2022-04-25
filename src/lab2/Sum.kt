package lab2

import java.math.BigInteger

fun main() {

    sumFromNum(readLine()!!)
    sumOfNums(100)
    getFactorial(100)

}

fun sumFromNum(string: String) {
    val num = string.toCharArray()
    var sum = 0
    for (n in num) {
        sum += n.toString().toInt()
    }
    println("Sum from number $string: $sum ")

}

fun sumOfNums(n: Int) {
    var result = 0
    for (i in 1..n) {
        result += i
    }
    println("Sum in 1..$n: $result")
}

fun getFactorial(f: Int) {
    var result = BigInteger.ONE
    for (i in 1..f) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    println("Factorial $f: $result")
}
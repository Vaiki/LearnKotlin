package lab2

import kotlin.random.Random

fun main(){
    val random = Random.nextInt(5,156)

    println("$random in range 25-100: " +(random in 25..100))
}
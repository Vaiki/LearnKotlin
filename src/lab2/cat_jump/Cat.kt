package lab2.cat_jump

class Cat(
    val name: String,
    private val weight: Double,
    private val growth: Double,
    private val length: Double
) {
    val jumpPower = (growth + length) * 3 - weight * 10
}


fun main() {
    val cat = Cat("Barsik", 5.5, 18.0, 37.5)
    val cat2 = Cat("Bars", 10.0, 20.0, 45.5)
    val table = Table(90.0, "black", "plastic", 150.0, 4)
    val table2 = Table(100.0, "black", "plastic", 100.0, 1)
    jumpingCat(cat, table)
    jumpingCat(cat2, table2)
}

fun jumpingCat(cat: Cat, table: Table) {
    if (cat.jumpPower > table.height) {
        println("${cat.name} jumps ${cat.jumpPower}cm high, and the table ${table.height}cm high, so he will jump onto the table")
    } else println("${cat.name} jumps ${cat.jumpPower}cm high, and the table ${table.height}cm high, so he will not jump onto the table")
}
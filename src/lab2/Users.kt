package lab2

class User(private val name: String, private val secondName: String, var age: Int) {
    companion object {
        private val users = mutableListOf<User>()
        val usersList = users
        fun addUsers(user: User) {
            users.add(user)
        }

        fun getSortedByName() = users.sortedBy { user -> user.name }

        fun selectByAge(age: Int){
            users.removeIf { user:User->user.age<age }
        }


    }

    override fun toString(): String {
        return "Name: $name, SecondName: $secondName, Age: $age"
    }
}

fun main() {
    val user1 = User("Masha", "Ivanova", 32)
    val user2 = User("Andrei", "Petrovich", 30)
    val user3 = User("Natalia", "Valentinovna", 23)
    val user4 = User("Boris", "Alexandrovich", 17)
    User.addUsers(user1)
    User.addUsers(user2)
    User.addUsers(user3)
    User.addUsers(user4)

    println("Список пользователей")
    User.usersList.forEach { println(it) }
    println("\nСписок пользователей отсортированный")
    User.getSortedByName().forEach { println(it) }
    User.selectByAge(24)
    println("\nСписок пользователей старше 24 лет")
    User.getSortedByName().forEach { println(it) }


}
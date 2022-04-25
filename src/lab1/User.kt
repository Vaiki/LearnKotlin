package lab1

class User(private val name: String, private val secondName: String, private var age: Int) {
    companion object {
        private val users = mutableListOf<User>()
        fun addUsers(user: User) {
            users.add(user)
        }

        fun getAllUsers() {
            for (user in users) {
                println(user.toString())
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, SecondName: $secondName, Age: $age"
    }
}
fun main(){
    val user1 = User("Evgeniy", "Anatolievich",32)
    val user2 = User("Andrei", "Petrovich",30)
    val user3 = User("Natalia", "Valentinovna",23)
    User.addUsers(user1)
    User.addUsers(user2)
    User.addUsers(user3)
    User.getAllUsers()
}
/** Created by Omar Parra on 2/12/19 at 6:11 PM */

class Login<T> (name: T, password: T) {
    init {
        println("Name: " + name + " Password: " + password)
    }
}

class Person(userName: String, password: String) {
    var userName : String?= null
    var password : String?= null
    init {
        this.userName = userName
        this.password = password
        println("Person class")
    }
}

fun main(args: Array<String>){

    var login = Login<String>("Omar", "1234")
    var login1 = Login<Int>(321,425)
    var login2 = Login<Boolean>(true,false)

    var person = Person("Francisco", "4321")
    var user = Login<Person>(person, person)

}
/** Created by Omar Parra on 2/11/19 at 11:45 PM */

open class Car() {

    var make: String? = null
    var model: String? = null
    var color: String? = null
    var year: String? = null
    var price: String? = null

    constructor(make: String, model: String, color: String, year: String, price: String) : this() {
        this.make = make
        this.model = model
        this.color = color
        this.year = year
        this.price = price
    }
}


class Audi : Car{
    constructor(): super()

}
fun main(args: Array<String>) {
    var mustangShelby = Car("Ford", "GT350", "Red", "2019", "$54,800.00")
    var r8Coupe = Car("Audi", "R8 Sport", "White", "2019", "$35,000.00")

    println("My ${mustangShelby.model} Mustang ${mustangShelby.model} is color ${mustangShelby.color} price is ${mustangShelby.price}")
    println("I dont like my ${r8Coupe.make} Audi ${r8Coupe.model} in color ${r8Coupe.color}")
}
/** Created by Omar Parra on 2/12/19 at 5:46 PM */
//Abstract Classes = not meant to be instantiated and they also can have a mixture of function declared with or without an implementation.

abstract class GraphicObject {

    fun moveTo(newX: Int, newY: Int){
        println("Move to new X and new Y")
    }

    abstract fun draw()
    abstract fun resize()

}

class Circle : GraphicObject() {
    override fun draw() {
        println("Drawing circle")
    }

    override fun resize() {
        println("Resizing circle")
    }

}

class Triangle : GraphicObject(){
    override fun draw() {
        println("Drawing Triangle")
    }

    override fun resize() {
        println("Resizing Triangle")
    }

}

abstract class Computers {

    fun price(wholeSale: Int, retail: Int) {
        println("The wholesale price is $$$$ and the retail price is $$$$")
    }

    abstract fun size()
    abstract fun make()
}

class AlienWare : Computers() {
    override fun size() {
        println("The size of this laptop is....")
    }

    override fun make() {
        println("The make is Dell")
    }

}

class Mac : Computers(){
    override fun size() {
        println("The size is perfect")
    }

    override fun make() {
        println("The make is Apple")
    }

}

fun main(args: Array<String>) {

    var alienware = AlienWare()
    var mac = Mac()

    alienware.make()
    mac.make()

    alienware.price(1500,3200)
    mac.size()

    var circle = Circle()
    circle.draw()
    circle.moveTo(12, 23)

    var triangle = Triangle()
    triangle.draw()
    triangle.resize()

}
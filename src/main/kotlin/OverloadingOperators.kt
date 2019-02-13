/** Created by Omar Parra on 2/12/19 at 2:54 PM */

fun main(args: Array<String>) {
    val a = 5
    val b = 3

    //println(a + b)
    //backgorund ^
    //print(a.plus(b))

    val point1 = Point(10, -4)
    val point2 = Point(3, 8)

    var sum = Point()
    sum = point1 + point2
    println("The sum is = (${sum.x}, ${sum.y})")

    val point3 = Point(8, 9)
    val point4 = Point(4, 15)

    var min = Point()
    min = point3 - point4
    println("The substraction is = (${min.x}, ${min.y})")

}

class Point(val x: Int = 0, val y: Int = 12){

    //Overload plus function
    operator fun plus(p: Point) : Point {
        return Point(x + p.x, y + p.y)
    }

    //Challenge: Minus fun
    operator fun minus(m: Point) : Point {
        return Point(x - m.x, y - m.y)
    }

}
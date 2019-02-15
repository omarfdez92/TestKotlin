/** Created by Omar Parra on 2/15/19 at 1:17 PM */

fun main(args: Array<String>) {

    //Default is always immutable
    var myArrayList = listOf<String>("Hello","again","my","nigga")

    //Mutable
    var mutableList = mutableListOf("I","am","mutable")
    mutableList[0] = "Change it"
    for (item in mutableList) println("Item: $item")

    //hashmap
    var myHashmap = hashMapOf(1 to "Omar", 2 to "Solo", 3 to "Crack")
    println(myHashmap.get(2))

    //Array
    var myArray = arrayOf(1,2,3,4,5)
    myArray[3] = 10
    println(myArray[3])
}
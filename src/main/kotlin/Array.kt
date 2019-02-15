/** Created by Omar Parra on 2/15/19 at 12:07 PM */
fun main(args: Array<String>) {

    var myArray = arrayOf(1,3,5,2,4,8,9,6)

    var myList = listOf<String>("Hello","You","Are","The","Best")

    for(item in myArray){
        print("[$item] ")
    }

    println()

    for (item1 in myList){
        print("$item1 ")
    }



}
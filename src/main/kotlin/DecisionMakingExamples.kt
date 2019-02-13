/**
 * Created by Omar Parra on 2/11/19.
 */

fun main(args: Array<String>) {

    var n1 = 8
    var n2 = 5
    var again: String? = ""
    var timesYouUsedTheProgram = 1

    do{

        println("============================")
        println(" -> Welcome to our options <- ")
        println("============================")

        println("What do you want to do:")
        println("1. Addition \t2. Substract \t3. Multiply \t4. Division")
        var options = readLine()!!.toInt()

        when (options) {
            1 -> println("The sum result is: ${sum(n1,n2)}" )
            2 -> println("The substract result is: ${sub(n1,n2)}" )
            3 -> println("The multiplication result is: ${mul(n1.toFloat(),n2.toFloat())}" )
            4 -> println("The div result is: ${div(n1.toFloat(),n2.toFloat())}" )
            else -> println("Elige una opcion valida")
        }

        println("Try Again: yes/no?")
        var again = readLine()!!

        if( again == "yes") timesYouUsedTheProgram++

    }while (again == "yes")

    /*for(i in 1 until 11){
        println("Loading $i%")
        Thread.sleep(700)
    }*/

    print("Loading")
    for(item in 1..11){
        print("*")
        Thread.sleep(500)
    }
    println()
    println("===============================")
    println(" -> You used $timesYouUsedTheProgram times the program <- \n -> Thank You!... Bye! <- ")
    println("===============================")

}


fun sum(n1: Int, n2: Int) : Int{
    return n1 + n2
}

fun sub(n1: Int, n2: Int) : Int{
    return n1 - n2
}

fun mul(n1: Float, n2: Float) : Float{
    return n1 * n2
}

fun div(n1: Float, n2: Float) : Float{
    return n1 / n2
}

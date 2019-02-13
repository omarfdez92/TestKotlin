/**
 * Created by Omar Parra on 2/11/19.
 *
 * App that have to guess right the number of siblings i have
 */

fun main(args: Array<String>) {
    val siblings = 4

    println("===================================")
    println(" -> Welcome to guess the siblings <- ")
    println("===================================")

    println("We will start in: ")
    for (countDown in 5 downTo 1){
        println(countDown)
        Thread.sleep(500)
    }

    do{

        println("How many siblings do i have?")
        var guessing = readLine()!!.toInt()

        if (guessing > siblings){
            println("You write $guessing, but i have less siblings, keep trying")
            Thread.sleep(500)
        } else{
            println("You write $guessing, i have more siblings, keep trying")
        }

    }while(guessing != siblings)

    Thread.sleep(300)

    println("===================================")
    println(" -> You did it! I have $siblings siblings <- ")
    println("===================================")
}



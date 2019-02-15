import java.io.FileReader
import java.io.FileWriter

/** Created by Omar Parra on 2/15/19 at 4:47 PM */

fun main(args: Array<String>) {

    menu()

}

fun menu(){

    do {

        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
        println("Enter: \n1. Write\n2. Read\n3. Exit\n")
        var choice = readLine()!!.toInt()

        when (choice){
            1 -> {
                println("Write something: ")
                var message = readLine()!!.toString()
                if (message.equals("")){
                    println("Please add something!!!")
                }else {
                    writetoFile(message)
                }
                style()
            }
            2 -> {
                println("Hello in texting.txt file you have: ")
                readfromFile()
                style()
            }
            else -> ("This option is not valid")
        }

    }while(choice != 3)

    println("Thank you, next!... I mean bye!")
    style()

}

fun writetoFile(message: String){

    try {

        var writer = FileWriter("texting.txt", true)
        writer.write(message + " \n")
        writer.close()

    }catch (e: Exception){
        println("EXC: $e")
    }

}

fun readfromFile(){

    try {

        var reader = FileReader("texting.txt")
        var char: Int?

        do {
            char = reader.read()
            print(char.toChar())

        }while (char != -1)

    }catch (e: Exception){
        println("Exc: ${e.message}")
    }

}

fun style(){
    Thread.sleep(700)
    println("Done/EOF")
    println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
}



import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception
import java.nio.file.Files
import java.nio.file.Paths

/** Created by Omar Parra on 2/15/19 at 1:48 PM */

fun main(args: Array<String>) {

    println("Write something and it will be added to message.txt: ")
    var message = readLine()!!.toString()

    if (message.equals("")){
        println("Please enter a message!")
    }else{
        writeToFile(message)
    }

    for (i in 1..5){
        println()
    }
    println("The file message.txt have all this inside:")
    readFile()

}

fun readFile(){

    var reader = FileReader("message.txt")
    var readMessage: String? = null
    var char: Int?
    try {

        do {
            char = reader.read()
            print(char.toChar())
        }while(char != -1)//while not the end of file

    }catch (e: Exception){
        println("Exc: ${e.message}")
    }
}

fun writeToFile(message: String) {

    try {

        var writer = FileWriter("message.txt", true)
        writer.write(message + " \n")
        writer.close()

    }catch (e: Exception){
        println("Exception: $e")
    }

}

/*
We can also use this to read files
fun readFromFile(){
    val stream = Files.newInputStream(Paths.get("message.txt"))
    stream.buffered().reader().use {
        reader -> println(reader.readText())
    }
}*/

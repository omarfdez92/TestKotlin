/** Created by Omar Parra on 2/12/19 at 5:30 PM */

//Interface Classes = Classes that have methods without bodies

interface InputHandler {

    fun clicked()
    fun doubleClicked()

}

class Phone : InputHandler {
    override fun doubleClicked() {
        println("Phone Double Clicked")
    }

    override fun clicked() {
        println("Phone Clicked")
    }

}

class Button : InputHandler {
    override fun doubleClicked() {
        println("Button Double Clicked")
    }

    override fun clicked() {
        println("Button Clicked")
    }

}

fun main(args: Array<String>) {

    var myButton = Button()
    myButton.clicked()

    var myPhone = Phone()
    myPhone.clicked()
    myPhone.doubleClicked()

}
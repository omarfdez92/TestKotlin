/** Created by Omar Parra on 2/12/19 at 6:27 PM */

//Enum classes = allow us to represent collections of information (fixed or static information)

enum class Suits {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main(args: Array<String>) {

    var cardPlayer = Suits.DIAMONDS
    var cardPlayer1 = Suits.CLUBS
    var playerDirection = Directions.EAST
    var playerDirection1 = Directions.SOUTH

    if (cardPlayer == Suits.DIAMONDS) println("You are doing great!")
    if (cardPlayer1 == Suits.CLUBS) println("Hello there things  are not so well")

    if(playerDirection == Directions.EAST) println("You are going East")
    if(playerDirection1 == Directions.SOUTH) println("You are going South")

}
package com.chandan.rockpaperscissors

fun main(){

    var ComputerChoice = ""
    var UserChoice = ""
    println("Rock, Paper or Scissors ? Enter your choice ..")
    UserChoice = readln()

    // using .. range operator , we randomly take one integer out of 1-3 and store in randomNum
    val randomNum = (1 .. 3).random()
//    println(randomNum)
   
//    if (randomNum == 1)
//        ComputerChoice = "Rock"
//    else if (randomNum == 2)
//        ComputerChoice = "Paper"
//    else if (randomNum == 3)
//        ComputerChoice = "Scissors"
//    println(ComputerChoice)

    // if statements are replaced with when due to cascading numbers
    when (randomNum) {
        1 -> ComputerChoice = "Rock"
        2 -> ComputerChoice = "Paper"
        3 -> ComputerChoice = "Scissors"
    }
    println(ComputerChoice)

    val winner = when {
        UserChoice == ComputerChoice -> "Tie"
        UserChoice == "Rock" && ComputerChoice == "Scissors" -> "Player wins"
        UserChoice == "Scissors" && ComputerChoice == "Paper" -> "Player wins"
        UserChoice == "Paper" && ComputerChoice == "Rock" -> "Player wins"
        else -> "Computer Wins"
    }
    print(winner)

}
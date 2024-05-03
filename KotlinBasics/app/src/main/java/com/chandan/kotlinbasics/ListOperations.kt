package com.chandan.kotlinbasics

fun main(){
    val fruitsList = mutableListOf<String>("Apple", "Banana", "Cherry", "Dragonfruit", "Eggplant")
    fruitsList.add("Mango")
    fruitsList.remove("Apple")
    println(fruitsList)

    val check = fruitsList.contains("Banana")
    println(check)
    when(check){
        true->println("THE Fruit is present")
        else-> println("NOT Present")
    }
}

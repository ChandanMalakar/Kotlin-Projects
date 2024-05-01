package com.chandan.kotlinbasics

fun main(){
//    println("Hello Chandan!")
//    var one = 20021021211
//    val e = 2.34f
//    val d = 21344.3216545
//    println(one)
//    one = 300000000
//    println(one)
//
//    val myChar = 'C'
//    println(myChar)
//    // for special characters
//    val specialChar = '\u00AE'
//    println(specialChar)
//
//
//    val str = "Chandan"
//    println(str)
//    for (c in str)
//        println(c)

    // taking input from the user
    println("Enter the age of the user")

    var age = readln().toInt()
    // println(age)
    if (age<=18){
        println("Still you're a baby boy")
    }
    else{
        println("you've grown up ")
    }

    // read what user entered into the console
    var name = readln()
    // convert the default string variable to the int variable
    var name1 = name.toString()
    println(name1)
}
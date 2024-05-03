package com.chandan.kotlinbasics

fun main() {
//    println("Enter the age of the user")
//    val age = readln().toInt()
//    if (age<=18){
//        println("Still you're a baby boy")
//    }
//    else{
//        println("you've grown up ")
//    }

//    var Daisy = Dog("Dilip", "Muffins")
//    println(Daisy.breed)

    //Immutable List - You cannot add the items after the initialization
    val shoppingList = listOf("Chandan", "Raju")
    println(shoppingList)

    //Mutable List - You can easily add the items after the initialization
    val moneyDistribute = mutableListOf<Int>(100,2000,312645,23415341)
//    println(moneyDistribute)

    // adding the values to the mutable list
//    moneyDistribute.set(1,100000)
//    moneyDistribute.add(324564)
//    moneyDistribute.remove(100)
//    println(moneyDistribute)


//    val hasHund = moneyDistribute.contains(100)
//    println(hasHund)
//    if(hasHund) println("100 is in the list")
//    else    println("Not in the list")

    for (items in moneyDistribute){
        println(items)

        if(items == 312645){
            moneyDistribute.removeLast()
            break
        }

    }
    println(moneyDistribute)

    for(items in 0 until moneyDistribute.size)
    {
        println("The item ${moneyDistribute[items]} is at index $items")
    }

}

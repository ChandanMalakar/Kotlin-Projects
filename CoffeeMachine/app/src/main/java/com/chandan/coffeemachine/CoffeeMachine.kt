package com.chandan.coffeemachine

data class CoffeeDetails
    (
    val sugarCount:Int ,
    val name:String,
    val size : String,
    val creamAmount : Int
)

fun main(){
    val coffeeforDenis = CoffeeDetails(0, "Chandan", "XL", 200)
    makeCoffee(coffeeforDenis)
}
fun askCoffeeDetails()
{
    println("Who the coffee is for?")
    val name= readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    when(coffeeDetails.sugarCount){
        0->println("Coffee with no sugar for ${coffeeDetails.name}")
        1->println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
        else->{
            println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails. name}")
        }
    }
}
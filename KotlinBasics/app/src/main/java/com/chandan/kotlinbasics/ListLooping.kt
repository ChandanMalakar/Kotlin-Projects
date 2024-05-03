package com.chandan.kotlinbasics

fun main()
{
    val numbers = mutableListOf<Int>(1,2,3,4,5)
    for(index in 0 until numbers.size){
        numbers[index] = 2*numbers[index]
    }
    println(numbers)
}
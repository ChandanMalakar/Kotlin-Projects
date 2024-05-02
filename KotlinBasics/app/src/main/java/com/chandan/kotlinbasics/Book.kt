package com.chandan.kotlinbasics

class BookClass(val title:String = "Unknown", val author:String = "Anonymous", val yearPublished:Int = 2024){

    init {
    println("$title is $author and $yearPublished")
    }

}
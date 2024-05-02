package com.chandan.kotlinbasics

class Dog(val name:String, val breed:String){

    init { bark(name) }
    fun bark(name : String){ println("$name of breed $breed says Woof Woof ") }

}
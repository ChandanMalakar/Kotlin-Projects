package com.chandan.bankaccountprogram

class BankAccount(
    var accountHolder:String,
    var balance:Double=0.0 ) {

    private val transactionHistory= mutableListOf<String>()

    fun acctBalance(){
        println("$accountHolder's balance is $balance")
    }
    fun deposit(amount:Double){
        balance += amount
//        println("New Balance is $balance")
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount:Double){
        if(balance>=amount){
            balance -= amount
//            println("New Balance is $balance")
            transactionHistory.add("$accountHolder withdrew $$amount")
        }
        else    println("Insufficient balance")
    }

    fun displayTranscationHistory(){
        println("The Transaction history for $accountHolder is : ")
        for(transaction in transactionHistory)
        {
            println(transaction)
        }
    }

}
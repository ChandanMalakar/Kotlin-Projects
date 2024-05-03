package com.chandan.bankaccountprogram

fun main(){


    val chandanBankAccount = BankAccount("Chandan", 10000.0)
    chandanBankAccount.deposit(10000.0)
    chandanBankAccount.withdraw(5000.0)
    chandanBankAccount.withdraw(20000.0)
    chandanBankAccount.displayTranscationHistory()
    chandanBankAccount.acctBalance()

    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTranscationHistory()
    sarahBankAccount.acctBalance()
}
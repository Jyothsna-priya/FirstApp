package com.example.firstapp

class Company<T> (text : T){
    var x = text
    fun display(){
        println(x)
    }
}
fun main(args: Array<String>){
    var name: Company<String> =
        Company<String>("GeeksforGeeks")
    var rank: Company<Int> = Company<Int>(22)
    name.display()
}

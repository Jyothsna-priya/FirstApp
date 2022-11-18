package com.example.firstapp

data class User(var name:String,var age:Int)

fun main(){
    var user1=User("jyo",22)
    var user2=User("jyo",22)
    println(user1==user2)
    println(user1===user2)
    println(user2.equals(user1))

}
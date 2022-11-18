package com.example.firstapp

class Tiger(name:String){
    init {
        println("name is $name")
    }
    constructor(myname:String,age:Int):this(myname){
        println("hey i am $myname")
    }
    constructor(id:Int):this("jyo",22){
        println("$id")
    }
}
fun main(){
    var tiger=Tiger("jyo",22)
}
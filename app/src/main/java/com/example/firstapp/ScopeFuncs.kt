package com.example.firstapp

class Sc(var name:String,var age:Int){

    fun A(){
        println(name)
        println(age)
    }
}
fun main(){
    Sc("jyo",22).let {
        it.age=it.age+10
        it.A()
    }
    Sc("Bob",21).apply {
        this.name="jyobob"
        this.A()
    }
}
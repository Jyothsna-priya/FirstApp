package com.example.firstapp

open class A(var a:Int,var b:Int){

}
fun main(){
    //extension function
    fun A.operate():Int{
        return a*b
    }
    fun display(a:A){
        println(a.operate())
    }
    display(A(4,5))
}

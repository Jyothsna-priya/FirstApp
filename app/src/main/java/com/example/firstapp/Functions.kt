package com.example.firstapp

fun mySum(a : Int, b : Int) : Int{
    return a+ b
}

fun getDeatils(name : String = "abc", age : Int = 100){

    println("my name is $name and age is $age")
}

fun getDeatils(){
    println("testing")
}


fun myMul(a : Int, b : Int) : Int {
    return a * b
}

fun myname() : Unit{
    println("my name is ansari")
}

fun myHigerOrder(anyfun : ()->Unit) : (Int, Int) -> Int{
    anyfun()
    return  ::myMul
}

fun main(){

    var res =   myHigerOrder(::myname)

    println(res(4,5))
}
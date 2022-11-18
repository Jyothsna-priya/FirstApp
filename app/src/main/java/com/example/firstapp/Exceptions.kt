package com.example.firstapp

fun main(){
    try{
        var a=10
        var b=0
        var c=2
        var res=a/b

    }
    catch (e:Exception){
        println("exception catched")
    }
    try{
        var c=2
        var b=0
        var ans=c/b

    }
    catch (e2:Exception) {
        println("2nd exception")
    }
}
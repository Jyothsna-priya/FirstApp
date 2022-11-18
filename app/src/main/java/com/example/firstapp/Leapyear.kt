package com.example.firstapp
import java.util.Scanner

class Leap(var year:Int){
    fun isLeap():String{
    if ((year%400==0) || (year%100!=0) && (year%4==0)) return "leap year" else return "not a leap year"

    }
}
fun main(){
    var sc=Scanner(System.`in`)
    println("enter year")
    var y:Int=sc.nextInt()
    println(Leap(y).isLeap())
}
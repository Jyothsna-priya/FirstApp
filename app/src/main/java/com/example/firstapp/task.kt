package com.example.firstapp
import java.util.Scanner

fun main(){
    var x=Scanner(System.`in`)
    println("enter name")
    var name:String=x.nextLine()
    if (name==" ")
        throw NullPointerException("name is null")
    var y=Scanner(System.`in`)
    println("enter phonenm")
    var phonenum:String= y.nextLine()
    val length1 = phonenum.length
    fun isNumeric(phonenum:String):Boolean{
        return phonenum.all { char->char.isDigit() }
    }
    var res=isNumeric(phonenum)
    if(length1!=10)
        throw  Exception("invalid length")
        if (res==false)
            throw Exception("not integer")
}
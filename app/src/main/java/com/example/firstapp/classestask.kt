package com.example.firstapp
import java.util.Scanner
class A1(var name:String, var phonenum: String) {
    fun valid() {
        if (name == " ")
            throw NullPointerException("name is null")
        val length1 = phonenum.length
        fun isNumeric(phonenum: String): Boolean {
            return phonenum.all { char -> char.isDigit() }
        }

        var res = isNumeric(phonenum)
        if (length1 != 10)
            throw  Exception("invalid length")
        if (res == false)
            throw Exception("not integer")
    }
}

fun main(){
    var s1 =Scanner(System.`in`)
    println("enter name")
    var name:String=s1.nextLine()
    var s2=Scanner(System.`in`)
    println("enter phonenum")
    var phonenum:String=s2.nextLine()
    var a1=A1(name,phonenum)
    a1.valid()
}
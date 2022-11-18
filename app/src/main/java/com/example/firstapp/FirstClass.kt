package com.example.firstapp
import java.util.Scanner
/*fun main(){
    println("hello world")

    var name="jyo"
    var college : String="iare"
    var age : Int = 21

    println("name is"+ name + "college is"+ college)
    println("name is $name")
    println("name count is ${name.length}")
}*/
fun main(args: Array<String>){
    var n= Scanner(System.`in`)
    var num1:Int=n.nextInt()
    when (num1){
        1-> println(num1+1)
        is Int->println("gud")
        //is String-> println(num1+"hey")
        else -> ("check input")
    }

}

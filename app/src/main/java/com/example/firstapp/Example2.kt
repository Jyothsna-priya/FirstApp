package com.example.firstapp

var num:Int=10
    get() {
        return 28
    }
fun area(a:Int,b:Int){
    fun answer()=a*b
    var result=answer()
    println(result)
}
fun max(a:Int,b:Int):Int=if (a>b){a} else{b}

fun elvisop(name:String){
    var res=name.length?:-1
    println(res)
}
fun main(){
    println(num)
    area(2,3)
    elvisop("jyo")
    println(max(10,11))
}
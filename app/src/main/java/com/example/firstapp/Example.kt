package com.example.firstapp


fun f1(array1:IntArray) {
    for (i in array1)
        if (i % 2 == 0) {
            print("$i" +" ")
        }
    println()
}
fun f2(array1: IntArray){
    var m=0
    for (i in array1)
    {
        m=i*10
        print("$m"+" ")
    }
    println()
}
fun f3(array1:IntArray){
    var res=array1[0]
    var ce=0
    for(i in 0..array1.size-2){
        ce=array1[i+1]
        res = res.plus(ce)
        print("$res"+" ")}
    println()
}
fun main(){
    var myarray:IntArray= intArrayOf(1,2,3,4,5)
    println("filter function")
    f1(myarray)
    println("map function")
    f2(myarray)
    println("reduce function")
    f3(myarray)
}

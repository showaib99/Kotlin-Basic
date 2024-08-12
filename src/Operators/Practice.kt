package Operators

import java.util.Scanner

fun main(args : Array<String>) {
    var show = Scanner(System.`in`)
    var a = show.nextInt()
    var b = show.nextInt()

    var sum = a + b
    println(sum)

    var sub = a - b
    println(sub)

    var multi = a * b
    println(multi)

    var div = a / b.toFloat()
    println(div)

    var mod = a % b
    println(mod)
}
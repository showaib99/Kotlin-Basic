package Operators

fun main(args : Array<String>) {
    var a = 120
    var b = 65
    //Addition Operator(+)
    var sum = a+b
    println("Sum: $sum")

    //Subtraction Operator(-)
    var sub = a-b
    println("Sub: $sub")

    //Multiplication Operator(*)
    var mult = a*b
    println("Multi: $mult")

    //Division Operator(/)
    var div = a/b.toDouble()
    println("Div: $div")

    //Modolas Operator
    var mod = a%b
    println("Mod: $mod")
}
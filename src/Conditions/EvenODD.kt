package Conditions

/*fun main(args: Array<String>) {
    print("Enter a Number: ")
    var number = readLine()!!.toInt()
    if(number % 2 == 0){
        println("$number is an Even")
    }else{
        println("$number is an ODD")
    }
}*/

fun main() {
    var a = readLine()!!.toInt()
    when(a%2){
        0-> println("$a is Even Number")
        else -> println("$a is Odd Number")
    }

}
package Loop

fun main(args: Array<String>) {
    var fac = 1
    var value = 5
    for(i in 1..value){
        fac*=i
    }
    println(fac)
}
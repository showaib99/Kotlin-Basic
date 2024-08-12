package Loop

fun main(args: Array<String>) {
    var f = 0
    var s = 1
    var n = 0

    for (i in 1..10){
        print("$f ")

        n= f + s
        f=s
        s=n
    }
}
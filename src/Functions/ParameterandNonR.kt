package Functions

fun main(args : Array<String>) {
    sum2(10, 20)
    sum2(10, 80)
    sum2(10, 120)
}

fun sum2(a:Int,b:Int) { //প্যারামিটার টাইপে অবশ্যই ইনপুটে ডাটা টাইপ উল্লেখ করে দিতে হবে।
    var sum =a+b
    println("Sum of $a and $b is $sum")
}
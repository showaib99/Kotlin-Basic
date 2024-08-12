package Functions

fun main(args : Array<String>) {
    var add = 10+ sum1()
    println(add)
}

fun sum1():Int{  //রিটার্ণ টাইপে অবশ্যই ডাটা টাইপ উল্লেখ করে দিতে হবে।
    var a = 10
    var b =20
    var sum = a+b
    return sum
}
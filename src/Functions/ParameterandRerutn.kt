package Functions

fun main(args : Array<String>) {
    println(sum3(10, 50))
    var r = sum3(50, 80)
    println(r)

    var add = 20 + sum3(90, 20)
    println(add)
}
                                //রিটার্ণ টাইপে অবশ্যই ডাটা টাইপ উল্লেখ করে দিতে হবে।
fun sum3(a:Int, b:Int):Int {   //প্যারামিটার টাইপে অবশ্যই ইনপুটে ডাটা টাইপ উল্লেখ করে দিতে হবে।
    var sum = a+b
    return sum
}
package Conditions

fun main() {
    var a = 10
    var b = 20
    var c = 30

    if(a>b && a>c){
        println("a is greater")
    }else if(b>a && b>c){
        println("b is greater")
    }else if(c>a && c>b){
        println("c is greater")
    }else if(a==b && a>c){
        println("a and b are equal")
    }else if(b==c && a>b){
        println("a and c are equal")
    }else if(b==c && b>a){
        println("b and c are equal")
    }
    else{
        println("All are equal")
    }
}
fun main() {
    name()
    var result=modulus(19,6)
    println(result)

    var addition=sum(19,18,4,9)
    println(addition)
    fact()

}
fun name(){
    var name=("Hello Melannie Tamara")
    println(name)
}
fun modulus(num1:Int,num2:Int):Int{
 var module=num1%num2
    return module
}

fun sum(a:Int,b:Int,c:Int,d:Int):Int{
    var sum=a+b+c+d
    return sum
}
fun fact(){
    var personality="Advocate"
    println(personality)
}
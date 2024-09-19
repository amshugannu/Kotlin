//fun main(){
//
//    sum(56,44)
//    sum();
//}
//fun sum(num1:Int = 3,num2:Int = 9){
//
//    println(num1+num2)
//}
//
fun main(){
    celciusToFarenheit(30.5F)
    farenheitToCelcius(86.9f)
}


fun celciusToFarenheit(num1:Float){
    var farenheit = ((num1 * 9)/5) + 32
    println("The $num1 degree celcius is equal to $farenheit farenheit")
}
fun farenheitToCelcius(num2:Float){
    var celcius =  ((num2-32)* 5)/9
    println("The $num2 degree farenheit is equal to $celcius celcius")
}



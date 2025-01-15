var x = 30
fun main(){
    var a = 10
    var b = 20
    var `try` = 50
    println("sum of " + a + "and "+ b + " is " +(a+b)) //String Concatenation
    println("sum  of $a and $b is ${a+b}")   //String interpolation
    println(`try`)                 // Using ``  symbol the keyword can be used as the variables and  identifiers
    abc()
    xyz()

    println(x)

}


// create a simple function and declare a variable print the variable and close and try to access the local variable of the function in
//the main function

//way 1 : Global declaration
// way 2 : declaration of the variable inside a new function and calling in main
//way 3 : declaration of the variable inside a new class and calling in main
// way 4: calling main function in other function

fun xyz(){
    var y = 40
}

fun abc(){
    var x = 10;
    println(x);
    println("Lovely\n\tProfessional\n\t\tuniversity")
    println("""lovely 
    professional
    	university""")
}
//Design a kotlin program for a store to determine eligibility for a special offer based on the total amount and membership status .
import java.util.*;

fun main(){
    var sc = Scanner(System.`in`)
    var amount = sc.nextInt()
    var membership = sc.nextBoolean()

    if(amount>= 1000){
        if(membership){
            println("You get 20 percent discount")
        }
        else{
            println("you wll get 10 percent discount")
        }
    }
    else{
        println("You get no discount")
    }

}
//Design a kotlin program for a store to determine eligibility for a special offer based on the total amount and membership status .

fun main(){
    var a = readLine()
    var amount = a?.toInt()
    var b = readLine()
    var member:Boolean = b.toBoolean()


    if (amount != null) {
        if(amount>=1000){
            if(member){
                println("You got 20% discount")
            } else{
                println("You get 10% discount")
            }
        } else{
            println("You don't get any discount")
        }
    }
}

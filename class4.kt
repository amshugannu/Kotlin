fun main(){
    val x:Int = 100
    val y: Long = x.toLong() //Typecasting Int to Long
    println(y)

    val a:String= "100"
    val b:Int = a.toInt() // Typecasting String to Int
    println(b)



    val str:String = "This is String"
    val num:String? = str as? String //
    if(num!=null){
        println("Typecasting sucessfull")
    }
    else{
        println("typecasting is unsucessfull")
    }

    //Usage of When
    //
    val dayOfTheWeek = (readLine())?.toInt()

    val dayName = when(dayOfTheWeek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(dayName);

    var number = 45
    var remainder = number%2
    val result = when(remainder){
        1-> "It's an odd number"
        0 -> "It's an even number"
        else -> "Invalid"
    }
    println(result)

    var num1 = 45;
    when{
        num1%2 == 0 -> println("It's an even number")
        num1%2 != 0 -> println("It's an odd number")
        else -> println("Invalid")
    }


}

//CLASS 5

fun main(){
    for(i in 1..5){ //Ranges
        print(i)  // printing number using for loop
    }
    println()
    for(i in 1 until 5 ){
        print(i) // Iterating using until
    }
    println()
    for(i in 5 downTo  1 ){ // decrementing the numbers
        print(i)  // Reverse Iteration using downto
    }
    println()
    for(i in 1..10 step 2){
        print(i)   // Iterating while incrementing
    }
    println()

    var alph : Array<String> = arrayOf("A","B","C","D","E")
    var a = alph.size
    println(a)
    for(i in alph){
        print(" $i ")
    }
    println()
    var alpha = listOf("X","Y","Z")

    for(i in alpha){
        print(" $i ")
    }
    println()

    var str_array = arrayOf("Hi","Hello","123")

    for(i in 0 until str_array.size){
        println("Element at index $i is  "+ str_array[i])
    }
    println()
    for(i in str_array.indices){
        println("Element at index $i is  ${str_array[i]}")
    }



}
fun main(){
// Array of integers
    val numbers = arrayOf(1,2,3,4,5)
    //Array of strings
    var words: Array<String> = arrayOf("Kotlin","Java","Python","Cpp")
    // Array of squares using lambda function
    val squares = Array(5) { i -> i*i}

    // Accesssing elements in arrays
    var firstNumber = numbers[0]
    var secondWord = words[1]

    println("first number : $firstNumber")
    println("second word : $secondWord")

    // manipulating the elements in the array

    numbers[2]=10
    var manipulatedelement = numbers[2]
    println("the manipulated number : $manipulatedelement")

    //printing the array using the for loop

    for(i in numbers){
        print("$i ")
    }

    //printing the elements in array using for each loop

    words.forEach { word -> println(word)}

    //properties of the arrays

    val size = numbers.size
    println("Size of the array numbers is $size");

    if (numbers.isEmpty()){
        println("Numbers array is empty")
    }
    else{
        println("Numbers array is not empty")
    }
    val firstElement = numbers.first();
    val lastElement = numbers.last();




}
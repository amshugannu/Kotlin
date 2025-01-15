//class XYZ{
//    fun intro(){
//        println("Hi this Amshu ")
//    }
//}
//fun main(){
//    var a = XYZ()
//    a.intro()
//}

// Constructors
//Seconddary Cnstructor

//class Introduction{
//
//    var name:String
//    var age:Int
//
//    constructor(name:String,age:Int){
//        this.name = name
//        this.age = age
//    }
//    constructor(name:String){
//        this.name = name
//        this.age = 10
//    }
//    constructor(){
//        this.name = "RAVI"
//        this.age = 8
//    }
//
//    fun intro(){
//        println("my name is $name ");
//        println("MY age is $age");
//    }
//}
//fun main(){
//    var a = Introduction("Amshu",19)
//    var b = Introduction("kid")
//    var c = Introduction()
//    a.intro()
//    b.intro()
//    c.intro()
//}


//Primary Constructor

class Introduction{

    var name:String
    var age:Int

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }
    constructor(name:String){
        this.name = name
        this.age = 10
    }
    constructor(){
        this.name = "RAVI"
        this.age = 8
    }

    fun intro(){
        println("my name is $name ");
        println("MY age is $age");
    }
}
fun main(){
    var a = Introduction("Amshu",19)
    var b = Introduction("kid")
    var c = Introduction()
    a.intro()
    b.intro()
    c.intro()
}












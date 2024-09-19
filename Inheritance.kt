import kotlin.math.PI

//the class which can be inherited should be declared as Open and inherit the class uing : symboL

//SYNTAX

// open class XYZ
//{
//
//}
//class ABC:XYZ{
//
//}

// Create a class

open class Rectangle(var a:Double,var b:Double){

    open fun Area():Double{
        return a*b
    }
    open fun Display(){
        println("The area of the rectangle with dimensions $a and $b is ${Area()}")
    }
}
open class Square(var s:Double):Rectangle(s,s){
    override fun Display(){
        println("The area of the square with dimension $s is ${Area()}")
    }
}
class Circle(var radius:Double):Square(radius){
    override fun Area():Double{
        return PI*radius*radius
    }
    override fun Display(){
        println("The area of the circle with radius $radius is ${Area()}")
    }
}

fun main(){
    var d = Rectangle(10.0,20.0)
    d.Display()
    var x = Square(10.0)
    x.Display()
    var y = Circle(2.5)
    y.Display()
}

// Home work // Write a program using recursions to find the factorial of the number






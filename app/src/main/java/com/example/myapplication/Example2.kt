package com.example.myapplication

interface Shape {
    fun area()
    fun perimeter() : Int
}

open class Rectangle(protected var width : Int, protected var length : Int) : Shape{

    override fun area() {
        println(width * length)
    }

    override fun perimeter(): Int {
        return  2*(width + length)
    }

}

class Parallelepiped(width: Int, length: Int, var height :Int) : Rectangle(width,length){
    override fun area() {
        println(2*(width*length + length*height + height*width))
    }

    override fun perimeter(): Int {
        return 4*(width + length + height)
    }
}

fun main(){
    var r1 = Rectangle(5,4)
    r1.area()

    var p1 = Parallelepiped(5,4,8)
    p1.area()
}
package com.example.myapplication

class Person : Any() {
    var name : String = ""
    var age : Int = 0
    var height : Double = 0.0
    var hasCar : Boolean = false

    override fun toString(): String {
        return "name : $name \nage : $age"
    }

//    person1.equals(person2)

    override fun equals(other: Any?): Boolean {
        if (other is Person){
            if (name == other.name && age == other.age){
                return true
            }
        }
        return false
    }

}

fun main(){
    var person1 = Person()
    person1.name = "keti"
    person1.age = 23


    var person2 = Person()
    person2.name = "keti"
    person2.age = 27

    println(person1 == person2)


}



package com.dependency.code.types

import com.dependency.code.typeAbstract.Person

class Musician(name:String): Person(name) {
    fun performTask(instrument:String){
        println("$name is playing $instrument")
    }
}
package com.dependency.code.types

import com.dependency.code.typeAbstract.Person

class Student (name:String) : Person(name){
    fun study(subject:String){
        println("$name is studying $subject")
    }
}
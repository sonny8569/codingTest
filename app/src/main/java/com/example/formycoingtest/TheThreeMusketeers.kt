package com.example.formycoingtest

class TheThreeMusketeers {

    fun theThreeMusketeers(number : IntArray) :Int{
        var answer: Int = 0
        for(first in number.indices){
            for(second in first +1 until number.size){
                for(third in second+1 until number.size){
                    if(number[first] + number[second] + number[third] == 0 ){
                        answer++
                    }
                }
            }
        }
        return answer
    }
}
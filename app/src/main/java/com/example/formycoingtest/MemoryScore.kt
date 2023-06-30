package com.example.formycoingtest

import android.util.Log

class MemoryScore {
    fun yearningPhoto(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val nameAndScore = HashMap<String , Int>()
        var answer: IntArray = intArrayOf()
        var score : Int =  0
        for(item in name.indices){
            nameAndScore[name[item]] = yearning[item]
        }
        for(item in photo){
            for(element in item) {
                if(nameAndScore.containsKey(element)){
                    score += nameAndScore[element]!!
                }
            }
            answer += score
            score = 0
        }
        return answer
    }
}
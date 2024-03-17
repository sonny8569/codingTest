package com.example.formycoingtest

import android.util.Log

class TallerThanMuggy {
    private fun tallerThanMuggy(data : IntArray, height : Int): Int {
        var index = 0
        for(item in data){
            if(item > height){
                index++
            }
        }
        return index
    }
}
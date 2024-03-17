package com.example.formycoingtest

import android.util.Log

class UpperLowerString {
    private val TAG : String = "CodingText"

    private fun reformData(data : String) {
        val makeAnswer = data.map {
            if(it.isUpperCase()){
                it.lowercaseChar()
            }else{
                it.uppercaseChar()
            }
        }.toCharArray()
        val result = String(makeAnswer)
        Log.d(TAG, result)
    }
}
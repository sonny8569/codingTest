package com.example.formycoingtest

import android.util.Log

class OverWriteString {
    private val TAG : String = "CodingText"

    private fun getOverrideString(data : String , overrideString : String , startLength : Int){
        var index = 0
        val updateData : Array<String> = data.toCharArray().map { it.toString() }.toTypedArray()
        for(item in 0..updateData.size){
            if(item >= startLength){
                updateData[item] = overrideString[index].toString()
                index++
            }
            if(index == overrideString.length){
                Log.d(TAG, "The overrideString length is end")
                break
            }
        }
        Log.d(TAG , "The beforeData $data")
        Log.d(TAG, "The newData ${updateData.joinToString("")}")
    }

}
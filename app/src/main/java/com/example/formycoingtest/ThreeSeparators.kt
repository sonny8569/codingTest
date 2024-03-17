package com.example.formycoingtest

class ThreeSeparators {
    fun threeDefine(data : String): Array<String> {
        var answer: Array<String> = arrayOf<String>()

        val split = data.split("a" , "b" , "c")
        for(item in split) {
            if(item != ""){
                answer += item
            }
        }
        if(answer.isEmpty()){
            answer+="EMPTY"
        }
        return answer
    }

}
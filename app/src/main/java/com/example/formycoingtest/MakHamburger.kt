package com.example.formycoingtest

import android.util.Log

class MakHamburger {
    private fun makeHamburger(ingredient : IntArray): Int {
        var answer = 0
        var dataString = ""
        for (i in ingredient.indices) {
            if (ingredient[i] == 1 && i <= ingredient.size - 4 && ingredient[i + 1] == 2 && ingredient[i + 2] == 3 && ingredient[i + 3] == 1) {
                answer++
            }
        }
        return answer
    }
}
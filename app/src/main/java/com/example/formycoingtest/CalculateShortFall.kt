package com.example.formycoingtest

class CalculateShortFall {

    private fun calculateShortfall(price: Int, money: Int, count: Int) : Long {
        var totalPrice : Long = 0
        var newMoney : Long = money.toLong()
        var count : Long = count.toLong()
        for(data in 1..count){
            totalPrice += data * price
        }
        val answer : Long  = (money - totalPrice).toLong()
        if(answer > 0){
            return 0
        }
        return answer * -1
    }
}
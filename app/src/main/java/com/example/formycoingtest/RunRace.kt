package com.example.formycoingtest

import android.util.Log

class RunRace {
    private fun runRace(players : Array<String> , callings :Array<String>): Array<String> {
        val playerMap = HashMap<String , Int>()
        for(item in players.indices){
            playerMap[players[item]] = item
        }
        for (item in callings) {
            if (playerMap.containsKey(item)) {
                val selectPlayerIndex = playerMap[item]!!
                val orginPlayerIndex = playerMap[item]!! -1

                val orginePlayer = players[orginPlayerIndex]
                val selectPlayer = players[selectPlayerIndex]

                players[orginPlayerIndex] = selectPlayer
                players[selectPlayerIndex] = orginePlayer

                playerMap[item] = orginPlayerIndex
                playerMap[orginePlayer] = selectPlayerIndex
            }
        }
        return players
    }
}
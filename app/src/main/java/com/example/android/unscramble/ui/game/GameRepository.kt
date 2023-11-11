package com.example.android.unscramble.ui.game

import javax.inject.Inject

class GameRepository @Inject constructor(){
    fun getAllWordsList() : List<String> {
        return allWordsList
    }
}
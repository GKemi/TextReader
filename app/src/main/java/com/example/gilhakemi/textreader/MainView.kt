package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.Word

/**
 * Created by work on 22/09/2019.
 */
interface MainView {
    fun showWords(words: List<Word>?)
    fun getWords()
}
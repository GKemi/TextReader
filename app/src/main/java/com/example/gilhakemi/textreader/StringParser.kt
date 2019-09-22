package com.example.gilhakemi.textreader

/**
 * Created by work on 22/09/2019.
 */
class StringParser {

    fun parse(phrase: String): List<String> {
        val words = phrase.split(" ")
        return words
    }

}
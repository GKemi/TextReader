package com.example.gilhakemi.textreader

/**
 * Created by work on 22/09/2019.
 */
import java.util.regex.Pattern

class StringParser {

    fun parse(phrase: String): List<String> {
        val pattern = Pattern.compile("\\w+")
        val matcher = pattern.matcher(phrase)
        val words = mutableListOf<String>()
        while (matcher.find()) {
            words.add(matcher.group())
        }
        return words
    }

}
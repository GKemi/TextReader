package com.example.gilhakemi.textreader

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class StringParserTests {
    private lateinit var phrase: String
    private lateinit var wordList: List<String>
    private lateinit var stringParser: StringParser

    @Before
    fun setup() {
        stringParser = StringParser()
    }

    @Test
    fun parserCanExtractOneWord() {
        //given I have an expected string
        phrase = "hello"

        //when I provide it to the parse
        wordList = stringParser.parse(phrase)

        //then the parse returns a list with the word
        assertEquals(wordList.size, 1)
    }
}
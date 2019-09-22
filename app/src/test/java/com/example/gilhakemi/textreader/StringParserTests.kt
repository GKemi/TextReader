package com.example.gilhakemi.textreader

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
    fun parserCanExtractWords() {
        givenIHaveAnExpectedString("hello world")

        whenARequestIsMadeToParseTheString()

        thenTheCorrectNumberOfWordsIsReturned(2)
    }

    @Test
    fun parserExtractsWordsWithPunctuation() {
        givenIHaveAnExpectedString("hello World. I am's not a robot!")

        whenARequestIsMadeToParseTheString()

        thenTheCorrectNumberOfWordsIsReturned(7)
    }

    @Test
    fun parserExtractsWordsWithContractions() {
        givenIHaveAnExpectedString("Hello Gil's world. I am not a robot!")

        whenARequestIsMadeToParseTheString()

        thenTheCorrectNumberOfWordsIsReturned(8)
    }

    private fun givenIHaveAnExpectedString(expectedString: String) {
        phrase = expectedString
    }

    private fun whenARequestIsMadeToParseTheString() {
        wordList = stringParser.parse(phrase)
    }

    private fun thenTheCorrectNumberOfWordsIsReturned(expectedNumberOfWords: Int) {
        assertEquals(wordList.size, expectedNumberOfWords)
    }
}
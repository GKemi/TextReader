package com.example.gilhakemi.textreader

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class WordDeduplicatorTests {
    lateinit var listOfInputtedWords: MutableList<String>
    lateinit var listOfExpectedWords: MutableList<String>
    lateinit var wordDeduplicator: WordDeduplicator

    @Before
    fun setup() {
        listOfInputtedWords = mutableListOf()
        listOfExpectedWords = mutableListOf()
        wordDeduplicator = WordDeduplicator()
    }

    @Test
    fun listOfWordsIsDeduplicated() {
        givenWeHaveAListOfWords()

        whenARequestToTheWordDeduplicatorIsMade()

        thenTheCorrectNumberOfWordsIsInTheList(6)
    }

    private fun givenWeHaveAListOfWords() {
        listOfInputtedWords.add("hello")
        listOfInputtedWords.add("world")
        listOfInputtedWords.add("Gil's")
        listOfInputtedWords.add("gil's")
        listOfInputtedWords.add("I")
        listOfInputtedWords.add("world")
        listOfInputtedWords.add("i")
        listOfInputtedWords.add("am")
        listOfInputtedWords.add("here")
    }

    private fun whenARequestToTheWordDeduplicatorIsMade() {
        listOfExpectedWords = wordDeduplicator.deduplicate(listOfInputtedWords)
    }

    private fun thenTheCorrectNumberOfWordsIsInTheList(numberOfWords: Int) {
        assertEquals(numberOfWords, listOfExpectedWords.size)
    }
}
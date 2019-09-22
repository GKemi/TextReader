package com.example.gilhakemi.textreader

import android.util.ArrayMap
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class WordDeduplicatorTests {
    lateinit var listOfInputtedWords: MutableList<String>
    lateinit var mapOfExpectedWords: MutableMap<String, Int>
    lateinit var wordDeduplicator: WordDeduplicator

    @Before
    fun setup() {
        listOfInputtedWords = mutableListOf()
        mapOfExpectedWords = mutableMapOf()
        wordDeduplicator = WordDeduplicator()
    }

    @Test
    fun listOfWordsIsDeduplicated_withTheCorrectNumberOfOccurrences() {
        givenWeHaveAListOfWords()

        whenARequestIsMadeToRemoveDuplicates()

        thenANewMapShouldBeReturnedWithTheCorrectNumberOfWords(6)
        andWordsHaveCorrectNumberOfOccurrences()
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

    private fun whenARequestIsMadeToRemoveDuplicates() {
        mapOfExpectedWords = wordDeduplicator.deduplicate(listOfInputtedWords)
    }

    private fun thenANewMapShouldBeReturnedWithTheCorrectNumberOfWords(numberOfWords: Int) {
        assertEquals(numberOfWords, mapOfExpectedWords.size)
        andWordsHaveCorrectNumberOfOccurrences()
    }

    private fun andWordsHaveCorrectNumberOfOccurrences() {
        assertEquals(1, mapOfExpectedWords["hello"])
        assertEquals(2, mapOfExpectedWords["world"])
        assertEquals(2, mapOfExpectedWords["gil's"])
        assertEquals(2, mapOfExpectedWords["i"])
        assertEquals(1, mapOfExpectedWords["am"])
        assertEquals(1, mapOfExpectedWords["here"])
    }
}
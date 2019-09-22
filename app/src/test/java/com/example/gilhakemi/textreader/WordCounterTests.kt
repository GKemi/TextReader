package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.Word
import com.example.gilhakemi.textreader.core.WordCounter
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class WordCounterTests {
    lateinit var listOfInputtedWords: MutableList<String>
    lateinit var mapOfExpectedWords: MutableList<Word>
    lateinit var wordCounter: WordCounter

    @Before
    fun setup() {
        listOfInputtedWords = mutableListOf()
        mapOfExpectedWords = mutableListOf()
        wordCounter = WordCounter()
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
        mapOfExpectedWords = wordCounter.deduplicate(listOfInputtedWords)
    }

    private fun thenANewMapShouldBeReturnedWithTheCorrectNumberOfWords(numberOfWords: Int) {
        assertEquals(numberOfWords, mapOfExpectedWords.size)
        andWordsHaveCorrectNumberOfOccurrences()
    }

    private fun andWordsHaveCorrectNumberOfOccurrences() {
        assertEquals(1, mapOfExpectedWords[0].occurrences)
        assertEquals(2, mapOfExpectedWords[1].occurrences)
        assertEquals(2, mapOfExpectedWords[2].occurrences)
        assertEquals(2, mapOfExpectedWords[3].occurrences)
        assertEquals(1, mapOfExpectedWords[4].occurrences)
        assertEquals(1, mapOfExpectedWords[5].occurrences)
    }
}
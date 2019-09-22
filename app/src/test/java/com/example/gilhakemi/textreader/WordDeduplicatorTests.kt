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
        //given we have a list of words
        listOfInputtedWords.add("hello")
        listOfInputtedWords.add("world")
        listOfInputtedWords.add("I")
        listOfInputtedWords.add("world")
        listOfInputtedWords.add("i")
        listOfInputtedWords.add("am")
        listOfInputtedWords.add("here")

        //when a request a made to deduplicate them
        listOfExpectedWords = wordDeduplicator.deduplicate(listOfInputtedWords)

        //then a list should be returned with extra occurrences removed
        assertEquals(5, listOfExpectedWords.size)
    }
}
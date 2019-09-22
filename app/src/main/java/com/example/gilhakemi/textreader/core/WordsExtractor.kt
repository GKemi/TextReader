package com.example.gilhakemi.textreader.core

/**
 * Created by work on 22/09/2019.
 */
class WordsExtractor {
    private val stringParser = StringParser()
    private val wordCounter = WordCounter()

    fun extractWords(string: String): List<Word> {
        val words = stringParser.parse(string)
        val wordsWithCount = wordCounter.deduplicate(words)
        return wordsWithCount
    }
}
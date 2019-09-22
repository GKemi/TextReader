package com.example.gilhakemi.textreader.core

/**
 * Created by work on 22/09/2019.
 */

class WordCounter {

    fun deduplicate(listOfWords: MutableList<String>): MutableList<Word> {
        val newListOfWords = mutableListOf<Word>()

        for (word in listOfWords) {
            val wordLowerCased = Word(word.toLowerCase())

            if (newListOfWords.contains(wordLowerCased)) {
                val wordPosition = newListOfWords.indexOf(wordLowerCased)
                val wordObject = newListOfWords[wordPosition]
                wordObject.occurrences += 1
            } else {
                newListOfWords.add(wordLowerCased)
            }

        }
        return newListOfWords
    }

}
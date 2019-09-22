package com.example.gilhakemi.textreader

import android.util.ArrayMap

/**
 * Created by work on 22/09/2019.
 */

class WordDeduplicator {

    fun deduplicate(listOfWords: MutableList<String>): MutableMap<String, Int> {
        val newMapOfWords = mutableMapOf<String, Int>()

        for (word in listOfWords) {
            val wordLowerCased = word.toLowerCase()
            if (newMapOfWords.containsKey(wordLowerCased)) {
                var wordCount = newMapOfWords.getValue(wordLowerCased)
                wordCount += 1
                newMapOfWords[wordLowerCased] = wordCount
                continue
            }
            newMapOfWords.put(wordLowerCased, 1)
        }
        return newMapOfWords
    }

}
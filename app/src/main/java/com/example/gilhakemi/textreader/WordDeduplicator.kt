package com.example.gilhakemi.textreader

/**
 * Created by work on 22/09/2019.
 */

class WordDeduplicator {

    fun deduplicate(listOfWords: MutableList<String>): MutableList<String> {
        val newList = mutableListOf<String>()

        for (word in listOfWords) {
            val wordLowerCased = word.toLowerCase()
            if (newList.contains(wordLowerCased)) continue
            newList.add(wordLowerCased)
        }
        return newList
    }

}
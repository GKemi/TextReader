package com.example.gilhakemi.textreader

/**
 * Created by work on 22/09/2019.
 */

class WordDeduplicator {

    fun deduplicate(listOfWords: MutableList<String>): MutableList<String> {
        val newList = mutableListOf<String>()

        listOfWords
                .map { it.toLowerCase() }
                .filterNot { newList.contains(it) }
                .forEach { newList.add(it) }

        return newList
    }

}
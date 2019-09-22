package com.example.gilhakemi.textreader

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class WordRetrievalTests {
    lateinit var view: MockMainView

    @Test
    fun viewRetrievesAListOfWords_whenARequestForOpeningATextFileIsMade() {
        //given there is a view
        view = MockMainView()

        //when the view requests for a text file
        view.getWords()

        //then a list of words should be returned
        assertNotNull(view.words)
    }

}
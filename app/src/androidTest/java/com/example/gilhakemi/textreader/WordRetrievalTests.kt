package com.example.gilhakemi.textreader

import android.app.Application
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import android.app.Instrumentation.newApplication
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner



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

    @Test
    fun viewRetrievesAListOfWords_withAssociatedOccurrences() {
        //given there is a view
        view = MockMainView()

        //when the view requests for a text file
        view.getWords()

        //then a list of words should be returned with occurrences
        assertEquals("the", view.words!![0].word)
        assertEquals(3366, view.words!![0].occurrences)
        assertEquals("railway", view.words!![1].word)
        assertEquals(54, view.words!![1].occurrences)
        assertEquals("children", view.words!![2].word)
        assertEquals(157, view.words!![2].occurrences)
    }


}


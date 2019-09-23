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

    @Before
    fun setup() {
        view = MockMainView()
    }

    @Test
    fun viewRetrievesAListOfWords_whenARequestForOpeningATextFileIsMade() {
        //given there is a view

        whenTheViewRequestsForAListOfWords()

        thenAListOfWordsShouldBeReturned()
    }

    @Test
    fun viewRetrievesAListOfWords_withAssociatedOccurrences() {
        //given there is a view

        whenTheViewRequestsForAListOfWords()

        thenAListOfWordsShouldBeReturnedWithAssociatedOccurrences()
    }

    @Test
    fun viewRetrievesAListOfWords_withValueIndicatingOccurrencesIsPrime() {
        //given there is a view

        whenTheViewRequestsForAListOfWords()

        thenAListOfWordsShouldBeReturned_withAssociatedOccurrencesPrimeValue()
    }

    private fun whenTheViewRequestsForAListOfWords() {
        view.getWords()
    }

    private fun thenAListOfWordsShouldBeReturned() {
        assertNotNull(view.words)
    }

    private fun thenAListOfWordsShouldBeReturnedWithAssociatedOccurrences() {
        assertEquals("the", view.words!![0].word)
        assertEquals(3366, view.words!![0].occurrences)
        assertEquals("railway", view.words!![1].word)
        assertEquals(54, view.words!![1].occurrences)
        assertEquals("children", view.words!![2].word)
        assertEquals(157, view.words!![2].occurrences)
    }

    private fun thenAListOfWordsShouldBeReturned_withAssociatedOccurrencesPrimeValue() {
        assertEquals("the", view.words!![0].word)
        assertFalse(view.words!![0].occurrencesPrime)
        assertEquals("railway", view.words!![1].word)
        assertFalse(view.words!![1].occurrencesPrime)
        assertEquals("children", view.words!![2].word)
        assertTrue(view.words!![2].occurrencesPrime)
    }
}


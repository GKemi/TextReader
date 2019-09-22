package com.example.gilhakemi.textreader

import android.content.Context
import android.support.test.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by work on 22/09/2019.
 */
class TextAdapterTest {
    lateinit var textAdapter: TextPort
    lateinit var textFile: String
    lateinit var context: Context

    @Before
    fun setup() {
        context = InstrumentationRegistry.getContext()
    }

    @Test
    fun textFileGetsContentConvertedIntoCorrectString() {
        givenIHaveATextAdapter()

        whenIOptToOpenAFile("testTwo.txt")

        thenIShouldretrieveTheAppropriateString()
    }

    @Test
    fun textFileGetsContentConvertedIntoCorrectString_whenThereAreNewLines() {
        givenIHaveATextAdapter()

        whenIOptToOpenAFile("test.txt")

        thenIShouldRetrieveTheAppropriateString_withLineBreaks()
    }

    private fun givenIHaveATextAdapter() {
        textAdapter = TextAdapter(context)
    }

    private fun whenIOptToOpenAFile(fileName: String) {
        textFile = textAdapter.openFile(fileName)
    }

    private fun thenIShouldretrieveTheAppropriateString() {
        assertEquals("Hello I am Gil", textFile)
    }

    private fun thenIShouldRetrieveTheAppropriateString_withLineBreaks() {
        assertEquals("this is a test file\n" +
                "\n" +
                "Lets convert this wonderful text into a string. I can't wait!", textFile)
    }
}
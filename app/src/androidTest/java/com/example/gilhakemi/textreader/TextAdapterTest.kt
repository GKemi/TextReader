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
    lateinit var context: Context

    @Before
    fun setup() {
        context = InstrumentationRegistry.getContext()
    }

    @Test
    fun readTestFileFromAssets() {
        //given I have a text adapter
        textAdapter = TextAdapter(context)

        //when I make a request to open a file
        val textFile = textAdapter.openFile("test.txt")

        //then a file should successfully be retrieved
        assertNotNull(textFile)
    }

    @Test
    fun textFileGetsContentConvertedIntoCorrectString() {
        //given I have opened a text file
        textAdapter = TextAdapter(context)
        val textFile = textAdapter.openFile("testTwo.txt")

        //when I opt to convert the content into a string
        val textConvertedToString = textAdapter.convertToString(textFile)

        //I should retrieve the appropriate string value
        assertEquals("Hello I am Gil", textConvertedToString)
    }

    @Test
    fun textFileGetsContentConvertedIntoCorrectString_whenThereAreNewLines() {
        //given I have opened a text file
        textAdapter = TextAdapter(context)
        val textFile = textAdapter.openFile("test.txt")

        //when I opt to convert the content into a string
        val textConvertedToString = textAdapter.convertToString(textFile)

        //I should retrieve the appropriate string value
        assertEquals("this is a test file\n" +
                "\n" +
                "Lets convert this wonderful text into a string. I can't wait!", textConvertedToString)
    }
}
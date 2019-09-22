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
    fun textFileGetsContentConvertedIntoCorrectString() {
        //given I have a text adapter
        textAdapter = TextAdapter(context)

        //when I opt to open a file
        val textFile = textAdapter.openFile("testTwo.txt")

        //then I should retrieve the appropriate string value
        assertEquals("Hello I am Gil", textFile)
    }

    @Test
    fun textFileGetsContentConvertedIntoCorrectString_whenThereAreNewLines() {
        //given I have a text adapter
        textAdapter = TextAdapter(context)

        //when I opt to open a file
        val textFile = textAdapter.openFile("test.txt")

        //I should retrieve the appropriate string value
        assertEquals("this is a test file\n" +
                "\n" +
                "Lets convert this wonderful text into a string. I can't wait!", textFile)
    }
}
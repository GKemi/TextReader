package com.example.gilhakemi.textreader

import android.content.Context
import java.io.File
import java.io.InputStream
import java.io.BufferedReader
import java.io.InputStreamReader


/**
 * Created by work on 22/09/2019.
 */
class TextAdapter(val applicationContext: Context): TextPort {
    override fun openFile(name: String): String {
        val fileInputStream = applicationContext.assets.open(name)

        return convertToString(fileInputStream)
    }

    private fun convertToString(file: InputStream) = file.bufferedReader().use { it.readText() }

}
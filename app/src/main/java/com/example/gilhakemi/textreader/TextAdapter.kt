package com.example.gilhakemi.textreader

import android.content.Context
import java.io.InputStream

class TextAdapter(val applicationContext: Context): TextPort {
    override fun openFile(name: String): String {
        val fileInputStream = applicationContext.assets.open(name)

        return convertToString(fileInputStream)
    }

    private fun convertToString(file: InputStream) = file.bufferedReader().use { it.readText() }
}
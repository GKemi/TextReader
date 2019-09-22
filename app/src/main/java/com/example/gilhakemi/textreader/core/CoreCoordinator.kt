package com.example.gilhakemi.textreader.core

import android.content.Context
import com.example.gilhakemi.textreader.MainPresenter
import com.example.gilhakemi.textreader.TextAdapter
import com.example.gilhakemi.textreader.TextPort

/**
 * Created by work on 22/09/2019.
 */
class CoreCoordinator(applicationContext: Context) {
    private var textAdapter: TextPort = TextAdapter(applicationContext)
    private var wordsExtractor: WordsExtractor = WordsExtractor()

    private var presenter: MainPresenter? = null

    fun attachPresenter(presenter: MainPresenter) {
        this.presenter = presenter
    }

    fun detachPresenter() {
        presenter = null
    }

    fun getWordsFromFile(fileName: String) {
        val fileString = textAdapter.openFile(fileName)
        val listOfWords = wordsExtractor.extractWords(fileString)
        presenter?.showWords(listOfWords)
    }
}
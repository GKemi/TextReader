package com.example.gilhakemi.textreader.core

import android.content.Context
import com.example.gilhakemi.textreader.MainPresenter
import com.example.gilhakemi.textreader.TextAdapter
import com.example.gilhakemi.textreader.TextPort

/**
 * Created by work on 22/09/2019.
 */
class CoreInteractor(applicationContext: Context): Interactor {
    private var textAdapter: TextPort = TextAdapter(applicationContext)
    private var wordsExtractor: WordsExtractor = WordsExtractor()

    private var presenter: MainPresenter? = null

    override fun attachPresenter(presenter: MainPresenter) {
        this.presenter = presenter
    }

    override fun detachPresenter() {
        presenter = null
    }

    override fun getWordsFromFile(fileName: String) {
        val fileString = textAdapter.openFile(fileName)
        val listOfWords = wordsExtractor.extractWords(fileString)
        presenter?.showWords(listOfWords)
    }
}
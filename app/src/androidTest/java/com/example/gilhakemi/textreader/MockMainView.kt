package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.Word

/**
 * Created by work on 22/09/2019.
 */
class MockMainView: MainView {
    var presenter = MainPresenter()

    var words: MutableList<Word>? = null

    override fun getWords() {
        presenter.getWordsFromFile("testTwo.txt")
    }

    override fun showWords(words: MutableList<Word>?) {
        this.words = words
    }
}
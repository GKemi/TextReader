package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.Word

/**
 * Created by work on 22/09/2019.
 */
class MockMainView: MainView {
    var presenter = MainPresenter(this)

    var words: List<Word>? = null

    override fun getWords() {
        presenter.getWordsFromFile("THE RAILWAY CHILDREN.txt")
    }

    override fun showWords(words: List<Word>?) {
        this.words = words
    }
}
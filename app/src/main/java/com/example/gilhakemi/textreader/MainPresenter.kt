package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.Interactor
import com.example.gilhakemi.textreader.core.Word

/**
 * Created by work on 22/09/2019.
 */
class MainPresenter(var view: MainView?) {
    var interactor: Interactor? = null

    init {
        getCore()
    }

    fun getCore() {
        interactor = MainApplication.getInteractor()
        interactor?.attachPresenter(this)
    }

    fun getWordsFromFile(fileName: String) {
        interactor?.getWordsFromFile(fileName)
    }

    fun showWords(listOfWords: List<Word>) {
        view?.showWords(listOfWords)
    }

    fun onDestroy() {
        interactor?.detachPresenter()
        interactor = null
        view = null
    }
}
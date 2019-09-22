package com.example.gilhakemi.textreader

import com.example.gilhakemi.textreader.core.CoreCoordinator
import com.example.gilhakemi.textreader.core.MainApplication
import com.example.gilhakemi.textreader.core.Word

/**
 * Created by work on 22/09/2019.
 */
class MainPresenter(var view: MainView?) {
    var core: CoreCoordinator? = null

    init {
        getCore()
    }

    fun getCore() {
        core = MainApplication.getCore()
        core?.attachPresenter(this)
    }

    fun getWordsFromFile(fileName: String) {
        core?.getWordsFromFile(fileName)
    }

    fun showWords(listOfWords: List<Word>) {
        view?.showWords(listOfWords)
    }

    fun onDestroy() {
        core?.detachPresenter()
        core = null
        view = null
    }
}
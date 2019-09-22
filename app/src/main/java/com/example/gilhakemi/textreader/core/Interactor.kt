package com.example.gilhakemi.textreader.core

import com.example.gilhakemi.textreader.MainPresenter

/**
 * Created by work on 22/09/2019.
 */
interface Interactor {
    fun attachPresenter(presenter: MainPresenter)
    fun detachPresenter()
    fun getWordsFromFile(fileName: String)
}
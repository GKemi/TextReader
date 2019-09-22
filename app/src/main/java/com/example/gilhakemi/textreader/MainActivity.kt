package com.example.gilhakemi.textreader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.example.gilhakemi.textreader.core.Word

class MainActivity : AppCompatActivity(), MainView {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.presenter = MainPresenter(this)
    }

    override fun getWords() {

    }

    override fun showWords(words: List<Word>?) {

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}

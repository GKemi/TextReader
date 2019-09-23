package com.example.gilhakemi.textreader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast

import com.example.gilhakemi.textreader.core.Word
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.presenter = MainPresenter(this)
        getWords()
    }

    override fun getWords() {
        presenter.getWordsFromFile("THE RAILWAY CHILDREN.txt")
    }

    override fun showWords(words: List<Word>?) {
        words?.let {
            wordsList.layoutManager = LinearLayoutManager(this)
            wordsList.adapter = RecyclerViewAdapter(words)
        } ?: run {
            Toast.makeText(this, "The list was empty!", Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }
}

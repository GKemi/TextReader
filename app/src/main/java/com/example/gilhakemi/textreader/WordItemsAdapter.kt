package com.example.gilhakemi.textreader

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gilhakemi.textreader.core.Word
import kotlinx.android.synthetic.main.layout_worditem.view.*

/**
 * Created by work on 23/09/2019.
 */
class RecyclerViewAdapter(private val listOfWords: List<Word>): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cell = layoutInflater.inflate(R.layout.layout_worditem, parent, false)
        return ViewHolder(cell)
    }

    override fun getItemCount(): Int {
        return listOfWords.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val wordContent = listOfWords[position]
        holder.itemView?.word?.text = wordContent.word
        holder.itemView?.wordOccurrences?.text = wordContent.occurrences.toString()
        holder.itemView?.wordOccurrencesPrime?.text = wordContent.occurrencesPrime.toString()
    }

}

class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

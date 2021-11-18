package com.example.answerquestion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnswerAdapter(private val answerList: List<Answer>) : RecyclerView.Adapter<AnswerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswerViewHolder {
        val answerListItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.answer_list_item, parent, false)

        return AnswerViewHolder(answerListItemView)
    }

    override fun onBindViewHolder(holder: AnswerViewHolder, position: Int) {
        val car = answerList[position]
        holder.bind(car)
    }

    override fun getItemCount(): Int {
        return answerList.size
    }
}
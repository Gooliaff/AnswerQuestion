package com.example.answerquestion

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnswerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(answer: Answer) {
        val answerTextView: TextView = itemView.findViewById(R.id.answer_text_view)
        val questionTextView: TextView = itemView.findViewById(R.id.question_text_view)

        answerTextView.text = answer.answer
        questionTextView.text = answer.question


    }
}
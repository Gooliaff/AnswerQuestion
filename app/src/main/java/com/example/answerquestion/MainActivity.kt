package com.example.answerquestion

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val start_button: View = findViewById(R.id.button_start)
        start_button.setOnClickListener {
            val intent = Intent(this, AnswerList::class.java)
            startActivity(intent)


            val answer_button: View = findViewById(R.id.button_answer)
            answer_button.setOnClickListener {
                val intent = Intent(this, QuestActivity::class.java)
                startActivity(intent)






            }
        }
    }}
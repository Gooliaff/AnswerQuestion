package com.example.answerquestion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AnswerList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer_list)

        val answerList: List<Answer> = listOf(

            Answer("Какой океан омывает восточное побережье США?", "Атлантический"),
            Answer("Между какими странами находится Берингов пролив?", "США и Россия"),
            Answer("Какая самая длинная река в мире?", "Амазонка"),
            Answer("Какая самый глубокий океан на Земле?", "Тихий"),
            Answer("Какова длина экватора?", "Приблизительно 40 тысяч километров"),
            Answer("Какая самая большая в мире пустыня?", "Сахара"),
            Answer("Какая самая маленькая страна мира по площади?", "Ватикан"),
            Answer("Какой самый большой остров?", "Гренландия"),
            Answer("Со сколькими странами граничит Россия?", "18"),
            Answer("Какова примерная численность населения Земли?", "White")
        )

        val usersRecyclerView: RecyclerView = findViewById(R.id.list_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        usersRecyclerView.adapter = AnswerAdapter(answerList)


        usersRecyclerView.addItemDecoration(
        DividerItemDecoration(
        this,
        DividerItemDecoration.HORIZONTAL))
    }
}

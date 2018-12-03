package com.ypst.primeyz.quizzlerkotlin

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var questionBank: QuesitonBank? = null
    private var allQuestions: List<Question>? = null
    private var pickedAnswer = false
    private var questionNumber = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionBank = QuesitonBank()
        questionBank!!.initQuestions()
        allQuestions = questionBank!!.list

        nextQuestion()

        btn_true.setOnClickListener {
            pickedAnswer = true
            checkAnswer(pickedAnswer)
        }

        btn_false.setOnClickListener {
            pickedAnswer = false
            checkAnswer(pickedAnswer)
        }
    }

    private fun checkAnswer(pickedAnswer: Boolean) {
        val correctAnswer = allQuestions!![questionNumber].answer
        if (correctAnswer == pickedAnswer) {
            score += 1
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show()
        }
        questionNumber += 1
        nextQuestion()
    }

    private fun nextQuestion() {
        if (questionNumber <= allQuestions!!.size - 1) {
            tv_question.text = allQuestions!![questionNumber].questionText
            updateUI()
        } else {
            updateUI()
            AlertDialog.Builder(this)
                .setTitle("Awesome")
                .setMessage("You've finished all the questions, do you want to start over?")
                .setPositiveButton("Restart") { dialog, which -> startOver() }
                .show()
        }
    }

    private fun updateUI() {
        tv_question_number.text = (questionNumber + 1).toString() + "/" + allQuestions!!.size
        tv_score.text = "Score: $score"
        progressBar.progress = questionNumber + 1
    }

    private fun startOver() {
        score = 0
        questionNumber = 0
        nextQuestion()
    }
}

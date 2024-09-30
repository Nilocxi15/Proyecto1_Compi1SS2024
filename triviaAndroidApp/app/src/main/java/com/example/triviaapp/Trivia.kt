package com.example.triviaapp

import android.content.IntentSender.OnFinished
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Trivia : AppCompatActivity() {
    private lateinit var timeThreadTextView: TextView
    private lateinit var countDownTimer: CountDownTimer
    private var timeLeftInMillis: Long = 600000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_trivia)

        timeThreadTextView = findViewById(R.id.timeThread)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        startTimer()
    }

    private fun startTimer() {
        countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                updateTimer()
            }

            override fun onFinish() {
                //espacio para redirigir
            }
        }.start()
    }

    private fun updateTimer() {
        val minutes = (timeLeftInMillis / 1000) / 60
        val seconds = (timeLeftInMillis / 1000) % 60
        val timeLeftFormatted = String.format("%02d:%02d", minutes, seconds)
        timeThreadTextView.text = timeLeftFormatted
    }

    private fun finishTrivia() {
        //espacio para redirigir
    }

    override fun onDestroy() {
        super.onDestroy()
        saveTimeLeft()
    }

    private fun saveTimeLeft() {
        val sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putLong("timeLeftInMillis", timeLeftInMillis)
        editor.apply()
    }
}
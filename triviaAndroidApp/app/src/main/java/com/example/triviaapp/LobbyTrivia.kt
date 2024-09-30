package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LobbyTrivia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lobby_trivia)

        val triviaName = intent.getStringExtra("TRIVIA_NAME")
        val triviaNameTextView = findViewById<TextView>(R.id.triviaName)
        triviaNameTextView.text = triviaName

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val returnButton: Button = findViewById(R.id.returnBtn)
        returnButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        val startButton: Button = findViewById(R.id.startBtn)
        startButton.setOnClickListener {
            val intent = Intent(this, Trivia::class.java)
            startActivity(intent)
            finish()
        }

    }


}
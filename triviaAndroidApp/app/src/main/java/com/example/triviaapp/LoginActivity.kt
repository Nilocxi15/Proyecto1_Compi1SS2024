package com.example.triviaapp

import analyzers.S_Analyzer_login
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import models.ListElement
import models.Trivia
import util.ListAdapter
import java.util.LinkedList

class LoginActivity : AppCompatActivity() {

    private lateinit var util: Client
    private val elements: MutableList<ListElement> = ArrayList()

    companion object {
        @JvmStatic
        val trivias: LinkedList<Trivia> = LinkedList()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        loadElements()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val logoutButton: Button = findViewById(R.id.logoutBtn)
        logoutButton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }

    private fun loadElements() {
        var request: String = null.toString()
        request = "<?xson version=\"1.0\"?>\n"
        request += "<!realizar_solicitud: \"LISTA_TRIVIAS\">\n"
        request += "<fin_solicitud_realizada!>"

        util = Client()
        util.sendMessage(request, object : Client.SendMessageCallback {
            override fun onResult(result: String) {
                val status = result.toBoolean()

                if (!status) {
                    Toast.makeText(this@LoginActivity, "Trivias no encontradas", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    for (trivia in trivias) {
                        addElement(
                            trivia.name,
                            trivia.topic,
                            trivia.author,
                            trivia.questionTime,
                            trivia.idTrivia
                        )
                    }
                    init()
                }
            }
        })
    }

    private fun init() {
        val listAdapter = ListAdapter(elements, this)
        val recyclerView: RecyclerView = findViewById(R.id.listRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = listAdapter
    }

    private fun addElement(
        name: String,
        topic: String,
        author: String,
        questionTime: String,
        id: String
    ) {
        println("$name $topic $author $questionTime")
        elements.add(
            ListElement(
                name,
                topic,
                author,
                questionTime,
                id
            )
        )

    }
}
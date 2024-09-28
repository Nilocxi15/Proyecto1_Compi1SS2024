package com.example.triviaapp

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var passCheckBox: CheckBox
    private lateinit var util: client

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        username = findViewById(R.id.usernameEditText)
        password = findViewById(R.id.passEditText)
        passCheckBox = findViewById(R.id.seePassCheckBox)

        passCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                password.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                password.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
            password.setSelection(password.text.length)
        }

        val loginButton : Button = findViewById(R.id.loginBtn)
        loginButton.setOnClickListener {
            val usernameText = username.text.toString()
            val passwordText = password.text.toString()

            var request: String = null.toString()
            request = "<?xson version=\"1.0\"?>\n"
            request += "<!realizar_solicitud: \"LOGIN_USUARIO\">\n"
            request += "\t{\"DATOS_USUARIO\":[\n"
            request += "\t{\n"
            request += "\t\t\"USUARIO\":\"" + usernameText + "\",\n"
            request += "\t\t\"PASSWORD\":\"" + passwordText + "\"\n"
            request += "\t}\n"
            request += "\t]}\n"
            request += "<fin_solicitud_realizada!>\n"

            util = client()
            util.sendMessage(request, object : client.SendMessageCallback {
                override fun onResult(result: String) {
                    val status = result.toBoolean()
                    if (status) {
                        val intent = Intent(this@MainActivity, LoginActivity::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@MainActivity, "Contraseña o usuario incorrectos", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }
    }

}
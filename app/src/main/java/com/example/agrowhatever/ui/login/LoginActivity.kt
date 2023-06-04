package com.example.agrowhatever.ui.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.agrowhatever.R

class LoginActivity : AppCompatActivity() {
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this@LoginActivity, "Por favor, preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else if (username == "usuario" && password == "senha") {
                Toast.makeText(this@LoginActivity, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
                // Faça algo após o login ser bem-sucedido, como abrir uma nova atividade.
            } else {
                Toast.makeText(this@LoginActivity, "Credenciais inválidas!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

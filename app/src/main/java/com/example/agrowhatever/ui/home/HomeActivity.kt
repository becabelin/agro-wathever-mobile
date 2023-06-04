package com.example.agrowhatever.ui.home

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.agrowhatever.R

class HomeActivity : AppCompatActivity() {
    private lateinit var profileButton: ImageButton
    private lateinit var chatButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_acitivity)

        profileButton = findViewById(R.id.profileButton)
        chatButton = findViewById(R.id.chatButton)

        chatButton.setOnClickListener {
            // Lógica para abrir a tela de chat
            Toast.makeText(this@HomeActivity, "Chat clicked", Toast.LENGTH_SHORT).show()
        }
    }
}

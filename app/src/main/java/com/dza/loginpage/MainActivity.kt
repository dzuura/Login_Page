package com.dza.loginpage

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi UI elements
        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        // Set OnClickListener untuk tombol login
        loginButton.setOnClickListener {
            // Ambil input dari EditText
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Tampilkan Toast dengan username
            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Selamat Datang, $username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tolong masukkan username dan password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

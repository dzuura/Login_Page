package com.dza.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dza.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set OnClickListener untuk tombol login
        binding.loginButton.setOnClickListener {
            // Ambil input dari EditText
            val username = binding.usernameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()

            // Tampilkan Toast dengan username
            if (username.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Selamat Datang, $username", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tolong masukkan username dan password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

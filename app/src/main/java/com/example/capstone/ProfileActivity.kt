package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Mengatur data profil
        val name = "John Doe"
        val expertise = "Nelayan"
        val profilename: TextView = findViewById(R.id.nameTextView)
        val profileexpertise: TextView = findViewById(R.id.expertiseTextView)
        profilename.text = name
        profileexpertise.text = expertise

        // Menambahkan onClickListener untuk tombol detail
        val btndetail: Button = findViewById(R.id.detailButton)
        btndetail.setOnClickListener {
            // Lakukan tindakan yang diinginkan saat tombol detail diklik
            // Contoh: Navigasi ke halaman detail
//            startActivity(Intent(this, DetailActivity::class.java))
        }

        // Menambahkan onClickListener untuk tombol pesan
        val btnmessage: Button = findViewById(R.id.messageButton)
        btnmessage.setOnClickListener {
            // Lakukan tindakan yang diinginkan saat tombol pesan diklik
            // Contoh: Navigasi ke halaman pesan
//            startActivity(Intent(this, MessageActivity::class.java))
        }
    }
}
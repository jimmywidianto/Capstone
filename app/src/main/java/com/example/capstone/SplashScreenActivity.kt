package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 3000 // Durasi tampilan splash screen dalam milidetik (misalnya 3000ms = 3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            // Intent untuk memulai aktivitas berikutnya setelah tampilan splash screen selesai
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup aktivitas splash screen agar tidak dapat dikembalikan dengan tombol "back"
        }, SPLASH_TIME_OUT.toLong())
    }
}
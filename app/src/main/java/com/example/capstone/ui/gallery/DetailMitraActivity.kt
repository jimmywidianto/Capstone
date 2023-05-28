package com.example.capstone.ui.gallery

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.capstone.R

class DetailMitraActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_mitra)

        val dataMitra = intent.getParcelableExtra("key_mitra") as Mitra?

        val tvDetailName: TextView = findViewById(R.id.tv_detail_name)
        val tvDetailDescription: TextView = findViewById(R.id.tv_detail_description)
        val ivDetailPhoto: ImageView = findViewById(R.id.iv_detail_photo)
        val btnTelp: Button = findViewById(R.id.btn_telp)

        tvDetailName.text = dataMitra?.namaMitra
        tvDetailDescription.text = dataMitra?.descMitra
        if (dataMitra != null) {
            ivDetailPhoto.setImageResource(dataMitra.photo)
        }

        btnTelp.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_DIAL
            intent.data = Uri.parse("tel:" + dataMitra?.noTelp)
            startActivity(intent)
        }
    }
}
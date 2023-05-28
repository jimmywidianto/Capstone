package com.example.capstone.ui.gallery

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mitra(
    val namaMitra: String,
    val descMitra: String,
    val photo: Int,
    val noTelp: String
) : Parcelable
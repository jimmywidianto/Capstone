package com.example.capstone.ui.gallery

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.capstone.R

class ListMitraActivity : AppCompatActivity() {
    private lateinit var rvMitra: RecyclerView
    private val list = ArrayList<Mitra>()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_mitra)

        rvMitra = findViewById(R.id.rv_mitra)
        rvMitra.setHasFixedSize(true)

        list.addAll(getListMitra())
        showRecyclerList()
    }

    private fun getListMitra(): ArrayList<Mitra> {
        val dataMitra = resources.getStringArray(R.array.data_mitra)
        val dataDescription = resources.getStringArray(R.array.desc_mitra)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val dataTelp = resources.getStringArray(R.array.no_telp_mitra)
        val listMitra = ArrayList<Mitra>()
        for (i in dataMitra.indices) {
            val mitra = Mitra(dataMitra[i], dataDescription[i], dataPhoto.getResourceId(i, -1), dataTelp[i])
            listMitra.add(mitra)
        }
        return listMitra
    }

    private fun showRecyclerList() {
        rvMitra.layoutManager = LinearLayoutManager(this)
        val listMitraAdapter = ListMitraAdapter(list)
        rvMitra.adapter = listMitraAdapter
    }
}
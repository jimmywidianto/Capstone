package com.example.capstone.ui.gallery

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.capstone.R

class ListMitraAdapter(private val listMitra: ArrayList<Mitra>) : RecyclerView.Adapter<ListMitraAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_mitra, parent,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMitra.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (namaMitra, descMitra, photo ,noTelp) = listMitra[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvNamaMitra.text = namaMitra
        holder.tvDescMitra.text = descMitra
        holder.noTelp.text = noTelp

        holder.itemView.setOnClickListener{
            val intentDetail = Intent(holder.itemView.context, DetailMitraActivity::class.java)
            intentDetail.putExtra("key_mitra", listMitra[holder.adapterPosition])
            holder.itemView.context.startActivity(intentDetail)
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvNamaMitra: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescMitra: TextView = itemView.findViewById(R.id.tv_item_description)
        val noTelp: TextView = itemView.findViewById(R.id.tv_no_telp)
    }
}
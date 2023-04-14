package com.example.srecyclerview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RcvAdapter(private val arrayList: ArrayList<Modal>):RecyclerView.Adapter<RcvAdapter.ViewHolder>() {




    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
    var view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
     var viewHolder : ViewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int {

         return arrayList.size
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {

        holder.name.text = arrayList[position].name +" "+ position
        holder.img.setImageResource(arrayList.get(position).img)

    }

     class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     var  name: TextView = itemView.findViewById<TextView>(R.id.text)
        var img: ImageView = itemView.findViewById<ImageView>(R.id.img)

    }
}
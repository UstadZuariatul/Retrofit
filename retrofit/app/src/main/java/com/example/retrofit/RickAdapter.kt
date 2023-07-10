package com.example.retrofit

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RickAdapter(val dataRick: List<ResultsItem>): RecyclerView.Adapter<RickAdapter.MyViewHolder>() {
    class MyViewHolder (view: View): RecyclerView.ViewHolder(view){
        val imgRick = view.findViewById<ImageView>(R.id.i)

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}
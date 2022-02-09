package com.example.myapplication.feature

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.URLImage
import com.example.myapplication.inflate

class GeneralAdapter() : ListAdapter<URLImage, GeneralAdapter.GeneralViewHolder>(
    object : DiffUtil.ItemCallback<URLImage>() {
        override fun areItemsTheSame(oldItem: URLImage, newItem: URLImage): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: URLImage, newItem: URLImage): Boolean {
            return oldItem == newItem
        }
    }
) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralViewHolder =
        GeneralViewHolder(parent.inflate(R.layout.item_general))


    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class GeneralViewHolder(private val containerView: View) :
        RecyclerView.ViewHolder(containerView), LayoutContainer {

        fun bind(urlImage: URLImage) {
            with(itemView) {

            }
        }
    }
}
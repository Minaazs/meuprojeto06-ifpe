package com.example.meuprojeto06ifpe.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuprojeto06ifpe.databinding.ItemUserBinding
import com.example.meuprojeto06ifpe.model.User

class UserAdapter(private val users: List<User>) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    inner class UserViewHolder(val binding: ItemUserBinding) :
        RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val u = users[position]
        holder.binding.tvName.text = u.name
        holder.binding.tvEmail.text = u.email
    }
    override fun getItemCount() = users.size
}

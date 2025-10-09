package com.example.meuprojeto06ifpe.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meuprojeto06ifpe.databinding.ItemProductBinding
import com.example.meuprojeto06ifpe.model.Product
class ProductAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    inner class ProductViewHolder(val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val p = products[position]
        holder.binding.tvName.text = p.name
        holder.binding.tvPrice.text = "Preço: R$ %.2f".format(p.price)
    }
    override fun getItemCount() = products.size
}

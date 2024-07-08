package com.example.ewallettwo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

package com.example.newsinformation


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var wallet:List<wallet>): RecyclerView.Adapter<WalletInformation>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletInformation{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items_list, parent,false)
        return WalletInformation(itemView)

    }



    override fun getItemCount(): Int {
        return wallet.size


    }
}
class WalletInformation(itemView:View):RecyclerView.ViewHolder(itemView){
    var textimage =itemView.findViewById<TextView>(R.id.tvout)
    var texttitle = itemView.findViewById<TextView>(R.id.tvmoney)
    var textDate = itemView.findViewById<TextView>(R.id.tvbalance)
    var authorsname = itemView.findViewById<TextView>(R.id.tvout)
    var preview = itemView.findViewById<TextView>(R.id.tvThree)
    var seemore = itemView.findViewById<TextView>(R.id.tvFour)







}









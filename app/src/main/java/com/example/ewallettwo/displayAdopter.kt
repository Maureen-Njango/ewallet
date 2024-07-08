package com.example.ewallettwo

import android.service.quickaccesswallet.WalletCard
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class displayAdopter (var listwallet:List<Wallet>)
    :RecyclerView.Adapter<dispayViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dispayViewHolder {

    }

    override fun getItemCount(holder: dispayViewHolder, position: Int): Int {
            val wallet = listwallet[position]
            holder.textviewone.text = wallet.bill
            holder.texvietwo.text = wallet.amount




    }

    override fun onBindViewHolder(holder: dispayViewHolder, position: Int) {
        return listwallet.size

    }

}

class dispayViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var textviewone = itemView.findViewById<TextView>(R.id.tvmoney)
    var texvietwo = itemView.findViewById<TextView>(R.id.tvout)
    var textviewthree = itemView.findViewById<TextView>(R.id.tvbalance)
    var textviewfour = itemView.findViewById<TextView>(R.id.tvtransaction)
}



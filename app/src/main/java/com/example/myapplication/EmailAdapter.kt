package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Email(
    val icon: String,
    val sender: String,
    val subject: String,
    val preview: String,
    val time: String
)


class EmailAdapter(private val emailList: List<Email>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvIcon: TextView = itemView.findViewById(R.id.tvIcon)
        val tvSender: TextView = itemView.findViewById(R.id.tvSender)
        val tvSubject: TextView = itemView.findViewById(R.id.tvSubject)
        val tvPreview: TextView = itemView.findViewById(R.id.tvPreview)
        val tvTime: TextView = itemView.findViewById(R.id.tvTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.tvIcon.text = email.icon
        holder.tvSender.text = email.sender
        holder.tvSubject.text = email.subject
        holder.tvPreview.text = email.preview
        holder.tvTime.text = email.time
    }

    override fun getItemCount(): Int = emailList.size
}

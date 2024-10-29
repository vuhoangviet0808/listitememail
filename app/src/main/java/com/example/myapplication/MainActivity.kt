package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val emailList = listOf(
            Email("E", "Edurila.com", "$19 Only - Learn Web Design", "Are you looking to...", "12:34 PM"),
            Email("C", "Chris Abad", "Help improve Campaign Monitor", "Let us know your...", "11:22 AM"),
            Email("T", "Tuto.com", "Free course on SEO", "Photoshop, CSS, and...", "11:04 AM"),
            Email("S", "Support", "Follow-up on your services", "SAS OVH status update", "10:26 AM"),
            Email("M", "Matt from Ionic", "The New Ionic Creator", "Announcing new features", "9:15 AM")
        )


        val adapter = EmailAdapter(emailList)
        recyclerView.adapter = adapter
    }
}

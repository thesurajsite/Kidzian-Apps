package com.kidzian.myfamily

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // create three new activities: Me_Activity, Dad_Activity, Mom_Activity
        // Main activtiy UI is already created. Just import the cardviews and write code to naviagate to new pages/activities

        // initialize cardViews to go to new activities
        val meCardView=findViewById<CardView>(R.id.meCardView)
        val dadCardView=findViewById<CardView>(R.id.dadCardView)
        val momCardView=findViewById<CardView>(R.id.momCardView)

        // set onClickListener for meCardView
        meCardView.setOnClickListener {
            // create intent to navigate to Me_Activity
            val intent= Intent(this,Me_Activity::class.java)
            startActivity(intent)
        }

        // set onClickListener for dadCardView
        dadCardView.setOnClickListener {
            // create intent to navigate to Dad_Activity
            val intent= Intent(this,Dad_Activity::class.java)
            startActivity(intent)
        }

        // set onClickListener for momCardView
        momCardView.setOnClickListener {
            // create intent to navigate to Mom_Activity
            val intent= Intent(this,Mom_Activity::class.java)
            startActivity(intent)
        }

    }
}
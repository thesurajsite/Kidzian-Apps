package com.kidzian.animalfacts

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


        // Create Three More activities with names: Octopus_Activity, Koala_Activity, Platypus_Activity
        // UI of Main_Activity is already created.

        // initialize the cardviews from the main actvity to navigate to animals activities
        val octopusCardView=findViewById<CardView>(R.id.octopusCardView)
        val koalaCardView=findViewById<CardView>(R.id.koalaCardView)
        val platypusCardView=findViewById<CardView>(R.id.platypusCardView)

        // set click listener on octopusCardView
        octopusCardView.setOnClickListener {
            // navigate to octopus activity
            val intent= Intent(this,Octopus_Activity::class.java)
            startActivity(intent)
        }

        // set click listener on koalaCardView
        koalaCardView.setOnClickListener {
            // navigate to koala activity
            val intent= Intent(this,Koala_Activity::class.java)
            startActivity(intent)
        }

        // set click listener on platypusCardView
        platypusCardView.setOnClickListener {
            // navigate to platypus activity
            val intent= Intent(this,Platypus_Activity::class.java)
            startActivity(intent)
        }

    }
}
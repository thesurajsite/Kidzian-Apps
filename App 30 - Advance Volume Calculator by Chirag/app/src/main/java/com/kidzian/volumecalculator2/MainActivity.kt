package com.kidzian.volumecalculator2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // activtiy_main.xml is already created for you
        // Add 4 more new activities to the project for sphere, cube, cylinder and cone
        // use these cardviews and set on click listeners to navigate to the respective activities
        // perform operations to calculate the volume of the shapes in their respective activities

        // How to add new activity ?
        // Go to folder icon (top left), -> app -> kotlin+java -> right click on com.kidzian.volumecalculator -> New -> Activity -> empty views activity


        // initialize the UI cardview using which we will navigate to other pages
        val sphereCardView=findViewById<CardView>(R.id.sphereCardView)
        val cubeCardView=findViewById<CardView>(R.id.cubeCardView)
        val cylinderCardView=findViewById<CardView>(R.id.cylinderCardView)
        val coneCardView=findViewById<CardView>(R.id.coneCardView)


        // set click listener on sphereCardView to navigate to sphere_activity
        sphereCardView.setOnClickListener {
            val intent= Intent(this,sphere_activity::class.java)
            startActivity(intent)
        }

        // set click listener on cubeCardView to navigate to cube_activity
        cubeCardView.setOnClickListener {
            val intent= Intent(this,cube_activity::class.java)
            startActivity(intent)
        }

        // set click listener on cylinderCardView to navigate to cylinder_activity
        cylinderCardView.setOnClickListener {
            val intent= Intent(this,cylinder_activity::class.java)
            startActivity(intent)
        }

        // set click listener on coneCardView to navigate to cone_activity
        coneCardView.setOnClickListener {
            val intent= Intent(this,cone_activity::class.java)
            startActivity(intent)
        }

    }
}
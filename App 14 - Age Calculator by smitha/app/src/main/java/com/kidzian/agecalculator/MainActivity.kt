package com.kidzian.agecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize the UI Elements needed
        val ageTextView= findViewById<TextView>(R.id.ageTextView)
        val enterAgeEditText= findViewById<EditText>(R.id.enterAgeEditText)
        val calculateButton= findViewById<Button>(R.id.calculateButton)

        // Set the click listener for the calculate button
        calculateButton.setOnClickListener {

            if(enterAgeEditText.text.isNotEmpty()){

                val currentYear= LocalDateTime.now().year                   // Get the current year
                val birthYear= enterAgeEditText.text.toString().toInt()     // Get the birth year of user from the EditText
                val age= currentYear-birthYear                              // Calculate the age of the user
                ageTextView.setText("Your age is $age")                     // show the user age in the TextView

                if(age<0){
                    ageTextView.setText("You are not born yet")
                }

            }

        }




    }
}
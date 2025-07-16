package com.kidzian.textreverse

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
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

        // initialize the UI Elements needed
        // Initialize the enterText Edit text to take input from user
        val enterText=findViewById<EditText>(R.id.enterText)
        // Initialize the showText TextView to show the reversed text
        val showText=findViewById<TextView>(R.id.showText)
        // Initialize the reverseButton. Here, the reverseButton is created using cardView.
        val reverseButton=findViewById<CardView>(R.id.reverseButton)

        // Set the click listener for the reverseButton
        reverseButton.setOnClickListener {
            // Get the text from the enterText EditText
            val myText=enterText.text.toString()
            // Reverse the text
            val reversedText=myText.reversed()
            // Set the reversed text in the showText TextView
            showText.setText(reversedText)
        }


    }
}
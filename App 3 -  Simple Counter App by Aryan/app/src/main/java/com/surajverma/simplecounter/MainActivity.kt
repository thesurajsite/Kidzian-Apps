package com.surajverma.simplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Comment this part, its not required

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        // Declare all the elements from the UI that we need
        // Initialize numberTextView
        val numberTextview= findViewById<TextView>(R.id.numberTextview)
        // Initialize resetButton
        val resetButton= findViewById<Button>(R.id.resetButton)
        // Initialize plusOne Button
        val plusOne= findViewById<Button>(R.id.plusOne)
        // Initialize plusThree Button
        val plusThree= findViewById<Button>(R.id.plusThree)
        // Initialize plusFive Button
        val plusFive= findViewById<Button>(R.id.plusFive)

        // Initialize a variable count with value equal to 0
        var count = 0

        // make a plusOne Button click listener and add +1 to the count variable
        plusOne.setOnClickListener {
            // adding +1 to count variable
            count=count+1
            // showing the value in the numberTextView
            numberTextview.setText(count.toString())
        }

        // make a plusThree Button click listener and add +3 to the count variable
        plusThree.setOnClickListener {
            // adding +3 to count variable
            count=count+3
            // showing the value in the numberTextView
            numberTextview.setText(count.toString())
        }

        // make a plusFive Button click listener and add +5 to the count variable
        plusFive.setOnClickListener {
            // adding +5 to count variable
            count=count+5
            // showing the value in the numberTextView
            numberTextview.setText(count.toString())
        }

        // make resetButton click listener
        resetButton.setOnClickListener {
            // reset the vaue of count variable to zero
            count = 0
            // set the value of numberTextView to zero in the UI
            numberTextview.setText(count.toString())
        }









    }
}
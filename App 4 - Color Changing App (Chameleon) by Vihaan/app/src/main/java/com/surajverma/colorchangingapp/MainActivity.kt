package com.surajverma.colorchangingapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // COMMENT THIS PART, ITS NOT REQUIRED

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.background)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        // Initialize all the elements from the UI that we need in logic part

        // initialze Red button
        val redButton=findViewById<Button>(R.id.redButton)
        // initialize the blue button
        val blueButton=findViewById<Button>(R.id.blueButton)
        // initialize green button
        val greenButton=findViewById<Button>(R.id.greenButton)
        // initialize yellow button
        val yellowButton=findViewById<Button>(R.id.yellowButton)
        // initialize pink button
        val pinkButton=findViewById<Button>(R.id.pinkButton)
        // initialize orange button
        val orangeButton=findViewById<Button>(R.id.orangeButton)
        // initialize colorName TextView
        val colorName=findViewById<TextView>(R.id.colorName)
        // initialize background
        val background=findViewById<ConstraintLayout>(R.id.background)
        // if any RED LINE appears under "ConstraintLayout", it means we need to import it.
        // Press alt+Enter >> then click on import ConstraintLayout

        // There are many types of Background layouts. 
        // The layout where we constrain each element to parent is called ConstraintLayout.
        // therefore, the type of our background is ConstraintLayout above





        // make click listener for redButton button
        redButton.setOnClickListener {
            // set background color to red on clicking the redButton
            background.setBackgroundColor(Color.parseColor("#FF0000"))
            // set colorName TextView to "Red"
            colorName.setText("Red")
        }


        // make click listener for blueButton button
        blueButton.setOnClickListener {
            // set background color to blue on clicking the blueButton
            background.setBackgroundColor(Color.parseColor("#0000FF"))
            // set colorName TextView to "Blue"
            colorName.setText("Blue")
        }


        // make click listener for greenButton button
        greenButton.setOnClickListener {
            // set background color to green on clicking the greenButton
            background.setBackgroundColor(Color.parseColor("#00FF00"))
            // set colorName TextView to "Green"
            colorName.setText("Green")
        }



        // make click listener for yellowButton button
        yellowButton.setOnClickListener {
            // set background color to yellow on clicking the yellowButton
            background.setBackgroundColor(Color.parseColor("#FFFF00"))
            // set colorName TextView to "Yellow"
            colorName.setText("Yellow")
        }


        // make click listener for pinkButton button
        pinkButton.setOnClickListener {
            // set background color to pink on clicking the pinkButton
            background.setBackgroundColor(Color.parseColor("#FFC0CB"))
            // set colorName TextView to "Pink"
            colorName.setText("Pink")
        }


        // make click listener for orangeButton button
        orangeButton.setOnClickListener {
            // set background color to orange on clicking the orangeButton
            background.setBackgroundColor(Color.parseColor("#FFA500"))
            // set colorName TextView to "Orange"
            colorName.setText("Orange")
        }


    }
}
package com.kidzian.speedtimecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Ititialise all the UI elements required
        // Initialize speedEditText to take speed input from user
        val speedEditText=findViewById<EditText>(R.id.speedEditText)
        // Initialize timeEditText to take time input from user
        val timeEditText=findViewById<EditText>(R.id.timeEditText)
        // Initialize distanceEditText to take distance input from user
        val distanceEditText=findViewById<EditText>(R.id.distanceEditText)
        // Initialize all the buttons
        val speedButton=findViewById<Button>(R.id.speedButton)
        val timeButton=findViewById<Button>(R.id.timeButton)
        val distanceButton=findViewById<Button>(R.id.distanceButton)
        val clearButton=findViewById<Button>(R.id.clearButton)

        // set click listener for speed button and calculate speed
        speedButton.setOnClickListener {

            // check if time & distance are not empty
            if(timeEditText.text.isNotEmpty() && distanceEditText.text.isNotEmpty()){
                val time=timeEditText.text.toString().toDouble()
                val distance=distanceEditText.text.toString().toDouble()
                val speed=distance/time                                    // calculate speed
                speedEditText.setText(speed.toString())
            }
            else{
                Toast.makeText(this, "Please Fill Time & Distance", Toast.LENGTH_SHORT).show()
            }

        }


        // set click listener for time button and calculate time
        timeButton.setOnClickListener {

            // check if speed & distance are not empty
            if(speedEditText.text.isNotEmpty() && distanceEditText.text.isNotEmpty()){
                val speed=speedEditText.text.toString().toDouble()
                val distance=distanceEditText.text.toString().toDouble()
                val time=distance/speed                                   // calculate time
                timeEditText.setText(time.toString())

            }
            else{
                Toast.makeText(this, "Please Fill Speed & Distance", Toast.LENGTH_SHORT).show()
            }
        }


        // set click listener for distance button and calculate distance
        distanceButton.setOnClickListener {

            // check if speed & time are not empty
            if(speedEditText.text.isNotEmpty() && timeEditText.text.isNotEmpty()){
                val speed=speedEditText.text.toString().toDouble()
                val time=timeEditText.text.toString().toDouble()
                val distance=speed*time                              // calculate distance
                distanceEditText.setText(distance.toString())
            }
            else{
                Toast.makeText(this, "Please Fill Speed & Time", Toast.LENGTH_SHORT).show()
            }
        }


        // set click listener for clear button and clear all the fields
        clearButton.setOnClickListener {
            speedEditText.setText("")
            timeEditText.setText("")
            distanceEditText.setText("")
        }
    }
}
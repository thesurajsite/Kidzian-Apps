package com.kidzian.leapyearcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        // Conditions to check if the Year is a Leap Year or not
        // if a year is divided by 4 and not by 100 then it is a Leap Year
        // if a leap year is divided by 100, it has to be divided by 400 to be a Leap Year
        // so if a number is divided by 100 and 400 th en it is a Leap Year else it is not a Leap Year

        // Initialize all the UI Elements that we need to use
        // Initialize TextView to show the Text if it is a Leap Year or not
        val textView=findViewById<TextView>(R.id.textView)
        // Initialize EditText to get the Year from the User
        val editText=findViewById<EditText>(R.id.editText)
        // Initialize Button to check if the Year is a Leap Year or not
        val button=findViewById<Button>(R.id.button)

        // Set the onClickListener for the Button
        button.setOnClickListener{
            // Get the Year from the EditText
            val year=editText.text.toString().toInt()

            // Check if the Year is a Leap Year or not
            if(year%4==0 && year%100!=0 ){
                textView.setText("Leap Year")
            }
            else if(year%100==0 && year%400==0){
                textView.setText("Leap Year")
            }
            else{
                textView.setText("Not A Leap Year")
            }

        }

    }
}
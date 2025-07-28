package com.surajverma.bmicalculator

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

        // Comment this part, its not required

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        // Initialize all the UI elements that we need
        // Initialize Weight and Height EditText
        val weight=findViewById<EditText>(R.id.weight)
        val height=findViewById<EditText>(R.id.height)
        // Initialize Calculate Button
        val calculate=findViewById<Button>(R.id.calculate)
        // Initialize Score & status TextView
        val score=findViewById<TextView>(R.id.score)
        val status=findViewById<TextView>(R.id.status)


        // Formula for BMI Score
        // BMI = weight(kg) / height(m) * height(m) * 10000

        // make click listener for calculate button
        calculate.setOnClickListener {

            // get weight and height and convert to float
            // float is used to store decimal values
            val w=weight.text.toString().toFloat()
            val h=height.text.toString().toFloat()
            // calculate BMI
            val bmi= (w*10000)/(h*h)
            // set BMI score
            score.setText(bmi.toString())

            // set status based on BMI score
            if(bmi <= 18.5){
                status.setText("Underweight")
            }
            if(bmi >18.5 && bmi <=24.9)
            {
                status.setText("Normal")
            }
            if(bmi > 24.9 && bmi < 30)
            {
                status.setText("Overweight")
            }
            if(bmi >= 30)
            {
                status.setText("Obese")
            }

        }


    }
}
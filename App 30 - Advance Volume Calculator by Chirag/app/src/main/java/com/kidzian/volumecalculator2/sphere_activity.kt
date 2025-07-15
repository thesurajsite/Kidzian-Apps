package com.kidzian.volumecalculator2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class sphere_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sphere)

        // initialize ui elements here
        val radiusEditText=findViewById<EditText>(R.id.radiusEditText)
        val resultTextView=findViewById<TextView>(R.id.resultTextView)
        val calculateButton=findViewById<Button>(R.id.calculateButton)

        // set click listener for calculate button
        calculateButton.setOnClickListener {

            // check if radius is not empty
            if(radiusEditText.text.toString().isNotEmpty()){

                // get radius from edit text
                val radius=radiusEditText.text.toString().toDouble()
                // calculate volume
                val volume= (4.0/3.0) * 3.14 * radius * radius * radius
                // set result text
                resultTextView.setText(volume.toString())
            }

        }
    }
}
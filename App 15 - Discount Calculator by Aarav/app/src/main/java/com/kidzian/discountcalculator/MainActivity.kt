package com.kidzian.discountcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Initialize all the UI Elements Required
        // Initialize originalPriceEditText used to take original price input
        val originalPriceEditText=findViewById<EditText>(R.id.originalPriceEditText)
        // Initialize discountPercentEditText used to take discount percent input
        val discountPercentEditText=findViewById<EditText>(R.id.discountPercentEditText)
        // Initialize discountValueTextView used to display discount value
        val discountValueTextView=findViewById<TextView>(R.id.discountValueTextView)
        // Initialize discountedPriceTextView used to display discounted price
        val discountedPriceTextView=findViewById<TextView>(R.id.discountedPriceTextView)
        // Initialize calculateButton used to calculate discount
        val calculateButton=findViewById<Button>(R.id.calculateButton)


        // Set onClickListener for calculateButton
        calculateButton.setOnClickListener {

            // Check if both originalPriceEditText and discountPercentEditText are not empty
            if(originalPriceEditText.text.toString().isNotEmpty() && discountPercentEditText.text.toString().isNotEmpty()){

                // Get the values from the EditText fields
                val originalPrice = originalPriceEditText.text.toString().toDouble()
                val discountPercent = discountPercentEditText.text.toString().toDouble()
                // Calculate the discount value and discounted price
                val discountValue = originalPrice * (discountPercent/100)
                val discountedPrice=originalPrice-discountValue

                // Set the discount value and discounted price in the TextView fields
                discountValueTextView.setText("$discountValue")
                discountedPriceTextView.setText("$discountedPrice")

            }


        }


    }
}
package com.kidzian.binaryconverter

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


        // Initlize UI elements for Decimal to Binary Converter part
        val decimalEditText= findViewById<EditText>(R.id.decimalEditText)
        val binaryTextView= findViewById<TextView>(R.id.binaryTextView)
        val binaryButton= findViewById<Button>(R.id.binaryButton)

        // set click listener for binary button
        binaryButton.setOnClickListener {
            // get the decimal number from EditText
            val decimalNumber= decimalEditText.text.toString().toInt()
            // convert the decimal number to binary
            val binaryNumber= Integer.toBinaryString(decimalNumber)
            // set the binary number in TextView
            binaryTextView.setText(binaryNumber.toString())
        }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Initlize UI elements for Binary to Decimal Converter part
        val binaryEditText= findViewById<EditText>(R.id.binaryEditText)
        val decimalTextView= findViewById<TextView>(R.id.decimalTextView)
        val decimalButton= findViewById<Button>(R.id.decimalButton)

        // set click listener for decimal button
        decimalButton.setOnClickListener {

            // get the binary number from EditText
            val binaryNumber= binaryEditText.text.toString()
            // check if the binary number is valid (isBinary stores true/false value)
            val isBinary = binaryNumber.matches(Regex("^[01]+$"))

            // if the binary number is valid, convert it to decimal
            if (isBinary)
            {
                val decimalNumber = Integer.parseInt(binaryNumber, 2)
                decimalTextView.setText(decimalNumber.toString())
            }
            // if the binary number is invalid, display an error message
            else {
                decimalTextView.setText("Invalid binary number")
            }


        }

    }
}
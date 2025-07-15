package com.kidzian.volumecalculator

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

        // UI Already Created
        // Initialize UI Elements Here
        val resultTextView=findViewById<TextView>(R.id.resultTextView)
        val sphereRadiusEditText=findViewById<EditText>(R.id.sphereRadiusEditText)
        val coneRadiusEditText=findViewById<EditText>(R.id.coneRadiusEditText)
        val coneHeightEditText=findViewById<EditText>(R.id.coneHeightEditText)
        val cubeSide1EditText=findViewById<EditText>(R.id.cubeSide1EditText)
        val cubeSide2EditText=findViewById<EditText>(R.id.cubeSide2EditText)
        val cubeSide3EditText=findViewById<EditText>(R.id.cubeSide3EditText)

        val sphereCalculateButton=findViewById<Button>(R.id.sphereCalculateButton)
        val coneCalculateButton=findViewById<Button>(R.id.coneCalculateButton)
        val cubeCalculateButton=findViewById<Button>(R.id.cubeCalculateButton)


        // add click listener to sphereCalculateButton
        sphereCalculateButton.setOnClickListener {

            // check if sphereRadiusEditText is not empty
            if(sphereRadiusEditText.text.isNotEmpty())
            {
                // get the value of sphereRadiusEditText and convert it to double
                val sphereRadius= sphereRadiusEditText.text.toString().toDouble()
                // calculate the volume of sphere
                val sphereVolume= (4.0/3.0) * 3.14 * sphereRadius * sphereRadius * sphereRadius
                // set the resultTextView text to sphereVolume
                resultTextView.setText(sphereVolume.toString())
            }

        }

        // add click listener to coneCalculateButton
        coneCalculateButton.setOnClickListener {
            // check if coneRadiusEditText and coneHeightEditText are not empty
            if(coneRadiusEditText.text.isNotEmpty() && coneHeightEditText.text.isNotEmpty())
            {
                // get the values of coneRadiusEditText and coneHeightEditText and convert them to double
                val coneRadius= coneRadiusEditText.text.toString().toDouble()
                val coneHeight= coneHeightEditText.text.toString().toDouble()
                // calculate the volume of cone
                val coneVolume= (3.14 * coneRadius * coneRadius * coneHeight)/3
                // set the resultTextView text to coneVolume
                resultTextView.setText(coneVolume.toString())
            }

        }

        // add click listener to cubeCalculateButton
        cubeCalculateButton.setOnClickListener {
            // check if cubeSide1EditText, cubeSide2EditText, and cubeSide3EditText are not empty
            if(cubeSide1EditText.text.isNotEmpty() && cubeSide2EditText.text.isNotEmpty() && cubeSide3EditText.text.isNotEmpty())
            {
                // get the values of cubeSide1EditText, cubeSide2EditText, and cubeSide3EditText and convert them to double
                val cubeSide1= cubeSide1EditText.text.toString().toDouble()
                // get the value of cubeSide2EditText and convert it to double
                val cubeSide2= cubeSide2EditText.text.toString().toDouble()
                // get the value of cubeSide3EditText and convert it to double
                val cubeSide3= cubeSide3EditText.text.toString().toDouble()
                //
                val cubeVolume= cubeSide1 * cubeSide2 * cubeSide3
                //
                resultTextView.setText(cubeVolume.toString())
            }
        }




    }
}
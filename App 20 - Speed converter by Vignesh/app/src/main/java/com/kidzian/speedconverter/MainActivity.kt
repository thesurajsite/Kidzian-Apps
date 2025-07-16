package com.kidzian.speedconverter

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize UI Elements
        // mps means meter per second
        // kmph means kilometer per hour
        val mpsEditText= findViewById<EditText>(R.id.mpsEditText)
        val kmphEditText= findViewById<EditText>(R.id.kmphEditText)
        val upButton=findViewById<ImageView>(R.id.upButton)
        val downButton=findViewById<ImageView>(R.id.downButton)

        // Set Click Listeners for upButton
        upButton.setOnClickListener {
            // get the spped in kmph from the user
            val speedInkmph=kmphEditText.text.toString().toDouble()
            // convert kmph to mps
            val speedInMeter=(speedInkmph * 5)/18
            // set the speed in mps to the EditText
            mpsEditText.setText(speedInMeter.toString())
        }

        // Set Click Listeners for downButton
        downButton.setOnClickListener {
            // get the spped in mps from the user
            val speedInmps=mpsEditText.text.toString().toDouble()
            // convert mps to kmph
            val speedInkmph=(speedInmps * 18)/5
            // set the speed in kmph to the EditText
            kmphEditText.setText(speedInkmph.toString())

        }




    }
}
package com.surajverma.contactsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


        //Initialize the UI Elements needed
        //These are the cardviews of the call buttons
        //Initialize the momCallButton which is a CardView
        val momCallButton = findViewById<CardView>(R.id.momCallButton)
        //Initialize the dadCallButton which is a CardView
        val dadCallButton = findViewById<CardView>(R.id.dadCallButton)
        //Initialize the policeStationCallButton which is a CardView
        val policeStationCallButton= findViewById<CardView>(R.id.policeStationCallButton)
        //Initialize the fireStationCallButton which is a CardView
        val fireStationCallButton= findViewById<CardView>(R.id.fireStationCallButton)
        //Initialize the ambulanceCallButton which is a CardView
        val ambulanceCallButton= findViewById<CardView>(R.id.ambulanceCallButton)


        //Initialize the call buttons
        // Set calling for mom
        momCallButton.setOnClickListener {
            //create an intent to call the number
            val callIntent=Intent(Intent.ACTION_DIAL)
            //set the data to the number
            callIntent.data= Uri.parse("tel:1234567890")
            //start the activity
            startActivity(callIntent)
        }

        // Set calling for dad
        dadCallButton.setOnClickListener {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data= Uri.parse("tel:9876543210")
            startActivity(callIntent)
        }

        // Set calling for police station
        policeStationCallButton.setOnClickListener {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data= Uri.parse("tel:100")
            startActivity(callIntent)
        }

        // Set calling for fire station
        fireStationCallButton.setOnClickListener {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data= Uri.parse("tel:101")
            startActivity(callIntent)
        }

        // Set calling for ambulance
        ambulanceCallButton.setOnClickListener {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data= Uri.parse("tel:102")
            startActivity(callIntent)
        }


    }
}
package com.kidzian.smssender

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Note for Teachers only
        // After completing this app, teachers can assign this app to integrate with the calling app


        // CLick on Folder Icon (top left) -> go to Manifest -> Manifest.xml -> Add SMS Permission
        // Also Change app logo in the Manifest.xml file, in the icon tag


        // Initialize UI Elements
        // we have assigned the dadSmsButton, and momSmsButton id to a CardView (not Button), but we can assign it to a button also.
        val dadSmsButton=findViewById<CardView>(R.id.dadSmsButton)
        val momSmsButton=findViewById<CardView>(R.id.momSmsButton)

        // check permission for SMS
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!=PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.SEND_SMS),101)
        }

        // set clickListener on dadButton
        dadSmsButton.setOnClickListener {

            val phoneNumber="9876543210"
            val smsIntent=Intent(Intent.ACTION_VIEW)
            smsIntent.data= Uri.parse("sms:$phoneNumber")
            startActivity(smsIntent)

        }

        momSmsButton.setOnClickListener {

            val phoneNumber="1234567890"
            val smsIntent=Intent(Intent.ACTION_VIEW)
            smsIntent.data= Uri.parse("sms:$phoneNumber")
            startActivity(smsIntent)

        }

    }

}
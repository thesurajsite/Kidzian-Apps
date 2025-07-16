package com.kidzian.basicformvalidator

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

        // How to change the logo ?
        // Click on folder icon (top left) -> App -> res -> drawable
        // paste the logo to the drawable folder
        // go to app -> manifest -> AndroidManifest.xml -> in the icon tag, add the logo name
        // Tell the students to add the app logo themselves


        // Initialize all the UI Elements
        // initialize nameEditText, emailEditText, phoneEditText, passwordEditText, submitButton
        val nameEditText=findViewById<EditText>(R.id.nameEditText)
        val emailEditText=findViewById<EditText>(R.id.emailEditText)
        val phoneEditText=findViewById<EditText>(R.id.phoneEditText)
        val passwordEditText=findViewById<EditText>(R.id.passwordEditText)
        val submitButton=findViewById<Button>(R.id.submitButton)





        // set the onClickListener for the submitButton
        submitButton.setOnClickListener {

            // get the values entered by the user
            val name=nameEditText.text.toString()
            val email=emailEditText.text.toString()
            val phone=phoneEditText.text.toString()
            val password=passwordEditText.text.toString()

            // There are several conditions taht must not be true to submit the form
            // if any condition is true, the form will not be submitted, get stuck in the middle
            // if all the conditions are false, only then it will go to the last else block, then form will be submitted (toast will appear)

            // check if all the fields are filled
            if(name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Please fill up all the fields", Toast.LENGTH_SHORT).show()
            }
            // check if the email contains @ and .com
            else if(!email.contains(".com") || !email.contains("@")){
                Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show()
            }
            // check if the phone number is 10 digits
            else if(phone.length != 10){
                Toast.makeText(this, "Phone No. must be 10 digits", Toast.LENGTH_SHORT).show()
            }
            // check if the password is less than 8 characters
            else if(password.length < 8){
                Toast.makeText(this, "Password must be atleast 8 characters", Toast.LENGTH_SHORT).show()
            }
            // if all the above conditions are not satisfied, then submitted successfully, else it will get stuck in the above part
            else{
                Toast.makeText(this, "Submitted Successfully", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
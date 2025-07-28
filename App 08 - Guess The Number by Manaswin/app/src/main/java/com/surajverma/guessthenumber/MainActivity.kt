package com.surajverma.guessthenumber

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
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

        //Initialize UI elements that we need
        // Initialize chancesTextView
        val chancesTextView= findViewById<TextView>(R.id.chancesTextView)
        // Initialize resultTextView
        val resultTextView= findViewById<TextView>(R.id.resultTextView)
        // Initialize enterNumberEditText
        val enterNumberEditText=findViewById<EditText>(R.id.enterNumberEditText)
        // Initialize checkButton
        val checkButton=findViewById<Button>(R.id.checkButton)
        // Initialize resetButton
        val resetButton=findViewById<Button>(R.id.resetButton)

        // Generate random number
        var randomNumber= Random.nextInt(1,101)
        // Initialize chancesLeft
        var chancesLeft =5
        // Show number of chances left
        chancesTextView.setText("Chances Left: $chancesLeft")
        // store the win state as true or false
        var win = false


        // Add click listener to checkButton
        checkButton.setOnClickListener {

            // Check if the user has entered a number
            // exclamation mark means "NOT"
           if( !enterNumberEditText.text.toString().isEmpty() )
           {
               // Decreas chancesLeft after every attempt
               chancesLeft = chancesLeft -1
               chancesTextView.setText("Chances Left: $chancesLeft")

               // Get the number entered by the user
               var numberEntered= enterNumberEditText.text.toString().toInt()

               // Check if the number entered is correct
               if(numberEntered==randomNumber)
               {
                   // Make User Win
                   resultTextView.setText("You Won !!")
                   // Disable checkButton because game has ended, user need to click on resetButton
                   checkButton.isEnabled=false
                   // store the win state as true
                   win=true
               }

               // Check if the number entered is higher or lower than the random number
               if(numberEntered != randomNumber  && numberEntered<randomNumber)
               {
                   // if the number entered is lower than the random number, then show "Enter a higher number"
                   resultTextView.setText("Enter a higher number")
               }

               // Check if the number entered is higher or lower than the random number
               if(numberEntered != randomNumber  && numberEntered>randomNumber)
               {
                   // if the number entered is higher than the random number, then show "Enter a Lower number"
                   resultTextView.setText("Enter a lower number")
               }
           }

            // Check if the user has no chances left and user has not won yet
            // it can be possible that user wins in the last chance, in that case user will have zero chances left
            // Therefore we have also checked if the user has won before making him lose
            if(chancesLeft==0 && win==false)
            {
                resultTextView.setText("You Lost !! \n The number was $randomNumber")
                // Disable checkButton because game has ended, user need to click on resetButton
                checkButton.isEnabled=false
            }

        }

        // Add click listener to resetButton
        resetButton.setOnClickListener {
            // Reset the game
            // Generate new random number
            randomNumber= Random.nextInt(1,101)
            // Reset the chancesLeft
            chancesLeft =5
            chancesTextView.setText("Chances Left: $chancesLeft")
            resultTextView.setText("Start Guessing")
            enterNumberEditText.setText("")
            checkButton.isEnabled=true
        }

    }
}
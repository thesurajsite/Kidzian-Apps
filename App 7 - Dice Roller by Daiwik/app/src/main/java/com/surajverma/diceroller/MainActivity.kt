package com.surajverma.diceroller

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlin.random.Random

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



        // Initialize the UI Elements that we need to use
        // Initialize cardView and imageView
        val dice= findViewById<CardView>(R.id.dice)
        val image=findViewById<ImageView>(R.id.image)

        
        // Initialize a variable to store random number
        var randomNumber=1     // (val is used when we can't change the value)
                               // (var is used when we can change the value)
                               // Since we need to change the value of randomNumber, we used var

        // Set onClickListener on dice
        dice.setOnClickListener {

            // Generate a random number between 1 and 7   (1 included, 7 excluded)
            randomNumber= Random.nextInt(1, 7)  // if red line appears under Random -> Alt+enter

            // create a toast to show the Random Number
            Toast.makeText(this, "$randomNumber", Toast.LENGTH_SHORT).show()

            // Set the image according to the random number
            if(randomNumber==1){
                image.setImageResource(R.drawable.one)
            }

            if(randomNumber==2){
                image.setImageResource(R.drawable.two)
            }

            if(randomNumber==3){
                image.setImageResource(R.drawable.three)
            }

            if(randomNumber==4){
                image.setImageResource(R.drawable.four)
            }

            if(randomNumber==5){
                image.setImageResource(R.drawable.five)
            }

            if(randomNumber==6){
                image.setImageResource(R.drawable.six)
            }


        }



    }
}
package com.surajverma.rockpaperscissor

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
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


        // Initialize the UI Elements that we need
        // Initialize playerImageView and computerImageView
        val playerImageView= findViewById<ImageView>(R.id.playerImageView)
        // Initialize computerImageView
        val computerImageView= findViewById<ImageView>(R.id.computerImageView)
        // Initialize the rockCardView
        val rockCardView= findViewById<CardView>(R.id.rockCardView)
        // Initialize the paperCardView
        val paperCardView= findViewById<CardView>(R.id.paperCardView)
        // Initialize the scissorCardView
        val scissorCardView= findViewById<CardView>(R.id.scissorCardView)
        // Initialize the resultTextView
        val resultTextView= findViewById<TextView>(R.id.resultTextView)

        // Default images for the playerImageView and computerImageView
        playerImageView.setImageResource(R.drawable.rock)
        computerImageView.setImageResource(R.drawable.rock)

        // IMPORTANT
        // let assume Rock as 1, Paper as 2, Scissor as 3

        // Set onClickListener to the rockCardView
        rockCardView.setOnClickListener {

            // Set the playerImageView to rock
            val playerNumber = 1   // Rock
            playerImageView.setImageResource(R.drawable.rock)

            // Generate a random number between 1 and 4 (1 included, 4 excluded)
            val computerNumber = Random.nextInt(1, 4)  // Computer will select a random number between 1 and 3
            // 1 = rock, 2 = paper, 3 = scissor

            // If RandomNumber is 1, then it is a Tie, and Set the computerImageView to rock and resultTextView to Tie
            if(computerNumber == 1) {
                resultTextView.setText("Tie 🏳️")
                computerImageView.setImageResource(R.drawable.rock)
            }

            // If RandomNumber is 2, then it is a Lose, and Set the computerImageView to paper and resultTextView to You Lose
            if(computerNumber==2){
                resultTextView.setText("You Lose 😥")
                computerImageView.setImageResource(R.drawable.paper)
            }

            // If RandomNumber is 3, then it is a Win, and Set the computerImageView to scissor and resultTextView to You Win
            if(computerNumber==3){
                resultTextView.setText("You Win 🥳")
                computerImageView.setImageResource(R.drawable.scissor)
            }


        }

        // Set onClickListener to the paperCardView
        paperCardView.setOnClickListener {

            // Set the playerImageView to paper
            val playerNumber = 2   // Paper
            playerImageView.setImageResource(R.drawable.paper)

            // Generate a random number between 1 and 4 (1 included, 4 excluded)
            val computerNumber = Random.nextInt(1, 4)  // Computer will select a random number between 1 and 3
            // 1 = rock, 2 = paper, 3 = scissor

            // If RandomNumber is 1, then it is a Win, and Set the computerImageView to rock and resultTextView to You Win
            if(computerNumber == 1){   // Rock
                resultTextView.setText("You Win 🥳")
                computerImageView.setImageResource(R.drawable.rock)
            }

            // If RandomNumber is 2, then it is a Tie, and Set the computerImageView to paper and resultTextView to Tie
            if(computerNumber==2){    // Paper
                resultTextView.setText("Tie 🏳️")
                computerImageView.setImageResource(R.drawable.paper)
            }

            // If RandomNumber is 3, then it is a Lose, and Set the computerImageView to scissor and resultTextView to You Lose
            if(computerNumber==3){   // Scissor
                resultTextView.setText("You Lose 😥")
                computerImageView.setImageResource(R.drawable.scissor)
            }
        }


        // Set onClickListener to the scissorCardView
        scissorCardView.setOnClickListener {

            // Set the playerImageView to scissor
            val playerNumber = 3   // Scissor
            playerImageView.setImageResource(R.drawable.scissor)

            // Generate a random number between 1 and 4 (1 included, 4 excluded)
            val computerNumber = Random.nextInt(1, 4)  // Computer will select a random number between 1 and 3
            // 1 = rock, 2 = paper, 3 = scissor


            // If RandomNumber is 1, then it is a Lose, and Set the computerImageView to rock and resultTextView to You Lose
            if(computerNumber == 1){   // Rock
                resultTextView.setText("You Lose 😥")
                computerImageView.setImageResource(R.drawable.rock)
            }

            // If RandomNumber is 2, then it is a Win, and Set the computerImageView to paper and resultTextView to You Win
            if(computerNumber==2){    // Paper
                resultTextView.setText("You Win 🥳")
                computerImageView.setImageResource(R.drawable.paper)

            }

            // If RandomNumber is 3, then it is a Tie, and Set the computerImageView to scissor and resultTextView to Tie
            if(computerNumber==3){   // Scissor
                resultTextView.setText("Tie 🏳️")
                computerImageView.setImageResource(R.drawable.scissor)
            }
            
        }

    }
}
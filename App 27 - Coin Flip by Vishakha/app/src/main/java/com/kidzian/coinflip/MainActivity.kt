package com.kidzian.coinflip

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Initialize UI Elements
        val coinImageView=findViewById<ImageView>(R.id.coinImageView)
        val headOrTail=findViewById<TextView>(R.id.headOrTail)

        // PERFORM COIN FLIP TASK AS SOON AS THE APP OPENS

        // to select a Randon number
        val randomNumber= Random.nextInt(1, 3)  // including 1 & 2, but not 3
        // Set the Coin face according to the random number
        if(randomNumber==1){
            coinImageView.setImageResource(R.drawable.head)
            headOrTail.setText("Heads")
            Toast.makeText(this, "Flipped", Toast.LENGTH_SHORT).show()
        }
        else{
            coinImageView.setImageResource(R.drawable.tail)
            headOrTail.setText("Tails")
            Toast.makeText(this, "Flipped", Toast.LENGTH_SHORT).show()
        }


        // PERFORM THE COIN FLIP TASK AGAIN WHEN THE USER CLICKS ON THE COIN
        coinImageView.setOnClickListener {

            // to select a Randon number
            val randomNumber= Random.nextInt(1, 3)  // including 1 & 2, but not 3

            if(randomNumber==1){
                coinImageView.setImageResource(R.drawable.head)
                headOrTail.setText("Heads")
                Toast.makeText(this, "Flipped", Toast.LENGTH_SHORT).show()
            }
            else{
                coinImageView.setImageResource(R.drawable.tail)
                headOrTail.setText("Tails")
                Toast.makeText(this, "Flipped", Toast.LENGTH_SHORT).show()
            }

        }




    }
}
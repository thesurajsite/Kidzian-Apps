package com.surajverma.birthdaywishingapp

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

        // COMMENT THIS PART, IT IS A USELESS FUNCTION FOR US (if present)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        // INITIALIZE THE ELEMENTS OF THE  UI: EDITTEXT & BUTTON
        // val nameOfVariable = findViewById<Type>(R.id.idThatWeProvided)
        val name=findViewById<EditText>(R.id.name)
        val button=findViewById<Button>(R.id.button)

        //the button that we wrote after val will be used in kt file, the button in R.id.button is the id that we provided
        // we keep these names same to avoid confusion



        // lets perform what out button will do. Make clickListerner for the button
        // as you write button.setoncli    (you will get a suggestion like below, click on that)
        // button.setOnClickListener{ }     <------ select this suggestion, not any other

        button.setOnClickListener {
            //on the click of the button, get the name what the user has entered in the edittext
            val nameEntered=name.text.toString()

            //create a toast to wish happy birthday to the user
            // to get the toast, start writing 'toast'
            Toast.makeText(this, "Happy Birthday $nameEntered", Toast.LENGTH_SHORT).show()

        }






    }
}
package com.surajverma.calculator

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

        //Comment this part, its not required

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }


        //Declare all the UI Elements that we need
        // initialize inputNumber1 and inputNumber2
        val inputNumber1= findViewById<EditText>(R.id.inputNumber1)
        val inputNumber2= findViewById<EditText>(R.id.inputNumber2)
        // initialize answer
        val answer= findViewById<TextView>(R.id.answer)
        // initialize operation buttons
        val addButton= findViewById<Button>(R.id.addButton)
        val subtractButton= findViewById<Button>(R.id.subtractButton)
        val multiplyButton= findViewById<Button>(R.id.multiplyButton)
        val divideButton= findViewById<Button>(R.id.divideButton)
        // initialize clear button
        val clearButton= findViewById<Button>(R.id.clearButton)


        // Add a Click Listener to addButton button
        addButton.setOnClickListener {
            // check that the EditTexts are not empty, and user has entered some number
            // exclamation mark means not. So first we check if its empty, then added exclamation mark to make it not empty
            // inputNumber1.text.toString().isEmpty() ---> means inputNumber1 is empty
            // !inputNumber1.text.toString().isEmpty() ---> means inputNumber1 is not empty
            if(!inputNumber1.text.toString().isEmpty() && !inputNumber2.text.toString().isEmpty() )
            {
                //get the numbers entered by user if it is not empty
                val number1= inputNumber1.text.toString().toInt()
                val number2= inputNumber2.text.toString().toInt()
                // add the numbers
                val add= number1+number2
                // set the answer text
                answer.setText(add.toString())
            }
        }


        // Add a Click Listener to subtractButton button
        subtractButton.setOnClickListener {
            // check that the EditTexts are not empty, and user has entered some number
            if(!inputNumber1.text.toString().isEmpty() || !inputNumber2.text.toString().isEmpty())
            {
                //get the numbers entered by user if it is not empty
                val number1= inputNumber1.text.toString().toInt()
                val number2= inputNumber2.text.toString().toInt()
                // subtract the numbers
                val subtract= number1-number2
                // set the answer text
                answer.setText(subtract.toString())
            }
        }


        // Add a Click Listener to multiplyButton button
       multiplyButton.setOnClickListener {
           // check that the EditTexts are not empty, and user has entered some number
           if(!inputNumber1.text.toString().isEmpty() || !inputNumber2.text.toString().isEmpty())
           {
               //get the numbers entered by user if it is not empty
               val number1= inputNumber1.text.toString().toInt()
               val number2= inputNumber2.text.toString().toInt()
               // multiply the numbers
               val multiply= number1*number2
               // set the answer text
               answer.setText(multiply.toString())
           }


       }


        // Add a Click Listener to divideButton button
        divideButton.setOnClickListener {
            // check that the EditTexts are not empty, and user has entered some number
            if(!inputNumber1.text.toString().isEmpty() || !inputNumber2.text.toString().isEmpty())
            {
                //get the numbers entered by user if it is not empty
                val number1= inputNumber1.text.toString().toInt()
                val number2= inputNumber2.text.toString().toInt()
                // divide the numbers
                val divide= number1/number2
                // set the answer text
                answer.setText(divide.toString())
            }
        }


        // Add a Click Listener to clearButton button
        clearButton.setOnClickListener {
            // clear the EditTexts
            inputNumber1.setText("")
            inputNumber2.setText("")
            // clear the answer
            answer.setText("")
        }

    }
}
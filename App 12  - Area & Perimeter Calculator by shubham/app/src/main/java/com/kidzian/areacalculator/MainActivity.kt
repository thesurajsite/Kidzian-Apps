package com.kidzian.areacalculator

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

        // SINCE THIS PROJECT HAS A COMPLEX UI, THEREFORE, THE UI IS ALREADY PROVIDED TO THE STUDENTS
        // JUST INITIALIZE THE UI ELEMENTS HERE AND ADD BUTTON CLICK LISTENERS AND PERFORM TASKS

        // Initialize UI Elements
        // Initialize result TextView
        val result= findViewById<TextView>(R.id.result)
        // Initialize radius EditText
        val radius= findViewById<EditText>(R.id.radius)
        // Initialize rectangle side EditText
        val rectangleSide1=findViewById<EditText>(R.id.rectangleSide1)
        val rectangleSide2=findViewById<EditText>(R.id.rectangleSide2)
        // Initialize triangle side EditText
        val triangleSide1=findViewById<EditText>(R.id.triangleSide1)
        val triangleSide2=findViewById<EditText>(R.id.triangleSide2)
        val triangleSide3=findViewById<EditText>(R.id.triangleSide3)
        // Initialize triangle base and height EditText
        val triangleBase=findViewById<EditText>(R.id.triangleBase)
        val triangleHeight=findViewById<EditText>(R.id.triangleHeight)

        // Initialize buttons
        //Initialize circleAreaButton
        val circleAreaButton=findViewById<Button>(R.id.circleAreaButton)
        //Initialize circlePerimeterButton
        val circlePerimeterButton=findViewById<Button>(R.id.circlePerimeterButton)
        //Initialize rectangleAreaButton
        val rectangleAreaButton=findViewById<Button>(R.id.rectangleAreaButton)
        //Initialize rectanglePerimeterButton
        val rectanglePerimeterButton=findViewById<Button>(R.id.rectanglePerimeterButton)
        //Initialize triangleAreaButton
        val triangleAreaButton=findViewById<Button>(R.id.triangleAreaButton)
        //Initialize trianglePerimeterButton
        val trianglePerimeterButton=findViewById<Button>(R.id.trianglePerimeterButton)


        // Add button click listeners to Calculate Area of Cirlce when button is clicked
        circleAreaButton.setOnClickListener {

            val circleRadius=radius.text.toString().toDouble()
            val circleArea=(3.14) *circleRadius * circleRadius
            result.setText("$circleArea unit square")

        }

        // Add button click listeners to Calculate Perimeter of Circle when button is clicked
        circlePerimeterButton.setOnClickListener {
            val circleRadius=radius.text.toString().toDouble()
            val circlePerimeter=2*3.14*circleRadius
            result.setText("$circlePerimeter units")

        }

        // Add button click listeners to Calculate Area of Rectangle when button is clicked
        rectangleAreaButton.setOnClickListener {
            val rectangleSide1=rectangleSide1.text.toString().toDouble()
            val rectangleSide2=rectangleSide2.text.toString().toDouble()
            val rectangleArea= rectangleSide1 * rectangleSide2
            result.setText("$rectangleArea unit square")

        }

        // Add button click listeners to Calculate Perimeter of Rectangle when button is clicked
        rectanglePerimeterButton.setOnClickListener {
            val rectangleSide1=rectangleSide1.text.toString().toDouble()
            val rectangleSide2=rectangleSide2.text.toString().toDouble()
            val rectanglePerimeter=2 * (rectangleSide1 + rectangleSide2)
            result.setText("$rectanglePerimeter units")

        }

        // Add button click listeners to Calculate Area of Triangle when button is clicked
        triangleAreaButton.setOnClickListener {
            val triangleBase=triangleBase.text.toString().toDouble()
            val triangleHeight=triangleHeight.text.toString().toDouble()
            val triangleArea= 0.5 * triangleBase * triangleHeight
            result.setText("$triangleArea unit square")
        }

        // Add button click listeners to Calculate Perimeter of Triangle when button is clicked
        trianglePerimeterButton.setOnClickListener {
            val triangleSide1=triangleSide1.text.toString().toDouble()
            val triangleSide2=triangleSide2.text.toString().toDouble()
            val triangleSide3=triangleSide3.text.toString().toDouble()
            val trianglePerimeter=triangleSide1 + triangleSide2 + triangleSide3
            result.setText("$trianglePerimeter units")


        }
    }
}
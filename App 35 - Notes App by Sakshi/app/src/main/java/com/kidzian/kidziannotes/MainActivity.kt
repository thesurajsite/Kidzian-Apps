package com.kidzian.kidziannotes

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val notesEditText= findViewById<EditText>(R.id.notesEditText)
        val saveButton=findViewById<Button>(R.id.saveButton)

        // on start of the app, get the notes and set it in the EditText
        notesEditText.setText(getNotes())

        // when save button is pressed, get the notes from the EditText and update the notes by passing it to the updateNotes function
        saveButton.setOnClickListener{
            Toast.makeText(this, "Notes Saved...", Toast.LENGTH_SHORT).show()
            val updatedNotes= notesEditText.text.toString()
            updateNotes(updatedNotes)
        }


    }


    // NOTE: All the words & letters in the double quotes must be exactly same.

    // create a function getNotes to get the notes
    fun getNotes(): String{
        // create a Shared-Preference database of name NOTES-SHARED-PREF.
        val pref: SharedPreferences = getSharedPreferences("NOTES-SHARED-PREF", MODE_PRIVATE)
        // inside that NOTES-SHARED-PREF database, create a field named "notes" with default value "Your Notes Here..."
        return pref.getString("notes", "Your Notes Here...").toString()
    }


    // create a function updateNotes to update the notes (passed updatedNotes as a parameter of type string)
    fun updateNotes(updatedNotes: String){
        // calling the same shared preference that we create above
        val pref: SharedPreferences = getSharedPreferences("NOTES-SHARED-PREF", MODE_PRIVATE)
        // creating a editor to edit the shared preference
        val editor= pref.edit()
        // edit the "notes" field with the current mood
        editor.putString("notes", updatedNotes)
        editor.apply()
    }
}
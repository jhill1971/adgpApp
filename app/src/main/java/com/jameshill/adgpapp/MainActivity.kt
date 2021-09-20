package com.jameshill.adgpapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //assign the variable button to inherit from class Button
    //will be initialized later.
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //intialize button by assigning it to the tappable_view from xml.
        button = findViewById(R.id.tappable_view)
        //set the onClickListener for the button
        button.setOnClickListener {
            val a: Int= 1
            val b: Int = 2
            val c: Int = a + b
            Log.i("Example Activity", "The value of c is $c")

            Toast.makeText(this,
                "The value of c is $c", Toast.LENGTH_LONG).show()
        }
    }
}
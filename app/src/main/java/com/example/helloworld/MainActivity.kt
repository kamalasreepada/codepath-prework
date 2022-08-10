package com.example.helloworld

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.TintableBackgroundView

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Kamala","Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            //Log.i("Kamala","Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getColor(R.color.teal_200))
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            Log.i("Kamala","Tapped on button")
            findViewById<TextView>(R.id.textView).setText("Android is Awesome!")

        }
        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener{
            //Log.i("Kamala","Tapped on button")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getColor(R.color.blue))
            findViewById<TextView>(R.id.textView).setText("Hello from Kamala!")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.red))
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            Log.i("Kamala","Tapped on button")
            findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Kamala", "Entered user input")
            val simpleEditText = findViewById<EditText>(R.id.editText)
            val msg = simpleEditText.text.toString()
            if (msg == "") {
                findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
            } else {
                findViewById<TextView>(R.id.textView).setText(msg)
            }
        }


}}
package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

abstract class MainActivity : AppCompatActivity() {
 lateinit var hallo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hallo =findViewById(R.id.hello)
    }
    fun pressButtonAction (view: View) {

    }

}

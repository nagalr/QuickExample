package com.lalorosas.quickexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloButton.setOnClickListener { v ->
            helloText.text = "Hi ".plus(nameEditText.text.toString()).plus("! Good to see you here.");
        // Here we change the features again
        // and another change here.
        }
    }
}

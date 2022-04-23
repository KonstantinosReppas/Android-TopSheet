package com.konstantinosreppas.topsheetfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.topSheetButton).setOnClickListener {

            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainer, TopSheetFragment()).addToBackStack("").commit()
        }
    }
}
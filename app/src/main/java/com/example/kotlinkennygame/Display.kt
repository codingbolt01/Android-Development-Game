package com.example.kotlinkennygame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_display.*

class Display : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        var sharedPreference=this.getSharedPreferences("com.example.kotlinkennygame", Context.MODE_PRIVATE)
        val storedscore=sharedPreference.getInt("storedScore",0)
        Score.text= "Score \n "+storedscore.toString()
    }
    fun change(view:View)
    {
        val intent=Intent(application,MainActivity::class.java)
        startActivity(intent)
    }
}

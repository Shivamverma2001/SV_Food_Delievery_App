package com.example.fooddelieveryapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fooddelieveryapplication.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

    }

    fun register(view: View) {
        val i=Intent(this, RegistrationActivity::class.java)
        startActivity(i)
    }
    fun singIn(view: View) {
        val i= Intent(this, LoginActivity::class.java)
        startActivity(i)
    }
}
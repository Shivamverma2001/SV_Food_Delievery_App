package com.example.fooddelieveryapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fooddelieveryapplication.MainActivity
import com.example.fooddelieveryapplication.R

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

    fun singIn(view: View) {
        val i= Intent(this, LoginActivity::class.java)
        startActivity(i)
    }

    fun mainActivity(view: View) {
        val i= Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}
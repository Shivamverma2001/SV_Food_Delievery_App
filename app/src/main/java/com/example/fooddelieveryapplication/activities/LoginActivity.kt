package com.example.fooddelieveryapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.fooddelieveryapplication.MainActivity
import com.example.fooddelieveryapplication.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun register(view: View) {
        val i=Intent(this, RegistrationActivity::class.java)
        startActivity(i)
    }
    fun mainActivity(view: View) {
        val i= Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}
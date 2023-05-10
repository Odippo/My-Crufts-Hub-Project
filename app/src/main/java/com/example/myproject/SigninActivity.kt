package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SigninActivity : AppCompatActivity() {
    lateinit var mSignin:TextView
    lateinit var mUsername:EditText
    lateinit var mPassword:EditText
    lateinit var mButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        // Proceed to find the views by ID's
        mSignin = findViewById(R.id.mTvSignin)
        mUsername = findViewById(R.id.mEdtUsername)
        mPassword = findViewById(R.id.mEdtPasswordw)
        mButton = findViewById(R.id.mBtnSignin)
        // Set Oncklick listener to the Signin button
        mButton.setOnClickListener {
            val signin = Intent(this@SigninActivity, MenuActivity::class.java)
            startActivity(signin)
        }
    }

}
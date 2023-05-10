package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Initiate the elements on the user interface as variables
    lateinit var mHead:TextView
    lateinit var mAdd:TextView
    lateinit var mAsk:TextView
    lateinit var mQueri:TextView
    lateinit var mBtnSignup:Button
    lateinit var mBtnSignin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnSignup = findViewById(R.id.btnSignup)
        mBtnSignin = findViewById(R.id.btnSignIn)
        mAdd = findViewById(R.id.mTvAdd)
        mQueri = findViewById(R.id.mTvQueri)
        mHead = findViewById(R.id.mTvhead)
        mAsk = findViewById(R.id.mtvAsk)
        // Set Onclick listeners to the Signup and Sign in button
        mBtnSignup.setOnClickListener {
            val signup = Intent(this@MainActivity, SignupActivity::class.java)
            startActivity(signup)
        }
        mBtnSignin.setOnClickListener {
            val sign = Intent(this@MainActivity, SigninActivity::class.java)
            startActivity(sign)
        }
    }
}
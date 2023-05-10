package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    // Initiate the elements on the user interface as variables
    lateinit var mSignup:TextView
    lateinit var mCreate:TextView
    lateinit var mEmail:EditText
    lateinit var mPhone:EditText
    lateinit var mName:EditText
    lateinit var mPassword:EditText
    lateinit var mbLogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    // Find views by ID's
        mSignup = findViewById(R.id.mTvSignUp)
        mCreate = findViewById(R.id.mTvcreate)
        mEmail = findViewById(R.id.mEdtEmail)
        mPhone = findViewById(R.id.mEdtPhonnumber)
        mName = findViewById(R.id.mEdtName)
        mPassword = findViewById(R.id.mEdtPassword)
        mbLogin = findViewById(R.id.mBtnLogin)
        // Set Onclick listeners to the Signup button
        mbLogin.setOnClickListener {
            val login = Intent(this@SignupActivity, QueryActivity::class.java)
            startActivity(login)
        }
    }
}
package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myproject.databinding.ActivityCraftsBinding

class CraftsActivity : AppCompatActivity() {
    // Initiate the elements on the user interface as variables
    lateinit var mRegister:TextView
    lateinit var mInfo: TextView
    lateinit var mEmail: EditText
    lateinit var mPhone: EditText
    lateinit var mName: EditText
    lateinit var mPassword: EditText
    lateinit var mbRegister: Button
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityCraftsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityCraftsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

//        val navController = findNavController(R.id.nav_host_fragment_content_crafts)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
        setContentView(R.layout.activity_signup)
        // Find views by ID's
        mRegister = findViewById(R.id.mTvRegister)
        mInfo = findViewById(R.id.mTvinfo)
        mEmail = findViewById(R.id.mEdtId)
        mPhone = findViewById(R.id.mEdtMyPhoneNumber)
        mName = findViewById(R.id.mEdtMyName)
        mPassword = findViewById(R.id.mEdtMyPassword)
        mbRegister = findViewById(R.id.btnRegister)
        // Set Onclick listeners to the Signup button
        mbRegister.setOnClickListener {
            val login = Intent(this@CraftsActivity,  MenuActivity::class.java)
            startActivity(login)
        }
    }


//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_crafts)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_crafts, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_s1 -> {
                Toast.makeText(this,"S1 clicked",Toast.LENGTH_LONG).show()
                true
            }

            R.id.action_s2 -> {
                Toast.makeText(this,"S2 clicked",Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_s3 -> {
                Toast.makeText(this,"S3 clicked",Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
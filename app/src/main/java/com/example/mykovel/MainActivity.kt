package com.example.mykovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // SplashScreen from
        supportActionBar?.hide()

        Handler().postDelayed({
          val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        },3000, )
        //SplashScreen to
    }
}
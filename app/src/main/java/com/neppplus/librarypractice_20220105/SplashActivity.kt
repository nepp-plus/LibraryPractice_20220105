package com.neppplus.librarypractice_20220105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)

//        메인으로 넘어가고 나면, 이 화면 종료
        finish()

    }
}
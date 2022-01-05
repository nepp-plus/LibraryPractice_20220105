package com.neppplus.librarypractice_20220105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        2.5초간 대기 후에 -> 화면이동/로딩화면 종료

        val myHandler = Handler( Looper.getMainLooper() )

//        2500 ms 후에, {} 안에 있는 코드를 실행. (작업 지연/실행)
        myHandler.postDelayed( {

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

//        메인으로 넘어가고 나면, 이 화면 종료
            finish()

        },  2500 )



    }
}
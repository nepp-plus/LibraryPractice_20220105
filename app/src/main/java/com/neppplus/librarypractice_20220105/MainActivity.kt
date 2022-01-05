package com.neppplus.librarypractice_20220105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCall.setOnClickListener {

//            010-2222-3333 에 전화 연결하기.

        }

        imgProfilePhoto.setOnClickListener {

//            사진 크게 보기 화면으로 진입. (Intent - 추가 액티비티 필요)

            val myIntent = Intent(this, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }


//        Glide 이용 => 웹의 이미지를 -> imgRecent에 반영하기.

        Glide.with(this).load("https://cdn.kado.net/news/photo/201402/669003_243541_1228.jpg").into(imgRecent)



    }
}
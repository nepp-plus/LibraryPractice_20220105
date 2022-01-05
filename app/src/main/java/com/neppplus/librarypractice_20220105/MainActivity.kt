package com.neppplus.librarypractice_20220105

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCall.setOnClickListener {

//            010-2222-3333 에 전화 연결하기.
//            (안드로이드) 전화 앱 화면으로 이동

//            코드 구조가 틀린건아님. => 앱이 죽는 상황.

//            CALL (바로 전화 연결) 에 대한 권한 획득 후에 전화 연결 진행.


//            pl변수에, 권한 OK일때/ 거부일때 어떤 행동을 할지, 방침만 저장해둠.
//            실제로 권한을 묻는 행위는 코딩 X

            val pl = object : PermissionListener {
                override fun onPermissionGranted() {

//                    권한이 OK 되었을때 해줄일 적는 공간.

                    val myUri = Uri.parse("tel:010-2222-3333")
                    val myIntent = Intent( Intent.ACTION_CALL, myUri )
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(this@MainActivity, "권한이 거부되어 통화가 불가합니다.", Toast.LENGTH_SHORT)
                        .show()

                }

            }


//            실제 권한 확인
            TedPermission.create()
                .setPermissionListener(pl)
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()


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
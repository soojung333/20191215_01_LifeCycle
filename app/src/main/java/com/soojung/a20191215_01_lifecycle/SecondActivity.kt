package com.soojung.a20191215_01_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

    }

    override fun onBackPressed() {
//        super.onBackPressed()


    val alert = AlertDialog.Builder(mContext)
        alert.setTitle("게시글작성중지 확인")
        alert.setMessage("정말 중단하시겠습니까?")
        alert.setPositiveButton("확인",{dialog, which -> finish() })



    }


    override fun onResume() {
        super.onResume()

        Log.d("생명주기", "onResume 실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("생명주기", "onPause 실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("생명주기", "onDestroy 실행")
    }


    override fun setupEvents() {

        callActivityBtn.setOnClickListener {

            val intent = Intent(mContext, SecondActivity::class.java)
            startActivity(intent)

        }

    }

    override fun setValues() {

    }
}
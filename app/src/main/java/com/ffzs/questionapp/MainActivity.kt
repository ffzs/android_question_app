package com.ffzs.questionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        login_start_button.setOnClickListener {
            if (login_name_input.text.toString().isEmpty()) {
                Toast.makeText(this, "请输入昵称", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuestionActivity::class.java)
                val questionCount = login_name_input.text.toString()
                try {
                    questionCount.toInt()
                    intent.putExtra(Constants.QUESTION_COUNT, questionCount)
                    startActivity(intent)
                    finish()
                }catch (e:Exception) {
                    Toast.makeText(this, "请输入整数", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}

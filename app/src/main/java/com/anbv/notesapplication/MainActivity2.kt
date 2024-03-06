package com.anbv.notesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.btnnext).setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
        findViewById<TextView>(R.id.txtSkip).setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
        findViewById<TextView>(R.id.txtBack).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
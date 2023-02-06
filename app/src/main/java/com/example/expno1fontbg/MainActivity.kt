package com.example.expno1fontbg

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvText: TextView=findViewById(R.id.tvTextView)
        val btnFontSize: Button = findViewById(R.id.btnFontSize)
        val btnColor: Button = findViewById(R.id.btnColor)
        val btnBg: Button = findViewById(R.id.btnBg)
        var fontSize: Float= 5f
        var fontColor: Int= 0
        var colorBg: Int=0
        val LinLay: LinearLayout=findViewById(R.id.LinLay)
        btnFontSize.setOnClickListener {
            tvText.setTextSize(fontSize);
            fontSize=(fontSize+5)%50
        }
        btnColor.setOnClickListener {
            when(fontColor%3){
                0 -> tvText.setTextColor(Color.RED)
                1 -> tvText.setTextColor(Color.GREEN)
                2 -> tvText.setTextColor(Color.BLUE)
            }
            fontColor++
        }
        btnBg.setOnClickListener {
            when(colorBg%3){
                0 -> LinLay.setBackgroundColor(Color.RED)
                1 -> LinLay.setBackgroundColor(Color.GREEN)
                2 -> LinLay.setBackgroundColor(Color.BLUE)
            }
            colorBg++
        }
    }

}
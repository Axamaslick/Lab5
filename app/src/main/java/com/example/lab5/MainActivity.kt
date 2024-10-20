package com.example.lab5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var intent: Intent
    private lateinit var textInput: TextInputEditText
    private lateinit var rb1: RadioButton
    private lateinit var rb2: RadioButton
    private lateinit var rb3: RadioButton
    private lateinit var button: Button
    private lateinit var rg: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        textInput = findViewById(R.id.textInput)
        rb1 = findViewById(R.id.radioButton1)
        rb2 = findViewById(R.id.radioButton2)
        rb3 = findViewById(R.id.radioButton3)
        button = findViewById(R.id.button)
        rg = findViewById(R.id.RadioGroup)
        intent = Intent(this, ResultActivity::class.java)

        var res: Float = 0
        val sum = textInput.text.toString()
        val number: Int = sum.toInt()
        val numberf: Float = number.toFloat()
        button.setOnClickListener{
            if(rb1.isActivated){
                res = numberf / 68000
            }
            else if(rb2.isActivated){
                res = numberf / 2600
            }
            else if(rb3.isActivated){
                res = numberf / 598
            }
            intent.putExtra("123", res)
            startActivity(intent)

        }
    }
}
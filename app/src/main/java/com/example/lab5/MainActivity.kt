package com.example.lab5

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
        rg.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radioButton1 -> {
                    // Действие для первой опции
                }
                R.id.radioButton2 -> {
                    // Действие для второй опции
                }
                R.id.radioButton3 -> {
                    // Действие для третьей опции
                }
            }
        }
    }
}
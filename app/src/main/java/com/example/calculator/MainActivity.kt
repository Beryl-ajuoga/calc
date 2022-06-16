package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber: EditText
    lateinit var etNumber2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult: TextView

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber=findViewById(R.id.etNumber)
        etNumber2 = findViewById(R.id.etNumber2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener(){
            var number =etNumber.text.toString()
            var Number2=etNumber2.text.toString()
            add(number.toInt(), Number2.toInt() )


        }

    }
    fun add(number:Int,Number2:Int){
        var add = number + Number2
        tvResult.text = add.toString()
    }

    }

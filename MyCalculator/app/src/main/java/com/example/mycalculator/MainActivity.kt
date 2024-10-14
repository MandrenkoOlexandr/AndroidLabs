package com.example.mycalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG: String = "XXXXX"
    private lateinit var etLeft: EditText
    private lateinit var etRight: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnMultiplication: Button
    private lateinit var btnDivision: Button

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etLeft = findViewById(R.id.etLeft)
        etRight = findViewById(R.id.etRight)
        tvResult = findViewById(R.id.tvResult)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDivision = findViewById(R.id.btnDivision)

        btnPlus.setOnClickListener { it: View? ->
            Log.d(TAG, "onCreate: ")

            val left: String = etLeft.text.toString()
            val right: String = etRight.text.toString()
            if (left != "" && right != "") {
                val res: Double = left.toDouble() + right.toDouble()
                tvResult.text = res.toString()
            }

        }

        btnMinus.setOnClickListener { it: View? ->
            Log.d(TAG, "onCreate: ")

            val left: String = etLeft.text.toString()
            val right: String = etRight.text.toString()
            if (left != "" && right != "") {
                val res: Double = left.toDouble() - right.toDouble()
                tvResult.text = res.toString()
            }
        }

        btnMultiplication.setOnClickListener { it: View? ->
            Log.d(TAG, "onCreate: ")

            val left: String = etLeft.text.toString()
            val right: String = etRight.text.toString()
            if (left != "" && right != "") {
                val res: Double = left.toDouble() * right.toDouble()
                tvResult.text = res.toString()
            }
        }

        btnDivision.setOnClickListener { it: View? ->
            Log.d(TAG, "onCreate: ")

            val left: String = etLeft.text.toString()
            val right: String = etRight.text.toString()
            if (left != "" && right != "") {
                if (right.toDouble() == 0.0) {
                    tvResult.text = "Error"
                } else {
                    val res: Double = left.toDouble() / right.toDouble()
                    tvResult.text = res.toString()
                }
            }
        }

    }
}
package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset)
        resetButton.setOnClickListener { reset() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        var resultInt = resultText.text.toString().toInt()

        if (resultInt < 6) {
            resultInt++

            resultText.text = resultInt.toString()
        } else {
            resultText.text = resultInt.toString()
        }

    }

    private fun reset() {
        val resultText: TextView = findViewById(R.id.result_text)

        var resultInt = 0

        resultText.text = resultInt.toString()
    }

}

package com.surya.diceroller

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

        val rollButton:Button = findViewById(R.id.btnRoll)


        rollButton.text = "Lets Roll"

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "button clicekd", Toast.LENGTH_SHORT).show()
        }
    }

    fun rollDice(){
        val rollText:TextView = findViewById(R.id.tvRoll)

        val randomInt = Random().nextInt(6)+1

        rollText.text = randomInt.toString()
    }
}

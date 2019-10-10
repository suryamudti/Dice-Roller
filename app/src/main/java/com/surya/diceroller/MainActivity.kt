package com.surya.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var imageDice:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.btnRoll)
        imageDice = findViewById(R.id.ivDice)


        rollButton.text = "Lets Roll"

        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "button clicekd", Toast.LENGTH_SHORT).show()
        }
    }

    fun rollDice(){
        val randomInt = Random().nextInt(6)+1
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageDice.setImageResource(drawableResource)
    }
}

package com.gabyperez.myfirstapplication

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //lateinit var etiqueta: TextView
    lateinit var boton: Button
    lateinit var img: ImageView
    lateinit var img2: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_roller)

        boton = findViewById(R.id.btnClick)
        img = findViewById(R.id.imgRoller)
        img2 = findViewById(R.id.imgRoller2)

        img.setImageResource(R.drawable.empty_dice)
        img2.setImageResource(R.drawable.empty_dice)

        //val dra = resources.getDrawable(R.drawable.dice_3)
        //img.setImageDrawable(dra)

        /*
        Forma orientada a objetos
        boton.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext,"Botón Presionado",Toast.LENGTH_LONG).show()
        })
        */

        //Forma corta
        boton.setOnClickListener {
            //Toast.makeText(applicationContext,"Botón Presionado",Toast.LENGTH_LONG).show()
            //val num = diceRoller()
            //val num2 = diceRoller()
            //etiqueta.text = "Num Aleatorio ${num}"

            /*when (num) {
                1 -> img.setImageResource(R.drawable.dice_1)
                2 -> img.setImageResource(R.drawable.dice_2)
                3 -> img.setImageResource(R.drawable.dice_3)
                4 -> img.setImageResource(R.drawable.dice_4)
                5 -> img.setImageResource(R.drawable.dice_5)
                6 -> img.setImageResource(R.drawable.dice_6)
            }

            when (num2) {
                1 -> img2.setImageResource(R.drawable.dice_1)
                2 -> img2.setImageResource(R.drawable.dice_2)
                3 -> img2.setImageResource(R.drawable.dice_3)
                4 -> img2.setImageResource(R.drawable.dice_4)
                5 -> img2.setImageResource(R.drawable.dice_5)
                6 -> img2.setImageResource(R.drawable.dice_6)
            }*/

            img.setImageResource(diceRoller())
            img2.setImageResource(diceRoller())
        }
    }

    private fun diceRoller(): Int {
        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> {R.drawable.empty_dice}
        }
    }
}
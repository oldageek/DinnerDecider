package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    //Creamos lista de arrays
    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonals", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener{
            val randoom = Random() //Creamos numero random
            val randomFood = randoom.nextInt(foodList.count()) //creamos un valon random de 0 al numero maximo de nuestra lista
            selectedFoodTxt.text = foodList[randomFood] //Imprimimos el valor random de nuestra lista a nuestro TextView
        }

        addFoodBtn.setOnClickListener {
            val newFood = addFootTxt.text.toString() //Obtenemos el valor de nuestro EditText
            foodList.add(newFood) //Lo agregamos a la lista
            addFootTxt.text.clear() //Limpliamos nuestro EditText
            println(foodList) //Imprimimos en consola si se hace correctamente la operacion
        }
    }
}
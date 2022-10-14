package com.example.sumarestaradiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcular.setOnClickListener {
            if (radioButon_Suma.isChecked)
                txt_totalResu.text= "El resultado es: ${txt_NumeroUno.text.toString().toFloat()+txt_NumeroDos.text.toString().toFloat()}"
            if (radioButon_Resta.isChecked)
                txt_totalResu.text= "El resultado es: ${txt_NumeroUno.text.toString().toFloat()-txt_NumeroDos.text.toString().toFloat()}"
        }
    }
}

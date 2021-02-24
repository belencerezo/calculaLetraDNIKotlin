package com.example.calculaletradnikotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculaletradnikotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val listaLetras = charArrayOf('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E')

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var numberDNI = binding.number
        var letter = binding.letra



        binding.buttonResult.setOnClickListener {
            var dni = numberDNI.text.toString().toInt()
            var resto = dni % 23
            var stringDni: String = numberDNI.text.toString()
            letter.setText(listaLetras.get(resto).toString())

        }

        binding.buttonSalir.setOnClickListener {
            finish()
        }

    }
}

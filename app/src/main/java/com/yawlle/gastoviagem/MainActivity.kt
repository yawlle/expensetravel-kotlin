package com.yawlle.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.yawlle.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        //fazer tratamento
        //se o ID da view for o mesmo do buttom_calculadora, vc faz a coisa tal
        if (view.id == R.id.button_calculate) {
            calculate()
        }
    }

    private fun calculate() {
        Toast.makeText(this,"Fui clicado", Toast.LENGTH_SHORT).show()

    }


}



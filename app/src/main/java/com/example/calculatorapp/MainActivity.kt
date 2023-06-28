package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvAC.setOnClickListener {
            binding.tvDisplay.text = ""
            binding.tvDisplay1.text = ""
        }
        binding.tv9.setOnClickListener {
            binding.tvDisplay.append("9")
        }
        binding.tv8.setOnClickListener {
            binding.tvDisplay.append("8")
        }
        binding.tv7.setOnClickListener {
            binding.tvDisplay.append("7")
        }
        binding.tv6.setOnClickListener {
            binding.tvDisplay.append("6")
        }
        binding.tv5.setOnClickListener {
            binding.tvDisplay.append("5")
        }
        binding.tv4.setOnClickListener {
            binding.tvDisplay.append("4")
        }
        binding.tv3.setOnClickListener {
            binding.tvDisplay.append("3")
        }
        binding.tv2.setOnClickListener {
            binding.tvDisplay.append("2")
        }
        binding.tv1.setOnClickListener {
            binding.tvDisplay.append("1")
        }
        binding.tv0.setOnClickListener {
            binding.tvDisplay.append("0")
        }
        binding.tvAdd.setOnClickListener {
            binding.tvDisplay.append(" + ")
        }
        binding.tvMultiply.setOnClickListener {
            binding.tvDisplay.append(" * ")
        }
        binding.tvSubstract.setOnClickListener {
            binding.tvDisplay.append(" - ")
        }
        binding.tvDecimal.setOnClickListener {
            binding.tvDisplay.append(".")
        }
        binding.tvDivide.setOnClickListener {
            binding.tvDisplay.append(" / ")
        }
        binding.tvBackspace.setOnClickListener {
            binding.tvDisplay.text
        }
        binding.tvClosingBracket.setOnClickListener {
            binding.tvDisplay.append(")")
        }
        binding.tvOpeningBracket.setOnClickListener {
            binding.tvDisplay.append("(")
        }
        binding.tvEquals.setOnClickListener {
            val expression = ExpressionBuilder(binding.tvDisplay.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if (result == longResult.toDouble()) {

                binding.tvDisplay1.text = longResult.toString()
            } else {
                binding.tvDisplay1.text = result.toString()
            }
        }
    }
}
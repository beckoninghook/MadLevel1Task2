package com.example.madlevel1task2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.madlevel1task2.databinding.MainActivityBinding
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity()  {
    private lateinit var binding: MainActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        val submitBtn = findViewById<Button>(R.id.submitBtn)
        submitBtn.setOnClickListener(){
            onSubmit()
        }
    }

    private fun onSubmit(){
        if (checkAnswer()){
            Toast.makeText(applicationContext, "Correct Answer", Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(applicationContext, "Sumfin was wrong", Toast.LENGTH_LONG).show()
        }
    }

    private fun checkAnswer(): Boolean {
        if(textFieldRow1.text.toString() == "T"){
            if(textFieldRow2.text.toString() == "F"){
                if(textFieldRow3.text.toString() == "F"){
                    if(textFieldRow4.text.toString() == "F"){
                        return true
                    }
                }
            }
        } else {
            return false
        }
        return false
    }
}
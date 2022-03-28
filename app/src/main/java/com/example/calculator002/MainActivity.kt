package com.example.calculator002

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView: TextView = findViewById(R.id.input_number)


        val key_1: Button = findViewById(R.id.key_1)
        key_1.setOnClickListener {
            textView.append("1")
        }
        val key_2: Button = findViewById(R.id.key_2)
        key_2.setOnClickListener {
            textView.append("2")
        }
        val key_3: Button = findViewById(R.id.key_3)
        key_3.setOnClickListener {
            textView.append("3")
        }
        val key_4: Button = findViewById(R.id.key_4)
        key_4.setOnClickListener {
            textView.append("4")
        }
        val key_5: Button = findViewById(R.id.key_5)
        key_5.setOnClickListener {
            textView.append("5")
        }
        val key_6: Button = findViewById(R.id.key_6)
        key_6.setOnClickListener {
            textView.append("6")
        }
        val key_7: Button = findViewById(R.id.key_7)
        key_7.setOnClickListener {
            textView.append("7")
        }
        val key_8: Button = findViewById(R.id.key_8)
        key_8.setOnClickListener {
            textView.append("8")
        }
        val key_9: Button = findViewById(R.id.key_9)
        key_9.setOnClickListener {
            textView.append("9")
        }
        val key_0: Button = findViewById(R.id.key_0)
        key_0.setOnClickListener {
            textView.append("0")
        }
        val key_dot: Button = findViewById(R.id.key_dot)
        key_dot.setOnClickListener {
            textView.append(".")
        }
        val key_plus: Button = findViewById(R.id.key_plus)
        key_plus.setOnClickListener {
            textView.append("+")
        }
        val key_minus: Button = findViewById(R.id.key_minus)
        key_minus.setOnClickListener {
            textView.append("-")
        }
        val key_multiply: Button = findViewById(R.id.key_multiply)
        key_multiply.setOnClickListener {
            textView.append("*")
        }
        val key_shere: Button = findViewById(R.id.key_shere)
        key_shere.setOnClickListener {
            textView.append("/")
        }
        val key_equally: Button = findViewById(R.id.key_equally)
        key_equally.setOnClickListener {

            val ex = ExpressionBuilder(textView.text.toString()).build()
            val res = ex.evaluate()
            textView.text = res.toString()


        }
        val key_c: Button = findViewById(R.id.key_c)
        key_c.setOnClickListener {

            textView.text = ""

        }

        val key_back: Button = findViewById(R.id.key_back)
        key_back.setOnClickListener {
            val back_str = textView.text.toString()
            if (back_str.isNotEmpty())
                textView.text = back_str.substring(0, back_str.length - 1)
        }
    }


}
package es.fgd192.lesson_5

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.ActionMenuView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val writeSave : EditText? = null
    val writeSave2 : EditText? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val writeSave = findViewById<EditText>(R.id.write)
        val writeSave2 = findViewById<EditText>(R.id.write2)
        val buttonLoad2 = findViewById<Button>(R.id.button2)
        val preference = getSharedPreferences("Preference",Context.MODE_PRIVATE)

        buttonLoad2.setOnClickListener{
            val text = writeSave.text.toString()
            val text2 = writeSave2.text.toString()
            preference.edit().putString("text", text).apply()
            preference.edit().putString("text2", text2).apply()
            val intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("text", text)
            intent.putExtra("text2", text2)
            startActivity(intent)
        }
        }
    }
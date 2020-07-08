package es.fgd192.lesson_5
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_second.*
import java.lang.reflect.Array.set

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val write = intent.getStringExtra("text")
        val textV = findViewById<EditText>(R.id.write)
        write.text = textV
        val write2 = intent.getStringExtra("text2")
        val textV2 = findViewById<EditText>(R.id.write2)
        write2.text = textV2

    }
}
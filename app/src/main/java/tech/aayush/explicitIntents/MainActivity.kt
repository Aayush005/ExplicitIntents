package tech.aayush.explicitIntents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val num:Int = 10
    val text:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("num_value", num)
            intent.putExtra("text_value", text)
            startActivity(intent)
        }
    }
}
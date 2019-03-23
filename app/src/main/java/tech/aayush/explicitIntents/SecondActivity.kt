package tech.aayush.explicitIntents

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle = intent.extras
        val num = bundle.get("num_value")
        val text = bundle.get("text_value")
        Toast.makeText(applicationContext,num.toString()+" "+text,Toast.LENGTH_LONG).show()

        button2.setOnClickListener{
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
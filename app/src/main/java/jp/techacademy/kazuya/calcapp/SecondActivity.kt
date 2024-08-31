package jp.techacademy.kazuya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.kazuya.calcapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val value=intent.getFloatExtra("value",0.0f)
        binding.textView.text=value.toString()

    }
}
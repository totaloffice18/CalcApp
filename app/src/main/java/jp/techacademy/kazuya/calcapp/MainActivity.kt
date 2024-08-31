package jp.techacademy.kazuya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.techacademy.kazuya.calcapp.databinding.ActivityMainBinding
import android.util.Log
import android.view.View
import android.content.Intent
import android.view.View.OnClickListener

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.button1.setOnClickListener{

            val inten = Intent(this, SecondActivity::class.java)

            var str1:String?=binding.editText1.text.toString()
            var str2:String?=binding.editText2.text.toString()

            if (str1?.length==null){
            }else if(str2?.length==null){
            }else{

                var VALUE1:Float=str1.toFloat()
                var VALUE2:Float=str2.toFloat()
                var VALUE=VALUE1+VALUE2

                val intent=Intent(this,SecondActivity::class.java)
                intent.putExtra("value",VALUE)
                startActivity(intent)
            }

            Log.d("UI_PARTS", "掛け算")          //確認
            Log.d("UI_PARTS", VALUE1.toString())     //確認
            Log.d("UI_PARTS", VALUE2.toString())     //確認
            Log.d("UI_PARTS", VALUE.toString())      //確認

        }

        binding.button2.setOnClickListener {

            val inten = Intent(this, SecondActivity::class.java)

            val str1=binding.editText1.text.toString()
            val VALUE1:Float=str1.toFloat()
            val str2=binding.editText2.text.toString()
            val VALUE2:Float=str2.toFloat()
            val VALUE=VALUE1-VALUE2

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("value",VALUE)
            startActivity(intent)

            Log.d("UI_PARTS", "引き算") //確認
            Log.d("UI_PARTS", VALUE1.toString()) //確認
            Log.d("UI_PARTS", VALUE2.toString()) //確認
            Log.d("UI_PARTS", VALUE.toString()) //確認
        }

        binding.button3.setOnClickListener {

            val inten = Intent(this, SecondActivity::class.java)

            val str1=binding.editText1.text.toString()
            val VALUE1:Float=str1.toFloat()
            val str2=binding.editText2.text.toString()
            val VALUE2:Float=str2.toFloat()
            val VALUE=VALUE1*VALUE2

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("value",VALUE)
            startActivity(intent)

            Log.d("UI_PARTS", "掛け算") //確認
            Log.d("UI_PARTS", VALUE1.toString()) //確認
            Log.d("UI_PARTS", VALUE2.toString()) //確認
            Log.d("UI_PARTS", VALUE.toString()) //確認
        }

        binding.button4.setOnClickListener {

            val inten = Intent(this, SecondActivity::class.java)

            val str1=binding.editText1.text.toString()
            val VALUE1:Float=str1.toFloat()
            val str2=binding.editText2.text.toString()
            val VALUE2:Float=str2.toFloat()
            val VALUE=VALUE1/VALUE2

            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("value",VALUE)
            startActivity(intent)

            Log.d("UI_PARTS", "割り算") //確認
            Log.d("UI_PARTS", VALUE1.toString()) //確認
            Log.d("UI_PARTS", VALUE2.toString()) //確認
            Log.d("UI_PARTS", VALUE.toString()) //確認
        }

    }


}
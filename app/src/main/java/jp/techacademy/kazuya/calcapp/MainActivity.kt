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

        binding.button1.setOnClickListener {

             //　遷移先の指定
            val inten = Intent(this, SecondActivity::class.java)

            //　editTextの内容取得
            val str1=binding.editText1.text.toString()
            val str2=binding.editText2.text.toString()

            //　editTextの空判定
            val isNullOrEmpty1=str1.isNullOrEmpty()
            val isNullOrEmpty2=str2.isNullOrEmpty()
            val JUDGE=isNullOrEmpty1||isNullOrEmpty2

            //　型「小数点化」、足し算、画面遷移
            //　editTextがいずれか空なら実行しない
            if (JUDGE==true){
            }else{
                val VALUE1:Double=str1.toDouble()
                val VALUE2:Double=str2.toDouble()
                val VALUE=VALUE1+VALUE2

                val intent=Intent(this,SecondActivity::class.java)
                intent.putExtra("value",VALUE)
                startActivity(intent)
            }

        }

        binding.button2.setOnClickListener {

            //　遷移先の指定
            val inten = Intent(this, SecondActivity::class.java)

            //　editTextの内容取得
            val str1=binding.editText1.text.toString()
            val str2=binding.editText2.text.toString()

            //　editTextの空判定
            val isNullOrEmpty1=str1.isNullOrEmpty()
            val isNullOrEmpty2=str2.isNullOrEmpty()
            val JUDGE=isNullOrEmpty1||isNullOrEmpty2

            //　型「小数点化」、引き算、画面遷移
            //　editTextがいずれか空なら実行しない
            if(JUDGE==true){
            }else{
                val VALUE1:Double=str1.toDouble()
                val VALUE2:Double=str2.toDouble()
                val VALUE=VALUE1-VALUE2

                val intent=Intent(this,SecondActivity::class.java)
                intent.putExtra("value",VALUE)
                startActivity(intent)
            }
         }

        binding.button3.setOnClickListener {

            //　遷移先の指定
            val inten = Intent(this, SecondActivity::class.java)

            //　editTextの内容取得
            val str1=binding.editText1.text.toString()
            val str2=binding.editText2.text.toString()

            //　editTextの空判定
            val isNullOrEmpty1=str1.isNullOrEmpty()
            val isNullOrEmpty2=str2.isNullOrEmpty()
            val JUDGE=isNullOrEmpty1||isNullOrEmpty2

            //　型「小数点化」、掛け算、画面遷移
            //　editTextがいずれか空なら実行しない
            if(JUDGE==true){
            }else{
                val VALUE1:Double=str1.toDouble()
                val VALUE2:Double=str2.toDouble()
                val VALUE=VALUE1*VALUE2

                val intent=Intent(this,SecondActivity::class.java)
                intent.putExtra("value",VALUE)
                startActivity(intent)

            }

        }

        binding.button4.setOnClickListener {

            //　遷移先の指定
            val inten = Intent(this, SecondActivity::class.java)

            //　editTextの内容取得
            val str1=binding.editText1.text.toString()
            val str2=binding.editText2.text.toString()

            //　editTextの空判定
            val isNullOrEmpty1=str1.isNullOrEmpty()
            val isNullOrEmpty2=str2.isNullOrEmpty()
            val JUDGE=isNullOrEmpty1||isNullOrEmpty2

            //　型「小数点化」、掛け算、画面遷移
            //　editTextがいずれか空なら実行しない
           if(JUDGE==true){

               try{
                   val VALUE1:Double=str1.toDouble()
                   val VALUE2:Double=str2.toDouble()
                   val VALUE=VALUE1/VALUE2
               }catch(e:java.lang.Exception){
                   Log.d("UI_PARTS","数値が入力されていません")
               }finally{
               }

            }else{
                val VALUE1:Double=str1.toDouble()
                val VALUE2:Double=str2.toDouble()
                val VALUE=VALUE1/VALUE2

                val intent=Intent(this,SecondActivity::class.java)
                intent.putExtra("value",VALUE)
                startActivity(intent)

            }

            //Log.d("UI_PARTS",str1.toString()+isNullOrEmpty1.toString())
            //Log.d("UI_PARTS",str2.toString()+isNullOrEmpty2.toString())
            //Log.d("UI_PARTS",JUDGE.toString())

            }
    }
}
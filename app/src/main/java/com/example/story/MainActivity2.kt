package com.example.story

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    lateinit var bt1:Button
    private lateinit var ed1:EditText
    lateinit var ed2:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        x()
    }

    private fun x(){

        bt1 = findViewById(R.id.bt)
        ed1 = findViewById(R.id.editText)
        ed2 = findViewById(R.id.editText2)


        bt1.setOnClickListener {

                var e1 = ed1.text.toString()
                var e2 = ed2.text.toString()

            var em = Regex("\\w*[@]\\w*[.]\\w*")
            var pa = Regex("\\w{8}")

            if ((em.matches(e1) == true) && (pa.matches(e2) == true)){
                finish()

                var i = Intent(this,MainActivity3::class.java)
//                i.putExtra("emi",e1)
                startActivity(i)




            }else if(e1.isEmpty() == true ){
                ed1.error = "There are no data"



            }else if( e2.isEmpty() == true){

                ed2.error = "There are no data"

            }
            else{
            Toast.makeText(this,"Correct data must be entered",Toast.LENGTH_LONG).show()

        }


        }





            }



            }











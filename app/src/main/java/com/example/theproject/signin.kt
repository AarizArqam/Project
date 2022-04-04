package com.example.theproject

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.Window
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signin:AppCompatActivity() {
    var a=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()?.hide();
        setContentView(R.layout.signin)
        val chip=findViewById<ImageButton>(R.id.imageButton)
        val password=findViewById<EditText>(R.id.editTextTextPassword)
        chip.setOnClickListener {
            if(a==false)
            {
                chip.setBackgroundResource(R.drawable.hide)
                password.setTransformationMethod(HideReturnsTransformationMethod.getInstance())
                a=true
            }
            else
            {
                chip.setBackgroundResource(R.drawable.show)
                password.setTransformationMethod(PasswordTransformationMethod.getInstance())
                a=false
            }
        }
        val signbtn=findViewById<TextView>(R.id.button)
        signbtn.setOnClickListener {
            val i=Intent(this,signup::class.java);
            startActivity(i);
        }
    }
}
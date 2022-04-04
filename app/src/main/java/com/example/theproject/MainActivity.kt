package com.example.theproject

import android.os.Bundle
import android.text.InputType
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
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
    }
}
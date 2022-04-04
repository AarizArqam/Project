package com.example.theproject

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class signup:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar()?.hide();
        setContentView(R.layout.signup)
    }
}
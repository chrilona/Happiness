package com.lonainnovs.happinesspractically

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class HomeActivity : AppCompatActivity() {
    lateinit var tilHappy:TextInputLayout
    lateinit var etHappy:TextInputEditText
    lateinit var tilPassword:TextInputLayout
    lateinit var etPassword:TextInputEditText
    lateinit var btnHappy:Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        startActivity(Intent(this,HomeActivity::class.java))
        castViews()
        btnHappy.setOnClickListener {  validateInputs()}
    }
    fun castViews(){
        tilHappy=findViewById(R.id.tilHappy)
        etHappy=findViewById(R.id.etHappy)
        tilPassword=findViewById(R.id.tilPassword)
        etPassword=findViewById(R.id.etPassword)
        btnHappy=findViewById(R.id.btnHappy)

    }
   fun validateInputs(){
       var person = etHappy.text.toString()
       if (person.isBlank()){
           tilHappy.error="Your first name is required"
       }
       var pass= etPassword.text.toString()
       if (pass.isBlank()){
           tilPassword.error="Add a password"
       }
   }
}
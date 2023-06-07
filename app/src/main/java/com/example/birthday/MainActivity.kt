package com.example.birthday

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter.UsernameFilterGMail
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.birthday.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding  : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.createBirthdayButton.setOnClickListener{
           val intent = Intent(this@MainActivity, GreetingActivity::class.java)
           val message = binding.UserName.text.toString()
           intent.putExtra("message_key", message)
           startActivity(intent)
//           Toast.makeText(this, "${binding.UserName.text}", Toast.LENGTH_SHORT).show()
       }
    }

//    fun createBirthdayCard() {
//        val name =binding.UserName.text.toString()
//
//        val intent = Intent(MainActivity::class.java, GreetingActivity::class.java)
//        intent.putExtra("ayan", name)
//        startActivity(intent)
//    }
}

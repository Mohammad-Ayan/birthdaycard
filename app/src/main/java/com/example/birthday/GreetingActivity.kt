package com.example.birthday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.birthday.databinding.ActivityGreetingBinding

class GreetingActivity : AppCompatActivity() {

    private lateinit var  binding  : ActivityGreetingBinding

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGreetingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra("NAME_EXTRA")

        //val profileName=intent.getStringExtra("message_key")
          //  binding.tvReciveText.setText(profileName).toString()
            //Toast.makeText(this, "${binding.tvReciveText.text.toString()}", Toast.LENGTH_SHORT).show()


    }
}


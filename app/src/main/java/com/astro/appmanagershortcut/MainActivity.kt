package com.astro.appmanagershortcut

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try{
            startActivity(
                    Intent(Settings.ACTION_APPLICATION_SETTINGS).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            )
            finish()
        }catch (e : Exception){
            Toast.makeText(
                    applicationContext,
                    "Something went wrong",
                    Toast.LENGTH_SHORT
                    )
                    .show()
        }




    }
}
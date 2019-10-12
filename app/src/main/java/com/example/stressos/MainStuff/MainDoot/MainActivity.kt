package com.example.stressos.MainStuff.MainDoot

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.stressos.MainStuff.ActuallyDoingStuff.HealthActivity
import com.example.stressos.MainStuff.ShowInfo.InfoActivity
import com.example.stressos.R

import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonPreviousActivity.setOnClickListener{
            onButtonPrevious()
        }
        ButtonActivityCheck.setOnClickListener{
            onButtonActivity()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun onButtonActivity() {
        val intent = Intent(this, HealthActivity::class.java)
        startActivity(intent)
    }

    fun onButtonPrevious (){
        val intent = Intent(this, InfoActivity::class.java)
        startActivity(intent)
    }
}

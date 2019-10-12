package com.example.stressos.MainStuff.ShowInfo

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.stressos.R

import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.content_info.*

class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    fun onSetAverageBPM (){
        //Get average BPM and set it as necessary
    }
    fun onSetTarget (){
        //Find target BPMs of different age groups and set it here
    }
}

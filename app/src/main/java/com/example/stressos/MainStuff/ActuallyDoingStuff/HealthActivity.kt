package com.example.stressos.MainStuff.ActuallyDoingStuff

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.stressos.R

import kotlinx.android.synthetic.main.activity_health.*
import kotlinx.android.synthetic.main.content_health.*
import kotlinx.android.synthetic.main.content_health.view.*

class HealthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)

        //while(true){
            //val rnds = (45..65).random()
            val text = "45"     //Hardcoded for now, change with function name
            TextViewHRUpdate.text = text
        //}

        AnimatingCircle()
    }
}
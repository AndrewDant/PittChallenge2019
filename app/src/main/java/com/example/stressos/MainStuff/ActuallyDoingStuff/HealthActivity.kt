package com.example.stressos.MainStuff.ActuallyDoingStuff

import android.os.Bundle
import android.os.CountDownTimer
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

        val text = "63"     //Hardcoded for now, change with function name
        TextViewHRUpdate.text = text

        val timer = object: CountDownTimer(19000, 1000) {
            var tim = 4
            override fun onTick(millisUntilFinished: Long) {
                TextViewCountDown.text = tim.toString()//millisUntilFinished.toString()
                tim--
                if (tim == -1){
                    tim = 4
                }
            }
            override fun onFinish() {
                TextViewCountDown.text = "0"
            }
        }
        timer.start()

        AnimatingCircle()
    }
}
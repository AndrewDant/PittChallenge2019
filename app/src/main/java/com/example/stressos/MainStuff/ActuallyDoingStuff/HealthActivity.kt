package com.example.stressos.MainStuff.ActuallyDoingStuff

import android.os.Bundle
import android.view.LayoutInflater
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.stressos.R

import kotlinx.android.synthetic.main.activity_health.*

class HealthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)
    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
    }
}

/*class ScreenSlide : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater
    )
}*/

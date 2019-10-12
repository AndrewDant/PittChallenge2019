package com.example.stressos.MainStuff.ActuallyDoingStuff

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity
import com.example.stressos.R

class AnimatingCircle : AppCompatActivity() {
    private lateinit var wifiAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.image)
        imageView.setBackgroundResource(R.drawable.animation)
        wifiAnimation = imageView.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        wifiAnimation.start()
    }
}

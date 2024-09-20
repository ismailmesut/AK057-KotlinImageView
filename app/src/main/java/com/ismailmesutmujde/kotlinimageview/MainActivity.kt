package com.ismailmesutmujde.kotlinimageview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinimageview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonImage1.setOnClickListener {
            bindingMain.imageView.setImageResource(R.drawable.image1)
        }
        bindingMain.buttonImage2.setOnClickListener {
            bindingMain.imageView.setImageResource(R.drawable.image2)
        }
        bindingMain.buttonImage3.setOnClickListener {
            bindingMain.imageView.setImageResource(resources.getIdentifier("image3", "drawable", packageName))
        }

    }
}
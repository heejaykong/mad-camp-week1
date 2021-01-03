package com.example.madcampweek1.secondTab

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.madcampweek1.R
import kotlinx.android.synthetic.main.activity_gallery_show.*

class GalleryShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_show)

        val gallery_show: ImageView = gallery_show

        val bundle: Bundle = intent.extras!!

        val drawable = bundle.getInt("Drawable")

        gallery_show.setImageResource(drawable)
    }
}
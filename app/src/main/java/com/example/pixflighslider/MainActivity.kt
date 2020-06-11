package com.example.pixflighslider

import android.content.pm.ActivityInfo
import android.content.res.Resources
import android.os.Bundle
import android.provider.Settings.Global.getString
import android.provider.Settings.Secure.getString
import android.provider.Settings.System.getString
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide

class MainActivity : IntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        //setContentView(R.layout.activity_main)
 
        setButtonBackVisible(false); //desativa botão de voltar

        val addSlide1 = addSlide(FragmentSlide.Builder()
            .background(R.color.FundoSlide1)
            .fragment(R.layout.intro1)
            .build()
        )

        val addSlide2 = addSlide(FragmentSlide.Builder()
            .background(R.color.FundoSlide1)
            .fragment(R.layout.intro2)
            .build()
        )

        val addSlide3 = addSlide(FragmentSlide.Builder()
            .background(R.color.FundoSlide1)
            .fragment(R.layout.intro3)
            .build()
        )

    }
}
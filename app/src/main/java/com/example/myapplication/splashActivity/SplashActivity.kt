package com.example.myapplication.splashActivity

import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import com.example.myapplication.R
import com.example.myapplication.authActivity.AuthActivity
import com.example.myapplication.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class SplashActivity : BaseActivity() {
    override var layoutId = R.layout.activity_splash

    override fun onResume() {
        super.onResume()
        startAnimate()
    }

    private fun startAnimate() {
        val drawable = img_logo.drawable as AnimatedVectorDrawable
        drawable.registerAnimationCallback(object : Animatable2.AnimationCallback() {
            override fun onAnimationEnd(drawable: Drawable?) {
                super.onAnimationEnd(drawable)
                runBlocking {
                    delay(300)
                    openActivity(AuthActivity::class.java)
                }
            }
        })
        drawable.start()
    }
}

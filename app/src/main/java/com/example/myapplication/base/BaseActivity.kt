package com.example.myapplication.base

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    abstract var layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }

    open fun openActivity(
        destination: Class<*>,
        isCloseCurrentActivity: Boolean = true,
        bundle: Bundle? = null
    ) {
        val intent = Intent(this, destination)
        bundle?.let { intent.putExtras(bundle) }
        startActivity(intent)
        if (isCloseCurrentActivity) finish()
    }
}

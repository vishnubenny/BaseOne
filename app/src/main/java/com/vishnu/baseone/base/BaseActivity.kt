package com.vishnu.baseone.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {

    private lateinit var binding: V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentViewFromBinding()
    }

    private fun setContentViewFromBinding() {
        binding = getViewBinding()
        val view = binding.root
        setContentView(view)
    }

    abstract fun getViewBinding(): V
}

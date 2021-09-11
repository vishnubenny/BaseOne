package com.vishnu.baseone.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.vishnu.baseone.home.di.HomeSubComponent

abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {
    lateinit var diComponentHome: HomeSubComponent
    private lateinit var binding: V
    fun binding() = binding

    override fun onCreate(savedInstanceState: Bundle?) {
        injectSubComponent((applicationContext as App).appComponent)
        super.onCreate(savedInstanceState)
        setContentViewFromBinding()
    }

    private fun setContentViewFromBinding() {
        binding = getViewBinding()
        val view = binding.root
        setContentView(view)
    }

    abstract fun getViewBinding(): V

    abstract fun injectSubComponent(appComponent: AppComponent)
}

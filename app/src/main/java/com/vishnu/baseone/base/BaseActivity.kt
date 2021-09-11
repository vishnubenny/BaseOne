package com.vishnu.baseone.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.vishnu.baseone.home.di.SubComponent

abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {

    lateinit var diComponent: SubComponent
    private lateinit var binding: V
    fun binding() = binding

    override fun onCreate(savedInstanceState: Bundle?) {
        setupDiComponent()
        super.onCreate(savedInstanceState)
        setContentViewFromBinding()
    }

    private fun setupDiComponent() {
        diComponent = (applicationContext as App).appComponent
            .subComponent()
            .create()
        injectDiComponent(diComponent)
    }

    private fun setContentViewFromBinding() {
        binding = getViewBinding()
        val view = binding.root
        setContentView(view)
    }

    abstract fun getViewBinding(): V

    abstract fun injectDiComponent(diComponent: SubComponent)
}

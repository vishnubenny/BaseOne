package com.vishnu.baseone.detail

import android.os.Bundle
import com.vishnu.baseone.base.BaseActivity
import com.vishnu.baseone.databinding.ActivityDetailBinding
import com.vishnu.baseone.home.di.SubComponent
import javax.inject.Inject

class DetailActivity : BaseActivity<ActivityDetailBinding>() {

    @Inject
    lateinit var viewModel: DetailViewModel

    override fun getViewBinding() = ActivityDetailBinding.inflate(layoutInflater)

    override fun injectDiComponent(diComponent: SubComponent) {
        diComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel
    }
}

package com.vishnu.baseone.detail

import android.os.Bundle
import com.vishnu.baseone.base.AppComponent
import com.vishnu.baseone.base.BaseActivity
import com.vishnu.baseone.databinding.ActivityDetailBinding
import javax.inject.Inject

class DetailActivity : BaseActivity<ActivityDetailBinding>() {

    @Inject
    lateinit var viewModel: DetailViewModel

    override fun getViewBinding() = ActivityDetailBinding.inflate(layoutInflater)

    override fun injectSubComponent(appComponent: AppComponent) {
        appComponent.detailSubComponent()
            .create()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel
    }
}

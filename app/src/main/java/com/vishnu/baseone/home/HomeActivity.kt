package com.vishnu.baseone.home

import android.content.Intent
import android.os.Bundle
import com.vishnu.baseone.base.BaseActivity
import com.vishnu.baseone.databinding.ActivityHomeBinding
import com.vishnu.baseone.detail.DetailActivity
import com.vishnu.baseone.home.di.SubComponent
import javax.inject.Inject

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    @Inject
    lateinit var homeViewModel: HomeViewModel

    override fun getViewBinding() = ActivityHomeBinding.inflate(layoutInflater)

    override fun injectDiComponent(diComponent: SubComponent) {
        diComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding().btnNavigate
            .setOnClickListener {
                startActivity(Intent(this, DetailActivity::class.java))
            }
    }
}

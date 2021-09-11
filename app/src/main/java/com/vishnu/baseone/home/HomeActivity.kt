package com.vishnu.baseone.home

import android.content.Intent
import android.os.Bundle
import com.vishnu.baseone.base.AppComponent
import com.vishnu.baseone.base.BaseActivity
import com.vishnu.baseone.databinding.ActivityHomeBinding
import com.vishnu.baseone.detail.DetailActivity
import javax.inject.Inject

class HomeActivity : BaseActivity<ActivityHomeBinding>() {

    @Inject
    lateinit var homeViewModel: HomeViewModel

    override fun getViewBinding() = ActivityHomeBinding.inflate(layoutInflater)

    override fun injectSubComponent(appComponent: AppComponent) {
        appComponent.homeSubComponent()
            .create()
            .inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding().btnNavigate
            .setOnClickListener {
                startActivity(Intent(this, DetailActivity::class.java))
            }
    }
}

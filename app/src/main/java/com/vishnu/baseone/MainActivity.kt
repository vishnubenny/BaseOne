package com.vishnu.baseone

import com.vishnu.baseone.base.BaseActivity
import com.vishnu.baseone.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)

}

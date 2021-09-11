package com.vishnu.baseone.home.di

import com.vishnu.baseone.detail.DetailActivity
import com.vishnu.baseone.home.HomeActivity
import dagger.Subcomponent

@Subcomponent
interface SubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): SubComponent
    }

    fun inject(homeActivity: HomeActivity)
    fun inject(detailActivity: DetailActivity)
}

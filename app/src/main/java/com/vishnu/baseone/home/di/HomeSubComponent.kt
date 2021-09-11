package com.vishnu.baseone.home.di

import com.vishnu.baseone.home.HomeActivity
import dagger.Subcomponent

@Subcomponent
interface HomeSubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): HomeSubComponent
    }

    fun inject(homeActivity: HomeActivity)
}

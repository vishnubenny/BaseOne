package com.vishnu.baseone.detail.di

import com.vishnu.baseone.detail.DetailActivity
import dagger.Subcomponent

@Subcomponent(modules = [DetailModule::class])
interface DetailSubComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): DetailSubComponent
    }

    fun inject(detailActivity: DetailActivity)
}

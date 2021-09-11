package com.vishnu.baseone.detail.di

import com.vishnu.baseone.detail.DetailViewModel
import dagger.Module
import dagger.Provides

@Module
class DetailModule {

    @Provides
    fun providesDetailViewModel(): DetailViewModel {
        return DetailViewModel()
    }
}

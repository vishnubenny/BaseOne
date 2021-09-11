package com.vishnu.baseone.home.di

import com.vishnu.baseone.home.HomeRepository
import com.vishnu.baseone.home.HomeViewModel
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

    @Provides
    fun providesHomeViewModel(repository: HomeRepository): HomeViewModel {
        return HomeViewModel(repository)
    }

    @Provides
    fun providesHomeRepository(): HomeRepository {
        return HomeRepository()
    }
}

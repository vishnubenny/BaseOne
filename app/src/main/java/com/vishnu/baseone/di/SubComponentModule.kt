package com.vishnu.baseone.di

import com.vishnu.baseone.detail.di.DetailSubComponent
import com.vishnu.baseone.home.di.HomeSubComponent
import dagger.Module

@Module(
    subcomponents = [HomeSubComponent::class,
        DetailSubComponent::class]
)
abstract class SubComponentModule {

}

package com.vishnu.baseone.base

import android.app.Application
import com.vishnu.baseone.detail.di.DetailSubComponent
import com.vishnu.baseone.di.SubComponentModule
import com.vishnu.baseone.home.di.HomeSubComponent
import dagger.Component

// Definition of the Application graph
@Component(modules = [SubComponentModule::class])
interface AppComponent {
    fun homeSubComponent(): HomeSubComponent.Factory
    fun detailSubComponent(): DetailSubComponent.Factory
}

class App : Application() {

    val appComponent: AppComponent = DaggerAppComponent.create()
}

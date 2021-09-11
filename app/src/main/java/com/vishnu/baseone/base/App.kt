package com.vishnu.baseone.base

import android.app.Application
import com.vishnu.baseone.di.SubComponentModule
import com.vishnu.baseone.home.di.SubComponent
import dagger.Component

// Definition of the Application graph
@Component(modules = [SubComponentModule::class])
interface AppComponent {
    fun subComponent(): SubComponent.Factory
}

class App : Application() {

    val appComponent: AppComponent = DaggerAppComponent.create()
}

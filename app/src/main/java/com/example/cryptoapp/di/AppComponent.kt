package com.example.cryptoapp.di

import android.app.Application
import com.example.cryptoapp.App
import com.example.cryptoapp.di.annotation.ApplicationScope
import com.example.cryptoapp.presentation.CoinDetailFragment
import com.example.cryptoapp.presentation.CoinPriceListActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [ViewModelModule::class, DataModule::class, WorkerModule::class])
interface AppComponent {

    fun inject(coinListActivity: CoinPriceListActivity)

    fun inject(coinDetailFragment: CoinDetailFragment)

    fun inject(application: App)

    @Component.Factory
    interface AppComponentFactory{

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }
}
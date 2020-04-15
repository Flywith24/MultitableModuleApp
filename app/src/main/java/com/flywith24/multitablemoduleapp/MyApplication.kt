package com.flywith24.multitablemoduleapp

import android.app.Application
import android.content.Intent
import com.flywith24.feature1.Feature1Activity
import com.flywith24.feature2.Feature2Activity
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * @author yyz (杨云召)
 * @date   2020/4/15
 * time   9:46
 * description
 */
class MyApplication : Application() {
    val myModule = module {
        single { Feature2Activity::class.java.name }
        scope<Feature1Activity> { scope<String> { Feature2Activity::class.java.name } }
    }

    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            androidContext(this@MyApplication)
            // modules
            modules(myModule)
        }
    }
}
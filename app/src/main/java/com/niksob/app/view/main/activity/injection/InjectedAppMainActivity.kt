package com.niksob.app.view.main.activity.injection

import com.niksob.app.application.App
import com.niksob.app.view.main.activity.logging.LoggableMVVMMainActivity

open class InjectedAppMainActivity : LoggableMVVMMainActivity() {

    private val appComponent get() = injectableAppComponentBuilder.build()

    private val applicationForInjection get() = applicationContext as App

    override fun inject() {
        super.inject()
        appComponent.inject(applicationForInjection)
    }
}
package com.niksob.di.module.app

import android.view.ViewGroup
import dagger.Module
import dagger.Provides

@Module
class AppProgressBarLayoutComponentModule(
    private val progressBarLayoutComponent: ViewGroup
) {
    @Provides
    fun provideAppProgressBarLayoutComponent() = progressBarLayoutComponent
}
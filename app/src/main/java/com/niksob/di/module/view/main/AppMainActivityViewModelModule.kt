package com.niksob.di.module.view.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.niksob.app.application.App
import com.niksob.di.module.usecase.auth.LoadAuthorizeUserIdUseCaseModule
import com.niksob.domain.usecase.auth.LoadAuthorizeUserIdUseCase
import com.niksob.app.view.auth.LoginView
import com.niksob.app.view.moodentry.MoodEntriesView
import com.niksob.app.viewmodel.main.MainActivityViewModel
import com.niksob.app.viewmodel.main.factory.MainViewModelFactory
import com.niksob.di.module.app.ContextModule
import com.niksob.di.module.usecase.auth.SignOutUseCaseModule
import com.niksob.domain.usecase.auth.SignOutUseCase
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        ContextModule::class,
        LoadAuthorizeUserIdUseCaseModule::class,
        SignOutUseCaseModule::class,
    ]
)
open class AppMainActivityViewModelModule {

    @Provides
    fun provideViewModel(
        viewModelFactory: ViewModelProvider.Factory,
        viewModelClass: Class<MainActivityViewModel>,
        viewModelStoreOwner: ViewModelStoreOwner,
    ) =
        ViewModelProvider(viewModelStoreOwner, viewModelFactory)[viewModelClass]

    @Provides
    fun provideViewModelClass() = MainActivityViewModel::class.java

    @Provides
    fun provideViewModelFactory(
        loadAuthorizeUserIdUseCase: LoadAuthorizeUserIdUseCase,
        signOutUseCase: SignOutUseCase,
    ): ViewModelProvider.Factory =
        MainViewModelFactory(loadAuthorizeUserIdUseCase, signOutUseCase)

    @Provides
    fun provideLoginViewClass() = LoginView::class.java

    @Provides
    fun provideMoodEntriesViewClass() = MoodEntriesView::class.java

    @Provides
    fun provideMainActivityViewModelStoreOwner(context: Context) = (context as App).mainViewModelStoreOwner
}
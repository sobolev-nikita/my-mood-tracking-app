package com.niksob.di.module.view.mood_entry_addition.navigation

import com.niksob.app.view.provider.ViewClassProvider
import com.niksob.di.module.navigation.ScreenNavigationModule
import com.niksob.domain.model.NavigationableScreenClass
import dagger.Module
import dagger.Provides

@Module(includes = [ScreenNavigationModule::class])
class NavigatableMoodEntryAdditionViewModule {
    @Provides
    fun provideMoodEntriesListScreenViewClass() =
        NavigationableScreenClass(ViewClassProvider.MOOD_ENTRY_ADDITION_VIEW.clazz)
}
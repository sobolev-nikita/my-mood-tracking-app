package com.niksob.di.module.view.mood_entry_day.ui_component.mood_entries_recycle_view

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niksob.app.R
import com.niksob.app.view.mood_entry_day.adapter.factory.MoodEntryAdapterFactory
import com.niksob.app.view.mood_entry_day.adapter.factory.MoodEntryAdapterFactoryImpl
import com.niksob.di.module.app.ContextModule
import dagger.Module
import dagger.Provides

@Module(includes = [ContextModule::class])
class MoodEntriesRecycleViewUIComponentModule(
    private val view: View,
) {

    @Provides
    fun provideMoodEntryRecycleView(): RecyclerView = view.findViewById(R.id.entries_view__entry_recycle_view)

    @Provides
    fun provideRecycleViewLayoutManager(context: Context): RecyclerView.LayoutManager = LinearLayoutManager(context)

    @Provides
    fun provideMoodEntryAdapterFactory(): MoodEntryAdapterFactory = MoodEntryAdapterFactoryImpl()
}
package com.niksob.app.view.mood.entry.list.mvvm.startdataloader

import com.niksob.di.component.view.moodentry.MoodEntriesListViewComponent

open class InjectedMoodEntriesListViewWithStartDataLoader : MoodEntriesListViewWithStartDataLoader() {

    override val injectableComponent: MoodEntriesListViewComponent
        get() = super.injectableComponentBuilder.build()

    override fun inject() = injectableComponent.inject(this)
}
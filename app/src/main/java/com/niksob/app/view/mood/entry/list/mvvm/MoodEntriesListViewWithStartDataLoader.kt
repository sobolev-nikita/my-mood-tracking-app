package com.niksob.app.view.mood.entry.list.mvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.niksob.app.view.mood.entry.list.uicomponent.MoodEntriesListWithRecycleView

open class MoodEntriesListViewWithStartDataLoader : MoodEntriesListWithRecycleView() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = super.onCreateView(inflater, container, savedInstanceState)
        onCreateViewDataLoading()
        return rootView
    }

    private fun onCreateViewDataLoading() = loadMoodEntriesByUserId()
}
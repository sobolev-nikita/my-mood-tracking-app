package com.niksob.app.viewmodel.mood_entry.base.observation

import com.niksob.domain.model.MoodEntries
import io.reactivex.Single

interface MoodEntryDayViewModel {

    fun loadByDateInterval(): Single<MoodEntries>
}
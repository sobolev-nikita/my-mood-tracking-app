package com.niksob.domain.usecase.db.mood_entry.observation

import com.niksob.domain.model.mood_entry.MoodEntries
import com.niksob.domain.model.MoodEntriesData
import io.reactivex.Single

interface LoadMoodEntriesByUserIdAndDateUseCase {
    fun execute(moodEntriesData: MoodEntriesData): Single<MoodEntries>
}

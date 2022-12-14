package com.niksob.data.storage.firebase.base.saver

import com.google.android.gms.tasks.Task
import com.niksob.data.provider.ResponseReasonProvider
import com.niksob.domain.model.Callback
import com.niksob.domain.model.Query

class BaseOnDataSavedAction(
    private val reasonProvider: ResponseReasonProvider,
) : OnDataSavedAction {

    override fun onDataLoaded(callback: Callback<Query>) {
        val response = Query(completed = true, reason = reasonProvider.successfulReason)
        callback.call(response)
    }

    override fun onDataCancelled(task: Task<Void>, callback: Callback<Query>) {
        val response = Query(reason = reasonProvider.failureReason(task.exception?.message))
        callback.call(response)
    }
}
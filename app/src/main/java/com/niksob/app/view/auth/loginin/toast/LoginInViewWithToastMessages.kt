package com.niksob.app.view.auth.loginin.toast

import com.niksob.app.R
import com.niksob.app.toast.ToastMessage
import com.niksob.app.view.auth.loginin.logger.InjectableLoggableLoginInView
import com.niksob.domain.model.Query
import javax.inject.Inject

open class LoginInViewWithToastMessages : InjectableLoggableLoginInView() {

    @Inject
    lateinit var toastMessage: ToastMessage

    private val authCompletedMessage get() = requireContext().getString(R.string.authorize_completed)

    private val authFailedMessage get() = requireContext().getString(R.string.authorize_failed)

    private val signOutMessage get() = requireContext().getString(R.string.sign_out)

    protected open fun showAuthCompletedToastMessage() {
        toastMessage.showShortToast(authCompletedMessage)
    }

    protected open fun showAuthFailedToastMessage() {
        toastMessage.showShortToast(authFailedMessage)
    }

    protected open fun showSignOutToastMessage() {
        toastMessage.showShortToast(signOutMessage)
    }

    override fun onLoginInCompleted(response: Query) {
        super.onLoginInCompleted(response)

        if (response.completed) {
            showAuthCompletedToastMessage()
        } else {
            showAuthFailedToastMessage()
        }
    }

    override fun moveToPreviousView() {
        super.moveToPreviousView()
        showSignOutToastMessage()
    }
}
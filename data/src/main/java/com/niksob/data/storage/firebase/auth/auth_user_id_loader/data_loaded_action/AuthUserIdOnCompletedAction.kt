package com.niksob.data.storage.firebase.auth.auth_user_id_loader.data_loaded_action

import com.niksob.data.storage.firebase.auth.auth_user_id_loader.reason.AuthUserIdReasonResponseProvider
import com.niksob.data.storage.firebase.auth.signout.data_loaded_action.SignOutOnCompletedAction

class AuthUserIdOnCompletedAction(
    private val reasonProvider: AuthUserIdReasonResponseProvider
) : SignOutOnCompletedAction(reasonProvider)
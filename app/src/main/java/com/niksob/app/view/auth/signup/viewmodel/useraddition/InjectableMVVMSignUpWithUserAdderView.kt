package com.niksob.app.view.auth.signup.viewmodel.useraddition

import androidx.lifecycle.Observer
import com.niksob.di.component.view.auth.signup.DaggerSignUpViewComponent
import com.niksob.di.module.viewmodel.auth.signup.SignUpViewModelWithNewUserObserverModule
import com.niksob.domain.model.Query

open class InjectableMVVMSignUpWithUserAdderView : MVVMSignUpWithUserAdderView() {

    override val injectableComponentBuilder: DaggerSignUpViewComponent.Builder
        get() = super.injectableComponentBuilder
            .signUpViewModelWithNewUserObserverModule(signUpViewWithNewAdditionUserObserverModule)

    private val signUpViewWithNewAdditionUserObserverModule
        get() = SignUpViewModelWithNewUserObserverModule(
            lifecycleOwner = this,
            userAdditionObserver = userAdditionQuery,
        )

    private val userAdditionQuery
        get() = Observer<Query> { response ->
            onAddUserCompleted(response)
        }
}
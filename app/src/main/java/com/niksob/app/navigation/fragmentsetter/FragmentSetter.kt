package com.niksob.app.navigation.fragmentsetter

import androidx.fragment.app.FragmentManager
import com.niksob.app.R
import com.niksob.app.navigation.model.NavigationableFragment
import com.niksob.domain.navigation.NavigationableScreen
import com.niksob.domain.navigation.ScreenSetter

private const val FRAGMENT_CONTAINER_ID = R.id.main_layout__fragment_container

class FragmentSetter(
    private val manager: FragmentManager
) : ScreenSetter {
    override fun setNext(screen: NavigationableScreen) {
        val fragment = screen as NavigationableFragment
        manager.beginTransaction()
            .replace(FRAGMENT_CONTAINER_ID, fragment)
            .addToBackStack(fragment::class.simpleName)
            .commit()
    }

    override fun setPrevious() {
        manager.popBackStack()
    }
}
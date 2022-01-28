package com.example.myapplication

import android.os.Build
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import dagger.hilt.android.testing.UninstallModules
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@HiltAndroidTest
@RunWith(RobolectricTestRunner::class)
@Config(application = HiltTestApplication::class, sdk = [Build.VERSION_CODES.P])
class MainActivityTest {
    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup() {
       hiltRule.inject()
    }

    @Test
    fun doesItBreak() {
        val activityController = Robolectric.buildActivity(MainActivity::class.java).create()
        val vm = activityController.get().myViewModel
    }
}

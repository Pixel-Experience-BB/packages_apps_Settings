/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.spa.app.specialaccess

import android.Manifest
import android.app.AppOpsManager
import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.google.common.truth.Truth.assertThat
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TurnScreenOnAppsTest {
    private val context: Context = ApplicationProvider.getApplicationContext()

    private val listModel = TurnScreenOnAppsListModel(context)

    @Test
    fun modelResourceIdAndProperties() {
        assertThat(listModel.pageTitleResId).isEqualTo(com.android.settingslib.R.string.turn_screen_on_title)
        assertThat(listModel.switchTitleResId).isEqualTo(com.android.settingslib.R.string.allow_turn_screen_on)
        assertThat(listModel.footerResId).isEqualTo(com.android.settingslib.R.string.allow_turn_screen_on_description)
        assertThat(listModel.appOp).isEqualTo(AppOpsManager.OP_TURN_SCREEN_ON)
        assertThat(listModel.permission).isEqualTo(Manifest.permission.TURN_SCREEN_ON)
        assertThat(listModel.setModeByUid).isTrue()
    }
}
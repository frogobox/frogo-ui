/**
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object DependencyGradle {

    // dependencies version
    const val KOTLIN_VERSION = "1.9.23" // https://kotlinlang.org/docs/releases.html#release-details
    const val COMPOSE_MULTIPLATFORM_VERSION = "1.6.1" // https://github.com/JetBrains/compose-jb
    const val COMPOSE_VERSION = "1.5.12" // https://developer.android.com/jetpack/androidx/releases/compose

    const val FROGO_PATH_CORE_UI = ":${ProjectSetting.MODULE_NAME_UI}"
    const val FROGO_PATH_UI = ":${ProjectSetting.MODULE_NAME_CORE_UI}"

}
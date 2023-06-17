/*
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
    const val KOTLIN_VERSION = Version.JetBrains.kotlin
    const val COMPOSE_MULTIPLATFORM_VERSION = Version.Androidx.composeMultiPlatform
    const val COMPOSE_VERSION = Version.Androidx.composeCompiler

    const val FROGO_PATH_CORE_UI = ":${ProjectSetting.MODULE_NAME_UI}"
    const val FROGO_PATH_UI = ":${ProjectSetting.MODULE_NAME_CORE_UI}"

    const val FrogoRecyclerView = "com.github.amirisback:frogo-recycler-view:4.3.5"

}
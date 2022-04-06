package com.frogobox.ui.ext

import android.view.View
import com.frogobox.ui.animation.FrogoAnimation
import com.frogobox.ui.animation.core.Attention


/*
 * Created by faisalamir on 06/04/22
 * FrogoUI
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */
 
fun View.startAnimation(isRepeat: Boolean) {
    FrogoAnimation().apply {
        setAnimation(Attention.Ruberband(this@startAnimation))
        if (isRepeat) {
            setRepeated()
        }
        setDuration(1500)
    }.start()
}
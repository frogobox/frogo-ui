package com.frogobox.ui.ext

import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide


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

const val TAG = "FrogoImageViewExt"

fun ImageView.load(data: Any?) {
    Log.d(TAG,"Using Frogo UI Extension")
    Glide.with(context).load(data).into(this)
}
package com.example.navigationfragment.contract

import androidx.annotation.StringRes

/**
 * Если фрагмент реализует этот интерфейс, он поддерживает заголовок этого экрана
 */

interface HasCustomTitle {

    @StringRes
    fun getTitleRes(): Int
}
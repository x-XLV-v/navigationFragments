package com.example.navigationfragment.contract

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Показывает дополнительные действия на панели инструментов
 */

interface HasCustomAction {

    /**
     * @return спецификацию пользовательского действия
     */
    fun getCustomAction(): CustomAction

}

class CustomAction(
    @DrawableRes val iconRes: Int,
    @StringRes val textRes: Int,
    val onCustomAction: Runnable
)
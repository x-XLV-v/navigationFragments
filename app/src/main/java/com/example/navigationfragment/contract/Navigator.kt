package com.example.navigationfragment.contract

import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import com.example.navigationfragment.Options

typealias ResultListener<T> = (T) -> Unit

/**
 * Получение доступа к каждому навигатору для фрагмента
 */

fun Fragment.navigator(): Navigator {
    return requireActivity() as Navigator
}

interface Navigator {

    /**
     * Запуск экранов
     */

    fun showBoxSelectionScreen(options: Options)

    fun showOptionsScreen(options: Options)

    fun showAboutScreen()

    fun showCongratulationScreen()

    /**
     * Нажатие на кнопки
     */

    fun goBack()

    fun goToMenu()

    /**
     * Публикация результатов из текущего экрана
     */

    fun <T: Parcelable> publishResult(result: T)

    /**
     * Слушает результаты из другого экрана
     */

    fun <T: Parcelable> listenResult(clazz: Class<T>, owner: LifecycleOwner, listener: ResultListener<T>)
}
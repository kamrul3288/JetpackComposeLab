package com.iamkamrul.designsystem.utils

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier

fun debounceClick(onClick: () -> Unit): () -> Unit {
    var latest: Long = 0
    return {
        val now = System.currentTimeMillis()
        if (now - latest >= 300) {
            onClick()
            latest = now
        }
    }
}

@SuppressLint("ModifierFactoryUnreferencedReceiver")
inline fun Modifier.debounceClick(
    debounceInterval: Long = 300,
    crossinline onClick: () -> Unit,
): Modifier {
    var lastClickTime = 0L
    return clickable {
        val currentTime = System.currentTimeMillis()
        if ((currentTime - lastClickTime) < debounceInterval) return@clickable
        lastClickTime = currentTime
        onClick()
    }
}
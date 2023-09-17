package com.iamkamrul.common.extension

import android.os.Build
import android.os.Bundle
import com.google.gson.Gson
import java.io.Serializable

fun <T : Serializable?> Bundle.getSerializableCompat(key: String, clazz: Class<T>): T {
    @Suppress("DEPRECATION")
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) getSerializable(key, clazz)!! else (getSerializable(key) as T)
}

fun <T> String.convertJsonObject(type: Class<T>): T {
    return Gson().fromJson(this, type)
}

fun <T> T.convertJsonString(): String{
    return Gson().toJson(this)
}
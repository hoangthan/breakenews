package com.example.myapplication.utils

import android.os.Bundle

fun <T> Bundle.add(key: String, value: T) {
    when (value) {
        is Int -> {
            putInt(key, value)
        }
        is Long -> {
            putLong(key, value)
        }
        is Float -> {
            putFloat(key, value)
        }
        is Double -> {
            putDouble(key, value)
        }
        is Boolean -> {
            putBoolean(key, value)
        }
        is String -> {
            putString(key, value)
        }
    }
}